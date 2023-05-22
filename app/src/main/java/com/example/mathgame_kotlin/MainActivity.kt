package com.example.mathgame_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var addition: Button
    lateinit var subtraction: Button
    lateinit var multi: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addition = findViewById(R.id.btnAdd)
        subtraction = findViewById(R.id.btnSub)
        multi = findViewById(R.id.btnMulti)

        addition.setOnClickListener {
            var intent = Intent(this@MainActivity, GameActivity::class.java)
            intent.putExtra("chose", "addition")
            startActivity(intent)
        }
        subtraction.setOnClickListener {
            var intent = Intent(this@MainActivity, GameActivity::class.java)
            intent.putExtra("chose", "subtraction")
            startActivity(intent)
        }
        multi.setOnClickListener {
            var intent = Intent(this@MainActivity, GameActivity::class.java)
            intent.putExtra("chose", "multiplication")
            startActivity(intent)
        }
    }
}