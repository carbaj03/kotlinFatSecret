package com.acv.kotlin_fat_secret.data.service.weight

import com.google.gson.annotations.SerializedName

class MonthResponse(
        @SerializedName("from_date_int") val from: Int?,
        @SerializedName("to_date_int") val to: Int?,
        @SerializedName("month") val month: List<DayResponse>
)