package com.devassistantai.domain.repository

import com.devassistantai.domain.model.theory.Topic
import kotlinx.coroutines.flow.Flow

interface TopicRepositoryApi {
    suspend fun getAllBySubjectId(subjectId: String): Flow<List<Topic>>
}