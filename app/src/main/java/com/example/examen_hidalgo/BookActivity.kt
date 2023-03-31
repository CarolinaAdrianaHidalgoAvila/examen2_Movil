package com.example.examen_hidalgo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BookActivity : AppCompatActivity() {
    lateinit var title: TextView
    lateinit var description: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)
        title = findViewById(R.id.title)
        description = findViewById(R.id.description)
    }
}