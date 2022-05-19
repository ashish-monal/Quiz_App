package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btnStart)
        val etName: AppCompatEditText = findViewById(R.id.et_name)

        btnStart.setOnClickListener {
            if (etName.text.toString().isEmpty()) {
                Toast.makeText(this, "Please Enter your name ", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, QuizeQuestionActivity::class.java)
                intent.putExtra(Constants.User_Name,etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}