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
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.AccountRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.ChatAIRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.QuizRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.SettingsRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.TheoryRoutes.ArticleRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.TheoryRoutes.SubjectRoutes
import com.example.devassistantai.presentation.navigation.nav3.AppRoutes.TheoryRoutes.TopicRoutes
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
                isSelected = currentRoute is SubjectRoutes || currentRoute is TopicRoutes || currentRoute is ArticleRoutes,
                onClick = onTheoryClick,
            )
            NavBarItems(
                icon = R.drawable.icon_quiz,
                isSelected = currentRoute is QuizRoutes,
                onClick = onQuizClick,
            )
            NavBarItems(
                icon = R.drawable.icon_message,
                isSelected = currentRoute is ChatAIRoutes,
                onClick = onMessageAIClick,
            )
            NavBarItems(
                icon = R.drawable.icon_profile,
                isSelected = currentRoute is AccountRoutes,
                onClick = onProfileClick,
            )
            NavBarItems(
                icon = R.drawable.icon_setting,
                isSelected = currentRoute is SettingsRoutes,
                onClick = onSettingsClick,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomNavBarPreview() {
    CustomNavBar(
        currentRoute = SubjectRoutes,
        onTheoryClick = {},
        onQuizClick = {},
        onMessageAIClick = {},
        onProfileClick = {},
        onSettingsClick = {},
        modifier = Modifier
    )
}