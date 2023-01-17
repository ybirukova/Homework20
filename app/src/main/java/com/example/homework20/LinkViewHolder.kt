package com.example.homework20

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LinkViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {

    fun onBind(linkItem: LinkItem, itemClick: (String) -> Unit) {
        val linkName = itemView.findViewById<TextView>(R.id.tv_link)

        linkName.text = linkItem.name

        itemView.setOnClickListener {
            val link = linkItem.link
            itemClick.invoke(link)
        }
    }
}