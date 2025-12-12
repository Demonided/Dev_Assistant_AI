package com.example.tests.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_theme.ui.theme.DevAssistantAITheme

@Composable
fun QuizScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Экран контрольных вопросов",
            color = Color.Red
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuizScreenPreview() {
    DevAssistantAITheme {
        QuizScreen()
    }
}