package com.example.necoru7fishermanbook

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContentActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout)
        var tvTitle = findViewById<TextView>(R.id.tvTitle)
        var tvContent = findViewById<TextView>(R.id.tvContent)
        var im = findViewById<ImageView>(R.id.im)

        tvTitle.text = intent.getStringExtra("title")
        tvContent.text = intent.getStringExtra("content")
        im.setImageResource(intent.getIntExtra("image", R.drawable.som))


    }
}