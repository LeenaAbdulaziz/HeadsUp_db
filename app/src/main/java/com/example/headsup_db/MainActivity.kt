package com.example.headsup_db

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnStart.setOnClickListener {
            intent = Intent(applicationContext, Game::class.java)
            startActivity(intent)
        }
        btnadd.setOnClickListener {
            intent = Intent(applicationContext, AddCelebrity::class.java)
            startActivity(intent)
        }

    }

}

