package com.example.theory.presentation.topic.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theory.common.ui.components.HeaderComponent
import com.example.ui_theme.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient

@Composable
fun TopicHeaderComponent(
    modifier: Modifier = Modifier,
    colors: List<Color>,
    onBackButtonClick: () -> Unit
) {
    HeaderComponent(
        modifier = modifier.angleLinearGradient(
            colors = colors,
            angle = 60f
        ),
    ) {
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(20.dp))
        BackButton(onButtonClick = onBackButtonClick)
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(10.dp))
        Text(
            color = Color.White,
            text = "Основы синтаксиса Kotlin"
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(5.dp))
        Text(
            color = Color.White,
            text = "15 мин"
        )
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun TopicHeaderComponentPreview() {
    DevAssistantAITheme {
        TopicHeaderComponent(
            colors = DevAssistantGradient.purple()
        ) {}
    }
}