package com.example.wildlife.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wildlife.screen.*

        @Composable
        fun AppNavigation() {
        val navController = rememberNavController()

        NavHost(
            navController = navController,
            startDestination = "home"
        ) {composable("home") {
            HomeScreen(navController)
        }

            composable("wiki") {
                WikiScreen()
            }

            composable("alerts") {
                AlertsScreen()
            }
            composable("guide") {
                GuideScreen()
            }

            composable("sound") {
                SoundScreen()
            }
        }
    }
