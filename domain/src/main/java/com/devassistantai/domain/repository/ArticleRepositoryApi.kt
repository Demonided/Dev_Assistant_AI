package com.devassistantai.domain.repository

import com.devassistantai.domain.model.theory.Article
import kotlinx.coroutines.flow.Flow

interface ArticleRepositoryApi {
    suspend fun getAllByTopicId(topicId: String): Flow<Article>
}