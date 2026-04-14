package com.example.ai_chat.presentation.ui.components.chat

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_theme.R
import com.example.ui_theme.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun MessageInput(
    value: String,
    onValueChange: (String) -> Unit,
    onMessageSend: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var isFocused by remember { mutableStateOf(false) }
    var isButtonActive by remember { mutableStateOf(false) }
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        OutlinedTextField(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .weight(1f)
                .background(
                    color = DevAssistantTheme.colors.messageBackground,
                    shape = RoundedCornerShape(16.dp)
                ),
            value = value,
            placeholder = { Text(text = stringResource(R.string.ask_question_placeholder)) },
            onValueChange = onValueChange,
            enabled = true,
            maxLines = 5,
            textStyle = TextStyle(color = DevAssistantTheme.colors.textColor)
        )

        IconButton(
            modifier = modifier
                .padding(start = 16.dp)
                .clip(RoundedCornerShape(16.dp))
                .angleLinearGradient(
                    colors = DevAssistantGradient.primary(),
                    angle = 60f
                ),
            onClick = { },
            enabled = isButtonActive
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
                .padding(start = 10.dp, top = 10.dp, bottom = 10.dp)
        ) {
            MessageInput(
                value = "",
                onValueChange = {},
                onMessageSend = {}
            )
        }
    }
}