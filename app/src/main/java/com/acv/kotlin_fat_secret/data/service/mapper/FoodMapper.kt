package com.acv.kotlin_fat_secret.data.service.mapper

import com.acv.kotlin_fat_secret.data.service.food.search.FoodResponse
import com.acv.kotlin_fat_secret.domain.FoodSearch

class FoodMapper() {

    fun transform(foods: List<FoodResponse>): List<FoodSearch> {
        return foods.mapNotNull { transform(it) }
    }

    fun transform(food: FoodResponse) = food.id.let {
        FoodSearch(food.id, food.name, food.type, food?.brand, food.url, food.description)
    }
}