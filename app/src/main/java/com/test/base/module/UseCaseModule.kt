package com.test.base.module

import com.test.domain.usercaseimpl.GetCoinUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideGetCoinUseCase() = GetCoinUseCaseImpl()
}