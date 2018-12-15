package com.acv.kotlin_fat_secret.infraestructure.ui.main.profile

import com.acv.kotlin_fat_secret.domain.interactor.GetProfileInteractor
import com.acv.kotlin_fat_secret.infraestructure.ui.common.Presenter
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class ProfilePresenter(
        override val view: ProfileView,
        val getProfileInteractor: GetProfileInteractor
) : Presenter<ProfileView> {

    fun loadProfile() {

        doAsync {
            val profile = getProfileInteractor.execute()

            uiThread {
                view.showProfile(profile)
            }
        }
    }
}