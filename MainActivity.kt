package com.example.wildlife

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.wildlife.navigation.AppNavigation

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Open WildlifeActivity
        val intent = Intent(this, WildlifeActivity::class.java)
        startActivity(intent)

        setContent {
            AppNavigation()
        }
    }
}
