package com.acv.kotlin_fat_secret.data.service.profile

import com.acv.kotlin_fat_secret.data.service.Service
import com.acv.kotlin_fat_secret.data.service.mapper.FoodMapper
import com.acv.kotlin_fat_secret.data.service.mapper.ProfileAuthMapper
import com.acv.kotlin_fat_secret.data.service.mapper.ProfileMapper
import com.acv.kotlin_fat_secret.data.unwrapCall
import com.acv.kotlin_fat_secret.domain.Authentication
import com.acv.kotlin_fat_secret.domain.FoodSearch
import com.acv.kotlin_fat_secret.domain.Profile
import com.acv.kotlin_fat_secret.infraestructure.repository.dataset.FoodDataSet
import com.acv.kotlin_fat_secret.infraestructure.repository.dataset.ProfileDataSet

class CloudProfileDataSet(val language: String, val service: Service) : ProfileDataSet {
    override fun requestGet(): Profile {
        service.requestProfileGet().unwrapCall {
            return Profile()
        }
    }

    override fun requestCreate(): Authentication {
        service.requestProfileCreate().unwrapCall {
            return ProfileAuthMapper().transform(profileAuth)
        }
    }
}