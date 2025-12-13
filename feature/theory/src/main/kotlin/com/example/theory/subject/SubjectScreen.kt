package com.example.theory.subject

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
import com.example.theory.common.HeaderComponent
import com.example.theory.subject.composable.SubjectsComponent
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun TheoryScreen() {
    val viewModel = SubjectViewModel()
    val state by viewModel.state.collectAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(DevAssistantTheme.colors.bottomBarDashboard.bottomBarBackground)
    ) {
        HeaderComponent()
        SubjectsComponent(state.subjects)

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    DevAssistantAITheme {
        TheoryScreen()
    }
}