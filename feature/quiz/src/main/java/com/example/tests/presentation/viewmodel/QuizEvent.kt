package com.example.tests.presentation.viewmodel

import com.example.com.example.devassistantai.viewmodel.BaseEvent

sealed interface QuizEvent : BaseEvent {

    data class QuizError(val message: String) : QuizEvent
    object NavigateToNextScreen : QuizEvent
    object NavigateToResultScreen : QuizEvent
}