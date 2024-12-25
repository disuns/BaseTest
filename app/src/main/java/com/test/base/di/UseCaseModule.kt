package com.test.base.di

import com.test.domain.repositories.CoinRepository
import com.test.domain.usecase.GetCoinUseCase
import com.test.domain.usecaseimpl.GetCoinUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {
    @Provides
    @ViewModelScoped
    fun provideGetCoinUseCase(
        coinRepository: CoinRepository
    ): GetCoinUseCase {
        return GetCoinUseCaseImpl(coinRepository)
    }
}