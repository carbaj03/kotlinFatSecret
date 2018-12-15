package com.acv.kotlin_fat_secret.domain.interactor

import com.acv.kotlin_fat_secret.domain.Profile
import com.acv.kotlin_fat_secret.domain.interactor.base.Command
import com.acv.kotlin_fat_secret.domain.repository.ProfileRepository

class GetProfileInteractor(val profileRepository: ProfileRepository) : Command<Profile> {
    override fun execute(): Profile = profileRepository.get()
}