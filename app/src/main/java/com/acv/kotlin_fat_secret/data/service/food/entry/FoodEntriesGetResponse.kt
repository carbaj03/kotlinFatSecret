package com.acv.kotlin_fat_secret.data.service.food.entry

import com.google.gson.annotations.SerializedName

class FoodEntriesGetResponse(
        @SerializedName("food_entries") val entries: FoodEntriesResponse
)