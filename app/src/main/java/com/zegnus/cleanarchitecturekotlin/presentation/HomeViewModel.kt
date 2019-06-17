package com.zegnus.cleanarchitecturekotlin.presentation

import com.zegnus.cleanarchitecturekotlin.domain.entities.Action
import com.zegnus.cleanarchitecturekotlin.domain.entities.Failure
import com.zegnus.cleanarchitecturekotlin.domain.entities.Success
import com.zegnus.cleanarchitecturekotlin.domain.usecases.HomeUseCase

class HomeViewModel {

    private lateinit var success: (Success) -> Unit
    private lateinit var failure: (Failure) -> Unit

    private val homeUseCase = HomeUseCase()

    fun observe(success: (Success) -> Unit, failure: (Failure) -> Unit) {
        this.success = success
        this.failure = failure
    }

    fun action(action: Action) {
        when (action) {
            Action.Load -> TODO()
        }
    }
}