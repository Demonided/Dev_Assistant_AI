package com.example.ui_theme.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.example.ui_theme.ui.theme.DevAssistantColor.BottomBarDashboardColor
import com.example.ui_theme.ui.theme.DevAssistantColor.Quiz

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
        description = Color(0XFF151821)
    ),

    appCardColor = DevAssistantColor.AppCardColor(
        background = Color(0XFFFFFFFF),
        border = Color(0xFFEBE6E7),
        title = Color(0xFF101828),
        text = Color(0xFF4A5565)
    ),

    quiz = Quiz(
        backgroundQuizCard = Color(0xFFD3CACA),
        backgroundSelectedAnswerOption = Color(0xFF3A1E5E).copy(alpha = 0.3f),
        backgroundCorrectAnswerOption = Color(0xFF048105).copy(alpha = 0.3f),
        backgroundIncorrectedAnswerOption = Color(0xFF721515).copy(alpha = 0.3f),
        borderBackgroundSelectedAnswerOption = Color(0xFF3A1E5E),
        borderBackgroundCorrectAnswerOption = Color(0xFF048105),
        borderBackgroundIncorrectedAnswerOption = Color(0xFF721515),
        borderAnswerOption = Color(0xFF6B6868),
        backgroundLabelSelectedAnswerOption = Color(0xFF3A1E5E),
        backgroundLabelAnswerOption = Color(0xFF6B6868)
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
        border = Color(0xFFAD46FF),
        numberOfLearned = Color(0xFFAD46FF),
        progressPercent = Color(0xFFF6339A),
        streakNumber = Color(0xFFFF6900),
        description = Color(0X1A545868)
    ),

    appCardColor = DevAssistantColor.AppCardColor(
        background = Color(0XFF182B3A),
        border = Color(0XFF364153),
        title = Color(0xFFFFFFFF),
        text = Color(0xFF99A1AF)
    ),

    quiz = Quiz(
        backgroundQuizCard = Color(0xFFD3CACA),
        backgroundSelectedAnswerOption = Color(0xFF3A1E5E).copy(alpha = 0.3f),
        backgroundCorrectAnswerOption = Color(0xFF048105).copy(alpha = 0.3f),
        backgroundIncorrectedAnswerOption = Color(0xFF721515).copy(alpha = 0.3f),
        borderBackgroundSelectedAnswerOption = Color(0xFF3A1E5E),
        borderBackgroundCorrectAnswerOption = Color(0xFF048105),
        borderBackgroundIncorrectedAnswerOption = Color(0xFF721515),
        borderAnswerOption = Color(0xFF6B6868),
        backgroundLabelSelectedAnswerOption = Color(0xFF3A1E5E),
        backgroundLabelAnswerOption = Color(0xFF6B6868)
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
    val statisticCard: StatisticCardColor,
    val appCardColor: AppCardColor,
    val quiz: Quiz,
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
        val description: Color
    )

    @Immutable
    data class AppCardColor(
        val background: Color,
        val border: Color,
        val title: Color,
        val text: Color
    )

    data class Quiz(
        val backgroundQuizCard: Color,
        val backgroundSelectedAnswerOption: Color,
        val backgroundCorrectAnswerOption: Color,
        val backgroundIncorrectedAnswerOption: Color,
        val borderBackgroundSelectedAnswerOption: Color,
        val borderBackgroundCorrectAnswerOption: Color,
        val borderBackgroundIncorrectedAnswerOption: Color,
        val borderAnswerOption: Color,
        val backgroundLabelSelectedAnswerOption: Color,
        val backgroundLabelAnswerOption: Color,
    )
}