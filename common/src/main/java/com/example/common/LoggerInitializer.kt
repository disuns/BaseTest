package com.example.common

import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.FormatStrategy
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoggerInitializer @Inject constructor() {
    init{
        val formatStrategy: FormatStrategy = PrettyFormatStrategy.newBuilder()
            .showThreadInfo(false)
            .methodCount(5)
            .tag("My App")
            .build()
        Logger.addLogAdapter(AndroidLogAdapter(formatStrategy))
    }
}