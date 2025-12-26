package com.example.tests.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tests.domain.model.AnswerState
import com.example.tests.domain.model.QuestionWitchAnswer
import com.example.tests.domain.model.QuizProgressUiModel
import com.example.tests.presentation.ui.components.card.CardWithQuestionChoosingAnswer
import com.example.tests.presentation.ui.quizbar.TopQuizBar
import com.example.ui_theme.component.AdaptiveButton
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.R
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun QuizRoute() {
    val listQuestion = listOf(
        QuestionWitchAnswer(
            question = "Что такое Activity в Android?",
            responseOption = listOf(
                "Компонент для отображения UI",
                "Файл конфигурации",
                "Сервис для фоновых задач",
                "База данных"
            ),
            correctAnswer = ""
        )
    )

    QuizScreen(
        listQuestion = listQuestion,
        answerState = AnswerState.DEFAULT,
        quizProgress = QuizProgressUiModel(
            current = 3,
            total = 6,
            selectedAnswer = 1
        ),
        onClickBack = {},
        onClickNext = {},
        nameQuiz = "Quiz Name",
        modifier = Modifier
    )
}
@Composable
fun QuizScreen(
    listQuestion: List<QuestionWitchAnswer>,
    answerState: AnswerState,
    quizProgress: QuizProgressUiModel,
    nameQuiz: String,
    onClickBack: () -> Unit,
    onClickNext: () -> Unit,
    modifier: Modifier = Modifier,
    isEnableBack: Boolean = false,
    isEnableNext: Boolean = false,
) {
    Scaffold(
        topBar = {
            TopQuizBar(
                quizProgress,
                nameQuiz = nameQuiz
            )
        },
        containerColor = DevAssistantTheme.colors.appBackground
    ) { paddingValues ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 24.dp)
        ) {
            listQuestion.forEach { answer ->
                CardWithQuestionChoosingAnswer(
                    question = answer,
                    answerState = answerState,
                    modifier = Modifier
                        .padding(paddingValues)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 30.dp)
            ) {
                AdaptiveButton(
                    buttonText = stringResource(R.string.button_back),
                    startButtonIcon = R.drawable.icon_arrow_back,
                    isEnable = isEnableBack,
                    onClick = onClickBack,
                    modifier = Modifier
                        .weight(1f)
                )

                Spacer(modifier = Modifier.width(16.dp))

                AdaptiveButton(
                    buttonText = stringResource(R.string.button_next),
                    endButtonIcon = R.drawable.icon_arrow_next,
                    isEnable = isEnableNext,
                    onClick = onClickNext,
                    isGradient = true,
                    modifier = Modifier
                        .weight(1f)
                        .padding()
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun QuizScreenPreview() {
    val listQuestion = listOf(
        QuestionWitchAnswer(
            question = "Что такое Activity в Android?",
            responseOption = listOf(
                "Компонент для отображения UI",
                "Файл конфигурации",
                "Сервис для фоновых задач",
                "База данных"
            ),
            correctAnswer = ""
        )
    )
    DevAssistantAITheme {
        QuizScreen(
            listQuestion = listQuestion,
            answerState = AnswerState.SELECTED,
            quizProgress = QuizProgressUiModel(
                current = 3,
                total = 6,
                selectedAnswer = 1
            ),
            onClickBack = {},
            onClickNext = {},
            nameQuiz = "Quiz Name",
            modifier = Modifier
        )
    }
}