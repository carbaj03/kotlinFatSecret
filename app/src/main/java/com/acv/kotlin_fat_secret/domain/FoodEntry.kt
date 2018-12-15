package com.acv.kotlin_fat_secret.domain

import java.util.*

data class FoodEntry(val id: Int,
                     val description: String,
                     val date: Date,
                     val meal: String,
                     val foodId: Int,
                     val servingId: Int,
                     val units: Float,
                     val name: String,
                     val calories: Float,
                     val carbohydrate: Float,
                     val protein: Float,
                     val fat: Float,
                     val saturatedFat: Float?,
                     val polyunsaturatedFat: Float?,
                     val monounsaturatedFat: Float?,
                     val transFat: Float?,
                     val choresterol: Float?,
                     val sodium: Float?,
                     val potassium: Float?,
                     val fiber: Float?,
                     val sugar: Float?,
                     val vitaminA: Float?,
                     val vitaminC: Float?,
                     val calcium: Float?,
                     val irom: Float?)