package com.acv.kotlin_fat_secret.infraestructure.di

import com.acv.kotlin_fat_secret.infraestructure.di.module.ApplicationModule
import com.acv.kotlin_fat_secret.infraestructure.di.module.DataModule
import com.acv.kotlin_fat_secret.infraestructure.di.module.DomainModule
import com.acv.kotlin_fat_secret.infraestructure.di.module.RepositoryModule
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.diary.DiaryFragmentComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.diary.DiaryFragmentModule
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.login.LoginActivityComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.login.LoginActivityModule
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.login.LoginFragmentComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.login.LoginFragmentModule
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.main.MainActivityComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.main.MainActivityModule
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.food.SearchFoodFragmentComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.food.SearchFoodFragmentModule
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.profile.ProfileFragmentComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.profile.ProfileFragmentModule
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.splash.SplashActivityComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.splash.SplashActivityModule
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.weight.WeightMonthFragmentComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.weight.WeightMonthFragmentModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        DataModule::class,
        RepositoryModule::class,
        DomainModule::class
))
interface ApplicationComponent {
    fun plus(module: MainActivityModule): MainActivityComponent
    fun plus(module: SearchFoodFragmentModule): SearchFoodFragmentComponent
    fun plus(module: WeightMonthFragmentModule): WeightMonthFragmentComponent
    fun plus(module: LoginActivityModule): LoginActivityComponent
    fun plus(module: LoginFragmentModule): LoginFragmentComponent
    fun plus(module: SplashActivityModule): SplashActivityComponent
    fun plus(module: DiaryFragmentModule): DiaryFragmentComponent
    fun plus(module: ProfileFragmentModule): ProfileFragmentComponent
}

