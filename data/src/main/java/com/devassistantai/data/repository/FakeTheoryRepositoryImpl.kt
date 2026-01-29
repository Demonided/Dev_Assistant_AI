package com.devassistantai.data.repository

import com.devassistantai.domain.model.Subject
import com.devassistantai.domain.repository.TheoryRepositoryApi
import kotlinx.coroutines.flow.Flow

class FakeTheoryRepositoryImpl : TheoryRepositoryApi {

    override suspend fun getAll(): Flow<List<Subject>> {
        TODO("Not yet implemented")
    }

    override suspend fun getTopicBySubjectId(id: String): Subject {
        TODO("Not yet implemented")
    }
}