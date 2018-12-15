package com.acv.kotlin_fat_secret.data.service.food.search

import com.google.gson.annotations.SerializedName

class FoodResponse(
        @SerializedName("food_id") val id: String,
        @SerializedName("food_name") val name: String,
        @SerializedName("food_type") val type: String,
        @SerializedName("brand_name") val brand: String?,
        @SerializedName("food_url") val url: String,
        @SerializedName("food_description") val description: String
)
