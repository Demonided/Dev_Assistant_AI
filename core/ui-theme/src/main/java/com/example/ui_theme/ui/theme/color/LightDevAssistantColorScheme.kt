package com.example.ui_theme.ui.theme.color

import androidx.compose.ui.graphics.Color
import com.example.ui_theme.ui.theme.color.DevAssistantColor.BottomBarDashboardColor
import com.example.ui_theme.ui.theme.color.DevAssistantColor.Quiz

val LightDevAssistantColorScheme = DevAssistantColor(
    white = Color(0xFFFFFFFF),
    black = Color(0xFF181818),
    blackWhite = Color(0xFF000000),
    whiteBlack = Color(0xFFFFFFFF),
    textTitle = Color(0xFF000000),
    textColor = Color(0xFF101828),
    appStartGradient = Color(0xFFB649F3),
    appMediumGradientColor = Color(0xFFF6339A),
    appEndGradient = Color(0xFFFF6900),
    appBackground = Color(0xFFFFFFFF),
    appCardBackground = Color(0xFFF1F1F1),
    messageBackground = Color(0xFFE5E5E5),

    purpleStartGradientColor = Color(0xFF9810FA),
    purpleEndGradientColor = Color(0xFFAD46FF),

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
        backgroundSelectedAnswerOption = Color(0xFF6A5ACD).copy(alpha = 0.2f),
        backgroundCorrectAnswerOption = Color(0xFF4CAF50).copy(alpha = 0.2f),
        backgroundIncorrectedAnswerOption = Color(0xFFE57373).copy(alpha = 0.2f),
        borderBackgroundSelectedAnswerOption = Color(0xFF6A5ACD),
        borderBackgroundCorrectAnswerOption = Color(0xFF4CAF50),
        borderBackgroundIncorrectedAnswerOption = Color(0xFFE57373),
        borderAnswerOption = Color(0xFF6B6868),
        backgroundLabelSelectedAnswerOption = Color(0xFF6A5ACD),
        backgroundLabelAnswerOption = Color(0xFF6B6868),
        quizProgressBar = Color(0xFFD7D2D2),
    )
)