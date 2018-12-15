package com.acv.kotlin_fat_secret.data.service.authentication

import com.acv.kotlin_fat_secret.data.service.profile.ProfileAuthService
import com.google.gson.annotations.SerializedName

class AuthenticationResponse(
        @SerializedName("profile") val profileAuth: ProfileAuthService
)