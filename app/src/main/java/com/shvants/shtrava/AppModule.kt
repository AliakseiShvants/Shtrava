package com.shvants.shtrava

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class AppModule : Application() {

    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }
}