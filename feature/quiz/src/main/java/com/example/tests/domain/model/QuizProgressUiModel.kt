package com.example.tests.domain.model

data class QuizProgressUiModel(
    val current: Int,
    val total: Int,
    val selectedAnswer: Int = 0
)
