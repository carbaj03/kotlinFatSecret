package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.profile

import com.acv.kotlin_fat_secret.domain.interactor.GetProfileInteractor
import com.acv.kotlin_fat_secret.infraestructure.di.module.FragmentModule
import com.acv.kotlin_fat_secret.infraestructure.ui.main.profile.ProfileFragment
import com.acv.kotlin_fat_secret.infraestructure.ui.main.profile.ProfilePresenter
import com.acv.kotlin_fat_secret.infraestructure.ui.main.profile.ProfileView
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ProfileFragmentModule(fragment: ProfileFragment) : FragmentModule(fragment) {

    @Provides @ActivityScope
    fun provideProfileView(): ProfileView = fragment as ProfileView

    @Provides @ActivityScope
    fun provideProfilePresenter(view: ProfileView,
                              getProfileInteractor: GetProfileInteractor) : ProfilePresenter
            = ProfilePresenter(view, getProfileInteractor)
 }