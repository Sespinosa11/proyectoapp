package com.example.firebase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class RecyclearProducto(private val context:Context,val producto:List<productosCarnes>): RecyclerView.Adapter<RecyclearProducto.MiHolder>(){


    //se clasifica la imagen el m¿nombre y el precio
    class MiHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagen:ImageView
        var nombre:TextView
        var precio:TextView

        init {
            imagen = itemView.findViewById(R.id.imagenItem)
            nombre = itemView.findViewById(R.id.nombre)
            precio = itemView.findViewById(R.id.precio)
        }

    }
    // se crea la vista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiHolder {
        val itemView =LayoutInflater.from(context).inflate(R.layout.carnes_res_row_item,parent,false)
        return MiHolder(itemView)

    }
    // pasar los datos a la vista
    override fun onBindViewHolder(holder: MiHolder, position: Int) {
        val produ= producto[position]
        holder.nombre.setText(produ.nombre)
        holder.precio.setText(produ.precio)
        Glide.with(context).load(produ.imagen).apply(RequestOptions.circleCropTransform()).into(holder.imagen)

    }
    //se define la longitud de la lista
    override fun getItemCount(): Int {
        return producto.size
    }
}
