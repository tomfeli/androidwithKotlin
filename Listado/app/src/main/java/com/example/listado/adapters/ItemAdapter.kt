package com.example.listado.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.listado.R
import com.example.listado.entities.Item

class ItemAdapter(
    var listItem : MutableList<Item>,
    var onClick1 : (Item) -> Unit
) : RecyclerView.Adapter<ItemAdapter.ItemHolder>()
{
    class ItemHolder (v:View):RecyclerView.ViewHolder(v){
        private var view : View
        init{
            this.view =v
        }

        fun setName(name : String){
            var txtName : TextView =  view.findViewById(R.id.txtItemName)
            txtName.text = name
        }
        fun getCard () : CardView {
            return view.findViewById(R.id.card)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_detail,parent,false)
        return ItemHolder(view)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.setName(listItem[position].name)
        holder.getCard().setOnClickListener {
            onClick1(this.listItem[position])
        }
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

}