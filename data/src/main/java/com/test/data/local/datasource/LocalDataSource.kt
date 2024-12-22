package com.test.data.local.datasource

import com.test.data.local.dao.CoinDao

interface LocalDataSource {
}

class LocalDataSourceImpl(
    private val coinDao: CoinDao
) : LocalDataSource {
}