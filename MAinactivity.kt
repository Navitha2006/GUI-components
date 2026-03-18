package com.example.fontcolorapp

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var isChanged = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvText = findViewById<TextView>(R.id.tvText)
        val btnChange = findViewById<Button>(R.id.btnChange)

        btnChange.setOnClickListener {

            if (!isChanged) {
                tvText.setTextColor(Color.RED)
                tvText.textSize = 28f
                tvText.setTypeface(null, Typeface.BOLD)

                Toast.makeText(this, "Style Changed!", Toast.LENGTH_SHORT).show()
                isChanged = true
            } else {
                tvText.setTextColor(Color.BLACK)
                tvText.textSize = 22f
                tvText.setTypeface(null, Typeface.NORMAL)

                Toast.makeText(this, "Style Reset!", Toast.LENGTH_SHORT).show()
                isChanged = false
            }
        }
    }
}
