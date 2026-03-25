package com.example.gigakasyno.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gigakasyno.R
import com.example.gigakasyno.ui.theme.GigaKasynoTheme

@Composable
fun Menu(onBack: () -> Unit) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(
            text = stringResource(R.string.menu_title),
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = { /* TODO: Przejdź do Jednorękiego Bandyty */ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(R.string.game_slots))
        }
        Button(onClick = { /* TODO: Przejdź do Ruletki */ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(R.string.game_roulette))
        }
        Button(onClick = { /* TODO: Przejdź do Kości */ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(R.string.game_coin))
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onBack) {
            Text(text = stringResource(R.string.back_to_main))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    GigaKasynoTheme {
        Menu(onBack = {})
    }
}
