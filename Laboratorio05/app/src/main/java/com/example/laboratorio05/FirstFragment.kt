package com.example.laboratorio05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FirstFragment : Fragment() {

    private lateinit var btnActionSend: FloatingActionButton
    private lateinit var star_wars_card_action: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnActionSend = view.findViewById(R.id.btnActionSend)
        star_wars_card_action = view.findViewById(R.id.star_wars_card_action)

        btnActionSend.setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

        star_wars_card_action.setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_threeFragment)
        }
    }

}