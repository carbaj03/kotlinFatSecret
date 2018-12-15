package com.acv.kotlin_fat_secret.infraestructure.ui.splash

import android.os.Bundle
import android.support.annotation.VisibleForTesting
import com.acv.kotlin_fat_secret.infraestructure.di.ApplicationComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.splash.SplashActivityModule
import com.acv.kotlin_fat_secret.infraestructure.ui.common.BaseActivity
import com.acv.kotlin_fat_secret.infraestructure.ui.extension.launch
import com.acv.kotlin_fat_secret.infraestructure.ui.login.LoginActivity
import com.acv.kotlin_fat_secret.infraestructure.ui.main.MainActivity
import org.jetbrains.anko.setContentView
import javax.inject.Inject

class SplashActivity : BaseActivity(), SplashView {

    @Inject @VisibleForTesting
    lateinit var presenter: SplashPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.checkProfile()
    }

    override fun initView() {
        SplashActivityUI().setContentView(this)
    }

    override fun injectDependencies(applicationComponent: ApplicationComponent)
            = applicationComponent.plus(SplashActivityModule(this)).injectTo(this)

    override fun goToMain() {
        launch<MainActivity>()
        finish()
    }

    override fun goToLogin() {
        launch<LoginActivity>()
        finish()
    }
}
