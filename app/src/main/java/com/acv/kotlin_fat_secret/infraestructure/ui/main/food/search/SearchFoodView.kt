package com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search

import com.acv.kotlin_fat_secret.domain.FoodSearch
import com.acv.kotlin_fat_secret.infraestructure.ui.common.PresentationView

interface SearchFoodView : PresentationView {
    fun showFoods(foods: List<FoodSearch>)
    fun showLoading()
    fun hideLoading()
}