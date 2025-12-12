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

    val answerOptionText: TextStyle = TextStyle(
        fontFamily = enterFamily,
        fontWeight = FontWeight.Light,
        textAlign = TextAlign.Center,
        color = Color.White,
        fontSize = 22.sp,
        lineHeight = 22.sp,
    ),
)

val ubuntuFamily = FontFamily(
    Font(R.font.ubuntu_bold, FontWeight.Bold)
)

val enterFamily = FontFamily(
    Font(R.font.inter_thin, FontWeight.Thin),
    Font(R.font.inter_extra_light, FontWeight.ExtraLight),
    Font(R.font.inter_light, FontWeight.Light),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_bold, FontWeight.Bold),
)