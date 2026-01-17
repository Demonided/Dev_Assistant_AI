package com.example.theory.presentation.subject

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.theory.R
import com.example.theory.common.ui.components.DevAssistantHeader
import com.example.theory.presentation.subject.ui.components.AppSearchField
import com.example.theory.presentation.subject.ui.components.SubjectsComponent
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun SubjectScreen(
    viewModel: SubjectViewModel = hiltViewModel(),
    onSubjectClick: (String) -> Unit
) {
    val state by viewModel.state.collectAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(DevAssistantTheme.colors.appBackground)
    ) {
        DevAssistantHeader(
            showBackButton = false,
            title = R.string.select_topic,
            subTitle = R.string.start_preparation,
            background = DevAssistantGradient.primary()
        ) {
            AppSearchField(
                value = "",
                { }
            )
        }
        SubjectsComponent(subjects = state, onClick = onSubjectClick)

    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun HomeScreenPreview() {
    DevAssistantAITheme {
        SubjectScreen {}
    }
}