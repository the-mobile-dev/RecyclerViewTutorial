package com.themobiledev.recyclerviewtutorial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.themobiledev.recyclerviewtutorial.models.TransportOption

class TransportOptionAdapter(val transportList: List<TransportOption>) : RecyclerView.Adapter<TransportOptionAdapter.TransportViewHolder>() {

    class TransportViewHolder(item: View): RecyclerView.ViewHolder(item) {
        val image = item.findViewById<ImageView>(R.id.transport_image)
        val title = item.findViewById<TextView>(R.id.transport_title)
        val description = item.findViewById<TextView>(R.id.transport_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransportViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.transport_option_item, parent, false)
        return TransportViewHolder(view)
    }

    override fun getItemCount() = transportList.size

    override fun onBindViewHolder(holder: TransportViewHolder, position: Int) {
        // Get the data for the item
        val transportItem = transportList[position]

        holder.image.setImageResource(transportItem.imgResId)
        holder.title.setText(transportItem.titleResId)
        holder.description.setText(transportItem.descriptionResId)
    }
}