package com.acv.kotlin_fat_secret.domain.repository

import com.acv.kotlin_fat_secret.domain.WeightMonth

interface WeightRepository {
    fun weightBy(date: Int): List<WeightMonth>
}