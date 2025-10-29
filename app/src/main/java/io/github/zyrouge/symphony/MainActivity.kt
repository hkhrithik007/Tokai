package io.github.zyrouge.symphony

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import io.github.zyrouge.symphony.ui.view.BaseView
import io.github.zyrouge.symphony.utils.Logger
import io.github.zyrouge.symphony.usb.UsbAudioManager

class MainActivity : ComponentActivity() {
    private var gSymphony: Symphony? = null
    private lateinit var usbAudioManager: UsbAudioManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val ignition: ActivityIgnition by viewModels()
        if (savedInstanceState == null) {
            installSplashScreen().apply {
                setKeepOnScreenCondition { !ignition.ready.value }
            }
        }

        Thread.setDefaultUncaughtExceptionHandler { _, err ->
            Logger.error("MainActivity", "uncaught exception", err)
            ErrorActivity.start(this, err)
            finish()
        }

        val symphony: Symphony by viewModels()
        symphony.permission.handle(this)
        gSymphony = symphony
        symphony.emitActivityReady()
        attachHandlers()

        // Initialize USB Audio Manager
        usbAudioManager = UsbAudioManager(this)
        usbAudioManager.initialize()

        enableEdgeToEdge()
        setContent {
            LaunchedEffect(LocalContext.current) {
                ignition.emitReady()
            }
            BaseView(symphony = symphony, activity = this)
        }
    }

    override fun onPause() {
        super.onPause()
        gSymphony?.emitActivityPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        gSymphony?.emitActivityDestroy()
        // Cleanup USB Audio Manager
        usbAudioManager.cleanup()
    }

    private fun attachHandlers() {
        gSymphony?.closeApp = {
            finish()
        }
    }
}
