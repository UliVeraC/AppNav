package com.example.appnav

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appnav.Screens.DownScreen
import com.example.appnav.Screens.HomeScreen
import com.example.appnav.Screens.LeftScreen
import com.example.appnav.Screens.RightScreen
import com.example.appnav.Screens.UpScreen

@Composable
fun NavigatorRoutesHost(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ScreenClass.HomeScreenClass.name,
        
    ){
        composable(route = ScreenClass.HomeScreenClass.name){ HomeScreen(navController) }
        composable(route = ScreenClass.UpScreenClass.name){ UpScreen(navController) }
        composable(route = ScreenClass.DownScreenClass.name){ DownScreen(navController) }
        composable(route = ScreenClass.LeftScreenClass.name){ LeftScreen(navController) }
        composable(route = ScreenClass.RightScreenClass.name){ RightScreen(navController) }
    }
}