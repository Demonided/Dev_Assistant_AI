package com.example.ui_theme.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.example.ui_theme.ui.theme.color.DarkDevAssistantColorScheme
import com.example.ui_theme.ui.theme.color.DevAssistantColor
import com.example.ui_theme.ui.theme.color.LightDevAssistantColorScheme

private val LocalDevAssistantAiColor = staticCompositionLocalOf { LightDevAssistantColorScheme }

private val LocalDevAssistantTypography = staticCompositionLocalOf { DevAssistantTypography() }

object DevAssistantTheme {
    val colors: DevAssistantColor
        @Composable
        get() = LocalDevAssistantAiColor.current

    val typography: DevAssistantTypography
        @Composable
        get() = LocalDevAssistantTypography.current
}

@Composable
fun DevAssistantAITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkDevAssistantColorScheme else LightDevAssistantColorScheme

    CompositionLocalProvider(
        LocalDevAssistantAiColor provides colorScheme,
        LocalDevAssistantTypography provides DevAssistantTypography(),
        content = content
    )
}