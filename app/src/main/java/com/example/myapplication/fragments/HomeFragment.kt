package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class HomeFragment: Fragment(R.layout.home_fragment) {

    private lateinit var txt10 : EditText
    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txt10=view.findViewById(R.id.txt1)
        button=view.findViewById(R.id.button)
        button.setOnClickListener {
            val name =txt10.text.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToNotificationFragment(name)
            findNavController().navigate(action)

        }
    }
}