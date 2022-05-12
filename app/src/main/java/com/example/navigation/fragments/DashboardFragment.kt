package com.example.navigation.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.R

class DashboardFragment: Fragment(R.layout.fragment_dashboard) {
    private lateinit var textField: TextView
    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textField = view.findViewById(R.id.editTextTextSurname)
        button = view.findViewById(R.id.button2)
        val name = DashboardFragmentArgs.fromBundle(requireArguments()).firstName
        button.setOnClickListener {
            val surname = textField.text.toString()
            var action = DashboardFragmentDirections.actionDashboardFragmentToProfileFragment(surname, name)
            findNavController().navigate(action)
        }
    }
}