package com.moon.sernot

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channel = NotificationChannel(
                "running_channel",
                "Baur",
                NotificationManager.IMPORTANCE_HIGH
            )
            val notificationChannel = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationChannel.createNotificationChannel(channel)
        }
    }
}