package com.example.ui_theme.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.example.ui_theme.ui.theme.DevAssistantColor.BottomBarDashboard

val LightDevAssistantColor = DevAssistantColor(
    textTitle = Color(0xFFFFFFFF),

    bottomBarDashboard = BottomBarDashboard(
        backgroundBottomBar = Color(0xFFE9E9EC),
        colorEnableIcon = Color(0xFFFFFFFF),
        colorDisableIcon = Color(0xFF2A2A2A),
        gradientStartEnableIcon = Color(0xFF274A7A),
        gradientEndEnableIcon = Color(0xFF8C1F3F),
        externalCircleEnableIcon = Color(0xFFE0E1E4),
        borderBottomBar = Color(0xFFCCCCCC)
    )
)

val DarkDevAssistantColor = DevAssistantColor(
    textTitle = Color(0xFF000000),

    bottomBarDashboard = BottomBarDashboard(
        backgroundBottomBar = Color(0xFF121315),
        colorEnableIcon = Color(0xFFFFFFFF),
        colorDisableIcon = Color(0xFF8A8A8A),
        gradientStartEnableIcon = Color(0xFF274A7A),
        gradientEndEnableIcon = Color(0xFF8C1F3F),
        externalCircleEnableIcon = Color(0xFF1E1F22),
        borderBottomBar = Color(0xFF626161)
    )
)

data class DevAssistantColor(
    val textTitle: Color,

    val bottomBarDashboard: BottomBarDashboard
) {
    @Immutable
    data class BottomBarDashboard(
        val backgroundBottomBar: Color,
        val colorEnableIcon: Color,
        val colorDisableIcon: Color,
        val gradientStartEnableIcon: Color,
        val gradientEndEnableIcon: Color,
        val externalCircleEnableIcon: Color,
        val borderBottomBar: Color
    )
}