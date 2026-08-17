package com.example.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val ConsultColorScheme = lightColorScheme(
    primary = ConsultPrimary,
    onPrimary = Color.White,
    primaryContainer = ConsultPrimaryContainer,
    onPrimaryContainer = ConsultOnPrimaryContainer,
    secondaryContainer = ConsultSecondaryContainer,
    background = Color.White,
    surface = ConsultSurface,
    surfaceContainer = ConsultSurfaceContainer,
    onSurface = ConsultOnSurface,
    onSurfaceVariant = ConsultOnSurfaceVariant,
    outline = ConsultOutline,
    outlineVariant = ConsultOutlineVariant
)

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = ConsultColorScheme,
        typography = Typography,
        content = content
    )
}
