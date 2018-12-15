package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.login

import com.acv.kotlin_fat_secret.infraestructure.ui.login.LoginActivity
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Subcomponent


@Subcomponent(modules = arrayOf( LoginActivityModule::class ))
@ActivityScope interface LoginActivityComponent {
    fun injectTo(actvity: LoginActivity)
}