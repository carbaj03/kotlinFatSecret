package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.diary

import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.diary.DiaryFragment
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = arrayOf(DiaryFragmentModule::class))
interface DiaryFragmentComponent {
    fun injectTo(fragment: DiaryFragment)
}