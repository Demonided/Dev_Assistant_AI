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
    fun primary2(): List<Color> = listOf(
        DevAssistantTheme.colors.appStartGradient,
        DevAssistantTheme.colors.appMediumGradientColor,
    )

    @Composable
    fun purple(): List<Color> = listOf(
        DevAssistantTheme.colors.purpleStartGradientColor,
        DevAssistantTheme.colors.purpleEndGradientColor
    )

    @Composable
    fun grayMono(): List<Color> = listOf(
        DevAssistantTheme.colors.userChatIconBackground,
        DevAssistantTheme.colors.userChatIconBackground
    )

    @Composable
    fun darkGrayMono(): List<Color> = listOf(
        DevAssistantTheme.colors.messageBackground,
        DevAssistantTheme.colors.messageBackground
    )
}