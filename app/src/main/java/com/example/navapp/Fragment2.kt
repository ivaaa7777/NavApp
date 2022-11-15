package com.example.navapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.Navigation


class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_2, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editTextfrag2: EditText = view.findViewById(R.id.Fragment2edittext)
        val sendtextbtn: Button = view.findViewById(R.id.sendtextbtn)
        sendtextbtn.setOnClickListener{
            val message = editTextfrag2.text.toString()
            if(message.isNotEmpty()){
                val action = Fragment2Directions.actionFragment2ToFragment3(message)
                Navigation.findNavController(view).navigate(action)
            }else{
                Toast.makeText(activity,"Please Enter Text",Toast.LENGTH_LONG).show()
            }
        }

    }
}