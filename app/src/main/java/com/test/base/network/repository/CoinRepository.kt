package com.test.base.network.repository

import com.test.base.network.service.CoinService
import javax.inject.Inject

class CoinRepository @Inject constructor(private val service: CoinService) {
}