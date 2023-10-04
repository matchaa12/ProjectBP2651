package com.example.projectbp2651

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookKidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

        val btnFairy = findViewById<Button>(R.id.buttonFairy)
        val btnFable = findViewById<Button>(R.id.buttonFable)
        val btnScience = findViewById<Button>(R.id.buttonScience)

        //create method replace fragment
        private fun replaceFragment()
    }
}