package com.acv.kotlin_fat_secret.data.service.food.entry

import com.google.gson.annotations.SerializedName

class FoodEntriesResponse(
        @SerializedName("food_entry") val entries: List<FoodEntryResponse>
)
