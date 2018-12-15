package com.acv.kotlin_fat_secret.data.service.weight

import com.acv.kotlin_fat_secret.data.service.profile.ProfileService
import com.google.gson.annotations.SerializedName

class DayResponse(
        @SerializedName("date_int") val date: Int?,
        @SerializedName("weight_comment") val comment: String?,
        @SerializedName("weight_kg") val kg: Float?
)