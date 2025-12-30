package com.example.tests.presentation.ui.quizbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tests.domain.model.QuizProgressUiModel
import com.example.tests.presentation.ui.components.QuizProgressBar
import com.example.ui_theme.R
import com.example.ui_theme.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun TopQuizBar(
    quizProgress: QuizProgressUiModel,
    nameQuiz: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .angleLinearGradient(
                colors = DevAssistantGradient.primary(),
                angle = 60f
            )
            .padding(horizontal = 20.dp, vertical = 22.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    text = nameQuiz,
                    style = DevAssistantTheme.typography.answerOptionText.copy(
                        fontSize = 22.sp,
                    ),
                    color = DevAssistantTheme.colors.white,
                )
                Text(
                    text = "Вопрос ${quizProgress.current} из ${quizProgress.total}",
                    style = DevAssistantTheme.typography.answerOptionText.copy(
                        fontSize = 14.sp,
                        color = DevAssistantTheme.colors.white.copy(alpha = 0.7f)
                    ),
                    modifier = Modifier
                        .padding(vertical = 4.dp)
                )
            }

            Surface(
                shape = RoundedCornerShape(12.dp),
                color = DevAssistantTheme.colors.white.copy(alpha = 0.2f)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_bookmark_plus),
                    contentDescription = null,
                    tint = DevAssistantTheme.colors.whiteBlack,
                    modifier = Modifier
                        .size(34.dp)
                        .padding(8.dp)
                )
            }

        }

        QuizProgressBar(
            currentQuestion = quizProgress.current,
            totalQuestion = quizProgress.total,
            modifier = modifier
                .padding(vertical = 12.dp)
        )

        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon(
                painterResource(R.drawable.icon_flag),
                contentDescription = null,
                tint = DevAssistantTheme.colors.white,
                modifier = Modifier
                    .size(16.dp)
            )

            Text(
                text = "Баллы: ",
                style = DevAssistantTheme.typography.answerOptionText.copy(
                    fontSize = 14.sp,
                    color = DevAssistantTheme.colors.white.copy(alpha = 0.7f)
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
            )

            Text(
                text = "${quizProgress.selectedAnswer}/${quizProgress.total}",
                style = DevAssistantTheme.typography.answerOptionText.copy(
                    fontSize = 14.sp,
                    color = DevAssistantTheme.colors.white.copy(alpha = 0.7f)
                ),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TopQuizBarPreview() {
    DevAssistantAITheme {
        TopQuizBar(
            quizProgress = QuizProgressUiModel(
                current = 7,
                total = 10,
                selectedAnswer = 4
            ),
            nameQuiz = "Kotlin Quiz",
            modifier = Modifier
        )
    }
}