package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.login

import com.acv.kotlin_fat_secret.domain.interactor.CreateProfileInteractor
import com.acv.kotlin_fat_secret.infraestructure.di.module.FragmentModule
import com.acv.kotlin_fat_secret.infraestructure.ui.login.LoginFragment
import com.acv.kotlin_fat_secret.infraestructure.ui.login.LoginPresenter
import com.acv.kotlin_fat_secret.infraestructure.ui.login.LoginView
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class LoginFragmentModule(fragment: LoginFragment) : FragmentModule(fragment) {

    @Provides @ActivityScope
    fun provideLoginView(): LoginView = fragment as LoginView

    @Provides @ActivityScope
    fun provideLoginPresenter(view: LoginView,
                              profileInteractor: CreateProfileInteractor
    ) = LoginPresenter(view, profileInteractor)

}