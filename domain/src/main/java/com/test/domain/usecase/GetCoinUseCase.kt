package com.test.domain.usecase

import com.test.domain.ApiResult
import com.test.domain.models.CoinDomainModel
import kotlinx.coroutines.flow.Flow

interface GetCoinUseCase {
    suspend operator fun invoke() : Flow<ApiResult<CoinDomainModel>>
}