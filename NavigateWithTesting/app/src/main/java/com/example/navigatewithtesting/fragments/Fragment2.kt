package com.example.navigatewithtesting.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.navigatewithtesting.R
import com.example.navigatewithtesting.viewModels.Fragment2ViewModel

class Fragment2 : Fragment() {



    private lateinit var viewModel: Fragment2ViewModel
    private lateinit var myView:View
    private lateinit var textView: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myView=inflater.inflate(R.layout.fragment2_fragment, container, false)
        textView=myView.findViewById(R.id.showName)
        return myView

    }

    override fun onStart() {
        super.onStart()
        var parameters = Fragment2Args.fromBundle(requireArguments()).userName
        textView.text=parameters


    }
  /*  override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Fragment2ViewModel::class.java)
        // TODO: Use the ViewModel
    }*/

}