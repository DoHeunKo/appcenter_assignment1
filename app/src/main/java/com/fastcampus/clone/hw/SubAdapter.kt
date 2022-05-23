package com.fastcampus.clone.hw

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SubAdapter(private val data:ArrayList<Company>): RecyclerView.Adapter<SubAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val name: TextView = view.findViewById(R.id.name)
        val date: TextView = view.findViewById(R.id.date)
        val where: TextView = view.findViewById(R.id.where)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_sub, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = data[position].name
        holder.date.text = data[position].date
        holder.where.text = data[position].where
        setColor(holder)
        setClick(holder)
        setLongClick(holder,position)
    }

    override fun getItemCount() = data.size


    private fun setColor(holder:ViewHolder){
        when (holder.where.text) {
            "Korea" -> {
                holder.where.setTextColor(holder.where.context.resources.getColor(R.color.blue))
            }
            "USA" -> {
                holder.where.setTextColor(holder.where.context.resources.getColor(R.color.pink))
            }
            else -> {
                holder.where.setTextColor(holder.where.context.resources.getColor(R.color.green))
            }
        }
    }

    private fun setClick(holder:ViewHolder){
        holder.itemView.setOnClickListener {
            Intent(it.context,DetailActivity::class.java).run {
                putExtra("where",holder.where.text)
                putExtra("name",holder.name.text)
                it.context.startActivity(this)
            }
        }
    }

    private fun setLongClick(holder:ViewHolder,position:Int){
        holder.itemView.setOnLongClickListener {
            data.removeAt(position)     // 1
            notifyItemRemoved(position)     // 2
            notifyItemRangeChanged(position,data.size)      //3
            true
        }
    }
}