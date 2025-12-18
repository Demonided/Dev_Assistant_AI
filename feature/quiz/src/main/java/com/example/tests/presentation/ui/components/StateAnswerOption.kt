package com.example.tests.presentation.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.tests.domain.model.AnswerState
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun stateAnswerOptions(state: AnswerState): AnswerColor =
    when (state) {
        AnswerState.DEFAULT -> AnswerColor(
            background = Color.Transparent,
            border = DevAssistantTheme.colors.quiz.borderAnswerOption,
            labelColor = DevAssistantTheme.colors.textTitle,
            labelBorder = DevAssistantTheme.colors.quiz.borderAnswerOption,
            labelBackground = Color.Transparent
        )
        AnswerState.SELECTED -> AnswerColor(
            background = DevAssistantTheme.colors.quiz.backgroundSelectedAnswerOption,
            border = DevAssistantTheme.colors.quiz.borderBackgroundSelectedAnswerOption,
            labelColor = DevAssistantTheme.colors.white,
            labelBorder = DevAssistantTheme.colors.quiz.backgroundLabelSelectedAnswerOption,
            labelBackground = DevAssistantTheme.colors.quiz.backgroundLabelSelectedAnswerOption
        )
        AnswerState.CORRECT -> AnswerColor(
            background = DevAssistantTheme.colors.quiz.backgroundCorrectAnswerOption,
            border = DevAssistantTheme.colors.quiz.borderBackgroundCorrectAnswerOption,
            labelColor = DevAssistantTheme.colors.white,
            labelBorder = DevAssistantTheme.colors.quiz.borderBackgroundCorrectAnswerOption,
            labelBackground = DevAssistantTheme.colors.quiz.borderBackgroundCorrectAnswerOption
        )
        AnswerState.INCORRECT -> AnswerColor(
            background = DevAssistantTheme.colors.quiz.backgroundIncorrectedAnswerOption,
            border = DevAssistantTheme.colors.quiz.borderBackgroundIncorrectedAnswerOption,
            labelColor = DevAssistantTheme.colors.white,
            labelBorder = DevAssistantTheme.colors.quiz.borderBackgroundIncorrectedAnswerOption,
            labelBackground = DevAssistantTheme.colors.quiz.borderBackgroundIncorrectedAnswerOption
        )
        AnswerState.CORRECT_IDLE -> AnswerColor(
            background = DevAssistantTheme.colors.quiz.backgroundCorrectAnswerOption,
            border = DevAssistantTheme.colors.quiz.borderBackgroundCorrectAnswerOption,
            labelColor = DevAssistantTheme.colors.white,
            labelBorder = DevAssistantTheme.colors.quiz.borderBackgroundCorrectAnswerOption,
            labelBackground = DevAssistantTheme.colors.quiz.borderBackgroundCorrectAnswerOption
        )
    }