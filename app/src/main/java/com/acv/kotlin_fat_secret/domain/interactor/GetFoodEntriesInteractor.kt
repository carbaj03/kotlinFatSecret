package com.acv.kotlin_fat_secret.domain.interactor

import com.acv.kotlin_fat_secret.domain.FoodEntry
import com.acv.kotlin_fat_secret.domain.interactor.base.Command
import com.acv.kotlin_fat_secret.domain.repository.FoodRepository
import java.util.*

class GetFoodEntriesInteractor(val foodRepository: FoodRepository) : Command<List<FoodEntry>> {

    var date: Date? = null

    override fun execute(): List<FoodEntry> {
        val date = this.date ?: throw IllegalStateException("date can´t be null")
        val food = foodRepository.entryBy(dateToDays(date))
        return food
    }

    private fun dateToDays(date: Date): Int {
        return (date.time.div(1000L)).toInt()
    }
}