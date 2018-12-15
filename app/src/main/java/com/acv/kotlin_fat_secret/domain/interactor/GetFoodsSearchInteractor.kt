package com.acv.kotlin_fat_secret.domain.interactor

import com.acv.kotlin_fat_secret.domain.FoodSearch
import com.acv.kotlin_fat_secret.domain.interactor.base.Command
import com.acv.kotlin_fat_secret.domain.repository.FoodRepository

class GetFoodsSearchInteractor(val foodRepository: FoodRepository) : Command<List<FoodSearch>> {

    var description: String? = null

    override fun execute(): List<FoodSearch> {
        val description = this.description ?: throw IllegalStateException("description can´t be null")
        val foods = foodRepository.searchBy(description)
        return foods
    }
}