package com.example.theory.subject.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theory.subject.data.SubjectData
import com.example.ui_theme.ui.theme.DevAssistantAITheme

@Composable
fun SubjectsComponent(subjects: List<SubjectData>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(subjects) { subject ->
            SubjectCardItem(
                icon = subject.icon,
                title = subject.title,
                subtitle = "${subject.questionCount} вопросов",
                progress = subject.progress,
                colors = subject.colors,
                onClick = { /* обработка клика */ }
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SubjectsComponentPreview() {
    DevAssistantAITheme {
        val subjects = listOf(
            SubjectData(
                icon = Icons.Default.Favorite,
                title = "Android Framework",
                questionCount = 230,
                progress = 0.6f,
                colors = listOf(
                    Color(0xFF1E7C2F),
                    Color(0xFF0D5D1F)
                )
            ),
            SubjectData(
                icon = Icons.Default.Favorite,
                title = "Kotlin",
                questionCount = 180,
                progress = 0.3f,
                colors = listOf(
                    Color(0xFF1E4B7C),
                    Color(0xFF0D2E5D)
                )
            ),
            SubjectData(
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
        SubjectsComponent(subjects)
    }
}