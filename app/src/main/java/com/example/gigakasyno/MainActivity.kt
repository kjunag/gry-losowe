package com.example.gigakasyno

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.gigakasyno.ui.screens.GreetingScreen
import com.example.gigakasyno.ui.screens.Menu
import com.example.gigakasyno.ui.theme.GigaKasynoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GigaKasynoTheme {
                GigaKasynoApp()
            }
        }
    }
}

@Composable
fun GigaKasynoApp(viewModel: MainViewModel = viewModel()) {
    val currentScreen by viewModel.currentScreen.collectAsState()

    when (currentScreen) {
        is Screen.Greeting -> GreetingScreen(onNavigateToMenu = { viewModel.navigateToMenu() })
        is Screen.Menu -> Menu(onBack = { viewModel.navigateToGreeting() })
    }
}
