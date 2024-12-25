package com.test.data.local.datasource

import com.test.data.local.dao.CoinDao
import javax.inject.Inject

interface LocalDataSource {
}

class LocalDataSourceImpl @Inject constructor(
    private val coinDao: CoinDao
) : LocalDataSource {
}