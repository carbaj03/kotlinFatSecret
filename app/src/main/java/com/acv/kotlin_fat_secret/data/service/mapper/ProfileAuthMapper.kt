package com.acv.kotlin_fat_secret.data.service.mapper

import com.acv.kotlin_fat_secret.data.service.profile.ProfileAuthService
import com.acv.kotlin_fat_secret.domain.Authentication

class ProfileAuthMapper() {

    fun transform(profile: ProfileAuthService) = profile.let {
        Authentication(profile.token, profile.secret)
    }
}