package com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search

import com.acv.kotlin_fat_secret.domain.interactor.GetFoodsSearchInteractor
import com.acv.kotlin_fat_secret.infraestructure.ui.common.Presenter
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

open class SearchFoodPresenter(
        override val view: SearchFoodView,
        val getFoodsSearchInteractor: GetFoodsSearchInteractor
) : Presenter<SearchFoodView> {

    open fun searchFood(description: String) {
        doAsync() {
            view.showLoading()
            val getFoodsSearchInteractor = getFoodsSearchInteractor
            getFoodsSearchInteractor.description = description
            val foods = getFoodsSearchInteractor.execute()

            uiThread {
                view.showFoods(foods)
                view.hideLoading()
            }
        }
    }
}