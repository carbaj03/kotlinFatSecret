package com.acv.kotlin_fat_secret.data.service.mapper

import com.acv.kotlin_fat_secret.data.service.weight.DayResponse
import com.acv.kotlin_fat_secret.domain.WeightMonth

class WeightMapper {

    fun transform(entries: List<DayResponse>): List<WeightMonth> {
        return entries.mapNotNull { transform(it) }
    }

    fun transform(day: DayResponse) = day.let {
        WeightMonth(day.date, day.kg, day.comment)
    }
}