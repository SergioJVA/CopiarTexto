package com.example.copiartexto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.copiartexto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.showbutton.setOnClickListener(){
            val mensaje = binding.message.text
            Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
            binding.mensajeTexto.setText("Bienvenido "  + mensaje)


        }

        binding.cleanbutton.setOnClickListener(){
            binding.message.text.clear()
        }





    }



}