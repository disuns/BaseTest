package com.test.domain.usecaseimpl

import com.test.domain.ApiResult
import com.test.domain.models.CoinDomainModel
import com.test.domain.repositories.CoinRepository
import com.test.domain.usecase.GetCoinUseCase
import kotlinx.coroutines.flow.Flow

class GetCoinUseCaseImpl(
    private val coinRepository: CoinRepository) : GetCoinUseCase {
    override fun invoke(): Flow<ApiResult<CoinDomainModel>> {
        return coinRepository.fetchCoin()
    }
}