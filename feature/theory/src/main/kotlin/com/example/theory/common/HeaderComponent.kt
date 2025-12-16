package com.example.theory.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theory.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun HeaderComponent(
    modifier: Modifier = Modifier,
    background: List<Color>,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .angleLinearGradient(
                colors = background,
                angle = 60f
            )
            .padding(start = 20.dp, end = 20.dp, bottom = 24.dp),
    ) {
        content()
    }
}

@Composable
@Preview(showBackground = true)
fun HeaderComponentPreview() {
    DevAssistantAITheme {
        HeaderComponent(
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth(),
            background = listOf(
                DevAssistantTheme.colors.appStartGradient,
                DevAssistantTheme.colors.appMediumGradientColor,
                DevAssistantTheme.colors.appEndGradient
            )
        ) { }
    }
}