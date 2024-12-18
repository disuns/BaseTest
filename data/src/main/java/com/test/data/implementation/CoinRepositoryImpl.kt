package com.test.data.implementation

import com.test.domain.model.Coin
import com.test.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor() : CoinRepository {
    override suspend fun fetchCoin(): List<Coin> {
        return listOf(Coin(1))
    }
}