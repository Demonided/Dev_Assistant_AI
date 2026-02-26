package com.example.tests.presentation.viewmodel

import com.example.com.example.devassistantai.viewmodel.BaseEvent

sealed interface QuizEvent : BaseEvent {
    object NavigateToNextScreen : QuizEvent
    object NavigateToResultScreen : QuizEvent
}