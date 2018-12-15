package com.acv.kotlin_fat_secret.infraestructure.ui.login

import com.acv.kotlin_fat_secret.infraestructure.di.ApplicationComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.login.LoginActivityModule
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.splash.SplashActivityModule
import com.acv.kotlin_fat_secret.infraestructure.ui.common.BaseActivity
import com.acv.kotlin_fat_secret.infraestructure.ui.extension.replace
import org.jetbrains.anko.setContentView

class LoginActivity : BaseActivity() {

    override fun initView() {
        LoginActivityUI().setContentView(this)
        replace(LoginFragment.newInstance())
    }

    override fun injectDependencies(applicationComponent: ApplicationComponent)
            = applicationComponent.plus(LoginActivityModule(this)).injectTo(this)
}