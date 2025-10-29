package io.github.zyrouge.symphony.services.radio

import android.content.Context
import android.media.AudioDeviceInfo
import android.media.AudioManager
import android.net.Uri
import androidx.media3.common.AudioAttributes
import androidx.media3.common.C
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import io.github.zyrouge.symphony.Symphony
import io.github.zyrouge.symphony.services.audio.UsbAudioManager

class ExclusiveRadioPlayer(
    val symphony: Symphony,
    val id: String,
    val uri: Uri
) {
    private val context: Context = symphony.applicationContext
    private var player: ExoPlayer? = null
    private val usbAudioManager = UsbAudioManager(context)

    init {
        createPlayer()
    }

    private fun createPlayer() {
        // Implementation coming next...
    }

    fun play() {
        player?.play()
    }

    fun pause() {
        player?.pause()
    }

    fun stop() {
        player?.stop()
    }

    fun release() {
        player?.release()
        player = null
    }
}
