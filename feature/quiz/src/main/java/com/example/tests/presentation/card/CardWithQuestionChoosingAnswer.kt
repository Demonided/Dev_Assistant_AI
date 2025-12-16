package com.example.tests.presentation.card

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tests.domain.model.QuestionWitchAnswer
import com.example.ui_theme.ui.theme.DevAssistantAITheme

@Composable
fun CardWithQuestionChoosingAnswer(
    question: QuestionWitchAnswer,
    answerOptions: List<String>,
    isSelected: Int,
    modifier: Modifier = Modifier,
) {
    Column() {
        Text(text = "")

        question.responseOption.forEachIndexed { index, string ->
            SelectedAnswerOption(
                isSelected = isSelected == index,
                answerOption = "ssa",
                correctedAnswerOption = "da",
                questionNumber = "da",
                modifier = Modifier
            )
        }
    }
}

@Preview
@Composable
fun CardWithQuestionChoosingAnswerPreview() {
    DevAssistantAITheme {
        val answerOption = listOf("a", "b", "c", "d")
        CardWithQuestionChoosingAnswer(
            modifier = Modifier,
            question = QuestionWitchAnswer(
                question = "How",
                responseOption = listOf(),
                answer = "yes"
            ),
            answerOptions = answerOption,
            isSelected = 1
        )
    }
}