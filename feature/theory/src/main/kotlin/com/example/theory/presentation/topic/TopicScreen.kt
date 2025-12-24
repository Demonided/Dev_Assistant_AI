package com.example.theory.presentation.topic

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.theory.presentation.topic.ui.components.TopicCard
import com.example.theory.presentation.topic.ui.components.TopicHeaderComponent
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient

@Composable
fun TopicScreen(
    viewModel: TopicViewModel = hiltViewModel(),
    onBackButtonClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        TopicHeaderComponent(
            colors = DevAssistantGradient.purple(),
            subject = "Kotlin",
            topic = "Основы синтаксиса Kotlin",
            onBackButtonClick = onBackButtonClick
        )

        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(10.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(viewModel.state.value.topics) { topic ->
                TopicCard(
                    topicData = topic,
                    onClick = {}
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun TopicScreenPreview() {
    DevAssistantAITheme {
        TopicScreen {}
    }
}