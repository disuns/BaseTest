package com.test.domain.usercaseimpl

import com.test.domain.model.Coin
import com.test.domain.repository.CoinRepository
import com.test.domain.usecase.GetCoinUseCase

class GetCoinUseCaseImpl(private val coinRepository: CoinRepository) : GetCoinUseCase {
    override suspend fun invoke():Coin {
        return coinRepository.fetchCoin()
    }
}