package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.main

import com.acv.kotlin_fat_secret.infraestructure.di.module.ActivityModule
import com.acv.kotlin_fat_secret.infraestructure.ui.main.MainActivity
import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search.SearchFoodView
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule(activity: MainActivity) : ActivityModule(activity) {

    @Provides @ActivityScope
    fun provideMainView(): SearchFoodView = activity as SearchFoodView
}