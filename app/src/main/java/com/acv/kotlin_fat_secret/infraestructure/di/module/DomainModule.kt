package com.acv.kotlin_fat_secret.infraestructure.di.module

import com.acv.kotlin_fat_secret.data.cache.ProfileAuthCache
import com.acv.kotlin_fat_secret.data.cache.ProfileCache
import com.acv.kotlin_fat_secret.domain.interactor.*
import com.acv.kotlin_fat_secret.domain.repository.FoodRepository
import com.acv.kotlin_fat_secret.domain.repository.ProfileRepository
import com.acv.kotlin_fat_secret.domain.repository.WeightRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides fun provideSearchByInteractor(foodRepository: FoodRepository)
            = GetFoodsSearchInteractor(foodRepository)

    @Provides fun provideEntryByInteractor(foodRepository: FoodRepository)
            = GetFoodEntriesInteractor(foodRepository)

    @Provides fun providesCreateProfileInteractor(profileRepository: ProfileRepository,
                                  profileCache: ProfileAuthCache)
            = CreateProfileInteractor(profileRepository, profileCache)

    @Provides fun providesGetProfileAuthInteractor(profileCache: ProfileAuthCache)
            = GetProfileAuthInteractor(profileCache)

    @Provides fun providesGetProfileInteractor(profileRepository: ProfileRepository)
            = GetProfileInteractor(profileRepository)

    @Provides fun providesGetWeightMonthInteractor(repository: WeightRepository)
            = GetWeightMonthInteractor(repository)

}