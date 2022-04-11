package com.example.proyectointegrador3.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.proyectointegrador3.R
import com.example.proyectointegrador3.entities.Pokemon

class PokemonAdapter (
    var pokemons : MutableList<Pokemon>,
    var onClick : (Int) -> Unit
        ) : RecyclerView.Adapter<PokemonAdapter.PokemonHolder>(){



            class PokemonHolder(v: View) : RecyclerView.ViewHolder(v){
                private var view : View = v


                fun setName(name : String){
                    var txtName : TextView= view.findViewById(R.id.txtPokemonName)
                    txtName.text= name
                }
                fun setImage(img : String){
                    var imgPokemon : ImageView = view.findViewById(R.id.imgPokemon)
                    Glide.with(view).load(img).into(imgPokemon)
                }
                fun getCard () : CardView{
                    return view.findViewById(R.id.item_pokemon)
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pokemon,parent,false)
        return PokemonHolder(view)
    }

    override fun onBindViewHolder(holder: PokemonHolder, position: Int) {
        holder.setName(pokemons[position].name)
        holder.setImage(pokemons[position].picture)
        holder.getCard().setOnClickListener {
            onClick(position)
        }
    }

    override fun getItemCount(): Int {
        return pokemons.size
    }
}