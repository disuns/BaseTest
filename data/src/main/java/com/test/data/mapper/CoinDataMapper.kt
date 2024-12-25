package com.test.data.mapper

import com.test.data.local.entity.CoinEntity
import com.test.data.remote.response.CoinResponse
import com.test.domain.ApiResult
import com.test.domain.models.CoinDomainModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class CoinDataMapper @Inject constructor() {
    fun responseToDomainCoin(coinFlow : Flow<ApiResult<CoinResponse>>): Flow<ApiResult<CoinDomainModel>> {
        return coinFlow.map { coin->
            when(coin){
                is ApiResult.Success -> ApiResult.Success(CoinDomainModel(id = coin.value.id))
                is ApiResult.Empty -> ApiResult.Empty
                is ApiResult.Loading -> ApiResult.Loading
                is ApiResult.Error -> ApiResult.Error(coin.code, coin.exception)
            }
        }
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