package com.example.redxpress


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.redxpress.BottomMenu.FragmentHome
import com.example.redxpress.BottomMenu.FragmentProfile
import com.example.redxpress.BottomMenu.FragmentTrack
import com.example.redxpress.BottomMenu.FragmentWallet
import com.google.android.material.bottomnavigation.BottomNavigationView



class BottomActivity : AppCompatActivity() {
 //  val hide: ImageView = findViewById(R.id.ivHideBalance)
  // val money: TextView = findViewById(R.id.tvPayment)
private lateinit var bottomNavigationView: BottomNavigationView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_bottom)

    bottomNavigationView = findViewById(R.id.bottomView)
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.home -> {
                    replaceFragment(FragmentHome())
                    true
                }
                R.id.wallet -> {
                    replaceFragment(FragmentWallet())
                    true
                }
                R.id.track -> {
                    replaceFragment(FragmentTrack())
                    true
                }
                R.id.profile -> {
                    replaceFragment(FragmentProfile())
                    true
                }
                else -> false
            }

        }
        replaceFragment(FragmentHome())

   // hide.setOnClickListener {
     //   money.setText("**********").toString()
  //  }

    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()

    }
}