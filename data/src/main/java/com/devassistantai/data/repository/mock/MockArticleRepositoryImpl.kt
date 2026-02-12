package com.devassistantai.data.repository.mock

import com.devassistantai.domain.model.theory.Article
import com.devassistantai.domain.repository.ArticleRepositoryApi
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class MockArticleRepositoryImpl @Inject constructor() : ArticleRepositoryApi {
    override suspend fun getAllByTopicId(topicId: String): Flow<Article> {
        return flowOf(
            getArticles().first { article -> article.topicId == topicId }
        )
    }

    private fun getArticles(): List<Article> {
        return listOf(
            Article(
                id = "1",
                topicId = "1",
                topicTitle = "Основы синтаксиса Kotlin",
                topicDuration = 15,
                content = """
                Kotlin - это современный, статически типизированный язык программирования, работающий на JVM.
                
    📌 Переменные
        val = неизменяемая (read-only)
        var = изменяемая

        Тип после имени: val name: String = "Kotlin"
    
    📌 Null-безопасность
        По умолчанию переменная не может быть null.

        String? — разрешаем null.
        ?. — безопасный вызов.
        ?: — элвис-оператор (значение по умолч.).
        !! — рискованный null.

    📌 Функции
        fun sum(a: Int, b: Int): Int { return a + b }
        Однострочник: fun sum(a: Int, b: Int) = a + b
        Параметры по умолч.: fun log(msg: String = "Error")

    📌 Классы
        class Person(val name: String, var age: Int) — конструктор в заголовке.
        data class User(...) — для моделей данных (генерирует equals/hashCode/toString).
        Наследование: двоеточие class MyClass : ParentClass().

    📌 Строки
        ""${'"'} ""${'"'} — многострочный текст.
        Интерполяция: "Hello, ${'$'}name" или "${'$'}{obj.field}".

    📌 Коллекции
        listOf(), setOf(), mutableListOf(), mapOf(Pair("a", 1)).
        Фильтрация: .filter { it > 5 } (it — неявное имя).

    📌 Управление
        if — это выражение (возвращает значение): val max = if (a > b) a else b
        when — замена switch:

        kotlin
        when (x) {
            1 -> print("A")
            in 2..5 -> print("Range")
            else -> print("Other")
        }
    📌 Extension (расширения)
        Добавление метода к классу извне:
        fun String.reverse(): String = this.reversed()

    📌 Лямбды
        val sum = { x: Int, y: Int -> x + y }
            """.trimIndent()
            ),

            Article(
                id = "2",
                topicId = "2",
                topicTitle = "Основы синтаксиса Kotlin",
                topicDuration = 15,
                content = """
                Kotlin - это современный, статически типизированный язык программирования, работающий на JVM.
                
                Основные преимущества: 
                    • Null-безопасность из коробки 
                    • Краткий и выразительный синтаксис 
                    • 100% совместимость с Java 
                    • Поддержка функционального программирования 
                
                    Пример кода: 
                        val name: String = "Kotlin" 
                        var age: Int = 10  
                        
                        fun greet(name: String): String { 
                            return "Hello, ${'$'}name!" 
                        }
            """.trimIndent()
            ),
        )
    }
}