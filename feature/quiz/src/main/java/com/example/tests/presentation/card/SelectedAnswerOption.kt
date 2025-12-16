package com.example.tests.presentation.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun SelectedAnswerOption(
    isSelected: Boolean,
    answerOption: String,
    correctedAnswerOption: String,
    questionNumber: String,
    modifier: Modifier = Modifier,
) {
    Card(
        border = if (isSelected) BorderStroke(2.dp, Color.Blue) else BorderStroke(1.dp, Color.Green),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(12.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(32.dp)
                    .background(
                        color = Color.Transparent,
                        shape = CircleShape,
                    )
                    .border(
                        width = 1.dp,
                        color = Color.Red,
                        shape = CircleShape
                    )
            ) {
                Text(
                    text = questionNumber,
                    color = Color.Gray,
                )
            }

            Text(
                text = answerOption,
                style = DevAssistantTheme.typography.answerOptionText,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SelectedAnswerOptionPreview() {
    DevAssistantAITheme {
        SelectedAnswerOption(
            isSelected = false,
            answerOption = "Component for displaying UI decomposed into smaller parts",
            correctedAnswerOption = "Component for displaying UI decomposed into smaller parts",
            questionNumber = "A"
        )
    }
}