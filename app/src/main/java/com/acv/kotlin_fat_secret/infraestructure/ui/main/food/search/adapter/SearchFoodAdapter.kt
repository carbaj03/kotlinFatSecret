package com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.acv.kotlin_fat_secret.domain.FoodSearch
import com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.adapter.WeightItemViewHolder
import org.jetbrains.anko.AnkoContext
import kotlin.properties.Delegates

class SearchFoodAdapter: RecyclerView.Adapter<SearchFoodItemViewHolder>() {

    var itemClick: ((FoodSearch) -> Unit)? = null

    var items: List<FoodSearch> by Delegates.observable(emptyList()) { prop, old, new -> notifyDataSetChanged() }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchFoodItemViewHolder =
            SearchFoodItemViewHolder(SearchFoodItemUI().createView(
                    AnkoContext.create(parent.context, parent)), itemClick)

    override fun onBindViewHolder(holder: SearchFoodItemViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    fun findPositionById(id: String): Int = items.withIndex().first({ it.value.id == id }).index
}

