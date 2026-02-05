package com.devassistantai.domain.repository

import com.devassistantai.domain.model.profile.Statistics
import kotlinx.coroutines.flow.Flow

interface ProfileRepositoryApi {
    suspend fun getStatistics(): Flow<Statistics>
}