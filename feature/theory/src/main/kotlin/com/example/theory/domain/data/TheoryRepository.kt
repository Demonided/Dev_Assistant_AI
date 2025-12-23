package com.example.theory.domain.data

import com.example.theory.domain.model.Subject

interface TheoryRepository {

    fun getAll(): List<Subject>

    fun getTopicBySubjectId(): Subject
}