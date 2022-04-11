package com.example.proyectointegrador3.entities

class DataBase (){
    var users : MutableList<User> = mutableListOf()
    var pokemons : MutableList<Pokemon> = mutableListOf()
    init{
        users.add(User("Tom",
            "tom",
            "https://d500.epimg.net/cincodias/imagenes/2016/07/04/lifestyle/1467646262_522853_1467646344_noticia_normal.jpg"))
        users.add(User("Agustin",
            "tom",
            "https://d500.epimg.net/cincodias/imagenes/2016/07/04/lifestyle/1467646262_522853_1467646344_noticia_normal.jpg"))
        users.add(User("Dan",
            "tom",
            "https://d500.epimg.net/cincodias/imagenes/2016/07/04/lifestyle/1467646262_522853_1467646344_noticia_normal.jpg"))
        users.add(User("Tadeo",
            "tom",
            "https://d500.epimg.net/cincodias/imagenes/2016/07/04/lifestyle/1467646262_522853_1467646344_noticia_normal.jpg"))
        users.add(User("Federico",
            "tom",
            "https://d500.epimg.net/cincodias/imagenes/2016/07/04/lifestyle/1467646262_522853_1467646344_noticia_normal.jpg"))
        users.add(User("Jorge",
            "tom",
            "https://d500.epimg.net/cincodias/imagenes/2016/07/04/lifestyle/1467646262_522853_1467646344_noticia_normal.jpg"))
        pokemons.add(Pokemon("Charizard",
            "fire",
            20,
            600,
            "https://static.wikia.nocookie.net/espokemon/images/9/95/Charizard.png/revision/latest?cb=20180325003352",
            "great fire pokemon evolution of charmeleon"))
        pokemons.add(Pokemon("Pikachu",
            "electric",
            25,
            400,
            "https://i.pinimg.com/736x/dc/ab/b7/dcabb7fbb2f763d680d20a3d228cc6f9.jpg",
            "electric rat, the favorite pokemon of ash"))
        pokemons.add(Pokemon("Squirtle",
            "water",
            15,
            450,
            "https://pm1.narvii.com/6159/3ef6c4a73a478bb9c7de0bcd6bab6c085bbc2923_hq.jpg",
            "turtle with the ability to shot water out of his mouth"))
    }
    public fun searchUserByNameAndPass (name : String , pass : String)  : User{
        var i : Int =0
        var user : User = User("","","")
        var found : Boolean = false
        while(i<users.size && !found){
            if(users[i].name==name && users[i].password==pass){
                user=users[i]
                found = true
            }
            i++
        }
        return user
    }
}