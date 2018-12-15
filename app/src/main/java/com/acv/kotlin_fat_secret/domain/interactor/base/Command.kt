package com.acv.kotlin_fat_secret.domain.interactor.base

interface Command<T> {
    fun execute(): T
}