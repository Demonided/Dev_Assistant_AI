package com.devassistantai.usecase

import com.devassistantai.api.TheoryRepositoryApi
import com.devassistantai.model.Subject
import kotlinx.coroutines.flow.Flow

class GetAllSubjectsUseCase(
    private val subjectRepository: TheoryRepositoryApi
) {

    suspend fun invoke(): Flow<List<Subject>> {
        return subjectRepository.getAll()
    }
}