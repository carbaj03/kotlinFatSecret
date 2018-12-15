package com.acv.kotlin_fat_secret.infraestructure.ui

import android.app.Application
import com.acv.kotlin_fat_secret.infraestructure.di.ApplicationComponent
import com.acv.kotlin_fat_secret.infraestructure.di.DaggerApplicationComponent
import com.acv.kotlin_fat_secret.infraestructure.di.module.ApplicationModule

class App : Application() {

    companion object {
        lateinit var graph: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()
        initializeDagger()
    }

    fun initializeDagger() {
        graph = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}

