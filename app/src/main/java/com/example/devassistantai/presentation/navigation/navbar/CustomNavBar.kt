package com.example.devassistantai.presentation.navigation.navbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.devassistantai.presentation.navigation.ChatAI
import com.example.devassistantai.presentation.navigation.Profile
import com.example.devassistantai.presentation.navigation.Quiz
import com.example.devassistantai.presentation.navigation.Settings
import com.example.devassistantai.presentation.navigation.Theory
import com.example.ui_theme.R
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun CustomNavBar(
    currentRoute: String?,
    onTheoryClick: () -> Unit,
    onQuizClick: () -> Unit,
    onMessageAIClick: () -> Unit,
    onProfileClick: () -> Unit,
    onSettingsClick: () -> Unit,
    modifier: Modifier,
) {
    Column {
        Divider(
            color = DevAssistantTheme.colors.bottomBarDashboard.bottomBarBorder,
            thickness = 1.dp
        )

        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(DevAssistantTheme.colors.bottomBarDashboard.bottomBarBackground),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavBarItems(
                icon = R.drawable.icon_theory,
                isSelected = currentRoute == Theory.route,
                onClick = onTheoryClick,
            )
            NavBarItems(
                icon = R.drawable.icon_quiz,
                isSelected = currentRoute == Quiz.route,
                onClick = onQuizClick,
            )
            NavBarItems(
                icon = R.drawable.icon_message,
                isSelected = currentRoute == ChatAI.route,
                onClick = onMessageAIClick,
            )
            NavBarItems(
                icon = R.drawable.icon_profile,
                isSelected = currentRoute == Profile.route,
                onClick = onProfileClick,
            )
            NavBarItems(
                icon = R.drawable.icon_setting,
                isSelected = currentRoute == Settings.route,
                onClick = onSettingsClick,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomNavBarPreview() {
    CustomNavBar(
        currentRoute = Theory.route,
        onTheoryClick = {},
        onQuizClick = {},
        onMessageAIClick = {},
        onProfileClick = {},
        onSettingsClick = {},
        modifier = Modifier
    )
}