package com.acv.kotlin_fat_secret.data.service.food.search

import com.google.gson.annotations.SerializedName

class FoodsSearchResponse(
        @SerializedName("foods") val foods: FoodsResponse
)