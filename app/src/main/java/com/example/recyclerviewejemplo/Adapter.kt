package com.example.recyclerviewejemplo


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adaptador(private val listaDatos: List<ItemDatos>) : RecyclerView.Adapter<Adaptador.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tituloTextView: TextView = itemView.findViewById(R.id.textViewTitulo)
        val descripcionTextView: TextView = itemView.findViewById(R.id.textViewDescripcion)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vistaItem = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(vistaItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemActual = listaDatos[position]
        holder.tituloTextView.text = itemActual.titulo
        holder.descripcionTextView.text = itemActual.descripcion
    }

    override fun getItemCount() = listaDatos.size
}