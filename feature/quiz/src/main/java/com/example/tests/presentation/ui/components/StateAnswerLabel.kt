package com.example.tests.presentation.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tests.domain.model.AnswerState
import com.example.ui_theme.R

@Composable
fun StateAnswerLabel(state: AnswerState, questionNumber: String, color: Color) =
    when (state) {
        AnswerState.DEFAULT -> Text(
            text = questionNumber,
            color = color
        )
        AnswerState.SELECTED -> Text(
            text = questionNumber,
            color = color
        )
        AnswerState.CORRECT -> Icon(
            painter = painterResource(R.drawable.icon_corrected),
            contentDescription = null,
            tint = color,
            modifier = Modifier
                .size(18.dp)

        )
        AnswerState.INCORRECT -> Icon(
            painter = painterResource(R.drawable.icon_incorrected),
            contentDescription = null,
            tint = color,
            modifier = Modifier
                .size(18.dp)
        )
        AnswerState.CORRECT_IDLE -> Icon(
            painter = painterResource(R.drawable.icon_corrected),
            contentDescription = null,
            tint = color,
            modifier = Modifier
                .size(18.dp)
        )
    }