package com.devassistantai.data.repository.mock

import com.devassistantai.domain.model.theory.Topic
import com.devassistantai.domain.repository.TopicRepositoryApi
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import java.lang.Thread.sleep

class MockTopicRepositoryImpl @Inject constructor() : TopicRepositoryApi {
    override suspend fun getAllBySubjectId(subjectId: String): Flow<List<Topic>> {
        sleep(1000)

        return flowOf(
            listOf(
                Topic(
                    id = "1",
                    subjectId = "1",
                    orderNumber = 1,
                    title = "Kotlin basic",
                    duration = 40,
                    isCompleted = true,
                    icon = "Home"
                ),
                Topic(
                    id = "2",
                    subjectId = "1",
                    orderNumber = 2,
                    title = "Null safety",
                    duration = 15,
                    isCompleted = true,
                    icon = "Home"
                ),
                Topic(
                    id = "3",
                    subjectId = "1",
                    orderNumber = 3,
                    title = "Classes and Objects",
                    duration = 25,
                    isCompleted = false,
                    icon = "Home"
                ),
                Topic(
                    id = "3",
                    subjectId = "2",
                    orderNumber = 3,
                    title = "Classes and Objects",
                    duration = 25,
                    isCompleted = false,
                    icon = "Home"
                ),
                Topic(
                    id = "3",
                    subjectId = "2",
                    orderNumber = 3,
                    title = "Classes and Objects",
                    duration = 25,
                    isCompleted = false,
                    icon = "Home"
                ),
                Topic(
                    id = "3",
                    subjectId = "2",
                    orderNumber = 3,
                    title = "Classes and Objects",
                    duration = 25,
                    isCompleted = false,
                    icon = "Home"
                )
            )
                .filter { topic -> topic.subjectId == subjectId }
                .toList()
        )
    }
}