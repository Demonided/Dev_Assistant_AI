package com.example.theory.subject.data

data class SubjectData(
    var subjectItems: List<SubjectItem>,
    val statistics: Statistics
) {
    companion object {
        val EMPTY = SubjectData(
            subjectItems = emptyList(),
            statistics = Statistics(0, 0, 0)
        )
    }
}
