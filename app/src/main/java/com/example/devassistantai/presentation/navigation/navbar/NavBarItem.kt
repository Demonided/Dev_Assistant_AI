package com.example.devassistantai.presentation.navigation.navbar

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_theme.R
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun NavBarItems(
    @DrawableRes icon: Int,
    isSelected: Boolean,
    onClick: () -> Unit,
) {
    val size by animateDpAsState(targetValue = if (isSelected) 30.dp else 24.dp)
    val offsetY by animateDpAsState(targetValue = if (isSelected) (-8).dp else 0.dp)
    val interactionSource = remember { MutableInteractionSource() }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .offset(y = offsetY)
            .size(70.dp)
            .clickable(
                indication = null,
                interactionSource = interactionSource
            ) {
                if (!isSelected) onClick()
            }
    ) {
        if (isSelected) {
            Box(
                modifier = Modifier
                    .size(70.dp)
                    .background(
                        color = DevAssistantTheme.colors.bottomBarDashboard.externalCircleEnableIcon,
                        shape = CircleShape
                    )
            )

            Box(
                modifier = Modifier
                    .size(64.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors =
                                listOf(
                                    DevAssistantTheme.colors.bottomBarDashboard.gradientStartEnableIcon,
                                    DevAssistantTheme.colors.bottomBarDashboard.gradientEndEnableIcon
                                ),
                            start = Offset(0f, 0f),
                            end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
                        ),
                        shape = CircleShape
                    )
            )
        }

        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            tint = if (isSelected) {
                DevAssistantTheme.colors.bottomBarDashboard.colorEnableIcon
            } else DevAssistantTheme.colors.bottomBarDashboard.colorDisableIcon,
            modifier = Modifier.size(size)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NavBarItemsPreview() {
    DevAssistantAITheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            NavBarItems(
                icon = R.drawable.icon_quiz,
                isSelected = false,
                onClick = {},
            )
            Spacer(modifier = Modifier.height(24.dp))
            NavBarItems(
                icon = R.drawable.icon_setting,
                isSelected = true,
                onClick = {},
            )
        }
    }
}