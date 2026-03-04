package com.example.ai_chat

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ai_chat.presentation.model.MessageModel
import com.example.ai_chat.presentation.ui.components.chat.MessageItem
import com.example.ai_chat.presentation.ui.components.header.ChatHeader
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun ChatAIScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = DevAssistantTheme.colors.appBackground),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        ChatHeader()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 22.dp, end = 22.dp)
        ) {
            MessageItem(
                message = MessageModel(
                    id = "1",
                    text = "Привет! Я AI-помощник для подготовки к собеседованию по Android. Задавай любые вопросы о разработке!",
                    "16:40",
                    false
                )
            )

            MessageItem(
                message = MessageModel(
                    id = "1",
                    text = "Расскажи мне пожалуйста всё о корутинах. Приведи поясняющие примеры.",
                    "16:41",
                    true
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun QuizScreenPreview() {
    DevAssistantAITheme {
        ChatAIScreen()
    }
}