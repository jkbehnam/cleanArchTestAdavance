package com.example.cleanarchtestadavance.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cleanarchtestadavance.domain.usecase.GetMoviesUseCase
import com.example.cleanarchtestadavance.domain.usecase.GetTvShowsUseCase
import com.example.cleanarchtestadavance.domain.usecase.UpdateMoviesUseCase
import com.example.cleanarchtestadavance.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModelFactory(
    val getTvShowsUseCase: GetTvShowsUseCase,
    val updateTvShowsUseCase: UpdateTvShowsUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TvShowViewModel(getTvShowsUseCase, updateTvShowsUseCase) as T
    }
}
