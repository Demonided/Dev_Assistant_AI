package com.devassistantai.domain.model

data class Subject(
    val id: String,
    val icon: String,
    val title: String,
    val questionCount: Int,
    val progress: Float,
    val colors: List<String>
)