package com.acv.kotlin_fat_secret.infraestructure.ui.main.profile

import com.acv.kotlin_fat_secret.domain.Profile
import com.acv.kotlin_fat_secret.infraestructure.ui.common.PresentationView


interface ProfileView : PresentationView {
    fun  showProfile(profile: Profile)
}