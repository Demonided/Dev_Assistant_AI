package com.devassistantai.domain.repository

import com.devassistantai.domain.model.Subject
import kotlinx.coroutines.flow.Flow

interface TheoryRepositoryApi {

    suspend fun getAll(): Flow<List<Subject>>

    suspend fun getTopicBySubjectId(id: String): Subject
}