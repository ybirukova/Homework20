package com.example.homework20

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun onBind(titleItem: TitleItem) {
        val titleName = itemView.findViewById<TextView>(R.id.tv_title)

        titleName.text = titleItem.title
    }
}