package com.example.login.entities

data class Mascota(
    var name : String,
    var age : Int,
    var type : String
){
    fun calcularEdadHumana () : Int{
        return this.age * 7
    }
}

/*
data class Mascota2(name : String, age : Int, type : String) {

    var name: String
    var age: Int
    var type: String

    init{
        this.name = name
        this.age = age
        this.type = type
    }
}


class Constants {
    companion object{
        val typeCat = "CAT"
        val typeDog = "DOG"

    }
}

fun calcularEdadHumana () : Int{
    return this.age * 7
}
*/