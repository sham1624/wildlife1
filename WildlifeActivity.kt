package com.example.wildlife

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout

class WildlifeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_wildlife)
        setContentView(R.layout.activity_wildlife)

        val motionLayout = findViewById<MotionLayout>(R.id.motionLayout)
    }
}