package com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.acv.kotlin_fat_secret.domain.FoodSearch
import com.acv.kotlin_fat_secret.domain.WeightMonth
import com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.adapter.WeightItemViewHolder
import com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.adapter.WeightItemUI
import org.jetbrains.anko.AnkoContext
import kotlin.properties.Delegates

class WeightAdapter : RecyclerView.Adapter<WeightItemViewHolder>() {

    var itemClick: ((WeightMonth) -> Unit)? = null

    var items: List<WeightMonth> by Delegates.observable(emptyList()) {
        prop, old, new -> notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeightItemViewHolder =
            WeightItemViewHolder(WeightItemUI().createView(
                    AnkoContext.create(parent.context, parent)), itemClick)

    override fun onBindViewHolder(holder: WeightItemViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size
}

