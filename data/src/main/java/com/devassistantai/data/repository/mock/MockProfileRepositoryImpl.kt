package com.devassistantai.data.repository.mock

import com.devassistantai.domain.model.profile.Statistics
import com.devassistantai.domain.repository.ProfileRepositoryApi
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class MockProfileRepositoryImpl @Inject constructor() : ProfileRepositoryApi {
    override suspend fun getStatistics(): Flow<Statistics> {
        return flowOf(Statistics(243, 67, 12))
    }
}