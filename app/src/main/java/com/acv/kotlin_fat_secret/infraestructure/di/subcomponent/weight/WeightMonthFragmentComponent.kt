package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.weight

import com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.WeightMonthFragment
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = arrayOf(WeightMonthFragmentModule::class))
interface WeightMonthFragmentComponent {
    fun injectTo(fragment: WeightMonthFragment)
}