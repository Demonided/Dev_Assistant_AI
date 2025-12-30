package com.example.tests.presentation.ui.components.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tests.domain.model.AnswerState
import com.example.tests.domain.model.QuestionWitchAnswer
import com.example.tests.util.answerLabel
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun CardWithQuestionChoosingAnswer(
    question: QuestionWitchAnswer,
    answerState: AnswerState,
    modifier: Modifier = Modifier,
) {
    Card(
        border = BorderStroke(1.dp, Color.Gray),
        colors = CardDefaults.cardColors(
            DevAssistantTheme.colors.appCardBackground
        ),
        modifier = modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 12.dp)
        ) {
            Text(
                text = question.question,
                style = DevAssistantTheme.typography.quizQuestionText,
                color = DevAssistantTheme.colors.textTitle,
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            )

            question.responseOption.forEachIndexed { index, text ->
                AnswerOption(
                    state = answerState,
                    answerOption = text,
                    questionNumber = answerLabel(index),
                    modifier = Modifier
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CardWithQuestionChoosingAnswerPreview() {
    DevAssistantAITheme {
        val answerOption = QuestionWitchAnswer(
            question = "What's happened Activity in Android?",
            responseOption = listOf("Компонент для отображения UI", "two", "three", "four"),
            correctAnswer = "two"
        )
        CardWithQuestionChoosingAnswer(
            question = answerOption,
            answerState = AnswerState.DEFAULT,
            modifier = Modifier
                .padding(horizontal = 24.dp, vertical = 24.dp)
        )
    }
}