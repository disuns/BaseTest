package com.example.common

import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.FormatStrategy
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy

object LoggerInitializer {
    fun initialize() {
        val formatStrategy: FormatStrategy = PrettyFormatStrategy.newBuilder()
            .showThreadInfo(false)
            .methodCount(5)
            .tag("My App")
            .build()
        Logger.addLogAdapter(AndroidLogAdapter(formatStrategy))
    }
}