package com.acv.kotlin_fat_secret.infraestructure.di.module

import android.content.Context
import com.acv.kotlin_fat_secret.infraestructure.di.qualifier.ApplicationQualifier
import com.acv.kotlin_fat_secret.infraestructure.di.qualifier.LanguageSelection
import com.acv.kotlin_fat_secret.infraestructure.ui.App
import com.bumptech.glide.Glide
import dagger.Module
import dagger.Provides
import java.util.*
import javax.inject.Singleton

@Module
class ApplicationModule(private val app: App) {

    @Provides @Singleton
    fun provideApplication(): App = app

    @Provides @Singleton @ApplicationQualifier
    fun provideApplicationContext(): Context = app

    @Provides @Singleton
    fun provideGlide(@ApplicationQualifier context: Context): Glide = Glide.get(context)

    @Provides @Singleton @LanguageSelection
    fun provideLanguageSelection(): String = Locale.getDefault().language
}