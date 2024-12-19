package com.test.base.app

import android.app.Application
import com.example.common.LoggerInitializer
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApplication :Application(){
    override fun onCreate() {
        super.onCreate()
        LoggerInitializer.initialize()
    }
}