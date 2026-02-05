package com.devassistantai.domain.usecase

import com.devassistantai.domain.model.theory.Subject
import com.devassistantai.domain.repository.TheoryRepositoryApi
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetSubjectsListUseCase @Inject constructor(
    private val subjectRepository: TheoryRepositoryApi
) {
    suspend operator fun invoke(): Flow<List<Subject>> {
        return subjectRepository.getAll()
    }
}