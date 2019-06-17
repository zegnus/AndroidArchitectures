package com.zegnus.cleanarchitecturekotlin.presentation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zegnus.cleanarchitecturekotlin.R
import com.zegnus.cleanarchitecturekotlin.domain.entities.Action
import com.zegnus.cleanarchitecturekotlin.domain.entities.Failure
import com.zegnus.cleanarchitecturekotlin.domain.entities.Success

class HomeActivity : AppCompatActivity() {

    private val homeViewModel = HomeViewModel()

    private val success: (Success) -> Unit = { success ->
        when (success) {
            Success.Loaded -> TODO()
        }
    }

    private val failure: (Failure) -> Unit = { failure ->
        when (failure) {
            Failure.NetworkError -> TODO()
            Failure.NoDataAvailable -> TODO()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        homeViewModel.observe(success, failure)
        homeViewModel.action(Action.Load)
    }
}
