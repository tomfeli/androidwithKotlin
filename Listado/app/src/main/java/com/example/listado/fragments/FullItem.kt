package com.example.listado.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.listado.viewmodels.FullItemViewModel
import com.example.listado.R

class FullItem : Fragment() {


    private lateinit var viewModel: FullItemViewModel
    private lateinit var v : View
    private lateinit var name : TextView
    private lateinit var description : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v =  inflater.inflate(R.layout.full_item_fragment, container, false)
        name = v.findViewById(R.id.textViewName)
        description = v.findViewById(R.id.textViewDesc)
        return v
    }

    override fun onStart() {
        super.onStart()
        name.text = FullItemArgs.fromBundle(requireArguments()).itemName
        description.text = FullItemArgs.fromBundle(requireArguments()).itemDescription
    }



}