package com.example.theory.extantion

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import kotlin.math.cos
import kotlin.math.sin

fun Modifier.angleLinearGradient(
    colors: List<Color>,
    angle: Float
): Modifier = this.then(
    Modifier.drawBehind {
        val angleRad = Math.toRadians(angle.toDouble())
        val radius = size.minDimension
        val x = cos(angleRad).toFloat() * radius
        val y = sin(angleRad).toFloat() * radius

        drawRect(
            brush = Brush.linearGradient(
                colors = colors,
                start = Offset(
                    size.width / 2 - x,
                    size.height / 2 - y
                ),
                end = Offset(
                    size.width / 2 + x,
                    size.height / 2 + y
                )
            )
        )
    }
)
