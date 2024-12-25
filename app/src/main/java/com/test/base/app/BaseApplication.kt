package com.test.base.app

import android.app.Application
import com.example.common.LoggerInitializer
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class BaseApplication :Application(){

    @Inject
    lateinit var loggerInitializer: LoggerInitializer

    override fun onCreate() {
        super.onCreate()
    }
}