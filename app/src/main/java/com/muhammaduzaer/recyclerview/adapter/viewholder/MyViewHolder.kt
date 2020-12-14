package com.muhammaduzaer.recyclerview.adapter.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
    var textTitle = itemView.textViewTitle
    var textDescription = itemView.textViewDescription
    var container = itemView.layoutContainer
}