package com.devassistantai.domain.di

import com.devassistantai.domain.repository.ProfileRepositoryApi
import com.devassistantai.domain.usecase.GetStatisticsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ProfileDomainModule {

    @Provides
    @Singleton
    fun providesGetStatisticsUseCase(profileRepository: ProfileRepositoryApi): GetStatisticsUseCase =
        GetStatisticsUseCase(profileRepository)
}