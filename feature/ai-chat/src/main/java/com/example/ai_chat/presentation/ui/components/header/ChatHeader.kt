package com.example.ai_chat.presentation.ui.components.header

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_theme.R
import com.example.ui_theme.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun ChatHeader(
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
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                shape = RoundedCornerShape(12.dp),
                color = DevAssistantTheme.colors.white.copy(alpha = 0.2f)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.sparkles),
                    contentDescription = null,
                    tint = DevAssistantTheme.colors.white,
                    modifier = Modifier
                        .size(42.dp)
                        .padding(10.dp)
                )
            }
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
            ) {
                Text(
                    modifier = Modifier.padding(bottom = 5.dp),
                    color = Color.White,
                    fontSize = 16.sp,
                    text = "AI Assistant"
                )

                Text(
                    color = Color.White.copy(alpha = 0.7f),
                    fontSize = 14.sp,
                    text = "Ready to help "
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ChatHeaderPreview() {
    DevAssistantAITheme {
        ChatHeader()
    }
}