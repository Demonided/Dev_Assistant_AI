package com.devassistantai.domain.usecase

import com.devassistantai.domain.model.theory.Article
import com.devassistantai.domain.repository.ArticleRepositoryApi
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetArticleByTopicIdUseCase @Inject constructor(
    private val articleRepository: ArticleRepositoryApi
) {

    suspend operator fun invoke(topicId: String): Flow<Article> {
        return articleRepository.getAllByTopicId(topicId)
    }
}