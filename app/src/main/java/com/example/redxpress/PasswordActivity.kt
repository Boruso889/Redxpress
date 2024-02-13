package com.example.redxpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class PasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        val edMailRem = findViewById<EditText>(R.id.edMailRem)
        val tvSignIn = findViewById<TextView>(R.id.tvSignIn)
        val tvSendOTP = findViewById<TextView>(R.id.tvSendOTP)

        tvSendOTP.setOnClickListener {
            if (edMailRem.text.isEmpty()) {
                Toast.makeText(this@PasswordActivity, "Не все поля заполнены", Toast.LENGTH_LONG)
                    .show()
                return@setOnClickListener //alarm
            }
            if (!edMailRem.text.contains("@")) {
                Toast.makeText(
                    this@PasswordActivity,
                    "Почта неправильно указана",
                    Toast.LENGTH_LONG
                )
                    .show()
                return@setOnClickListener // alarm
            }
            tvSignIn.setOnClickListener {
                val intent = Intent(this@PasswordActivity, LogActivity::class.java)
                startActivity(intent)
                this@PasswordActivity.finish()
            }
            tvSendOTP.setOnClickListener {
                val intent = Intent(this@PasswordActivity, OTPActivity::class.java)
                startActivity(intent)
                this@PasswordActivity.finish()
            }


        }
    }
}
