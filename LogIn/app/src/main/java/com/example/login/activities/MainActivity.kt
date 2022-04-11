package com.example.login.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.login.R
import com.example.login.entities.Mascota
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    lateinit var textViewPet : TextView
    lateinit var btnShow :Button
    lateinit var inName : EditText
    lateinit var miLayout : ConstraintLayout
    var miMascota = Mascota("Pepa",2,"GATO")
    var mascotas : MutableList<Mascota> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewPet=findViewById(R.id.textViewPet)
        btnShow = findViewById(R.id.btnShow)
        inName = findViewById(R.id.inNombre)
        miLayout = findViewById(R.id.layout)

        btnShow.setOnClickListener {
            if(inName.length()>0){
                textViewPet.text=inName.text
            }
            else{
                Snackbar.make(miLayout,"El texto no puede ser vacio", Snackbar.LENGTH_SHORT).show()
            }


        }
        mascotas.add(Mascota("Pepa1",2,"GATO"))
        mascotas.add(Mascota("Pepa2",3,"GATO"))
        mascotas.add(Mascota("Pepa3",4,"GATO"))
        mascotas.add(Mascota("Pepa4",5,"GATO"))
        mascotas.add(Mascota("Pepa5",6,"GATO"))
        mascotas.add(Mascota("Pepa6",7,"GATO"))
        mascotas.add(Mascota("Pepa7",8,"GATO"))
        mascotas.add(Mascota("Pepa8",9,"GATO"))
        mascotas.forEach {
            Log.d("TEST",it.name)
            Log.d("TEST",it.calcularEdadHumana().toString())
            Log.d("TEST",it.type)
        }


    }
}