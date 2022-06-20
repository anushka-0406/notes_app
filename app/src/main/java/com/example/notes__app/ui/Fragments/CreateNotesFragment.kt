package com.example.notes__app.ui.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notes__app.R
import com.example.notes__app.databinding.FragmentCreateNotesBinding
import com.example.notes__app.databinding.FragmentHomeBinding


class CreateNotesFragment : Fragment() {

    lateinit var binding: FragmentCreateNotesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding=FragmentCreateNotesBinding.inflate(layoutInflater,container,false)

        return binding.root
    }


}