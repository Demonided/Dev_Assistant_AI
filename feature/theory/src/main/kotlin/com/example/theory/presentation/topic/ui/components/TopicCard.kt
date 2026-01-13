package com.example.theory.presentation.topic.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.theory.presentation.topic.model.TopicModel
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun TopicCard(
    modifier: Modifier = Modifier,
    topicData: TopicModel,
    onClick: (String) -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = DevAssistantTheme.colors.appCardColor.border,
                shape = RoundedCornerShape(14.dp)
            )
            .clip(RoundedCornerShape(14.dp))
            .background(color = DevAssistantTheme.colors.appCardBackground),
        colors = CardDefaults.cardColors(
            DevAssistantTheme.colors.appCardColor.background
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        shape = RoundedCornerShape(14.dp)
    ) {
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Brush.linearGradient(colors = topicData.colors)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = topicData.icon,
                        contentDescription = null,
                        tint = DevAssistantTheme.colors.white,
                        modifier = Modifier.size(28.dp)
                    )
                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .height(56.dp)
                        .padding(start = 15.dp)
                ) {
                    Text(
                        text = topicData.title,
                        color = DevAssistantTheme.colors.textTitle,
                        fontSize = 16.sp
                    )

                    Row(
                        modifier = Modifier.padding(top = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "${topicData.duration} мин",
                            color = DevAssistantTheme.colors.textColor,
                            fontSize = 14.sp,
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Завершено",
                            fontSize = 14.sp,
                            modifier = Modifier
                                .background(
                                    brush = Brush.linearGradient(colors = topicData.colors),
                                    shape = RoundedCornerShape(10.dp)
                                )
                                .padding(start = 8.dp, top = 4.dp, end = 8.dp, bottom = 4.dp),
                            color = DevAssistantTheme.colors.white
                        )
                    }
                }
                Column {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = null,
                        tint = DevAssistantTheme.colors.textTitle
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun TopicCardPreview() {
    DevAssistantAITheme {
        TopicCard(
            topicData = TopicModel(
                id = "1",
                orderNumber = 1,
                title = "Kotlin base syntax",
                duration = 15,
                isCompleted = true,
                colors = DevAssistantGradient.purple(),
                icon = Icons.Default.Home
            ),
            onClick = {}
        )
    }
}