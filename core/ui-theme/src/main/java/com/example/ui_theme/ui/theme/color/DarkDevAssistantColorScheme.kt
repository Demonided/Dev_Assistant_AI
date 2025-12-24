package com.example.ui_theme.ui.theme.color

import androidx.compose.ui.graphics.Color
import com.example.ui_theme.ui.theme.color.DevAssistantColor.BottomBarDashboardColor
import com.example.ui_theme.ui.theme.color.DevAssistantColor.Quiz

val DarkDevAssistantColorScheme = DevAssistantColor(
    white = Color(0xFFFFFFFF),
    black = Color(0xFF181818),
    blackWhite = Color(0xFFFFFFFF),
    whiteBlack = Color(0xFF000000),
    textTitle = Color(0xFFFFFFFF),
    appStartGradient = Color(0xFFB649F3),
    appMediumGradientColor = Color(0xFFF6339A),
    appEndGradient = Color(0xFFFF6500),
    appBackground = Color(0xFF101828),
    appCardBackground = Color(0xFF1A2138),

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
        backgroundSelectedAnswerOption = Color(0xFF2A2654).copy(alpha = 0.2f),
        backgroundCorrectAnswerOption = Color(0xFF66BB6A).copy(alpha = 0.2f),
        backgroundIncorrectedAnswerOption = Color(0xFFE57373).copy(alpha = 0.2f),
        borderBackgroundSelectedAnswerOption = Color(0xFF6A5ACD),
        borderBackgroundCorrectAnswerOption = Color(0xFF66BB6A),
        borderBackgroundIncorrectedAnswerOption = Color(0xFFE57373),
        borderAnswerOption = Color(0xFF8A8A8A),
        backgroundLabelSelectedAnswerOption = Color(0xFF2A2654),
        backgroundLabelAnswerOption = Color(0xFF6B6868),
        quizProgressBar = Color(0xFFD7D2D2),
    )
)