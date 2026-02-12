package com.example.theory.mapper

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Warning
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.devassistantai.domain.model.profile.Statistics
import com.devassistantai.domain.model.theory.Subject
import com.devassistantai.domain.model.theory.Topic
import com.example.theory.presentation.subject.model.StatisticsModel
import com.example.theory.presentation.subject.model.SubjectModel
import com.example.theory.presentation.topic.model.TopicModel

fun List<Subject>.toSubjectModel(): List<SubjectModel> {
    return this.map { subject ->
        SubjectModel(
            id = subject.id,
            icon = getImageVectorFromString(subject.icon),
            title = subject.title,
            questionCount = subject.questionCount,
            progress = subject.progress,
            colors = getColorsFromString(subject.colors)
        )
    }.toList()
}

fun Statistics.toStatisticsModel(): StatisticsModel {
    return StatisticsModel(
        learned = this.learned,
        progress = this.progress,
        streak = this.streak
    )
}

fun List<Topic>.toTopicModel(): List<TopicModel> {
    return this.map { topic ->
        TopicModel(
            id = topic.id,
            orderNumber = topic.orderNumber,
            title = topic.title,
            duration = topic.duration,
            isCompleted = topic.isCompleted,
            icon = getImageVectorFromString(topic.icon)
        )
    }
}

fun getImageVectorFromString(name: String): ImageVector = when (name) {
    "Home" -> Icons.Default.Home
    "AccountBox" -> Icons.Default.AccountBox
    "DateRange" -> Icons.Default.DateRange
    "Share" -> Icons.Default.Share
    "Star" -> Icons.Default.Star
    "Favorite" -> Icons.Default.Favorite
    else -> Icons.Default.Warning
}

private fun getColorsFromString(stringColor: List<String>): List<Color> {
    return stringColor.map { stringColor ->
        val cleanHex = stringColor.removePrefix("0x").removePrefix("0X")
        val colorLong = cleanHex.toLongOrNull(16) ?: 0xFFFFFFFF
        Color(colorLong)
    }.toList()
}