package com.example.cc17_3f_awaled_act6.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cc17_3f_awaled_act6.R
import com.example.cc17_3f_awaled_act6.model.AboutMeItem

class Adapter(private val data: List<AboutMeItem>) :
    RecyclerView.Adapter<Adapter.AboutMeItemViewHolder>() {

    class AboutMeItemViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val aboutMeImageView: ImageView = row.findViewById(R.id.picture)
        val aboutMedayTextView: TextView = row.findViewById(R.id.day)
        val aboutMedescTextView: TextView = row.findViewById(R.id.description)
        val aboutMetitleTextView: TextView = row.findViewById(R.id.title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AboutMeItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.view, parent, false)
        return AboutMeItemViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: AboutMeItemViewHolder, position: Int) {
        val item = data[position]
        holder.aboutMeImageView.setImageResource(item.picture)
        holder.aboutMedayTextView.text = item.day
        holder.aboutMedescTextView.text = item.description
        holder.aboutMetitleTextView.text = item.title
    }
}
