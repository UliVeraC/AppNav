package com.example.appnav

sealed class ScreenClass (val name: String){
    object HomeScreenClass:ScreenClass("Home")
    object UpScreenClass:ScreenClass("Up")
    object DownScreenClass:ScreenClass("Down")
    object LeftScreenClass:ScreenClass("Left")
    object RightScreenClass:ScreenClass("Right")
}