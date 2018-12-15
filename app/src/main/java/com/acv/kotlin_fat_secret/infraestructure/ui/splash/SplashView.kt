package com.acv.kotlin_fat_secret.infraestructure.ui.splash

import com.acv.kotlin_fat_secret.infraestructure.ui.common.PresentationView

interface SplashView : PresentationView {
    fun goToMain()
    fun goToLogin()
}