package com.devassistantai.api

import com.devassistantai.model.Subject
import kotlinx.coroutines.flow.Flow

interface TheoryRepositoryApi {

    fun getAll(): Flow<List<Subject>>

    fun getTopicBySubjectId(id: String): Subject
}