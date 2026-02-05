package com.devassistantai.domain.repository

import com.devassistantai.domain.model.theory.Subject
import kotlinx.coroutines.flow.Flow

interface TheoryRepositoryApi {
    suspend fun getAll(): Flow<List<Subject>>
}