package com.example.tests.presentation.viewmodel

import com.example.com.example.devassistantai.viewmodel.BaseViewState

data class QuizState(
    val state: String,
    val isLoading: Boolean = false,
) : BaseViewState
