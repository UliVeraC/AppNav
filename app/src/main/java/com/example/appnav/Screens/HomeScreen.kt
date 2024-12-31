package com.example.appnav.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.appnav.ScreenClass

@Composable
fun HomeScreen(navController: NavController){
    Scaffold{
        padding ->
        Box (
            contentAlignment = Alignment.Center,
            modifier = Modifier.padding(padding)
                .fillMaxSize()
        ){
            Box(
                modifier = Modifier.width(154.dp)
                    .height(150.dp)
            ){
                Row{
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(50.dp)
                            .clickable { navController.navigate(ScreenClass.LeftScreenClass.name) }
                    ){
                        Icon(Icons.Default.KeyboardArrowLeft,
                            contentDescription = "Go to Left Screen",
                            tint = Color.Black)
                    }

                    Spacer(modifier = Modifier.width(2.dp))

                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(50.dp)
                    ){
                        Row (
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(75.dp)
                                .clickable { navController.navigate(ScreenClass.UpScreenClass.name) }
                        ){
                            Icon(Icons.Default.KeyboardArrowUp,
                                contentDescription = "Go to Up Screen",
                                tint = Color.Black)
                        }
                        Row (
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(75.dp)
                                .clickable { navController.navigate(ScreenClass.DownScreenClass.name) }

                        ){
                            Icon(Icons.Default.KeyboardArrowDown,
                                contentDescription = "Go to Down Screen",
                                tint = Color.Black)
                        }
                    }

                    Spacer(modifier = Modifier.width(2.dp))

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(50.dp)
                            .clickable { navController.navigate(ScreenClass.RightScreenClass.name) }
                    ){
                        Icon(Icons.Default.KeyboardArrowRight,
                            contentDescription = "Go to Right Screen",
                            tint = Color.Black)
                    }
                }

            }
        }
    }
}