package com.onm.myerrordemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGo : Button = findViewById(R.id.btnGo)
        val editDividedNumber : EditText = findViewById(R.id.divideNumberEditText)
        btnGo.setOnClickListener{
            val theNum = Integer.parseInt(editDividedNumber.text.toString())
            val result = 100.div(theNum)

            Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show()

        }
    }
}