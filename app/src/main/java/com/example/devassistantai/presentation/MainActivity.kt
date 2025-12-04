package com.example.devassistantai.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.devassistantai.presentation.navigation.DevAssistantScreen
import com.example.devassistantai.presentation.navigation.Home
import com.example.devassistantai.presentation.navigation.Theory
import com.example.ui_theme.ui.theme.DevAssistantAITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DevAssistantAITheme {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Surface(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Log.d("MyLog", "MainActivity: запустился")
                        DevAssistantScreen(
                            startDestination = Theory.route
                        )
                    }
                }
            }
        }
    }
}