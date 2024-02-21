package com.example.redxpress.BottomMenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.redxpress.R


class FragmentProfile : Fragment() {
    private val money: TextView? = view?.findViewById(R.id.tvPayment)
private val hide = view?.findViewById<ImageView>(R.id.ivHideBalance)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {hide?.setOnClickListener{
        money?.setText("******")
    }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)


    }


}