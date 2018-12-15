package com.acv.kotlin_fat_secret.infraestructure.di.module

import android.content.Context
import com.acv.kotlin_fat_secret.BuildConfig
import com.acv.kotlin_fat_secret.R
import com.acv.kotlin_fat_secret.data.cache.ProfileAuthCache
import com.acv.kotlin_fat_secret.data.cache.ProfileCacheImpl
import com.acv.kotlin_fat_secret.data.service.FatRequestInterceptor
import com.acv.kotlin_fat_secret.data.service.Service
import com.acv.kotlin_fat_secret.infraestructure.di.qualifier.ApiKey
import com.acv.kotlin_fat_secret.infraestructure.di.qualifier.ApplicationQualifier
import com.acv.kotlin_fat_secret.infraestructure.di.qualifier.CacheDuration
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class DataModule {

    @Provides @Singleton
    fun provideCache(@ApplicationQualifier context: Context) = Cache(context.cacheDir, 10 * 1024 * 1024.toLong())

    @Provides @Singleton @ApiKey
    fun provideApiKey(@ApplicationQualifier context: Context): String = context.getString(R.string.fat_secret_api_key)

    @Provides @Singleton @CacheDuration
    fun provideCacheDuration(@ApplicationQualifier context: Context)
            = context.resources.getInteger(R.integer.cache_duration)

    @Provides @Singleton
    fun provideOkHttpClient(cache: Cache, interceptor: FatRequestInterceptor): OkHttpClient =
            OkHttpClient().newBuilder()
                    .cache(cache)
                    .addInterceptor(interceptor)
                    .addInterceptor(HttpLoggingInterceptor().apply {
                        level = if (BuildConfig.DEBUG) Level.HEADERS else Level.HEADERS
                    })
                    .build()

    @Provides @Singleton
    fun provideRequestInterceptor(@ApiKey apiKey: String, @CacheDuration cacheDuration: Int)
            = FatRequestInterceptor(apiKey, cacheDuration)

    @Provides @Singleton
    fun provideRestAdapter(client: OkHttpClient, @ApplicationQualifier context: Context): Retrofit {
        return Retrofit.Builder()
                .baseUrl(context.getString(R.string.base_url))
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    @Provides @Singleton
    fun providesService(retrofit: Retrofit): Service = retrofit.create(Service::class.java)

    @Provides @Singleton
    fun provideProfileCache(@ApplicationQualifier context: Context) : ProfileAuthCache = ProfileCacheImpl(context)
}