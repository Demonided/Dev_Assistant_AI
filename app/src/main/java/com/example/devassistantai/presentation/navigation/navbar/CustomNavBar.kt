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
import androidx.navigation3.runtime.NavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.AccountNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.ChatAINavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.QuizNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.SettingsNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.theory.ArticleNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.theory.SubjectNavKey
import com.example.devassistantai.presentation.navigation.nav3.routes.theory.TopicNavKey
import com.example.ui_theme.R
import com.example.ui_theme.ui.theme.DevAssistantTheme

@Composable
fun CustomNavBar(
    currentRoute: NavKey,
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
                .background(DevAssistantTheme.colors.appBackground),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavBarItems(
                icon = R.drawable.icon_theory,
                isSelected = currentRoute is SubjectNavKey || currentRoute is TopicNavKey || currentRoute is ArticleNavKey,
                onClick = onTheoryClick,
            )
            NavBarItems(
                icon = R.drawable.icon_quiz,
                isSelected = currentRoute is QuizNavKey,
                onClick = onQuizClick,
            )
            NavBarItems(
                icon = R.drawable.icon_message,
                isSelected = currentRoute is ChatAINavKey,
                onClick = onMessageAIClick,
            )
            NavBarItems(
                icon = R.drawable.icon_profile,
                isSelected = currentRoute is AccountNavKey,
                onClick = onProfileClick,
            )
            NavBarItems(
                icon = R.drawable.icon_setting,
                isSelected = currentRoute is SettingsNavKey,
                onClick = onSettingsClick,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomNavBarPreview() {
    CustomNavBar(
        currentRoute = SubjectNavKey,
        onTheoryClick = {},
        onQuizClick = {},
        onMessageAIClick = {},
        onProfileClick = {},
        onSettingsClick = {},
        modifier = Modifier
    )
}