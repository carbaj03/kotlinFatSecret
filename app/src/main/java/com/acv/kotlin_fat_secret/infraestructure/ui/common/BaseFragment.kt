package com.acv.kotlin_fat_secret.infraestructure.ui.common

import android.os.Bundle
import android.support.v4.app.Fragment
import com.acv.kotlin_fat_secret.infraestructure.di.ApplicationComponent
import com.acv.kotlin_fat_secret.infraestructure.ui.App

abstract class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependencies(App.graph)
    }

    abstract fun injectDependencies(applicationComponent: ApplicationComponent)
}