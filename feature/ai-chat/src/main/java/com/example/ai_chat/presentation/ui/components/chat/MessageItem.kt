package com.example.ai_chat.presentation.ui.components.chat

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ai_chat.presentation.model.MessageModel
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun MessageItem(
    message: MessageModel
) {
    Row(
        modifier = Modifier
            .padding(top = 10.dp, bottom = 10.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = if (message.isFromUser) Arrangement.End else Arrangement.Start
    ) {
        if (message.isFromUser) {
            Message(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(start = 58.dp, end = 16.dp),
                text = message.text,
                time = message.time,
                isFromUser = true
            )
            ChatIcon(isUserIcon = true)
        } else {
            ChatIcon(isUserIcon = false)
            Message(
                modifier = Modifier
                    .padding(start = 16.dp, end = 58.dp),
                text = message.text,
                time = message.time,
                isFromUser = false
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MessageItemPreview() {
    DevAssistantAITheme {
        Column(
            modifier = Modifier
                .background(color = DevAssistantTheme.colors.appBackground)
                .padding(22.dp)
        ) {
            MessageItem(
                message = MessageModel(
                    id = "1",
                    text = "Привет! Я AI-помощник для подготовки к собеседованию по Android. Задавай любые вопросы о разработке!",
                    "16:41",
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