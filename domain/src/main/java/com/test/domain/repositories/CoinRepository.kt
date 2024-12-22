package com.test.domain.repositories

import com.test.domain.models.CoinDomainModel

interface CoinRepository {
    suspend fun fetchCoin() : CoinDomainModel
    suspend fun localCoin() : CoinDomainModel
}