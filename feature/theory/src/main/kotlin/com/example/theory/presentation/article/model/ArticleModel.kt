package com.example.theory.presentation.article.model

data class ArticleModel(
    val id: String,
    val topicId: String,
    val topicTitle: String,
    val topicDuration: Int,
    val content: String,
)