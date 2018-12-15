package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.food

import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search.SearchFoodFragment
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = arrayOf(
        SearchFoodFragmentModule::class
))
interface SearchFoodFragmentComponent {

    fun injectTo(fragment: SearchFoodFragment)
}