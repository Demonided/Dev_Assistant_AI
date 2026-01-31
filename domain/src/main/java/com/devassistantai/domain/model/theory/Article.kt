package com.devassistantai.domain.model.theory

data class Article(
    val id: String,
    val topicId: String,
    val title: String,
    val content: String,
    val duration: Int,
)
