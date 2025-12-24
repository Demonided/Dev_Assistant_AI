package com.example.tests.presentation.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun QuizProgressBar(
    currentQuestion: Int,
    totalQuestion: Int,
    modifier: Modifier = Modifier
) {
    val targetProgress = currentQuestion / totalQuestion.toFloat()

    val animatedProgress by animateFloatAsState(
        targetValue = targetProgress,
        animationSpec = tween(durationMillis = 400),
        label = "Quiz Progress Animation"
    )

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(6.dp)
            .background(
                color = DevAssistantTheme.colors.quiz.quizProgressBar.copy(alpha = 0.4f),
                shape = RoundedCornerShape(50)
            )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(animatedProgress)
                .fillMaxHeight()
                .background(
                    color = DevAssistantTheme.colors.quiz.quizProgressBar,
                    shape = RoundedCornerShape(50)
                )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuizProgressBarPreview() {
    DevAssistantAITheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .height(22.dp)
                .background(
                    color = DevAssistantTheme.colors.appStartGradient
                )
        ) {
            QuizProgressBar(currentQuestion = 4, totalQuestion = 10)
        }
    }
}