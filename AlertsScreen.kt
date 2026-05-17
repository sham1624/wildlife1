package com.example.wildlife.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wildlife.utils.FirebaseHelper
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener

@Composable
fun AlertsScreen() {

    val alertsList = remember {
        mutableStateListOf<String>()
    }

    LaunchedEffect(Unit) {

        FirebaseHelper.alertsRef
            .addValueEventListener(object : ValueEventListener {

                override fun onDataChange(snapshot: DataSnapshot) {

                    alertsList.clear()

                    for (alertSnapshot in snapshot.children) {

                        val alert =
                            alertSnapshot.getValue(String::class.java)

                        if (alert != null) {

                            alertsList.add(alert)
                        }
                    }
                }

                override fun onCancelled(error: DatabaseError) {

                }
            })
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5DC))
            .padding(16.dp)
    ) {

        Text(
            text = "Wildlife Alerts",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1B4332)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {

                FirebaseHelper.alertsRef
                    .child("alert")
                    .setValue("Elephant movement near Bandipur forest")

                FirebaseHelper.alertsRef
                    .child("alert1")
                    .setValue("Tiger spotted near Nagarhole")

                FirebaseHelper.alertsRef
                    .child("alert2")
                    .setValue("Bear movement near lake")
            }
        ) {

            Text(text = "Load Wildlife Alerts")
        }

        Spacer(modifier = Modifier.height(20.dp))

        LazyColumn {

            items(alertsList) { alert ->

                AlertCard(alert)
            }
        }
    }
}

@Composable
fun AlertCard(alert: String) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        )
    ) {

        Text(
            text = alert,
            modifier = Modifier.padding(16.dp),
            fontSize = 18.sp
        )
    }
}