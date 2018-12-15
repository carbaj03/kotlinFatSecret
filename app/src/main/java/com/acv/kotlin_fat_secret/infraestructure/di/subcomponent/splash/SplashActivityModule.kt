package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.splash

import com.acv.kotlin_fat_secret.domain.interactor.GetProfileAuthInteractor
import com.acv.kotlin_fat_secret.infraestructure.di.module.ActivityModule
import com.acv.kotlin_fat_secret.infraestructure.ui.splash.SplashActivity
import com.acv.kotlin_fat_secret.infraestructure.ui.splash.SplashPresenter
import com.acv.kotlin_fat_secret.infraestructure.ui.splash.SplashView
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class SplashActivityModule(activity: SplashActivity) : ActivityModule(activity) {

    @Provides @ActivityScope
    fun provideSplashView(): SplashView = activity as SplashView

    @Provides @ActivityScope
    fun provideSplashPresenter(view: SplashView, getProfileInteractor: GetProfileAuthInteractor)
            = SplashPresenter(view, getProfileInteractor)

}