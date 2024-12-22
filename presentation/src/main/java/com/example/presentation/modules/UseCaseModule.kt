package com.example.presentation.modules

import com.test.domain.repositories.CoinRepository
import com.test.domain.usecaseimpl.GetCoinUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {
    @Provides
    fun provideGetCoinUseCase(coinRepository: CoinRepository) = GetCoinUseCaseImpl(coinRepository)
}