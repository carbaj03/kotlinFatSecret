package com.acv.kotlin_fat_secret.data.service.mapper

import com.acv.kotlin_fat_secret.data.service.profile.ProfileService
import com.acv.kotlin_fat_secret.domain.Profile

class ProfileMapper() {

    fun transform(profile: ProfileService) = profile.let {
        Profile(profile.weightMeasure, profile.heigthMeasure, profile.lastWeightKg, profile.lastWeightDate,
                profile.lastWeightComment, profile.goalWeightKg, profile.heightCm)
    }
}