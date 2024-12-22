package com.test.data.remote.network.service

import com.test.data.remote.response.CoinResponse
import retrofit2.Response
import retrofit2.http.GET

interface CoinService {
    @GET()
    suspend fun getCoin(): Response<CoinResponse>
}