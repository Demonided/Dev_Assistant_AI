package com.example.ai_chat.ui.message

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_theme.R
import com.example.ui_theme.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun ChatIcon(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .angleLinearGradient(
                colors = DevAssistantGradient.primary(),
                angle = 60f
            ),
        shape = RoundedCornerShape(12.dp),
        color = DevAssistantTheme.colors.white.copy(alpha = 0.1f),
    ) {
        Icon(
            painter = painterResource(id = R.drawable.icon_chat_bot),
            contentDescription = null,
            tint = DevAssistantTheme.colors.white,
            modifier = Modifier
                .size(42.dp)
                .padding(10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ChatIconPreview() {
    DevAssistantAITheme {
        ChatIcon()
    }
}