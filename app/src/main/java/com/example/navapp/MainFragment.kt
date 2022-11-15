package com.example.navapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragment1button: Button = view.findViewById(R.id.fragment1button)
        val fragment2button: Button = view.findViewById(R.id.fragment2button)
        fragment1button.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragment1)
        }
        fragment2button.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragment2)
        }

    }
}