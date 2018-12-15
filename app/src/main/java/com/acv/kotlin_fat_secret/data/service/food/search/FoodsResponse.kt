package com.acv.kotlin_fat_secret.data.service.food.search

import com.google.gson.annotations.SerializedName

class FoodsResponse(
        @SerializedName("food") val foods: List<FoodResponse>,
        @SerializedName("max_results") val maxResults: Int,
        @SerializedName("total_results") val totalResult: Int,
        @SerializedName("page_number") val pageNumber: Int
)
