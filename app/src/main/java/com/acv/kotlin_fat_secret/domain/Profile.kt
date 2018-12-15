package com.acv.kotlin_fat_secret.domain


class Profile(
        val weight_measure : String = "",
        val height_measure : String = "",
        val last_weight_kg : Float = 0F,
        val last_weight_date_int : Int = 0,
        val last_weight_commment : String = "No hay comentarios",
        val goal_weight_kg : Float = 0F,
        val height_cm : Float = 0F
)
