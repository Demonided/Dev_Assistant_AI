package com.example.theory.presentation.article

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.theory.common.ui.components.HeaderComponent
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun ArticleScreen(
    modifier: Modifier = Modifier,
    onBackButtonClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(color = DevAssistantTheme.colors.appBackground)
    ) {
        HeaderComponent(

        ) { }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ArticleScreenPreview() {
    DevAssistantAITheme {
        ArticleScreen {}
    }
}