package com.acv.kotlin_fat_secret.infraestructure.repository.dataset

import com.acv.kotlin_fat_secret.domain.Authentication
import com.acv.kotlin_fat_secret.domain.Profile

interface ProfileDataSet {
    fun requestCreate(): Authentication
    fun requestGet() : Profile
}