package com.acv.kotlin_fat_secret.infraestructure.di.module

import com.acv.kotlin_fat_secret.data.service.Service
import com.acv.kotlin_fat_secret.data.service.food.CloudFoodDataSet
import com.acv.kotlin_fat_secret.data.service.profile.CloudProfileDataSet
import com.acv.kotlin_fat_secret.data.service.weight.CloudWeightDataSet
import com.acv.kotlin_fat_secret.domain.repository.FoodRepository
import com.acv.kotlin_fat_secret.domain.repository.ProfileRepository
import com.acv.kotlin_fat_secret.domain.repository.WeightRepository
import com.acv.kotlin_fat_secret.infraestructure.di.qualifier.LanguageSelection
import com.acv.kotlin_fat_secret.infraestructure.repository.FoodRepositoryImpl
import com.acv.kotlin_fat_secret.infraestructure.repository.ProfileRepositoryImpl
import com.acv.kotlin_fat_secret.infraestructure.repository.WeightRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides @Singleton
    fun provideFood(service: Service): FoodRepository
            = FoodRepositoryImpl(CloudFoodDataSet(service))

    @Provides @Singleton
    fun provideProfile(@LanguageSelection language: String, service: Service): ProfileRepository
            = ProfileRepositoryImpl(CloudProfileDataSet(language, service))

    @Provides @Singleton
    fun provideWeight(service: Service): WeightRepository
            = WeightRepositoryImpl(CloudWeightDataSet(service))
}