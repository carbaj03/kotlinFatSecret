package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.diary

import com.acv.kotlin_fat_secret.domain.interactor.GetFoodEntriesInteractor
import com.acv.kotlin_fat_secret.infraestructure.di.module.FragmentModule
import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.diary.DiaryFragment
import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.diary.DiaryPresenter
import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.diary.DiaryView
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class DiaryFragmentModule(fragment: DiaryFragment) : FragmentModule(fragment) {

    @Provides @ActivityScope
    fun provideDiaryView(): DiaryView = fragment as DiaryView

    @Provides @ActivityScope
    fun provideDiaryPresenter(view: DiaryView,
                              getFoodEntriesInteractor: GetFoodEntriesInteractor) : DiaryPresenter
            = DiaryPresenter(view, getFoodEntriesInteractor)
 }