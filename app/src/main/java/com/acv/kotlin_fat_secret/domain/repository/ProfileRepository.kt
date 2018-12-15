package com.acv.kotlin_fat_secret.domain.repository

import com.acv.kotlin_fat_secret.domain.Authentication
import com.acv.kotlin_fat_secret.domain.Profile

interface ProfileRepository {
    fun create(): Authentication
    fun get() : Profile
}