package com.example.wildlife.screen

import android.media.MediaPlayer
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wildlife.R

@Composable
fun SoundScreen() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE8F5E9))
            .padding(16.dp),

        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        item {

            Text(
                text = "Wildlife Sounds",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1B5E20)
            )

            Spacer(modifier = Modifier.height(12.dp))
        }

        item {
            SoundCard(
                animal = "Animal Sound",
                soundRes = R.raw.animal_sound
            )
        }

        item {
            SoundCard(
                animal = "Bird Chirping ",
                soundRes = R.raw.bird_sound
            )
        }

        item {
            SoundCard(
                animal = "Music Sound",
                soundRes = R.raw.music_sound
            )
        }

        item {
            SoundCard(
                animal = "Nature Sound",
                soundRes = R.raw.nature_sound
            )
        }

        item {
            SoundCard(
                animal = "Rain Sound",
                soundRes = R.raw.rain_sound
            )
        }
    }
}

@Composable
fun SoundCard(
    animal: String,
    soundRes: Int
) {

    val context = LocalContext.current

    Card(
        modifier = Modifier.fillMaxWidth(),

        shape = RoundedCornerShape(16.dp),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),

        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Icon(
                imageVector = Icons.Default.VolumeUp,
                contentDescription = "Sound Icon",
                tint = Color(0xFF2E7D32)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = animal,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = {

                    val mediaPlayer =
                        MediaPlayer.create(context, soundRes)

                    mediaPlayer.start()
                },

                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF2E7D32)
                )
            ) {

                Text(
                    text = "Play Sound",
                    color = Color.White
                )
            }
        }
    }
}