package com.acv.kotlin_fat_secret.domain

data class FoodSearch(val id: String,
                      val name: String,
                      val type: String,
                      val brand: String?,
                      val url: String,
                      val description: String)