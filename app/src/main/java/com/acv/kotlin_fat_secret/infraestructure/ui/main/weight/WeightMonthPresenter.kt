package com.acv.kotlin_fat_secret.infraestructure.ui.main.weight

import com.acv.kotlin_fat_secret.domain.interactor.GetWeightMonthInteractor
import com.acv.kotlin_fat_secret.infraestructure.ui.common.Presenter
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class WeightMonthPresenter(
        override val view: WeightMonthView,
        val getWeightMonthInteractor: GetWeightMonthInteractor
) : Presenter<WeightMonthView> {

    fun searchWeights(date: Int) {
        doAsync {
            view.showLoading()
            val weightMonthInteractor = getWeightMonthInteractor
            weightMonthInteractor.date = date
            val weights = weightMonthInteractor.execute()

            uiThread {
                view.showWeights(weights)
                view.hideLoading()
            }
        }
    }
}