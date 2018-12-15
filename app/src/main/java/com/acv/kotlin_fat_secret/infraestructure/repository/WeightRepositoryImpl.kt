package com.acv.kotlin_fat_secret.infraestructure.repository

import com.acv.kotlin_fat_secret.domain.WeightMonth
import com.acv.kotlin_fat_secret.domain.repository.WeightRepository
import com.acv.kotlin_fat_secret.infraestructure.repository.dataset.WeightDataSet

class WeightRepositoryImpl(internal val dataSet: WeightDataSet) : WeightRepository {

    override fun weightBy(date: Int): List<WeightMonth> {
        val result = dataSet.requestWeightBy(date)
        if (result.isNotEmpty()) {
            return result
        }
        return emptyList()
    }
}