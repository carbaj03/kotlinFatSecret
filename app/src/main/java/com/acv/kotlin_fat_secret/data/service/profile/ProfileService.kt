package com.acv.kotlin_fat_secret.data.service.profile

import com.google.gson.annotations.SerializedName

class ProfileService(
        @SerializedName("weight_measure") val weightMeasure : String,
        @SerializedName("height_measure") val heigthMeasure : String,
        @SerializedName("last_weight_kg") val lastWeightKg : Float,
        @SerializedName("last_weight_date_int") val lastWeightDate : Int,
        @SerializedName("last_weight_comment") val lastWeightComment: String,
        @SerializedName("goal_weight_kg") val goalWeightKg : Float,
        @SerializedName("height_cm") val heightCm : Float
)
