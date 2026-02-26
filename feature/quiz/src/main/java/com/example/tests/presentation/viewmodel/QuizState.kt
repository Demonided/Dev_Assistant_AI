package com.example.tests.presentation.viewmodel

import androidx.compose.ui.Modifier
import com.example.com.example.devassistantai.viewmodel.BaseViewState
import com.example.tests.domain.model.AnswerState
import com.example.tests.domain.model.QuestionWitchAnswer
import com.example.tests.domain.model.QuizProgressUiModel

data class QuizState(
    val listQuestion: List<QuestionWitchAnswer> = emptyList(),
    val currentQuestionIndex: Int = 0,

    val selectedAnswerIndex: Int? = null,
    val answerState: AnswerState = AnswerState.DEFAULT,

    val quizProgress: QuizProgressUiModel = QuizProgressUiModel(
        current = 1,
        total = 0,
        selectedAnswer = -1
    ),
    val nameQuiz: String = "",
    val isLoading: Boolean = false,
    val errorMessage: String? = null,

//    val isEnableBack: Boolean = false,
//    val isEnableNext: Boolean = false,
) : BaseViewState
