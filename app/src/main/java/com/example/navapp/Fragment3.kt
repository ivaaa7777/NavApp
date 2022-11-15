package com.example.navapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.navArgs


class Fragment3 : Fragment() {

    val args: Fragment3Args by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_3, container, false)

        val textmessage = args.message
        val receivedmessageTextView: TextView = view.findViewById(R.id.receivedstringTextview)
        receivedmessageTextView.text = textmessage
        return view
    }
}