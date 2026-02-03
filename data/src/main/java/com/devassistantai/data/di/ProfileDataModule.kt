package com.devassistantai.data.di

import com.devassistantai.data.repository.MockProfileRepository
import com.devassistantai.domain.repository.ProfileRepositoryApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ProfileDataModule {

    @Provides
    @Singleton
    fun providesMockProfileRepository(): ProfileRepositoryApi =
        MockProfileRepository()
}