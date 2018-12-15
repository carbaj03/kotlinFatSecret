package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.weight

import com.acv.kotlin_fat_secret.domain.interactor.GetWeightMonthInteractor
import com.acv.kotlin_fat_secret.infraestructure.di.module.FragmentModule
import com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.WeightMonthFragment
import com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.WeightMonthPresenter
import com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.WeightMonthView
import com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.adapter.WeightAdapter
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class WeightMonthFragmentModule (fragment: WeightMonthFragment) : FragmentModule(fragment){

    @Provides @ActivityScope
    fun provideWeightView(): WeightMonthView = fragment as WeightMonthView

    @Provides @ActivityScope
    fun provideAdapter(): WeightAdapter = WeightAdapter()

    @Provides @ActivityScope
    fun providePresenter(view: WeightMonthView, getWeightMonthInteractor: GetWeightMonthInteractor)
            = WeightMonthPresenter(view, getWeightMonthInteractor)

}