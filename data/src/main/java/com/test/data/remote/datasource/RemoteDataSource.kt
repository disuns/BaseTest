package com.test.data.remote.datasource

import com.test.data.local.entity.CoinEntity
import com.test.data.remote.network.service.CoinService
import com.test.data.remote.response.CoinResponse
import retrofit2.Response
import javax.inject.Inject

interface RemoteDataSource {
    suspend fun fetchCoin(id:Int) : Response<CoinResponse>
}

class RemoteDataSourceImpl @Inject constructor(
    private val coinService: CoinService
) : RemoteDataSource{
    override suspend fun fetchCoin(id: Int): Response<CoinResponse> {
        return coinService.getCoin()
    }
}