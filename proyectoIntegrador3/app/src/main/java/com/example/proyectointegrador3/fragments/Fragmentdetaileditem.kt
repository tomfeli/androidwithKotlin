package com.example.proyectointegrador3.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide
import com.example.proyectointegrador3.viewmodels.FragmentdetaileditemViewModel
import com.example.proyectointegrador3.R
import com.example.proyectointegrador3.R.layout.fragmentdetaileditem_fragment

class Fragmentdetaileditem : Fragment() {


    private lateinit var viewModel: FragmentdetaileditemViewModel
    private lateinit var v : View
    private lateinit var name : TextView
    private lateinit var detail : TextView
    private lateinit var img : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v =   inflater.inflate(fragmentdetaileditem_fragment, container, false)
        name = v.findViewById(R.id.pokemonName)
        detail = v.findViewById(R.id.pokemonDetail)
        img = v.findViewById(R.id.imgViewPokemo)
        return v
    }

    override fun onStart() {
        super.onStart()
        val params = FragmentdetaileditemArgs.fromBundle(requireArguments()).pokemon
        name.text = params.name
        detail.text = params.description
        Glide.with(v).load(params.picture).into(img)
    }


}