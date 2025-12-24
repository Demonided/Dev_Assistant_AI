package com.example.theory.presentation.subject.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theory.R
import com.example.theory.presentation.subject.data.SubjectState
import com.example.theory.presentation.subject.ui.model.StatisticsModel
import com.example.theory.presentation.subject.ui.model.SubjectModel
import com.example.ui_theme.ui.theme.DevAssistantAITheme

@Composable
fun SubjectsComponent(
    subjects: SubjectState,
    onClick: (String) -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(subjects.subjectItems) { subject ->
            SubjectCardItem(
                icon = subject.icon,
                title = subject.title,
                subtitle = "${subject.questionCount} ${stringResource(R.string.questions)}",
                progress = subject.progress,
                colors = subject.colors,
                onClick = { onClick(subject.id) }
            )
        }
        item {
            with(subjects.statisticsModel) {
                StatisticsCard(
                    learned = learned,
                    progress = progress,
                    streak = streak
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun SubjectsComponentPreview() {
    val subjects = listOf(
        SubjectModel(
            id = "1",
            icon = Icons.Default.Home,
            title = "Kotlin",
            questionCount = 145,
            progress = 0.6f,
            colors = listOf(
                Color(0xFFad46ff),
                Color(0xFF9810fa)
            )
        ),
        SubjectModel(
            id = "2",
            icon = Icons.Default.AccountBox,
            title = "Android Framework",
            questionCount = 230,
            progress = 0.3f,
            colors = listOf(
                Color(0xFF00c951),
                Color(0xFF00a63e)
            )
        ),
        SubjectModel(
            id = "3",
            icon = Icons.Default.DateRange,
            title = "SQL & Database",
            questionCount = 120,
            progress = 0.8f,
            colors = listOf(
                Color(0xFF2b7fff),
                Color(0xFF155dfc)
            )
        ),
        SubjectModel(
            id = "4",
            icon = Icons.Default.Share,
            title = "Architecture",
            questionCount = 180,
            progress = 0.3f,
            colors = listOf(
                Color(0xFFff6900),
                Color(0xFFf54a00)
            )
        ),
        SubjectModel(
            id = "5",
            icon = Icons.Default.Star,
            title = "Jetpack Compose",
            questionCount = 120,
            progress = 0.8f,
            colors = listOf(
                Color(0xFF00b8db),
                Color(0xFF0092b8)
            )
        ),
    )
    val statisticsModel = StatisticsModel(243, 67, 12)

    DevAssistantAITheme {
        SubjectsComponent(
            subjects = SubjectState(
                subjectItems = subjects,
                statisticsModel = statisticsModel
            ),
            onClick = {}
        )
    }
}