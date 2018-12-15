/*
 * Copyright (C) 2015 Antonio Leiva
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.acv.kotlin_fat_secret.data.service

import com.acv.kotlin_fat_secret.data.service.authentication.AuthenticationResponse
import com.acv.kotlin_fat_secret.data.service.food.entry.FoodEntriesGetResponse
import com.acv.kotlin_fat_secret.data.service.food.search.FoodsSearchResponse
import com.acv.kotlin_fat_secret.data.service.profile.ProfileResponse
import com.acv.kotlin_fat_secret.data.service.weight.MonthResponse
import com.acv.kotlin_fat_secret.domain.WeightMonth
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {

    @GET("/rest/server.api?method=foods.search")
    fun requestFoodsSearch(@Query("search_expression") searchExpresion: String): Call<FoodsSearchResponse>

    @GET("/rest/server.api?method=food_entries.get")
    fun requestFoodEntries(@Query("date") searchExpresion: Int): Call<FoodEntriesGetResponse>


    @GET("/rest/server.api?method=profile.create")
    fun requestProfileCreate(): Call<AuthenticationResponse>

    @GET("/rest/server.api?method=profile.get")
    fun requestProfileGet(): Call<ProfileResponse>


    @GET("/rest/server.api?method=weights.get_month")
    fun requestWeightsGetMonth(@Query("date") searchExpresion: Int): Call<MonthResponse>
 }