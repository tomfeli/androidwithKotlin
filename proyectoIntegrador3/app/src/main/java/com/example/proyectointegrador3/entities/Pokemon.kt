package com.example.proyectointegrador3.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
class Pokemon(
    var name : String,
    var type : String,
    var attack : Int,
    var life   : Int,
    var picture  : String,
    var description : String
) : Parcelable {
    init {

    }
}