package com.devassistantai.domain.usecase

import com.devassistantai.domain.model.profile.Statistics
import com.devassistantai.domain.repository.ProfileRepositoryApi
import kotlinx.coroutines.flow.Flow

class GetStatisticsUseCase(
    private val profileRepository: ProfileRepositoryApi
) {
    suspend operator fun invoke(): Flow<Statistics> {
        return profileRepository.getStatistics()
    }
}