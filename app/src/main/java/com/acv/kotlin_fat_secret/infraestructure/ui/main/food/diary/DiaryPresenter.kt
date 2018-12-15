package com.acv.kotlin_fat_secret.infraestructure.ui.main.food.diary

import com.acv.kotlin_fat_secret.domain.interactor.GetFoodEntriesInteractor
import com.acv.kotlin_fat_secret.infraestructure.ui.common.Presenter
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.util.*

class DiaryPresenter(
        override val view: DiaryView,
        val getFoodEntriesInteractor: GetFoodEntriesInteractor
) : Presenter<DiaryView> {

    fun init(date: Date) {

        doAsync {
            val getFoodEntriesInteractor = getFoodEntriesInteractor
            getFoodEntriesInteractor.date = date
            val food = getFoodEntriesInteractor.execute()

            uiThread {


            }
        }
    }
}