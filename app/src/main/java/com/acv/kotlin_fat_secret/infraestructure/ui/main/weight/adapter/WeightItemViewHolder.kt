package com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.acv.kotlin_fat_secret.R
import com.acv.kotlin_fat_secret.domain.FoodSearch
import com.acv.kotlin_fat_secret.domain.WeightMonth
import org.jetbrains.anko.find

class WeightItemViewHolder(itemView: View,
                           val itemClick: ((WeightMonth) -> Unit)?)
    : RecyclerView.ViewHolder(itemView) {

    val name: TextView = itemView.find(R.id.tvName)
    val description: TextView = itemView.find(R.id.tvDescription)

    fun bind(weight: WeightMonth) {
        name.text = weight.weight.toString()
        description.text = weight.comment
        itemView.setOnClickListener { itemClick?.invoke(weight) }
    }
}