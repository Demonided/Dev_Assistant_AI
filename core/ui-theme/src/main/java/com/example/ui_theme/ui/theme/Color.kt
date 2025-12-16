package com.example.ui_theme.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.example.ui_theme.ui.theme.DevAssistantColor.BottomBarDashboard
import com.example.ui_theme.ui.theme.DevAssistantColor.Quiz

val LightDevAssistantColor = DevAssistantColor(
    textTitle = Color(0xFFFFFFFF),

    bottomBarDashboard = BottomBarDashboard(
        backgroundBottomBar = Color(0xFFE9E9EC),
        colorEnableIcon = Color(0xFFFFFFFF),
        colorDisableIcon = Color(0xFF2A2A2A),
        gradientStartEnableIcon = Color(0xFF274A7A),
        gradientEndEnableIcon = Color(0xFF8C1F3F),
        externalCircleEnableIcon = Color(0xFFE0E1E4),
        borderBottomBar = Color(0xFFCCCCCC)
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

val DarkDevAssistantColor = DevAssistantColor(
    textTitle = Color(0xFF000000),

    bottomBarDashboard = BottomBarDashboard(
        backgroundBottomBar = Color(0xFF121315),
        colorEnableIcon = Color(0xFFFFFFFF),
        colorDisableIcon = Color(0xFF8A8A8A),
        gradientStartEnableIcon = Color(0xFF274A7A),
        gradientEndEnableIcon = Color(0xFF8C1F3F),
        externalCircleEnableIcon = Color(0xFF1E1F22),
        borderBottomBar = Color(0xFF626161)
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
    val textTitle: Color,

    val bottomBarDashboard: BottomBarDashboard,
    val quiz: Quiz,
) {
    @Immutable
    data class BottomBarDashboard(
        val backgroundBottomBar: Color,
        val colorEnableIcon: Color,
        val colorDisableIcon: Color,
        val gradientStartEnableIcon: Color,
        val gradientEndEnableIcon: Color,
        val externalCircleEnableIcon: Color,
        val borderBottomBar: Color
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