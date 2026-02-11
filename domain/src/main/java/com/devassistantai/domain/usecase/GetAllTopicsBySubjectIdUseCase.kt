package com.devassistantai.domain.usecase

import com.devassistantai.domain.model.theory.Topic
import com.devassistantai.domain.repository.TopicRepositoryApi
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetAllTopicsBySubjectIdUseCase @Inject constructor(
    private val topicRepository: TopicRepositoryApi
) {

    suspend operator fun invoke(subjectId: String): Flow<List<Topic>> {
        return topicRepository.getAllBySubjectId(subjectId)
    }
}