package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.splash

import com.acv.kotlin_fat_secret.infraestructure.ui.splash.SplashActivity
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = arrayOf(
        SplashActivityModule::class
))
interface SplashActivityComponent {
    fun injectTo(activity: SplashActivity)
}