package com.example.appnav.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.appnav.ScreenClass

@Composable
fun DownScreen(navController: NavController){
    Scaffold {
            padding ->
        Box (
            contentAlignment = Alignment.Center,
            modifier = Modifier.padding(padding)
                .fillMaxSize()
                .background(color = Color.Black)
                .clickable { navController.popBackStack() }
        ){
            Icon(
                Icons.Default.ArrowBack,
                contentDescription = "Go to Home",
                tint = Color.DarkGray)
        }
    }
}