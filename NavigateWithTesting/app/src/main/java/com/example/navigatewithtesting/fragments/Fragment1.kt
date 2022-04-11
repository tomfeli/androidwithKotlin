package com.example.navigatewithtesting.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import com.example.navigatewithtesting.R
import com.example.navigatewithtesting.viewModels.Fragment1ViewModel
import com.google.android.material.snackbar.Snackbar

class Fragment1 : Fragment() {



    private lateinit var viewModel : Fragment1ViewModel
    private lateinit var myView : View
    private lateinit var logIn : Button
    private lateinit var inputName : EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myView=inflater.inflate(R.layout.fragment1_fragment, container, false)
        logIn = myView.findViewById(R.id.login)
        inputName = myView.findViewById(R.id.inputName)
        return myView
    }

    override fun onStart() {
        super.onStart()


        logIn.setOnClickListener {
            if(inputName.length()>0){
                val action = Fragment1Directions.actionFragment1ToFragment2(inputName.text.toString())
                myView.findNavController().navigate(action)
            }
            else{
                Snackbar.make(myView,"El texto no puede ser vacio", Snackbar.LENGTH_SHORT).show()
            }

        }
    }
    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Fragment1ViewModel::class.java)
        // TODO: Use the ViewModel
    }*/

}