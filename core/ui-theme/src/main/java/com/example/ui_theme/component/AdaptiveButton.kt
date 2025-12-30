package com.example.ui_theme.component

import android.content.res.Configuration
import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_theme.R
import com.example.ui_theme.extantion.angleLinearGradient
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantGradient
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun AdaptiveButton(
    buttonText: String,
    modifier: Modifier = Modifier,
    isGradient: Boolean = false,
    heightButton: Int = 60,
    @DrawableRes startButtonIcon: Int? = null,
    @DrawableRes endButtonIcon: Int? = null,
    isEnable: Boolean = true,
    onClick: () -> Unit = {},
) {
    Button(
        onClick = onClick,
        enabled = isEnable,
        shape = RoundedCornerShape(12.dp),
        border = if (isGradient) BorderStroke(0.dp, Color.Gray) else BorderStroke(1.dp, Color.Gray),
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        modifier = modifier
            .height(heightButton.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .then(
                    if (isGradient) {
                        Modifier.angleLinearGradient(DevAssistantGradient.primary(), 20f)
                    } else {
                        Modifier.background(Color.Transparent)
                    }
                )
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                NavigationIconButton(
                    drawable = startButtonIcon,
                    isGradient = isGradient
                )

                Text(
                    text = buttonText,
                    style = DevAssistantTheme.typography.answerOptionText.copy(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                    ),
                    color = if (isGradient) DevAssistantTheme.colors.white else DevAssistantTheme.colors.textTitle
                )

                NavigationIconButton(
                    drawable = endButtonIcon,
                    isGradient = isGradient
                )
            }
        }
    }
}

@Composable
fun NavigationIconButton(@DrawableRes drawable: Int?, isGradient: Boolean) {
    drawable?.let { icon ->
        Icon(
            painter = painterResource(icon),
            contentDescription = null,
            tint = if (isGradient) DevAssistantTheme.colors.white else DevAssistantTheme.colors.textTitle,
            modifier = Modifier
                .padding(start = 8.dp)
                .size(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun AdaptiveButtonPreview() {
    DevAssistantAITheme() {
        AdaptiveButton(
            buttonText = "Назад",
            isGradient = true,
            isEnable = false,
            startButtonIcon = R.drawable.icon_arrow_back,
            endButtonIcon = R.drawable.icon_arrow_next,
            modifier = Modifier
                .padding(4.dp)
        )
    }
}
