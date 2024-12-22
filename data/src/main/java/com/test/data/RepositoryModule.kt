package com.test.data

import com.test.data.implementations.CoinRepositoryImpl
import com.test.domain.repositories.CoinRepository
import com.test.domain.usecase.GetCoinUseCase
import com.test.domain.usecaseimpl.GetCoinUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideCoinUseCase(
        coinRepository: CoinRepository
    ): GetCoinUseCase {
        return GetCoinUseCaseImpl(coinRepository)
    }

    @Provides
    @Singleton
    fun provideCoinRepository():CoinRepository{
        return  CoinRepositoryImpl()
    }
}