package com.devassistantai.domain.model.theory

data class Article(
    val id: String,
    val topicId: String,
    val topicTitle: String,
    val topicDuration: Int,
    val content: String,
)
