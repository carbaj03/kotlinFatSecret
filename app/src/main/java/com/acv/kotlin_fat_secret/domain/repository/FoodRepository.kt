package com.acv.kotlin_fat_secret.domain.repository

import com.acv.kotlin_fat_secret.domain.FoodEntry
import com.acv.kotlin_fat_secret.domain.FoodSearch

interface FoodRepository {
    fun searchBy(description: String): List<FoodSearch>
    fun entryBy(date: Int): List<FoodEntry>
}