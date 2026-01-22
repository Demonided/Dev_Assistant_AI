package com.example.theory.presentation.topic.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.theory.R
import com.example.ui_theme.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun TopicProgressBar(
    modifier: Modifier = Modifier,
    total: Int,
    completed: Int
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = DevAssistantTheme.colors.white.copy(alpha = 0.35f),
        ),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = stringResource(R.string.progress), color = DevAssistantTheme.colors.white, fontSize = 16.sp)
                Text(text = "${completed}/${total}", color = DevAssistantTheme.colors.white, fontSize = 16.sp)
            }

            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp)
                    .height(9.dp),
                color = DevAssistantTheme.colors.white,
                trackColor = DevAssistantTheme.colors.white.copy(alpha = 0.3f),
                gapSize = 0.dp,
                progress = { completed.toFloat() / total.toFloat() }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopicProgressBarPreview() {
    DevAssistantAITheme {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .angleLinearGradient(colors = DevAssistantGradient.purple(), angle = 60f)
        ) {
            TopicProgressBar(
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(start = 20.dp, end = 20.dp),
                total = 5,
                completed = 2
            )
        }
    }
}