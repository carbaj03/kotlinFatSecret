package com.acv.kotlin_fat_secret.domain.interactor

import com.acv.kotlin_fat_secret.data.cache.ProfileAuthCache
import com.acv.kotlin_fat_secret.domain.Authentication
import com.acv.kotlin_fat_secret.domain.interactor.base.Command
import com.acv.kotlin_fat_secret.domain.repository.ProfileRepository

class CreateProfileInteractor(val profileRepository: ProfileRepository,
                              val profileCache: ProfileAuthCache) : Command<Authentication> {
    override fun execute(): Authentication {
        val authentication = profileRepository.create()
        profileCache.put(authentication)
        return authentication
    }
}