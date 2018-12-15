package com.acv.kotlin_fat_secret.data.service.profile

import com.acv.kotlin_fat_secret.data.service.profile.ProfileService
import com.google.gson.annotations.SerializedName

class ProfileResponse(
        @SerializedName("profile") val profile: ProfileService
)