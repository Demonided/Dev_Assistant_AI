package com.example.theory.presentation.subject.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.theory.R
import com.example.ui_theme.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun StatisticsCard(
    modifier: Modifier = Modifier,
    learned: Int = 243,
    progress: Int = 67,
    streak: Int = 12,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(24.dp))
            .angleLinearGradient(
                colors = listOf(
                    DevAssistantTheme.colors.appStartGradient.copy(alpha = 0.3f),
                    DevAssistantTheme.colors.appMediumGradientColor.copy(alpha = 0.3f)
                ), angle = 60f
            )
            .border(
                width = 1.dp,
                color = DevAssistantTheme.colors.statisticCard.border,
                shape = RoundedCornerShape(24.dp)
            )
            .padding(vertical = 24.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = stringResource(R.string.your_statistic),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = DevAssistantTheme.colors.textTitle,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                StatItem(
                    value = learned.toString(),
                    color = DevAssistantTheme.colors.statisticCard.numberOfLearned,
                    label = stringResource(R.string.learned)
                )

                StatItem(
                    value = "$progress%",
                    color = DevAssistantTheme.colors.statisticCard.progressPercent,
                    label = stringResource(R.string.progress)
                )

                StatItem(
                    value = streak.toString(),
                    color = DevAssistantTheme.colors.statisticCard.streakNumber,
                    label = stringResource(R.string.streak)
                )
            }
        }
    }
}

@Composable
fun StatItem(
    value: String,
    color: Color,
    label: String
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = value,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = color,
            modifier = Modifier.padding(bottom = 10.dp)
        )
        Text(
            text = label,
            fontSize = 14.sp,
            color = DevAssistantTheme.colors.textTitle,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true, name = "Light theme", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(showBackground = true, name = "Dark theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun StatisticsCardPreview() {
    DevAssistantAITheme {
        Box(modifier = Modifier.background(DevAssistantTheme.colors.appBackground)) {
            StatisticsCard()
        }
    }
}
