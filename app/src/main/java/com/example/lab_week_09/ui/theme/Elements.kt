package com.example.lab_week_09.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

// ---------- UI ELEMENTS ----------

// 1. Judul di background utama
@Composable
fun OnBackgroundTitleText(text: String) {
    TitleText(
        text = text,
        color = MaterialTheme.colorScheme.onBackground
    )
}

// Style untuk title (besar)
@Composable
fun TitleText(text: String, color: Color) {
    Text(
        text = text,
        style = MaterialTheme.typography.titleLarge,
        color = color
    )
}

// 2. Item list di background utama
@Composable
fun OnBackgroundItemText(text: String) {
    ItemText(
        text = text,
        color = MaterialTheme.colorScheme.onBackground
    )
}

// Style untuk item list
@Composable
fun ItemText(text: String, color: Color) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodySmall,
        color = color
    )
}

// 3. Tombol utama dengan text putih
@Composable
fun PrimaryTextButton(text: String, onClick: () -> Unit) {
    TextButton(
        text = text,
        textColor = Color.White,
        onClick = onClick
    )
}

// Style tombol dengan warna abu gelap
@Composable
fun TextButton(text: String, textColor: Color, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.padding(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF5E4B8B), // ungu lembut
            contentColor = textColor
        )
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium
        )
    }
}
