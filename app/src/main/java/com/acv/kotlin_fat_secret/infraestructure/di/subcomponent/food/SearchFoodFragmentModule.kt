package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.food

import com.acv.kotlin_fat_secret.domain.interactor.GetFoodsSearchInteractor
import com.acv.kotlin_fat_secret.infraestructure.di.module.FragmentModule
import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search.SearchFoodFragment
import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search.SearchFoodPresenter
import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search.SearchFoodView
import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search.adapter.SearchFoodAdapter
import com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.adapter.WeightAdapter
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class SearchFoodFragmentModule(fragment: SearchFoodFragment) : FragmentModule(fragment) {

    @Provides @ActivityScope
    fun provideMainView(): SearchFoodView = fragment as SearchFoodView

    @Provides @ActivityScope
    fun provideAdapter(): SearchFoodAdapter = SearchFoodAdapter()

    @Provides @ActivityScope
    fun provideMainPresenter(view: SearchFoodView, getFoodsSearchInteractor: GetFoodsSearchInteractor)
            = SearchFoodPresenter(view, getFoodsSearchInteractor)

}