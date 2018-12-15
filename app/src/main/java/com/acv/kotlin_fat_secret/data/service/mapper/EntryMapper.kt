package com.acv.kotlin_fat_secret.data.service.mapper

import com.acv.kotlin_fat_secret.data.service.food.entry.FoodEntryResponse
import com.acv.kotlin_fat_secret.domain.FoodEntry

class EntryMapper {

    fun transform(entries: List<FoodEntryResponse>): List<FoodEntry> {
        return entries.mapNotNull { transform(it) }
    }

    fun transform(entry: FoodEntryResponse) = entry.id?.let {
        FoodEntry(entry.id,
                entry.description,
                entry.date,
                entry.meal,
                entry.foodId,
                entry.servingId,
                entry.units,
                entry.name,
                entry.calories,
                entry.carbohydrate,
                entry.protein,
                entry.fat,
                entry.saturatedFat,
                entry.polyunsaturatedFat,
                entry.monounsaturatedFat,
                entry.transFat,
                entry.choresterol,
                entry.sodium,
                entry.potassium,
                entry.fiber,
                entry.sugar,
                entry.vitaminA,
                entry.vitaminC,
                entry.calcium,
                entry.irom)
    }
}