package com.example.wildlife.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pets
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WikiScreen() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4F1DE))
            .padding(16.dp),

        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        item {

            Text(
                text = "Wildlife Encyclopedia",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF264653)
            )

            Spacer(modifier = Modifier.height(12.dp))
        }

        item {

            AnimalCard(
                animalName = "Tiger",
                description = "Tigers are powerful wild cats found mainly in forests. They are carnivorous animals and excellent hunters."
            )
        }

        item {

            AnimalCard(
                animalName = "Elephant",
                description = "Elephants are the largest land animals. They are intelligent and usually live in groups."
            )
        }

        item {

            AnimalCard(
                animalName = "Peacock",
                description = "Peacocks are colorful birds known for their beautiful feathers and dance."
            )
        }

        item {

            AnimalCard(
                animalName = "Deer",
                description = "Deer are gentle herbivorous animals commonly found in forests and grasslands."
            )
        }

        item {

            AnimalCard(
                animalName = "Monkey",
                description = "Monkeys are smart and active animals that live mostly on trees."
            )
        }
    }
}

@Composable
fun AnimalCard(
    animalName: String,
    description: String
) {

    Card(
        modifier = Modifier.fillMaxWidth(),

        shape = RoundedCornerShape(18.dp),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),

        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Icon(
                imageVector = Icons.Default.Pets,
                contentDescription = "Animal Icon",
                tint = Color(0xFF2A9D8F),
                modifier = Modifier.size(50.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = animalName,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1D3557)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = description,
                fontSize = 16.sp,
                color = Color.DarkGray
            )
        }
    }
}