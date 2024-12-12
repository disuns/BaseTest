package com.test.base.utils

import com.orhanobut.logger.Logger

fun Any.logMessage(message: Any?, tag: String = "MyApp") {
    Logger.t(tag).e(message.toString())
}