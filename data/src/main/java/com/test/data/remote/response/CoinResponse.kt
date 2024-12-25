package com.test.data.remote.response

import com.google.gson.annotations.SerializedName

data class CoinResponse(
    @SerializedName("id")
    val id: Int
)