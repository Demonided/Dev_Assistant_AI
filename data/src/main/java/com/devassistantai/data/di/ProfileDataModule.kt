package com.devassistantai.data.di

import com.devassistantai.data.repository.mock.MockProfileRepositoryImpl
import com.devassistantai.domain.repository.ProfileRepositoryApi
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface ProfileDataModule {

    @Binds
    fun bindMockProfileRepository(impl: MockProfileRepositoryImpl): ProfileRepositoryApi
}