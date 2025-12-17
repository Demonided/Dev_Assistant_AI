package com.example.theory.subject

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.Color
import com.example.com.example.devassistantai.viewmodel.BaseViewModel
import com.example.theory.subject.data.Statistics
import com.example.theory.subject.data.SubjectData
import com.example.theory.subject.data.SubjectItem
import com.example.theory.subject.data.SubjectState
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class SubjectViewModel @Inject constructor(

) : BaseViewModel<SubjectState, Nothing>() {

    override fun initialState(): SubjectState = SubjectState.DEFAULT

    init {
        val subjects = listOf(
            SubjectItem(
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
            SubjectItem(
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
            SubjectItem(
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
            SubjectItem(
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
            SubjectItem(
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
            SubjectItem(
                id = "6",
                icon = Icons.Default.Favorite,
                title = "Testing & QA",
                questionCount = 120,
                progress = 0.8f,
                colors = listOf(
                    Color(0xFFf6339a),
                    Color(0xFFe60076)
                )
            )
        )

        val statistics = Statistics(243, 67, 12)

        updateState {
            copy(subjects = SubjectData(subjectItems = subjects, statistics = statistics))
        }
    }
}