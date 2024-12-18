package com.test.data.module

import com.test.data.implementation.CoinRepositoryImpl
import com.test.domain.repository.CoinRepository
import com.test.domain.usecase.GetCoinUseCase
import com.test.domain.usercaseimpl.GetCoinUseCaseImpl
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