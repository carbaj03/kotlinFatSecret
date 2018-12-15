package com.acv.kotlin_fat_secret.infraestructure.repository.dataset

import com.acv.kotlin_fat_secret.domain.FoodEntry
import com.acv.kotlin_fat_secret.domain.FoodSearch

interface FoodDataSet {
    fun requestSearchBy(description: String): List<FoodSearch>
    fun requestEntriesBy(date: Int): List<FoodEntry>
}