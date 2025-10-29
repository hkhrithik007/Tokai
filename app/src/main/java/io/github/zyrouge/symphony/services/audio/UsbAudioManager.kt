package io.github.zyrouge.symphony.services.audio

import android.content.Context
import android.hardware.usb.UsbDevice
import android.hardware.usb.UsbManager
import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioManager
import android.media.AudioTrack
import android.os.Build
import android.util.Log

class UsbAudioManager(private val context: Context) {
    private val audioManager = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
    private var audioTrack: AudioTrack? = null

    companion object {
        private const val TAG = "UsbAudioManager"
    }

    /**
     * Check if exclusive USB audio mode is supported
     */
    fun isExclusiveModeSupported(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M // Android 6+
    }

    /**
     * Check if a USB DAC is connected
     */
    fun isUsbDacConnected(): Boolean {
        val usbManager = context.getSystemService(Context.USB_SERVICE) as UsbManager
        return usbManager.deviceList.values.any { device ->
            isAudioDevice(device)
        }
    }

    private fun isAudioDevice(device: UsbDevice): Boolean {
        for (i in 0 until device.interfaceCount) {
            val usbInterface = device.getInterface(i)
            if (usbInterface.interfaceClass == 1) { // USB Audio Class
                return true
            }
        }
        return false
    }

    /**
     * Create AudioTrack with direct playback for USB DAC
     */
    fun createExclusiveAudioTrack(
        sampleRate: Int,
        channelConfig: Int,
        audioFormat: Int
    ): AudioTrack? {
        try {
            val format = AudioFormat.Builder()
                .setEncoding(audioFormat)
                .setSampleRate(sampleRate)
                .setChannelMask(channelConfig)
                .build()

            val attributes = AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build()

            val bufferSize = AudioTrack.getMinBufferSize(
                sampleRate,
                channelConfig,
                audioFormat
            ) * 4 // Larger buffer for stability

            if (bufferSize <= 0) {
                Log.w(TAG, "Invalid buffer size for sample rate: $sampleRate")
                return null
            }

            audioTrack = AudioTrack.Builder()
                .setAudioAttributes(attributes)
                .setAudioFormat(format)
                .setBufferSizeInBytes(bufferSize)
                .setTransferMode(AudioTrack.MODE_STREAM)
                .setPerformanceMode(AudioTrack.PERFORMANCE_MODE_LOW_LATENCY)
                .build()

            Log.d(TAG, "Created exclusive AudioTrack: $sampleRate Hz, format: $audioFormat")
            return audioTrack

        } catch (e: Exception) {
            Log.e(TAG, "Failed to create exclusive AudioTrack", e)
            return null
        }
    }

    fun release() {
        audioTrack?.release()
        audioTrack = null
    }
}
