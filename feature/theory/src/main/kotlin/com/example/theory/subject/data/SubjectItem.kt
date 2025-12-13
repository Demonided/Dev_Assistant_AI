package com.example.theory.subject.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class SubjectItem(
    val icon: ImageVector,
    val title: String,
    val questionCount: Int,
    val progress: Float,
    val colors: List<Color>
)
