package com.test.data.remote.datasource

import com.test.data.remote.network.safeFlow
import com.test.data.remote.network.service.CoinService
import com.test.data.remote.response.CoinResponse
import com.test.domain.ApiResult
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface RemoteDataSource {
    fun fetchCoin(id:Int) : Flow<ApiResult<CoinResponse>>
}

class RemoteDataSourceImpl @Inject constructor(
    private val coinService: CoinService
) : RemoteDataSource{
    override fun fetchCoin(id: Int) = safeFlow { coinService.getCoin() }
}