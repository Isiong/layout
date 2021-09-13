package com.example.layout_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView = findViewById(R.id.text3)

        textView.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
