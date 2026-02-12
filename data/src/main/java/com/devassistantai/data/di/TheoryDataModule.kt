package com.devassistantai.data.di

import com.devassistantai.data.repository.mock.MockArticleRepositoryImpl
import com.devassistantai.data.repository.mock.MockSubjectRepositoryImpl
import com.devassistantai.data.repository.mock.MockTopicRepositoryImpl
import com.devassistantai.domain.repository.ArticleRepositoryApi
import com.devassistantai.domain.repository.TheoryRepositoryApi
import com.devassistantai.domain.repository.TopicRepositoryApi
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface TheoryDataModule {

    @Binds
    fun bindMockTheoryRepository(impl: MockSubjectRepositoryImpl): TheoryRepositoryApi

    @Binds
    fun bindMockTopicRepository(impl: MockTopicRepositoryImpl): TopicRepositoryApi

    @Binds
    fun bindMockArticleRepository(impl: MockArticleRepositoryImpl): ArticleRepositoryApi
}