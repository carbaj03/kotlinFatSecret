package com.acv.kotlin_fat_secret.infraestructure.repository

import com.acv.kotlin_fat_secret.domain.Authentication
import com.acv.kotlin_fat_secret.domain.Profile
import com.acv.kotlin_fat_secret.domain.repository.ProfileRepository
import com.acv.kotlin_fat_secret.infraestructure.repository.dataset.ProfileDataSet

class ProfileRepositoryImpl(val artistDataSets: ProfileDataSet) : ProfileRepository {

    override fun create(): Authentication {
       return artistDataSets.requestCreate()
    }

    override fun get(): Profile {
        return artistDataSets.requestGet()
    }
}