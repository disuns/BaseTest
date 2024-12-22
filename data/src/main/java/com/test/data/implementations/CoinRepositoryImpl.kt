package com.test.data.implementations

import com.test.data.local.datasource.LocalDataSource
import com.test.data.mapper.CoinDataMapper
import com.test.data.remote.datasource.RemoteDataSource
import com.test.domain.models.CoinDomainModel
import com.test.domain.repositories.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource,
    private val mapper: CoinDataMapper
) : CoinRepository {
    override suspend fun fetchCoin(): CoinDomainModel {
        remoteDataSource.fetchCoin(1)
        return CoinDomainModel(1)
    }

    override suspend fun localCoin(): CoinDomainModel {
        localDataSource
        return CoinDomainModel(1)
    }
}