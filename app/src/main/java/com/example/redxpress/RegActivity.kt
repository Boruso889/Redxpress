package com.example.redxpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class RegActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)

        val etPhone: EditText = findViewById(R.id.etPhone)
        val etName: EditText = findViewById(R.id.etName)
        val etPass: EditText = findViewById(R.id.etPass)
        val etPassAgain: EditText = findViewById(R.id.etPassAgain)
        val etEmail: EditText = findViewById(R.id.etEmail)
        val regBtn: TextView = findViewById(R.id.regBtn)

        regBtn.setOnClickListener {
            if (etPhone.text.isEmpty() || etName.text.isEmpty() || etPass.text.isEmpty() || etPassAgain.text.isEmpty() || etEmail.text.isEmpty()) { // пустые поля поиск
                Toast.makeText(this@RegActivity, "Не все поля заполнены", Toast.LENGTH_LONG).show()
                return@setOnClickListener // alarm
            }
            if (!etEmail.text.contains("@")) {
                Toast.makeText(this@RegActivity, "Неправильно указана почта", Toast.LENGTH_LONG)
                    .show()
                return@setOnClickListener // alarm cancel
            }

        }


    }
}