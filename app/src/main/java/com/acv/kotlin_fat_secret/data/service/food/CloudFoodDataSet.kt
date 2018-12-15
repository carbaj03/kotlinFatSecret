package com.acv.kotlin_fat_secret.data.service.food


import com.acv.kotlin_fat_secret.data.service.Service
import com.acv.kotlin_fat_secret.data.service.mapper.EntryMapper
import com.acv.kotlin_fat_secret.data.service.mapper.FoodMapper
import com.acv.kotlin_fat_secret.data.unwrapCall
import com.acv.kotlin_fat_secret.domain.FoodEntry
import com.acv.kotlin_fat_secret.domain.FoodSearch
import com.acv.kotlin_fat_secret.infraestructure.repository.dataset.FoodDataSet

class CloudFoodDataSet(val service: Service) : FoodDataSet {

    override fun requestSearchBy(description: String): List<FoodSearch> {
        val response = service.requestFoodsSearch(description).execute()
        return FoodMapper().transform(response.body().foods.foods)
    }

    override fun requestEntriesBy(date: Int): List<FoodEntry> =
            service.requestFoodEntries(date).unwrapCall {
                EntryMapper().transform(entries.entries)
            }
}