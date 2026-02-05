package com.devassistantai.data.repository

import com.devassistantai.domain.model.profile.Statistics
import com.devassistantai.domain.repository.ProfileRepositoryApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class MockProfileRepository : ProfileRepositoryApi {
    override suspend fun getStatistics(): Flow<Statistics> {
        return flowOf(Statistics(243, 67, 12))
    }
}