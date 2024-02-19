package com.example.redxpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class LogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)

        val tvSignUp = findViewById<TextView>(R.id.TVsignup)
        val tvLogBtn = findViewById<TextView>(R.id.tvLogBtn)
        val edEmailLog = findViewById<EditText>(R.id.edEmailLog)
        val edPassLog = findViewById<EditText>(R.id.edPassLog)
        val tvRemPass = findViewById<TextView>(R.id.tvRemPass)

        tvLogBtn.setOnClickListener{
            if (edEmailLog.text.isEmpty() || edPassLog.text.isEmpty())
                Toast.makeText(this@LogActivity, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            return@setOnClickListener //alarm
        }
        tvLogBtn.setOnClickListener{
            if (!edEmailLog.text.contains("@"))
                Toast.makeText(this@LogActivity, "Почта неправильно указана", Toast.LENGTH_LONG).show()
            return@setOnClickListener // alarm
        }
        tvRemPass.setOnClickListener{
            val intent = Intent(this@LogActivity, PasswordActivity::class.java)
            startActivity(intent)
            this@LogActivity.finish()
        }
        tvSignUp.setOnClickListener{
            val intent = Intent(this@LogActivity, RegActivity::class.java)
            startActivity(intent)
            this@LogActivity.finish()
        }
        tvLogBtn.setOnClickListener{
            val intent = Intent(this@LogActivity, BottomActivity::class.java)
            startActivity(intent)
            this@LogActivity.finish()
        }
    }
}