package com.acv.kotlin_fat_secret.infraestructure.di.module

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
abstract class FragmentModule(protected val fragment: Fragment) {

    @Provides @ActivityScope
    fun provideFragment(): Fragment = fragment

    @Provides @ActivityScope
    fun provideFargmentContext(): Context = fragment.activity.baseContext
}