package com.acv.kotlin_fat_secret.domain

class Authentication(
        val oauth_token : String = "",
        val auth_secret : String = ""
){
    fun isValid() = oauth_token.isNotEmpty() && auth_secret.isNotEmpty()
}

