package com.example.gigakasyno

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

sealed class Screen {
    object Greeting : Screen()
    object Menu : Screen()
}

class MainViewModel : ViewModel() {
    private val _currentScreen = MutableStateFlow<Screen>(Screen.Greeting)
    val currentScreen: StateFlow<Screen> = _currentScreen.asStateFlow()

    fun navigateToMenu() {
        _currentScreen.value = Screen.Menu
    }

    fun navigateToGreeting() {
        _currentScreen.value = Screen.Greeting
    }
}
