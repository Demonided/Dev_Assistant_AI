package com.example.tests.presentation.quiz

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tests.domain.model.QuizProgressUiModel
import com.example.tests.presentation.ui.components.QuizProgressBar
import com.example.ui_theme.R
import com.example.ui_theme.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient

@Composable
fun TopQuizBar(
    quizProgress: QuizProgressUiModel,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .angleLinearGradient(
                colors = DevAssistantGradient.primary(),
                angle = 60f
            )
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Column() {
                Text(text = "Quiz")
                Text(text = "Вопрос 1 из 10")
            }

            Card() {
                Icon(
                    painter = painterResource(id = R.drawable.icon_bookmark_star),
                    contentDescription = null
                )
            }
        }

        QuizProgressBar(
            currentQuestion = quizProgress.current,
            totalQuestion = quizProgress.total,
            modifier = modifier
                .padding(horizontal = 6.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopQuizBarPreview() {
    DevAssistantAITheme {
        TopQuizBar(
            quizProgress = QuizProgressUiModel(
                current = 7,
                total = 10
            ),
            modifier = Modifier
        )
    }
}