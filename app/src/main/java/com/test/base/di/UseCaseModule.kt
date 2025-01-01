package com.test.base.di

import com.test.domain.repositories.CoinRepository
import com.test.domain.usecase.GetCoinUseCase
import com.test.domain.usecaseimpl.GetCoinUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {

    @Provides
    fun provideGetCoinUseCase(
        repository: CoinRepository
    ): GetCoinUseCase{
        return GetCoinUseCaseImpl(repository)
    }
}