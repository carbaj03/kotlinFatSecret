package com.acv.kotlin_fat_secret.infraestructure.repository

import com.acv.kotlin_fat_secret.domain.FoodEntry
import com.acv.kotlin_fat_secret.domain.FoodSearch
import com.acv.kotlin_fat_secret.domain.repository.FoodRepository
import com.acv.kotlin_fat_secret.infraestructure.repository.dataset.FoodDataSet

class FoodRepositoryImpl(val artistDataSets: FoodDataSet) : FoodRepository {

    override fun searchBy(description: String): List<FoodSearch> {
        val result = artistDataSets.requestSearchBy(description)
        if (result.isNotEmpty()) {
            return result
        }
        return emptyList()
    }

    override fun entryBy(date: Int): List<FoodEntry> {
        val result = artistDataSets.requestEntriesBy(date)
        if (result.isNotEmpty()) {
            return result
        }
        return emptyList()
    }
}