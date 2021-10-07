package com.example.weather_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var btngo: Button
    lateinit var code: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btngo = findViewById(R.id.go)
        code = findViewById(R.id.zip_code)
        btngo.setOnClickListener {

            val sendcode=code.text.toString()
            if (sendcode.isNotEmpty()){
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Code",sendcode)
            startActivity(intent)
        }
        else {
                Toast.makeText(applicationContext, "enter vild number ", Toast.LENGTH_SHORT).show()

            }

        }


    }
}