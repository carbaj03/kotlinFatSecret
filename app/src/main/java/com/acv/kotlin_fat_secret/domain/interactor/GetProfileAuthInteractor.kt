package com.acv.kotlin_fat_secret.domain.interactor

import com.acv.kotlin_fat_secret.data.cache.ProfileAuthCache
import com.acv.kotlin_fat_secret.domain.Authentication
import com.acv.kotlin_fat_secret.domain.interactor.base.Command
import com.acv.kotlin_fat_secret.domain.repository.ProfileRepository

class GetProfileAuthInteractor(val profileCache: ProfileAuthCache) : Command<Authentication> {
    override fun execute(): Authentication = profileCache.get()
}