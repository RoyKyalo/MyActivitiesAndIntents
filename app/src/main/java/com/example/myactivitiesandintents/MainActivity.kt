// MainActivity.kt
package com.example.myactivitiesandintents

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Called when the button is clicked
    fun goToSecondActivity(view: View) {
        // Create an Intent to start SecondActivity
        val intent = Intent(this, SecondActivity::class.java)

        // Pass some data to the second activity
        intent.putExtra("message", "Hello from MainActivity!")

        // Start SecondActivity
        startActivity(intent)
    }
}
