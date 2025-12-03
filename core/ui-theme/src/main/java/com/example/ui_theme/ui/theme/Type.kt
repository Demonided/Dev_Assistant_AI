package com.example.ui_theme.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.ui_theme.R

data class DevAssistantTypography(
    val primaryText: TextStyle = TextStyle(
        fontFamily = ubuntuFamily,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        color = Color.Red,
        fontSize = 40.sp,
        lineHeight = 40.sp,
    ),
)

val ubuntuFamily = FontFamily(
    Font(R.font.ubuntu_bold, FontWeight.Bold)
)