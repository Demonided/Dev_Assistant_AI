package com.example.theory.presentation.subject.ui.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class SubjectModel(
    val id: String,
    val icon: ImageVector,
    val title: String,
    val questionCount: Int,
    val progress: Float,
    val colors: List<Color>
)