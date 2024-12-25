package com.test.base.di

import com.test.data.implementations.CoinRepositoryImpl
import com.test.data.local.datasource.LocalDataSource
import com.test.data.mapper.CoinDataMapper
import com.test.data.remote.datasource.RemoteDataSource
import com.test.domain.repositories.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideCoinRepository(
        localDataSource: LocalDataSource,
        remoteDataSource: RemoteDataSource,
        mapper: CoinDataMapper
    ): CoinRepository {
        return CoinRepositoryImpl(
            localDataSource = localDataSource,
            remoteDataSource = remoteDataSource,
            mapper = mapper
        )
    }
}