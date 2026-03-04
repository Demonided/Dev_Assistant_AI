package com.example.ai_chat.presentation.ui.components.message

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme


@Composable
fun Message(
    text: String,
    isFromUser: Boolean,
    time: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .clip(shape = RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .background(color = DevAssistantTheme.colors.messageBackground)
            .padding(12.dp)
    ) {
        Text(
            text = text,
            color = DevAssistantTheme.colors.textColor
        )
        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = time,
            color = DevAssistantTheme.colors.appCardColor.text
        )
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MessagePreview() {
    DevAssistantAITheme {
        Box(modifier = Modifier.padding(10.dp)) {
            Message(
                text = "Привет! Я AI-помощник для подготовки к собеседованию по Android. Задавай любые вопросы о разработке!",
                isFromUser = false,
                time = "16:46"
            )
        }
    }
}
