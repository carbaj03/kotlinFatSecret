package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.login

import com.acv.kotlin_fat_secret.infraestructure.di.module.ActivityModule
import com.acv.kotlin_fat_secret.infraestructure.ui.login.LoginActivity
import dagger.Module

@Module class LoginActivityModule(activity: LoginActivity) : ActivityModule(activity) {

}