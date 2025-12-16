package com.example.theory.subject.composable

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theory.R
import com.example.theory.subject.data.Statistics
import com.example.theory.subject.data.SubjectData
import com.example.theory.subject.data.SubjectItem
import com.example.ui_theme.ui.theme.DevAssistantAITheme

@Composable
fun SubjectsComponent(subjects: SubjectData) {
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
                onClick = { /* обработка клика */ }
            )
        }
        item {
            with(subjects.statistics) {
                StatisticsCard(
                    learned = learned,
                    progress = progress,
                    streak = streak
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
fun SubjectsComponentPreview() {
    DevAssistantAITheme {
        val subjects = listOf(
            SubjectItem(
                icon = Icons.Default.Favorite,
                title = "Android Framework",
                questionCount = 230,
                progress = 0.6f,
                colors = listOf(
                    Color(0xFF1E7C2F),
                    Color(0xFF0D5D1F)
                )
            ),
            SubjectItem(
                icon = Icons.Default.Favorite,
                title = "Kotlin",
                questionCount = 180,
                progress = 0.3f,
                colors = listOf(
                    Color(0xFF1E4B7C),
                    Color(0xFF0D2E5D)
                )
            ),
            SubjectItem(
                icon = Icons.Default.Favorite,
                title = "Architecture",
                questionCount = 120,
                progress = 0.8f,
                colors = listOf(
                    Color(0xFFC63131),
                    Color(0xFF971919)
                )
            )

        )

        val statistics = Statistics(243, 67, 12)
        SubjectsComponent(SubjectData(subjectItems = subjects, statistics = statistics))
    }
}