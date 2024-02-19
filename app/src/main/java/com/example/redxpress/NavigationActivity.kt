package com.example.redxpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.redxpress.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavigationActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
     private val bNav = findViewById<BottomNavigationView>(R.id.bNav)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bNav.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.home -> {
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                }
                R.id.wallet -> {
                    Toast.makeText(this, "Wallet", Toast.LENGTH_SHORT).show()
                }
                R.id.track -> {
                    Toast.makeText(this, "Track", Toast.LENGTH_SHORT).show()
                }
            }

                true

        }



    }
}