package com.example.theory.presentation.article

import com.example.com.example.devassistantai.viewmodel.BaseViewModel
import com.example.theory.presentation.article.state.ArticleState
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class ArticleViewModel @Inject constructor(

) : BaseViewModel<ArticleState, Nothing>() {
    override fun initialState() = ArticleState.DEFAULT

    init {
        updateState {
            ArticleState(
                title = "Основы синтаксиса Kotlin",
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
            """.trimIndent(),
                duration = 15
            )
        }
    }
}