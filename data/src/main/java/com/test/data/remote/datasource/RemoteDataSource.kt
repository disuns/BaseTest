package com.test.data.remote.datasource

import com.test.data.local.entity.CoinEntity
import com.test.data.remote.network.service.CoinService
import javax.inject.Inject

interface RemoteDataSource {
    suspend fun getCoin(id:Int) : CoinEntity
}

class RemoteDataSourceImpl @Inject constructor(
    private val coinService: CoinService
) : RemoteDataSource{
    override suspend fun getCoin(id: Int): CoinEntity {
//        return coinService.()
        return
    }
}