package com.example.ui_theme.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.example.ui_theme.ui.theme.DevAssistantColor.BottomBarDashboardColor

val LightDevAssistantColorScheme = DevAssistantColor(
    white = Color(0xFFFFFFFF),
    textTitle = Color(0xFF000000),
    appStartGradient = Color(0xFFB649F3),
    appMediumGradientColor = Color(0xFFF6339A),
    appEndGradient = Color(0xFFFF6900),
    appBackground = Color(0xFFFFFFFF),

    bottomBarDashboard = BottomBarDashboardColor(
        bottomBarBackground = Color(0xFFE9E9EC),
        enabledIcon = Color(0xFFFFFFFF),
        disabledIcon = Color(0xFF2A2A2A),
        enabledExternalCircleIcon = Color(0xFFE0E1E4),
        bottomBarBorder = Color(0xFFCCCCCC)
    ),

    statisticCard = DevAssistantColor.StatisticCardColor(
        border = Color(0xFFD1BFF1),
        numberOfLearned = Color(0xFFAD46FF),
        progressPercent = Color(0xFFF6339A),
        streakNumber = Color(0xFFFF6900),
        gradientStart = Color(0xFFF6F0FF),
        gradientEnd = Color(0xFFEFF3FF),
        description = Color(0XFF151821)
    )
)

val DarkDevAssistantColorScheme = DevAssistantColor(
    white = Color(0xFFFFFFFF),
    textTitle = Color(0xFFFFFFFF),
    appStartGradient = Color(0xFFB649F3),
    appMediumGradientColor = Color(0xFFF6339A),
    appEndGradient = Color(0xFFFF6500),
    appBackground = Color(0xFF101828),

    bottomBarDashboard = BottomBarDashboardColor(
        bottomBarBackground = Color(0xFF121315),
        enabledIcon = Color(0xFFFFFFFF),
        disabledIcon = Color(0xFF8A8A8A),
        enabledExternalCircleIcon = Color(0xFF1E1F22),
        bottomBarBorder = Color(0xFF626161)
    ),

    statisticCard = DevAssistantColor.StatisticCardColor(
        border = Color(0xFF0B051B),
        numberOfLearned = Color(0xFFAD46FF),
        progressPercent = Color(0xFFF6339A),
        streakNumber = Color(0xFFFF6900),
        gradientStart = Color(0x1AAD46FF),
        gradientEnd = Color(0x1AF6339A),
        description = Color(0XFF545868)
    )
)

data class DevAssistantColor(
    val white: Color,
    val textTitle: Color,
    val appStartGradient: Color,
    val appMediumGradientColor: Color,
    val appEndGradient: Color,
    val appBackground: Color,

    val bottomBarDashboard: BottomBarDashboardColor,
    val statisticCard: StatisticCardColor
) {
    @Immutable
    data class BottomBarDashboardColor(
        val bottomBarBackground: Color,
        val enabledIcon: Color,
        val disabledIcon: Color,
        val enabledExternalCircleIcon: Color,
        val bottomBarBorder: Color
    )

    @Immutable
    data class StatisticCardColor(
        val border: Color,
        val numberOfLearned: Color,
        val progressPercent: Color,
        val streakNumber: Color,
        val gradientStart: Color,
        val gradientEnd: Color,
        val description: Color
    )
}