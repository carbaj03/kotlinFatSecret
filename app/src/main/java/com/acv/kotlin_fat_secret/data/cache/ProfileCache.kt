package com.acv.kotlin_fat_secret.data.cache

import com.acv.kotlin_fat_secret.domain.Profile

interface ProfileCache {
    fun put(authentication: Profile)
    fun get(): Profile
}