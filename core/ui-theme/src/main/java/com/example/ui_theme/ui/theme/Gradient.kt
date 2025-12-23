package com.example.ui_theme.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object DevAssistantGradient{

    @Composable
    fun primary(): List<Color> = listOf(
        DevAssistantTheme.colors.appStartGradient,
        DevAssistantTheme.colors.appMediumGradientColor,
        DevAssistantTheme.colors.appEndGradient,
    )

    @Composable
    fun purple(): List<Color> = listOf(
        DevAssistantTheme.colors.purpleStartGradientColor,
        DevAssistantTheme.colors.purpleEndGradientColor
    )
}