package com.example.wildlife.utils

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

object FirebaseHelper {

    private val database: FirebaseDatabase =
        FirebaseDatabase.getInstance()

    val alertsRef: DatabaseReference =
        database.getReference("alerts")
}