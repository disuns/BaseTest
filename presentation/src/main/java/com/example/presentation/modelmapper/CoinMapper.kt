package com.example.presentation.modelmapper

import com.example.presentation.model.CoinModel
import com.test.domain.model.Coin

object CoinMapper {
    fun toCoinModel(coin:Coin): CoinModel {
        return CoinModel(
            id = coin.id
        )
    }
}