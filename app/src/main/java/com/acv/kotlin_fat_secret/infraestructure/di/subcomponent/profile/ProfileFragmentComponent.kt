package com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.profile

import com.acv.kotlin_fat_secret.infraestructure.ui.main.profile.ProfileFragment
import com.antonioleiva.bandhookkotlin.di.scope.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = arrayOf(ProfileFragmentModule::class))
interface ProfileFragmentComponent {
    fun injectTo(fragment: ProfileFragment)
}