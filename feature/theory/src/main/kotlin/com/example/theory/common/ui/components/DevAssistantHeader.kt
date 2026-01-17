package com.example.theory.common.ui.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.theory.R
import com.example.theory.presentation.subject.ui.components.AppSearchField
import com.example.theory.presentation.topic.ui.components.BackButton
import com.example.ui_theme.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient

@Composable
fun DevAssistantHeader(
    modifier: Modifier = Modifier,
    showBackButton: Boolean = false,
    @StringRes title: Int? = null,
    @StringRes subTitle: Int? = null,
    background: List<Color> = emptyList(),
    onBackButtonClick: () -> Unit = {},
    content: @Composable (ColumnScope.() -> Unit)? = null
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .angleLinearGradient(
                colors = background,
                angle = 60f
            )
            .padding(start = 20.dp, end = 20.dp, bottom = 24.dp),
    ) {
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(20.dp))

        if (showBackButton) {
            BackButton(
                modifier = Modifier.padding(bottom = 10.dp),
                onButtonClick = onBackButtonClick
            )
        }

        title?.let {
            Text(
                modifier = Modifier.padding(bottom = 10.dp),
                color = Color.White,
                fontSize = 14.sp,
                text = stringResource(it)
            )
        }

        subTitle?.let {
            Text(
                color = Color.White.copy(alpha = 0.7f),
                fontSize = 12.sp,
                text = stringResource(it)
            )
        }

        content?.let {
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(15.dp))
            it()
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun SubjectHeaderPreview() {
    DevAssistantAITheme {
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
    }
}