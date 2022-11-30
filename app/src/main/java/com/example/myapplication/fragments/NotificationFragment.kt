package com.example.myapplication.fragments
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R


class NotificationFragment:Fragment(R.layout.notification_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.faq1).text=NotificationFragmentArgs.fromBundle(requireArguments()).name
    }
}