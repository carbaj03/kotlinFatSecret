package com.acv.kotlin_fat_secret.domain.interactor

import com.acv.kotlin_fat_secret.domain.WeightMonth
import com.acv.kotlin_fat_secret.domain.interactor.base.Command
import com.acv.kotlin_fat_secret.domain.repository.WeightRepository
import java.util.*

class GetWeightMonthInteractor(val profileRepository: WeightRepository) : Command<List<WeightMonth>> {

    var date: Int = (Calendar.getInstance().timeInMillis * 1000L).toInt()

    override fun execute(): List<WeightMonth> = profileRepository.weightBy(date)
}