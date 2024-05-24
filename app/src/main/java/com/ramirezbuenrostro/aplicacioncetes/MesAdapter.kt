package com.ramirezbuenrostro.aplicacioncetes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MesAdapter(val meses:List<CalculoMes>): RecyclerView.Adapter<MesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MesViewHolder {
        val vista=LayoutInflater.from(parent.context).inflate(
            R.layout.iterm_mes,
            parent,
            false
        )
        return MesViewHolder(vista)
    }

    override fun getItemCount(): Int= meses.size

    override fun onBindViewHolder(holder: MesViewHolder, position: Int) {
        holder.tvMes.text= meses[position].mes.toString()
        holder.tvMonto.text= "$${String.format("%.2f",meses[position].monto)}"
        holder.tvGanancia.text= "$${String.format("%.2f",meses[position].ganancia)}"
        holder.tvInteres.text= "${String.format("%.2f",meses[position].interes)}%"
    }
}