package com.acv.kotlin_fat_secret.domain.interactor.event

import com.acv.kotlin_fat_secret.domain.FoodSearch
import com.acv.kotlin_fat_secret.domain.interactor.base.Event

class FoodsSearchEvent(val foods: List<FoodSearch>) : Event