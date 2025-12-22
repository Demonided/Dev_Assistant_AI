package com.example.theory.presentation.topic.model

data class TopicModel(
    val id: String,
    val number: String,
    val title: String,
    val description: String,
    val duration: Int,
    val isCompleted: Boolean
)