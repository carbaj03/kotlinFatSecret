package com.acv.kotlin_fat_secret.infraestructure.ui.main.weight

import com.acv.kotlin_fat_secret.domain.WeightMonth
import com.acv.kotlin_fat_secret.infraestructure.ui.common.PresentationView

interface WeightMonthView : PresentationView {
    fun showWeights(weights: List<WeightMonth>)
    fun showLoading()
    fun hideLoading()
}