package com.example.presentation.module

import com.test.domain.repository.CoinRepository
import com.test.domain.usercaseimpl.GetCoinUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideGetCoinUseCase(coinRepository: CoinRepository) = GetCoinUseCaseImpl(coinRepository)
}