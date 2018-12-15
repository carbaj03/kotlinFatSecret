package com.acv.kotlin_fat_secret.data.service.food.entry

import com.google.gson.annotations.SerializedName
import java.util.*

class FoodEntryResponse(@SerializedName("food_entry_id") val id: Int,
                        @SerializedName("food_entry_description") val description: String,
                        @SerializedName("date_int") val date: Date,
                        @SerializedName("meal") val meal: String,
                        @SerializedName("food_id") val foodId: Int,
                        @SerializedName("serving_id") val servingId: Int,
                        @SerializedName("number_of_units") val units: Float,
                        @SerializedName("food_entry_name") val name: String,
                        @SerializedName("calories") val calories: Float,
                        @SerializedName("carbohydrate") val carbohydrate: Float,
                        @SerializedName("protein") val protein: Float,
                        @SerializedName("fat") val fat: Float,
                        @SerializedName("saturated_fat") val saturatedFat: Float?,
                        @SerializedName("polyunsaturated_fat") val polyunsaturatedFat: Float?,
                        @SerializedName("monunsaturated_fat") val monounsaturatedFat: Float?,
                        @SerializedName("trans_fat") val transFat: Float?,
                        @SerializedName("choresterol") val choresterol: Float?,
                        @SerializedName("sodium") val sodium: Float?,
                        @SerializedName("potassium") val potassium: Float?,
                        @SerializedName("fiber") val fiber: Float?,
                        @SerializedName("sugar") val sugar: Float?,
                        @SerializedName("vitaminA") val vitaminA: Float?,
                        @SerializedName("vitaminC") val vitaminC: Float?,
                        @SerializedName("calcium") val calcium: Float?,
                        @SerializedName("irom") val irom: Float?)
