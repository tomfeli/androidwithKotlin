package com.example.proyectointegrador3.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
class User(
    var name : String,
    var password : String,
    var picture  : String
) : Parcelable {
    init {

    }
}