package com.example.theory.presentation.topic.model

import androidx.compose.ui.graphics.vector.ImageVector

data class TopicModel(
    val id: String,
    val orderNumber: Int,
    val title: String,
    val duration: Int,
    val isCompleted: Boolean,
    val icon: ImageVector
)