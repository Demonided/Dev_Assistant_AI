package com.example.theory.subject

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.ui.graphics.Color
import com.example.com.example.devassistantai.viewmodel.BaseViewModel
import com.example.theory.subject.data.Statistics
import com.example.theory.subject.data.SubjectData
import com.example.theory.subject.data.SubjectItem
import com.example.theory.subject.data.SubjectState

class SubjectViewModel : BaseViewModel<SubjectState, Nothing>() {

    override fun initialState(): SubjectState = SubjectState.DEFAULT

    init {
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

        updateState {
            copy(subjects = SubjectData(subjectItems = subjects, statistics = statistics))
        }
    }
}