package com.devassistantai.data.theory

import com.devassistantai.api.TheoryRepositoryApi
import com.devassistantai.model.Subject
import kotlinx.coroutines.flow.Flow

class TheoryRepositoryImpl : TheoryRepositoryApi {

    override fun getAll(): Flow<List<Subject>> {
        TODO("Not yet implemented")
    }

    override fun getTopicBySubjectId(id: String): Subject {
        TODO("Not yet implemented")
    }
}