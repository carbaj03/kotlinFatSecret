package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.main

import com.acv.kotlin_fat_secret.infraestructure.ui.main.MainActivity
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Subcomponent


@Subcomponent(modules = arrayOf( MainActivityModule::class ))
@ActivityScope interface MainActivityComponent {

    fun injectTo(activity: MainActivity)
}