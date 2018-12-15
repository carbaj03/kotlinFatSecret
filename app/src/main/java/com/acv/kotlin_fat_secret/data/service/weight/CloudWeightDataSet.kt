package com.acv.kotlin_fat_secret.data.service.weight

import com.acv.kotlin_fat_secret.data.service.Service
import com.acv.kotlin_fat_secret.data.service.mapper.WeightMapper
import com.acv.kotlin_fat_secret.data.unwrapCall
import com.acv.kotlin_fat_secret.domain.WeightMonth
import com.acv.kotlin_fat_secret.infraestructure.repository.dataset.WeightDataSet

class CloudWeightDataSet(val service: Service) : WeightDataSet {
    override fun requestWeightBy(date: Int): List<WeightMonth> =
            service.requestWeightsGetMonth(date).unwrapCall {
                WeightMapper().transform(month)
            }
}