package com.example.redxpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
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
        val cbReg = findViewById<CheckBox>(R.id.cbReg)
        val TVsignin = findViewById<TextView>(R.id.TVsignin)
        val ivHide = findViewById<ImageView>(R.id.ivHide)
        val ivHide2 = findViewById<ImageView>(R.id.ivHide2)

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
            if (!cbReg.isChecked) {
                Toast.makeText(this@RegActivity, "Not Accepted", Toast.LENGTH_LONG).show()
                return@setOnClickListener // alarm cancel
            }
            if (etPass != etPassAgain){
                Toast.makeText(this@RegActivity, "Пароли не одинаковы", Toast.LENGTH_LONG).show()
                return@setOnClickListener// alarm
                }
        }
        TVsignin.setOnClickListener {
            val intent = Intent(this@RegActivity, LogActivity::class.java)
            startActivity(intent)
            this@RegActivity.finish()
        }

    }
}