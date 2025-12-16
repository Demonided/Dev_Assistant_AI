package com.example.theory.subject.composable

import android.content.res.Configuration
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.theory.R
import com.example.theory.common.AppSearchField
import com.example.theory.common.HeaderComponent
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun SubjectHeaderComponent(
    onSearchTextChanged: (String) -> Unit
) {
    HeaderComponent(
        background = listOf(
            DevAssistantTheme.colors.appStartGradient,
            DevAssistantTheme.colors.appMediumGradientColor,
            DevAssistantTheme.colors.appEndGradient
        )
    ) {
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )
        Text(
            text = stringResource(R.string.select_topic),
            color = DevAssistantTheme.colors.white,
            fontSize = 12.sp,
            modifier = Modifier.padding(bottom = 10.dp)
        )
        Text(
            text = stringResource(R.string.start_preparation),
            color = DevAssistantTheme.colors.textColor,
            fontSize = 12.sp,
            modifier = Modifier.padding(bottom = 15.dp)
        )

        AppSearchField(
            value = "",
            onSearchTextChanged
        )
    }
}


@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun SubjectHeaderComponentPreview() {
    DevAssistantAITheme {
        SubjectHeaderComponent { _ -> }
    }
}