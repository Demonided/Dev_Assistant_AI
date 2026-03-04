package com.example.ai_chat.presentation.ui.components.chat

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_theme.R
import com.example.ui_theme.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun MessageInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var isFocused by remember { mutableStateOf(false) }

    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        BasicTextField(
            value = "",
            onValueChange = onValueChange,
            singleLine = true,
            textStyle = TextStyle(
                color = DevAssistantTheme.colors.white,
                fontSize = 14.sp,
                lineHeight = 24.sp
            ),
            cursorBrush = SolidColor(DevAssistantTheme.colors.white),
            modifier = Modifier
                .height(46.dp)
                .weight(1f)
                .onFocusChanged { isFocused = it.isFocused }
                .border(
                    width = 1.dp,
                    color = DevAssistantTheme.colors.appCardColor.border,
                    shape = RoundedCornerShape(16.dp)
                )
        )

        IconButton(
            modifier = modifier
                .padding(start = 16.dp)
                .clip(RoundedCornerShape(16.dp))
                .angleLinearGradient(
                    colors = DevAssistantGradient.primary(),
                    angle = 60f
                ),
            onClick = {}
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_send),
                contentDescription = null,
                tint = DevAssistantTheme.colors.white,
                modifier = Modifier
                    .size(42.dp)
                    .padding(8.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MessageInputPreview() {
    DevAssistantAITheme {
        Box(
            modifier = Modifier
                .background(DevAssistantTheme.colors.appBackground)
                .padding(10.dp)
        ) {
            MessageInput(
                value = "",
                onValueChange = {}
            )
        }

    }
}