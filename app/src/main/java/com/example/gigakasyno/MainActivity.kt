package com.example.gigakasyno

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.gigakasyno.ui.theme.GigaKasynoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GigaKasynoTheme {
                GreetingScreen()
            }
        }
    }
}

@Composable
fun GreetingScreen() {
    val logo = painterResource(R.drawable.logo)
    val rouletteImage = painterResource(R.drawable.ruletka)
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
    ) {
        Image(painter = rouletteImage, contentDescription = stringResource(R.string.roulette_image))
        Image(painter = logo, contentDescription = stringResource(R.string.app_logo_description))
        Button(onClick = {}) {
            Text(text = stringResource(R.string.greeting_screen_btn_text))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingScreenPreview() {
    GigaKasynoTheme {
        GreetingScreen()
    }
}
