package com.example.ai_chat.presentation.ui.components.message.item

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ai_chat.presentation.ui.components.message.ChatIcon
import com.example.ai_chat.presentation.ui.components.message.Message
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun MessageItem() {
    Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
        ChatIcon()
        Message(
            modifier = Modifier.padding(start = 16.dp),
            text = "Hello",
            time = "15:40"
        )
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
            MessageItem()
        }

    }
}