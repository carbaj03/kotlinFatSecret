package com.acv.kotlin_fat_secret.data.cache


import android.content.Context
import com.acv.kotlin_fat_secret.domain.Authentication
import com.acv.kotlin_fat_secret.infraestructure.ui.extension.DelegatesExt

class ProfileCacheImpl(val context: Context) : ProfileAuthCache {

    companion object {
        val TOKEN = "token"
        val SECRET = "secret"
    }

    var token: String by DelegatesExt.preference(context, TOKEN, "")
    var secret: String by DelegatesExt.preference(context, SECRET, "")

    override fun put(authentication: Authentication) {
        token = authentication.oauth_token
        secret = authentication.auth_secret
    }

    override fun get(): Authentication = Authentication(token, secret)
}