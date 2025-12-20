package com.example.tests.domain.model

data class QuestionWitchAnswer(
    val question: String,
    val responseOption: List<String>,
    val correctAnswer: String
)
