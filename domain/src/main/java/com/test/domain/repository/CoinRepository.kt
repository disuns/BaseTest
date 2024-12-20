package com.test.domain.repository

import com.test.domain.model.Coin

interface CoinRepository {
    suspend fun fetchCoin() : Coin
}