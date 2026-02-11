package com.devassistantai.data.repository.mock

import com.devassistantai.domain.model.theory.Subject
import com.devassistantai.domain.repository.TheoryRepositoryApi
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class MockSubjectRepositoryImpl @Inject constructor() : TheoryRepositoryApi {

    override suspend fun getAll(): Flow<List<Subject>> {
        return flowOf(getMockSubjects())
    }

    private fun getMockSubjects(): List<Subject> {
        return listOf(
            Subject(
                id = "1",
                icon = "Home",
                title = "Kotlin",
                questionCount = 145,
                progress = 0.6f,
                colors = listOf("0xFFad46ff", "0xFF9810fa")
            ),
            Subject(
                id = "2",
                icon = "AccountBox",
                title = "Android Framework",
                questionCount = 230,
                progress = 0.3f,
                colors = listOf("0xFF00c951", "0xFF00a63e")
            ),
            Subject(
                id = "3",
                icon = "DateRange",
                title = "SQL & Database",
                questionCount = 120,
                progress = 0.8f,
                colors = listOf("0xFF2b7fff", "0xFF155dfc")
            ),
            Subject(
                id = "4",
                icon = "Share",
                title = "Architecture",
                questionCount = 180,
                progress = 0.3f,
                colors = listOf("0xFFff6900", "0xFFf54a00")
            ),
            Subject(
                id = "5",
                icon = "Star",
                title = "Jetpack Compose",
                questionCount = 120,
                progress = 0.8f,
                colors = listOf("0xFF00b8db", "0xFF0092b8")
            ),
            Subject(
                id = "6",
                icon = "Favorite",
                title = "Testing & QA",
                questionCount = 120,
                progress = 0.8f,
                colors = listOf("0xFFf6339a", "0xFFe60076")
            )
        )
    }

}
