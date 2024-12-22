package com.example.presentation.mappers

import com.example.presentation.models.CoinUiModel
import com.test.domain.models.CoinDomainModel

object CoinPresentationMapper {
    fun domainToUI(coin:CoinDomainModel): CoinUiModel {
        return CoinUiModel(
            id = coin.id
        )
    }

    fun uiToDomain(coin:CoinUiModel): CoinDomainModel{
        return CoinDomainModel(
            id = coin.id
        )
    }
}