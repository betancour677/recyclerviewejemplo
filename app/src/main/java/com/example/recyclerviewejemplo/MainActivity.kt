package com.example.recyclerviewejemplo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewejemplo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val listaDatos = listOf(
            ItemDatos("Item 1", "Descripción 1"),
            ItemDatos("Item 2", "Descripción 2"),
            ItemDatos("Item 3", "Descripción 3")
            // Agrega más elementos aquí si lo deseas
        )

        val adaptador = Adaptador(listaDatos)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adaptador
    }
}

data class ItemDatos(val titulo: String, val descripcion: String)
