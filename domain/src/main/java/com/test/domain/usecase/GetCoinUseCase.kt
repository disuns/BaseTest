package com.test.domain.usecase

import com.test.domain.model.Coin

interface GetCoinUseCase {
    suspend operator fun invoke() : List<Coin>
}