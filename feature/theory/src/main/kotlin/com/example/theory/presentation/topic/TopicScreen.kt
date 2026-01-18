package com.example.theory.presentation.topic

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.theory.common.ui.components.DevAssistantHeader
import com.example.theory.presentation.topic.ui.components.TopicCard
import com.example.theory.presentation.topic.ui.components.TopicProgressBar
import com.example.ui_theme.R.drawable
import com.example.ui_theme.component.AdaptiveButton
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun TopicScreen(
    viewModel: TopicViewModel = hiltViewModel(),
    onBackButtonClick: () -> Unit
) {
    val state by viewModel.state.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = DevAssistantTheme.colors.appBackground),
    ) {
        DevAssistantHeader(
            showBackButton = true,
            title = state.name,
            subTitle = state.description,
            background = DevAssistantGradient.purple(),
            onBackButtonClick = onBackButtonClick
        ) {
            TopicProgressBar(
                total = state.topics.size,
                completed = state.topics.filter { topic -> topic.isCompleted }.size,
            )
        }

        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(10.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(viewModel.state.value.topics) { topic ->
                TopicCard(
                    topicData = topic,
                    colors = state.color,
                    onClick = {}
                )
            }

            item {
                AdaptiveButton(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .align(alignment = Alignment.End),
                    buttonText = stringResource(com.example.theory.R.string.start_testing),
                    startButtonIcon = drawable.play,
                    isGradient = true,
                    isEnable = false,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun TopicScreenPreview() {
    DevAssistantAITheme {
        TopicScreen {}
    }
}