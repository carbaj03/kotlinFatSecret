package com.acv.kotlin_fat_secret.infraestructure.repository.dataset

import com.acv.kotlin_fat_secret.domain.WeightMonth

interface WeightDataSet {
    fun requestWeightBy(date: Int): List<WeightMonth>
}