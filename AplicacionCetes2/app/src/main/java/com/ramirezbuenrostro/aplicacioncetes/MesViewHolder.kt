package com.ramirezbuenrostro.aplicacioncetes

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    var tvMes=itemView.findViewById<TextView>(R.id.tvMes)
    val tvMonto= itemView.findViewById<TextView>(R.id.tvMonto)
    val tvGanancia=itemView.findViewById<TextView>(R.id.tvGananciaMonto)
    val tvInteres=itemView.findViewById<TextView>(R.id.tvInteresMonto)
}