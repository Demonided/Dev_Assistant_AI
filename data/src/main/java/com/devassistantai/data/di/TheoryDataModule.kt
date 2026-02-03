package com.devassistantai.data.di

import com.devassistantai.data.repository.MockTheoryRepositoryImpl
import com.devassistantai.domain.repository.TheoryRepositoryApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TheoryDataModule {

    @Provides
    @Singleton
    fun providesMockTheoryRepository(): TheoryRepositoryApi = MockTheoryRepositoryImpl()
}