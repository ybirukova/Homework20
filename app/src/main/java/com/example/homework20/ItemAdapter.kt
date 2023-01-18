package com.example.homework20

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val itemCLick: (String) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val list: MutableList<Any> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_TITLE -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.rv_title_item, parent, false)
                TitleViewHolder(view)
            }
            TYPE_LINK -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.rv_link_item, parent, false)
                LinkViewHolder(view)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val element = list[position]
        when (holder) {
            is TitleViewHolder -> holder.onBind(element as TitleItem)
            is LinkViewHolder -> holder.onBind(element as LinkItem, itemCLick)
        }
    }

    override fun getItemCount(): Int = list.size

    fun setItems(list: List<Any>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int = when (list[position]) {
        is TitleItem -> TYPE_TITLE
        is LinkItem -> TYPE_LINK
        else -> throw Exception()
    }

    companion object {
        private const val TYPE_TITLE = 1
        private const val TYPE_LINK = 0
    }
}