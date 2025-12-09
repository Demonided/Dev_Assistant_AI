package com.example.theory.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun HeaderComponent() {
    var text by remember { mutableStateOf("") }

    val gradient = Brush.linearGradient(
        colors = listOf(
            Color(0xFFB13AF6), // Фиолетовый
            Color(0xFFEC5125)
        ),
        start = Offset(0f, 0f),
        end = Offset.Infinite
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(135.dp)
            .background(gradient)
            .padding(start = 20.dp, end = 20.dp)

    ) {
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )
        Text(
            text = "Select topic",
            color = DevAssistantTheme.colors.textTitle,
            fontSize = 12.sp,
            modifier = Modifier.padding(bottom = 10.dp)
        )
        Text(
            text = "Start your preparation for interview",
            color = DevAssistantTheme.colors.textTitle,
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