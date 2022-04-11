package com.example.listado.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listado.R
import com.example.listado.adapters.ItemAdapter
import com.example.listado.entities.ItemRepositorie
import com.example.listado.viewmodels.ItemViewModel
import com.google.android.material.snackbar.Snackbar

class ItemFragment : Fragment() {

    companion object {
        fun newInstance() = ItemFragment()
    }

    private lateinit var viewModel: ItemViewModel
    private lateinit var v : View
    lateinit var recyclerView: RecyclerView
    lateinit var adapter : ItemAdapter
    var repositorie: ItemRepositorie = ItemRepositorie()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View? {
        v = inflater.inflate(R.layout.item_fragment, container, false)
        recyclerView = v.findViewById(R.id.recItem)
        return v
    }

    override fun onStart() {
        super.onStart()
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)

        adapter = ItemAdapter(repositorie.itemList) { item ->
            val action = ItemFragmentDirections.actionItemFragmentToFullItem(item.name,item.description)
            v.findNavController().navigate(action)
        }
        recyclerView.adapter = adapter
    }



}