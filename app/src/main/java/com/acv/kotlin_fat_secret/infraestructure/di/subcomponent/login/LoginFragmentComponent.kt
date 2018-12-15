package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.login

import com.acv.kotlin_fat_secret.infraestructure.ui.login.LoginFragment
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = arrayOf(
        LoginFragmentModule::class
))
interface LoginFragmentComponent {
    fun injectTo(fragment: LoginFragment)
}