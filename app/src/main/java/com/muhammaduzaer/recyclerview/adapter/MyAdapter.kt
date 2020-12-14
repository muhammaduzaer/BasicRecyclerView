package com.muhammaduzaer.recyclerview.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammaduzaer.recyclerview.R
import com.muhammaduzaer.recyclerview.adapter.viewholder.MyViewHolder
import com.muhammaduzaer.recyclerview.models.Song

class MyAdapter(
    private val songs: List<Song>
) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textTitle.text = songs[position].title
        holder.textDescription.text = songs[position].description
        var color = "#CCCCCC"
        if (position % 2==0) {
            color = "#EEEEEE"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
        return songs.size
    }

}