package com.test.domain.usecaseimpl

import com.test.domain.models.CoinDomainModel
import com.test.domain.repositories.CoinRepository
import com.test.domain.usecase.GetCoinUseCase

class GetCoinUseCaseImpl(private val coinRepository: CoinRepository) : GetCoinUseCase {
    override suspend fun invoke():CoinDomainModel {
        return coinRepository.fetchCoin()
    }
}