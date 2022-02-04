package com.codingwithjks.furnitureapp.data.splash

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.Surface
import com.codingwithjks.furnitureapp.data.splash.screens.OnBoardingScreen
import com.codingwithjks.furnitureapp.ui.theme.FurnitureAppTheme
import com.google.accompanist.pager.ExperimentalPagerApi

@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {

    @ExperimentalPagerApi
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FurnitureAppTheme() {
                Surface() {
                    OnBoardingScreen {

                    }
                }
            }
        }
    }
}