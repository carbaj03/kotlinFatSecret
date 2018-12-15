package com.acv.kotlin_fat_secret.infraestructure.ui.splash

import com.acv.kotlin_fat_secret.domain.interactor.GetProfileAuthInteractor
import com.acv.kotlin_fat_secret.infraestructure.ui.common.Presenter
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

open class SplashPresenter(override val view: SplashView,
                           val getProfileInteractor: GetProfileAuthInteractor) : Presenter<SplashView> {

    open fun checkProfile() {
        doAsync() {
            val getProfileInteractor = getProfileInteractor
            val authentication = getProfileInteractor.execute()

            uiThread {

                if (authentication.isValid())
                    view.goToMain()
                else
                    view.goToLogin()
            }
        }
    }

}