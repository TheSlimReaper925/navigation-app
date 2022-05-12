package com.example.navigation.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.navigation.R

class ProfileFragment: Fragment(R.layout.fragment_profile) {
    private lateinit var textField: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textField = view.findViewById(R.id.profile)
        val firstName = ProfileFragmentArgs.fromBundle(requireArguments()).firstName
        val lastName = ProfileFragmentArgs.fromBundle(requireArguments()).surname
        textField.text = "Hello, $firstName $lastName"
    }
}