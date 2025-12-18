package com.example.ui_theme.ui.theme.color

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.example.ui_theme.ui.theme.color.DevAssistantColor.BottomBarDashboardColor
import com.example.ui_theme.ui.theme.color.DevAssistantColor.Quiz

data class DevAssistantColor(
    val white: Color,
    val blackWhite: Color,
    val whiteBlack: Color,
    val textTitle: Color,
    val appStartGradient: Color,
    val appMediumGradientColor: Color,
    val appEndGradient: Color,
    val appBackground: Color,
    val appCardBackground: Color,

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
        val quizProgressBar: Color,
    )
}