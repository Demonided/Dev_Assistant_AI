package com.example.tests.presentation.viewmodel

import com.example.com.example.devassistantai.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuizScreenViewModel @Inject constructor() : BaseViewModel<QuizState, QuizEvent>(){

    override fun initialState(): QuizState {
        return QuizState("first")
    }

}