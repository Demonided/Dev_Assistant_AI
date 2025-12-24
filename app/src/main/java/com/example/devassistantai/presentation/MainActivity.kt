package com.example.devassistantai.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.devassistantai.presentation.navigation.DevAssistantScreen
import com.example.devassistantai.presentation.navigation.Theory
import com.example.ui_theme.ui.theme.DevAssistantAITheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            DevAssistantAITheme {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    DevAssistantScreen(
                        startDestination = Theory.route
                    )
                }
            }
        }
    }
}