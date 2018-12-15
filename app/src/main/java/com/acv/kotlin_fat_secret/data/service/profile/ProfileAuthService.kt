package com.acv.kotlin_fat_secret.data.service.profile

import com.google.gson.annotations.SerializedName

class ProfileAuthService(
        @SerializedName("auth_token") val token: String,
        @SerializedName("auth_secret") val secret: String
)
