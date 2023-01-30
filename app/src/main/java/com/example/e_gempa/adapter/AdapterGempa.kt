package com.example.e_gempa.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.e_gempa.R
import com.example.e_gempa.listGempa.FeaturesItem



class AdapterGempa ():
    RecyclerView.Adapter<AdapterGempa.dataGempaViewHolder>() {

    private lateinit var dataGempaListener: clickListener

    var listgempa: List<FeaturesItem> = ArrayList()

    fun setListGempa(ListGempa: List<FeaturesItem>){
        this.listgempa = ListGempa
        notifyDataSetChanged()
    }


    interface clickListener {
        fun onItemClick(position: Int)
    }

    fun setOnClickListener(listener: clickListener) {
        dataGempaListener = listener
    }

    inner class dataGempaViewHolder(itemView: View, listener: clickListener): RecyclerView.ViewHolder(itemView) {
        val place: TextView =itemView.findViewById(R.id.place)
        val time: TextView = itemView.findViewById(R.id.time)
        val mag: TextView = itemView.findViewById(R.id.mag)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dataGempaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return dataGempaViewHolder(view, dataGempaListener)
    }

    override fun onBindViewHolder(holder: dataGempaViewHolder, position: Int) {
        val item : FeaturesItem = listgempa.get(position)
        holder.place.text = item.properties?.place
        holder.time.text = item.properties?.time.toString()
        holder.mag.text = item.properties?.mag.toString()
    }

    override fun getItemCount(): Int {
        return listgempa.size
    }

    }