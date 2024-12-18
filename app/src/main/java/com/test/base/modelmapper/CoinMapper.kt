package com.test.base.modelmapper

import com.test.base.model.CoinModel
import com.test.domain.model.Coin

object CoinMapper {
    fun map(coin:Coin):CoinModel{
        return CoinModel(
            id = coin.id
        )
    }
}