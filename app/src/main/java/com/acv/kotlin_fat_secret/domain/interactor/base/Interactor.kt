package com.acv.kotlin_fat_secret.domain.interactor.base

import com.acv.kotlin_fat_secret.domain.interactor.base.Event

interface Interactor {

    operator fun invoke(): Event
}