package com.example.theory.presentation.article

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.theory.common.ui.components.DevAssistantHeader
import com.example.ui_theme.component.AdaptiveButton
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun ArticleScreen(
    modifier: Modifier = Modifier,
    viewModel: ArticleViewModel = hiltViewModel(),
    onBackButtonClick: () -> Unit
) {
    viewModel.loadState("1")
    val state by viewModel.state.collectAsState()

    if (state.isLoading) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Loading...",
                color = DevAssistantTheme.colors.textTitle,
                fontSize = 16.sp
            )
        }
    } else {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(color = DevAssistantTheme.colors.appBackground),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            DevAssistantHeader(
                showBackButton = true,
                title = state.title,
                subTitle = "${state.duration} мин",
                background = DevAssistantGradient.purple(),
                onBackButtonClick = onBackButtonClick
            )
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .fillMaxWidth()
                        .padding(20.dp)
                        .border(
                            width = 1.dp,
                            color = DevAssistantTheme.colors.appCardColor.border,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .background(
                            color = DevAssistantTheme.colors.appCardColor.background,
                            shape = RoundedCornerShape(size = 10.dp)
                        )
                ) {
                    //todo: move article title to model
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = state.title,
                        fontSize = 18.sp,
                        fontStyle = FontStyle.Italic,
                        textDecoration = TextDecoration.Underline,
                        color = DevAssistantTheme.colors.textColor
                    )
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = state.content,
                        color = DevAssistantTheme.colors.textColor
                    )
                }
            }

            AdaptiveButton(
                modifier = Modifier
                    .padding(20.dp)
                    .align(alignment = Alignment.End),
                buttonText = stringResource(com.example.theory.R.string.lesson_completed),
                isGradient = true,
                isEnable = false,
                onClick = onBackButtonClick
            )
        }
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