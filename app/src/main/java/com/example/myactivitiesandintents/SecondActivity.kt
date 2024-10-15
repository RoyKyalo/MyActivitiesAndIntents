// SecondActivity.kt
package com.example.myactivitiesandintents

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Get the intent that started this activity
        val intent = intent

        // Retrieve the data passed from MainActivity
        val message = intent.getStringExtra("message")

        // Find the TextView and set its text to the received message
        val messageTextView = findViewById<TextView>(R.id.message_textview)
        messageTextView.text = message
    }
}
