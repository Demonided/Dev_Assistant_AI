package com.example.theory.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.theory.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun HeaderComponent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(135.dp)
            .angleLinearGradient(
                colors = listOf(
                    DevAssistantTheme.colors.appStartGradient,
                    DevAssistantTheme.colors.appEndGradient
                ),
                angle = 60f
            )
            .padding(start = 20.dp, end = 20.dp)

    ) {
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )
        Text(
            text = "Select topic",
            color = DevAssistantTheme.colors.white,
            fontSize = 12.sp,
            modifier = Modifier.padding(bottom = 10.dp)
        )
        Text(
            text = "Start your preparation for interview",
            color = DevAssistantTheme.colors.white,
            fontSize = 12.sp,
            modifier = Modifier.padding(bottom = 15.dp)
        )

        AppSearchField(
            value = "",
            { }
        )
    }
}

@Composable
@Preview(showBackground = true)
fun HeaderComponentPreview() {
    DevAssistantAITheme {
        HeaderComponent()
    }
}