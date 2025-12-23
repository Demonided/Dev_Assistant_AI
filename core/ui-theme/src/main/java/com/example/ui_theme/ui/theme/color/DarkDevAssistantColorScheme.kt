package com.example.ui_theme.ui.theme.color

import androidx.compose.ui.graphics.Color
import com.example.ui_theme.ui.theme.color.DevAssistantColor.BottomBarDashboardColor
import com.example.ui_theme.ui.theme.color.DevAssistantColor.Quiz

val DarkDevAssistantColorScheme = DevAssistantColor(
    white = Color(0xFFFFFFFF),
    blackWhite = Color(0xFFFFFFFF),
    whiteBlack = Color(0xFF000000),
    textTitle = Color(0xFFFFFFFF),
    textColor = Color(0xFFFFFFCC),
    appStartGradient = Color(0xFFB649F3),
    appMediumGradientColor = Color(0xFFF6339A),
    appEndGradient = Color(0xFFFF6500),
    appBackground = Color(0xFF101828),
    appCardBackground = Color(0xFF282525),

    purpleStartGradientColor = Color(0xFFAD46FF),
    purpleEndGradientColor = Color(0xFF9810FA),

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
        backgroundSelectedAnswerOption = Color(0xFF3A1E5E).copy(alpha = 0.2f),
        backgroundCorrectAnswerOption = Color(0xFF048105).copy(alpha = 0.2f),
        backgroundIncorrectedAnswerOption = Color(0xFF721515).copy(alpha = 0.2f),
        borderBackgroundSelectedAnswerOption = Color(0xFF3A1E5E),
        borderBackgroundCorrectAnswerOption = Color(0xFF048105),
        borderBackgroundIncorrectedAnswerOption = Color(0xFF721515),
        borderAnswerOption = Color(0xFF6B6868),
        backgroundLabelSelectedAnswerOption = Color(0xFF3A1E5E),
        backgroundLabelAnswerOption = Color(0xFF6B6868),
        quizProgressBar = Color(0xFFD7D2D2),
    )
)