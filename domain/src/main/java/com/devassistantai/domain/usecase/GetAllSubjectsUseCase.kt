package com.devassistantai.domain.usecase

import com.devassistantai.domain.model.Subject
import com.devassistantai.domain.repository.TheoryRepositoryApi
import kotlinx.coroutines.flow.Flow

class GetAllSubjectsUseCase(
    private val subjectRepository: TheoryRepositoryApi
) {

    suspend fun invoke(): Flow<List<Subject>> {
        return subjectRepository.getAll()
    }
}