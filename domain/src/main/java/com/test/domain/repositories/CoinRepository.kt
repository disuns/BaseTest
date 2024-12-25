package com.test.domain.repositories

import com.test.domain.ApiResult
import com.test.domain.models.CoinDomainModel
import kotlinx.coroutines.flow.Flow

interface CoinRepository {
    fun fetchCoin() : Flow<ApiResult<CoinDomainModel>>
    suspend fun localCoin() : CoinDomainModel
}