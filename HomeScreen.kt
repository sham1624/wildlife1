package com.example.wildlife.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5DC))
            .padding(20.dp),

        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        Text(
            text = "Wildlife Safety App",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1B4332)
        )

        Text(
            text = "Learn wildlife awareness and safety precautions.",
            style = MaterialTheme.typography.bodyLarge
        )
        Button(
            onClick = {
                navController.navigate("guide")
            },

            modifier = Modifier.fillMaxWidth(),

            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2D6A4F)
            )
        ) {
            Text("Wildlife Guide")
        }
        Button(
            onClick = {
                navController.navigate("alerts")
            },

            modifier = Modifier.fillMaxWidth(),

            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFD62828)
            )
        ) {
            Text("Emergency Alerts")
        }
        Button(
            onClick = {
                navController.navigate("sound")
            },

            modifier = Modifier.fillMaxWidth(),

            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF3A86FF)
            )
        ) {
            Text("Animal Sounds")
        }
        Button(
            onClick = {
                navController.navigate("wiki")
            },

            modifier = Modifier.fillMaxWidth(),

            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF8338EC)
            )
        ) {
            Text("Wildlife Info")
        }
    }
}