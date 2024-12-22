package com.test.data.mapper

import com.test.data.local.entity.CoinEntity
import com.test.data.remote.response.CoinResponse
import com.test.domain.models.CoinDomainModel

class CoinDataMapper {

    fun responseToDomain(coin: CoinResponse): CoinDomainModel {
        return CoinDomainModel(
            id = coin.id
        )
    }

    fun domainToResponse(coin: CoinDomainModel): CoinResponse {
        return CoinResponse(
            id = coin.id
        )
    }

    fun entityToDomain(coin: CoinEntity): CoinDomainModel {
        return CoinDomainModel(
            id = coin.id
        )
    }

    fun domainToEntity(coin: CoinDomainModel): CoinEntity {
        return CoinEntity(
            id = coin.id
        )
    }
}