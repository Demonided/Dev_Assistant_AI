package com.example.ai_chat.presentation.ui.components.message

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
    isUserIcon: Boolean,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .angleLinearGradient(
                colors = if (!isUserIcon) DevAssistantGradient.primary() else DevAssistantGradient.grayMono(),
                angle = 60f
            ),
        shape = RoundedCornerShape(12.dp),
        color = DevAssistantTheme.colors.white.copy(alpha = 0.1f),


        ) {
        Icon(
            painter = painterResource(id = if (!isUserIcon) R.drawable.icon_chat_bot else R.drawable.user),
            contentDescription = null,
            tint = DevAssistantTheme.colors.white,
            modifier = Modifier
                .size(42.dp)
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ChatIconPreview() {
    DevAssistantAITheme {
        Row(
            modifier = Modifier
                .width(120.dp)
                .background(color = DevAssistantTheme.colors.appBackground)
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            ChatIcon(isUserIcon = false)
            ChatIcon(isUserIcon = true)
        }
    }
}