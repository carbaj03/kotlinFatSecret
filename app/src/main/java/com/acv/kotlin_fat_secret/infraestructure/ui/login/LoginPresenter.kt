package com.acv.kotlin_fat_secret.infraestructure.ui.login

import com.acv.kotlin_fat_secret.domain.interactor.CreateProfileInteractor
import com.acv.kotlin_fat_secret.infraestructure.ui.common.Presenter
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

open class LoginPresenter(
        override val view: LoginView,
        val profileInteractor: CreateProfileInteractor
) : Presenter<LoginView> {

    open fun init() {
        doAsync() {
            val profileInteractor = profileInteractor
            val profile = profileInteractor.execute()

            uiThread {
                if (profile.isValid())
                    view.goToMain()
            }
        }
    }
}