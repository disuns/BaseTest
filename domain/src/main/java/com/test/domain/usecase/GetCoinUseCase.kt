package com.test.domain.usecase

import com.test.domain.models.CoinDomainModel

interface GetCoinUseCase {
    suspend operator fun invoke() : CoinDomainModel
}