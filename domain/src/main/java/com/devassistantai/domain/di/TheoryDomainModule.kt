package com.devassistantai.domain.di

import com.devassistantai.domain.repository.TheoryRepositoryApi
import com.devassistantai.domain.repository.TopicRepositoryApi
import com.devassistantai.domain.usecase.GetAllTopicsBySubjectIdUseCase
import com.devassistantai.domain.usecase.GetSubjectsListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TheoryDomainModule {

    @Provides
    @Singleton
    fun providesGetSubjectsListUseCase(subjectRepository: TheoryRepositoryApi): GetSubjectsListUseCase =
        GetSubjectsListUseCase(subjectRepository)

    @Provides
    @Singleton
    fun providesGetAllTopicsBySubjectIdUseCase(topicRepository: TopicRepositoryApi): GetAllTopicsBySubjectIdUseCase =
        GetAllTopicsBySubjectIdUseCase(topicRepository)
}