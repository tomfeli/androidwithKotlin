package com.example.proyectointegrador3.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.proyectointegrador3.viewmodels.FragmentlistViewModel
import com.example.proyectointegrador3.R
import com.example.proyectointegrador3.adapters.PokemonAdapter
import com.example.proyectointegrador3.entities.DataBase
import com.example.proyectointegrador3.entities.Pokemon
import com.example.proyectointegrador3.entities.User

class Fragmentlist : Fragment() {



    private lateinit var viewModel: FragmentlistViewModel
    private lateinit var  v : View
    private lateinit var imgUser : ImageView
    private lateinit var userName : TextView
    private lateinit var recyclerPokemon : RecyclerView
    private lateinit var adapter : PokemonAdapter
    private  var dataBase : MutableList<Pokemon> = DataBase().pokemons

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragmentlist_fragment, container, false)
        imgUser = v.findViewById(R.id.profilePic)
        userName = v.findViewById(R.id.txtName)
        recyclerPokemon = v.findViewById(R.id.recPokemon)
        recyclerPokemon.setHasFixedSize(true)
        recyclerPokemon.layoutManager = LinearLayoutManager(context)

        return v
    }

    override fun onStart() {
        super.onStart()
        var args : User = FragmentlistArgs.fromBundle(requireArguments()).user
        userName.text = args.name
        Glide.with(v).load(args.picture).into(imgUser)

        adapter = PokemonAdapter(dataBase){ position ->
            var action = FragmentlistDirections.actionFragmentlistToFragmentdetaileditem(dataBase[position])
            v.findNavController().navigate(action)
        }
        recyclerPokemon.adapter = adapter

    }


}