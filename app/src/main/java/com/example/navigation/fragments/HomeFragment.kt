package com.example.navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.fragment.findNavController
import com.example.navigation.R

class HomeFragment: Fragment(R.layout.fragment_home) {
    private lateinit var button: Button
    private lateinit var text: EditText
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button = view.findViewById(R.id.button)
        text = view.findViewById(R.id.editTextTextFirstName)

        button.setOnClickListener {
            val param = text.text.toString()
//            var action = HomeFragmentDirections.actionHomeFragmentToNavigation(param)
//            findNavController().navigate(action)
        }
    }
}