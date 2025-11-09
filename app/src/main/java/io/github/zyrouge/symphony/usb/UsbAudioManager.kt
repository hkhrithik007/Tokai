package io.github.zyrouge.symphony.usb

import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.hardware.usb.UsbDevice
import android.hardware.usb.UsbManager
import android.os.Build
import android.util.Log
import androidx.core.content.ContextCompat

class UsbAudioManager(private val context: Context) {
    private val usbManager: UsbManager by lazy {
        context.getSystemService(Context.USB_SERVICE) as UsbManager
    }

    private var currentUsbDevice: UsbDevice? = null

    companion object {
        private const val TAG = "UsbAudioManager"
        private const val ACTION_USB_PERMISSION = "io.github.hkhrithik007.USB_PERMISSION"

        // Audiocular D07 - CX31993 specifications
        private const val VENDOR_ID = 0x06CB  // Synaptics/Conexant
        private const val PRODUCT_ID = 0x1595 // CX31993
    }

    private val usbReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            when (intent.action) {
                UsbManager.ACTION_USB_DEVICE_ATTACHED -> {
                    val device = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                        intent.getParcelableExtra(UsbManager.EXTRA_DEVICE, UsbDevice::class.java)
                    } else {
                        @Suppress("DEPRECATION")
                        intent.getParcelableExtra(UsbManager.EXTRA_DEVICE)
                    }
                    device?.let { handleDeviceAttached(it) }
                }

                UsbManager.ACTION_USB_DEVICE_DETACHED -> {
                    val device = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                        intent.getParcelableExtra(UsbManager.EXTRA_DEVICE, UsbDevice::class.java)
                    } else {
                        @Suppress("DEPRECATION")
                        intent.getParcelableExtra(UsbManager.EXTRA_DEVICE)
                    }
                    device?.let { handleDeviceDetached(it) }
                }

                ACTION_USB_PERMISSION -> {
                    synchronized(this) {
                        val device = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                            intent.getParcelableExtra(UsbManager.EXTRA_DEVICE, UsbDevice::class.java)
                        } else {
                            @Suppress("DEPRECATION")
                            intent.getParcelableExtra(UsbManager.EXTRA_DEVICE)
                        }

                        if (intent.getBooleanExtra(UsbManager.EXTRA_PERMISSION_GRANTED, false)) {
                            device?.let { handlePermissionGranted(it) }
                        } else {
                            Log.w(TAG, "Permission denied for device $device")
                        }
                    }
                }
            }
        }
    }

    fun initialize() {
        val filter = IntentFilter().apply {
            addAction(UsbManager.ACTION_USB_DEVICE_ATTACHED)
            addAction(UsbManager.ACTION_USB_DEVICE_DETACHED)
            addAction(ACTION_USB_PERMISSION)
        }

        ContextCompat.registerReceiver(
            context,
            usbReceiver,
            filter,
            ContextCompat.RECEIVER_NOT_EXPORTED
        )

        // Check if device is already connected
        checkExistingDevices()

        Log.d(TAG, "UsbAudioManager initialized")
    }

    private fun checkExistingDevices() {
        val deviceList = usbManager.deviceList
        deviceList.values.forEach { device ->
            if (isAudiocularD07(device)) {
                Log.d(TAG, "Audiocular D07 already connected")
                requestPermission(device)
            }
        }
    }

    private fun handleDeviceAttached(device: UsbDevice) {
        Log.d(TAG, "USB Device attached: ${device.deviceName}")
        Log.d(TAG, "Vendor ID: ${device.vendorId}, Product ID: ${device.productId}")

        if (isAudiocularD07(device)) {
            Log.d(TAG, "Audiocular D07 detected!")
            requestPermission(device)
        }
    }

    private fun handleDeviceDetached(device: UsbDevice) {
        Log.d(TAG, "USB Device detached: ${device.deviceName}")

        if (isAudiocularD07(device)) {
            Log.d(TAG, "Audiocular D07 disconnected")
            currentUsbDevice = null
            onDeviceDisconnected()
        }
    }

    private fun handlePermissionGranted(device: UsbDevice) {
        Log.d(TAG, "Permission granted for ${device.deviceName}")
        currentUsbDevice = device
        onDeviceConnected(device)
    }

    private fun requestPermission(device: UsbDevice) {
        if (usbManager.hasPermission(device)) {
            Log.d(TAG, "Already has permission for ${device.deviceName}")
            handlePermissionGranted(device)
        } else {
            Log.d(TAG, "Requesting permission for ${device.deviceName}")
            val permissionIntent = PendingIntent.getBroadcast(
                context,
                0,
                Intent(ACTION_USB_PERMISSION),
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                    PendingIntent.FLAG_MUTABLE
                } else {
                    0
                }
            )
            usbManager.requestPermission(device, permissionIntent)
        }
    }

    private fun isAudiocularD07(device: UsbDevice): Boolean {
        return device.vendorId == VENDOR_ID && device.productId == PRODUCT_ID
    }

    private fun onDeviceConnected(device: UsbDevice) {
        // Handle device connection
        Log.i(TAG, "Audiocular D07 connected and ready!")
        Log.i(TAG, "Device: ${device.deviceName}")
        Log.i(TAG, "Manufacturer: ${device.manufacturerName}")
        Log.i(TAG, "Product: ${device.productName}")

        // TODO: Add your audio routing logic here
        // Example: Switch audio output to USB device
    }

    private fun onDeviceDisconnected() {
        // Handle device disconnection
        Log.i(TAG, "Audiocular D07 disconnected")

        // TODO: Add your audio restoration logic here
        // Example: Switch back to default audio output
    }

    fun cleanup() {
        try {
            context.unregisterReceiver(usbReceiver)
            Log.d(TAG, "UsbAudioManager cleaned up")
        } catch (e: Exception) {
            Log.e(TAG, "Error cleaning up UsbAudioManager", e)
        }
    }

    fun getCurrentDevice(): UsbDevice? = currentUsbDevice

    fun isAudiocularConnected(): Boolean = currentUsbDevice != null
}
