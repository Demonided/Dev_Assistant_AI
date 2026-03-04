package com.example.ai_chat.presentation.ui.components.chat

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_theme.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient
import com.example.ui_theme.ui.theme.DevAssistantTheme


@Composable
fun Message(
    text: String,
    time: String,
    isFromUser: Boolean,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .clip(shape = RoundedCornerShape(10.dp))
            .angleLinearGradient(
                colors = if (isFromUser) DevAssistantGradient.primary2() else DevAssistantGradient.darkGrayMono(),
                angle = 0f
            )

            .padding(12.dp)
    ) {
        Text(
            text = text,
            color = if (isFromUser) DevAssistantTheme.colors.white else DevAssistantTheme.colors.textColor
        )
        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = time,
            color = if (isFromUser) DevAssistantTheme.colors.gray else DevAssistantTheme.colors.appCardColor.text
        )
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MessagePreview() {
    DevAssistantAITheme {
        Column(modifier = Modifier.padding(10.dp)) {
            Message(
                text = "Привет! Я AI-помощник для подготовки к собеседованию по Android. Задавай любые вопросы о разработке!",
                time = "16:46",
                isFromUser = false,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            )

            Message(
                text = "Привет! Я User, приятно познакомиться",
                time = "16:46",
                isFromUser = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            )
        }
    }
}
