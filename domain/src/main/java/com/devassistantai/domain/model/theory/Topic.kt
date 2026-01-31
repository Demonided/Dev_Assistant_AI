package com.devassistantai.domain.model.theory

data class Topic(
    val id: String,
    val subjectId: String,
    val orderNumber: Int,
    val title: String,
    val duration: Int,
    val isCompleted: Boolean,
    val icon: String,
)