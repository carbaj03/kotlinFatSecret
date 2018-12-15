package com.acv.kotlin_fat_secret.data.cache

import com.acv.kotlin_fat_secret.domain.Authentication

interface ProfileAuthCache {
    fun put(authentication: Authentication)
    fun get(): Authentication
}