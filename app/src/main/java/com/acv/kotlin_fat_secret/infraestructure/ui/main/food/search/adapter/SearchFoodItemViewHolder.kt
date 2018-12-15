package com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.acv.kotlin_fat_secret.R
import com.acv.kotlin_fat_secret.domain.FoodSearch
import org.jetbrains.anko.find

class SearchFoodItemViewHolder(itemView: View, val itemClick: ((FoodSearch) -> Unit)?) : RecyclerView.ViewHolder(itemView) {
    val name: TextView = itemView.find(R.id.tvName)
    val description: TextView = itemView.find(R.id.tvDescription)

    fun bind(food: FoodSearch) {
        name.text = food.name
        description.text = food.description
        itemView.setOnClickListener { itemClick?.invoke(food) }
    }
}