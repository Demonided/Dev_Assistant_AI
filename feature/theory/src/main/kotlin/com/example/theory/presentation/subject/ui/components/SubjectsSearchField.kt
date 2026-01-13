package com.example.theory.presentation.subject.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun AppSearchField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val backgroundColor = DevAssistantTheme.colors.white.copy(alpha = 0.15f)
    val focusedBackgroundColor = DevAssistantTheme.colors.white.copy(alpha = 0.22f)
    var isFocused by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(42.dp)
            .background(
                color = if (isFocused) focusedBackgroundColor else backgroundColor,
                shape = RoundedCornerShape(30)
            )
            .padding(horizontal = 42.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            singleLine = true,
            textStyle = TextStyle(
                color = DevAssistantTheme.colors.white,
                fontSize = 14.sp,
                lineHeight = 42.sp
            ),
            cursorBrush = SolidColor(DevAssistantTheme.colors.white),
            modifier = Modifier
                .fillMaxWidth()
                .onFocusChanged { isFocused = it.isFocused }
        )

        if (value.isEmpty()) {
            Text(
                text = "Search...",
                color = DevAssistantTheme.colors.white.copy(alpha = 0.6f),
                fontSize = 14.sp,
                modifier = Modifier.align(Alignment.CenterStart)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun AppSearchFieldPreview() {
    DevAssistantAITheme {
        AppSearchField("", {})
    }
}