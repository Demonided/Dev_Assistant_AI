package com.example.tests.presentation.viewmodel

import com.example.com.example.devassistantai.viewmodel.BaseViewModel
import com.example.tests.domain.model.AnswerState
import com.example.tests.domain.model.QuestionWitchAnswer
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuizScreenViewModel @Inject constructor(
//    val repositoryQuiz: RepositoryQuiz,
) : BaseViewModel<QuizState, QuizEvent>() {

    val questions = listOf(
        QuestionWitchAnswer(
            question = "What is the capital of France?",
            responseOption = listOf("Berlin", "Madrid", "Paris", "Rome"),
            correctAnswer = "Paris"
        ),
        QuestionWitchAnswer(
            question = "What is the largest planet in our solar system?",
            responseOption = listOf("Earth", "Mars", "Jupiter", "Saturn"),
            correctAnswer = "Jupiter"
        ),
        QuestionWitchAnswer(
            question = "What is the smallest country in the world?",
            responseOption = listOf("Vatican City", "Monaco", "San Marino", "Liechtenstein"),
            correctAnswer = "Vatican City"
        ),
    )

    override fun initialState(): QuizState {
        return QuizState(
            listQuestion = questions,
        )
    }

    fun onAnswerSelected(index: Int) {
        updateState {
            copy(
                selectedAnswerIndex = index,
                answerState = AnswerState.SELECTED,
                quizProgress = quizProgress.copy(
                    selectedAnswer = index
                )
            )
        }
    }

    fun onClickNextQuestion() {
        val state = state.value

        if (state.selectedAnswerIndex == null) return

        if (state.currentQuestionIndex == state.listQuestion.lastIndex) {
            sendEvent(QuizEvent.NavigateToResultScreen)
        } else {
            updateState {
                copy(
                    currentQuestionIndex = currentQuestionIndex + 1,
                    selectedAnswerIndex = null,
                    answerState = AnswerState.DEFAULT,
                    quizProgress = quizProgress.copy(
                        current = quizProgress.current + 1,
                        selectedAnswer = -1
                    )
                )
            }
        }
    }
}