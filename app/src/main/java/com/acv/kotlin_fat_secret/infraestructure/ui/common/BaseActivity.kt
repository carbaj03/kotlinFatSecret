package com.acv.kotlin_fat_secret.infraestructure.ui.common

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.acv.kotlin_fat_secret.infraestructure.di.ApplicationComponent
import com.acv.kotlin_fat_secret.infraestructure.ui.App

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        injectDependencies(App.graph)
    }

    abstract fun initView()

    abstract fun injectDependencies(applicationComponent: ApplicationComponent)
}