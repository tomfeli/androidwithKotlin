package com.example.proyectointegrador3.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import com.example.proyectointegrador3.viewmodels.FragmentloginViewModel
import com.example.proyectointegrador3.R
import com.example.proyectointegrador3.entities.DataBase
import com.google.android.material.snackbar.Snackbar

class Fragmentlogin : Fragment() {



    private lateinit var viewModel: FragmentloginViewModel
    private lateinit var v : View
    private lateinit var name : EditText
    private lateinit var password : EditText
    private lateinit var button: Button
    private var dataBase : DataBase = DataBase()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragmentlogin_fragment, container, false)
        name = v.findViewById(R.id.name)
        password = v.findViewById(R.id.password)
        button = v.findViewById(R.id.login)

        return v

    }

    override fun onStart() {
        super.onStart()
        button.setOnClickListener {
            var miUser = dataBase.searchUserByNameAndPass(name.text.toString(),password.text.toString())
            if(miUser.name!=""){
                val action = FragmentloginDirections.actionFragmentloginToFragmentlist(miUser)
                v.findNavController().navigate(action)
            }else{
                Snackbar.make(v,"Nombre de usuario o contraseña incorreectas",Snackbar.LENGTH_SHORT).show()
            }
        }
    }

}