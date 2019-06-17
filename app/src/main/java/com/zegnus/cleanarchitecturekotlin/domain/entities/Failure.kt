package com.zegnus.cleanarchitecturekotlin.domain.entities

sealed class Failure {

    object NetworkError: Failure()

    object NoDataAvailable: Failure()

}