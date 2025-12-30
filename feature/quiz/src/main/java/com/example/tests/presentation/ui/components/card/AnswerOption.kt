package com.example.tests.presentation.ui.components.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tests.domain.model.AnswerState
import com.example.tests.presentation.ui.state.StateAnswerLabel
import com.example.tests.presentation.ui.state.stateAnswerOptions
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun AnswerOption(
    state: AnswerState,
    answerOption: String,
    questionNumber: String,
    modifier: Modifier = Modifier,
) {
    val color = stateAnswerOptions(state)
    
    Card(
        border = BorderStroke(1.4.dp, color.border.copy(alpha = 0.75f)),
        colors = CardDefaults.cardColors(
            color.background),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(12.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(32.dp)
                    .background(
                        color = color.labelBackground,
                        shape = CircleShape,
                    )
                    .border(
                        width = 1.4.dp,
                        color = color.labelBorder.copy(alpha = 0.75f),
                        shape = CircleShape
                    )
            ) {
                StateAnswerLabel(
                    state = state,
                    questionNumber = questionNumber,
                    color = color.labelColor
                )
            }

            Text(
                text = answerOption,
                style = DevAssistantTheme.typography.answerOptionText,
                color = DevAssistantTheme.colors.textTitle,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AnswerOptionPreview() {
    DevAssistantAITheme {
        Column {
            AnswerOption(
                state = AnswerState.DEFAULT,
                answerOption = "Component for displaying UI decomposed into smaller parts",
                questionNumber = "A",
                modifier = Modifier
            )
            AnswerOption(
                state = AnswerState.SELECTED,
                answerOption = "Component for displaying UI decomposed into smaller parts",
                questionNumber = "B",
                modifier = Modifier
            )
            AnswerOption(
                state = AnswerState.CORRECT,
                answerOption = "Component for displaying UI decomposed into smaller parts",
                questionNumber = "C",
                modifier = Modifier
            )
            AnswerOption(
                state = AnswerState.INCORRECT,
                answerOption = "Component for displaying UI decomposed into smaller parts",
                questionNumber = "D",
                modifier = Modifier
            )
        }
    }
}