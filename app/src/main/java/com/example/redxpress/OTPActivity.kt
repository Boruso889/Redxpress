package com.example.redxpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class OTPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpactivity)

        val tvResend = findViewById<TextView>(R.id.tvResend)
        val tvSetPass = findViewById<TextView>(R.id.tvSetPass)
        val edOTP1 = findViewById<EditText>(R.id.edOTP1)
        val edOTP2 = findViewById<EditText>(R.id.edOTP2)
        val edOTP3 = findViewById<EditText>(R.id.edOTP3)
        val edOTP4 = findViewById<EditText>(R.id.edOTP4)
        val edOTP5 = findViewById<EditText>(R.id.edOTP5)
        val edOTP6 = findViewById<EditText>(R.id.edOTP6)

        tvSetPass.setOnClickListener{
            if (edOTP1.text.isEmpty()||edOTP2.text.isEmpty()||edOTP3.text.isEmpty()||edOTP4.text.isEmpty()||edOTP5.text.isEmpty()||edOTP6.text.isEmpty())
                Toast.makeText(this@OTPActivity, "Не указан код ОТП", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
        tvResend.setOnClickListener{
            val intent = Intent(this@OTPActivity, PasswordActivity::class.java)
            startActivity(intent)
            this@OTPActivity.finish()
        }
        tvSetPass.setOnClickListener{
            val intent = Intent(this@OTPActivity, BottomActivity::class.java)
            startActivity(intent)
            this@OTPActivity.finish()
        }

    }
}