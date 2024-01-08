package com.example.cleanarchtestadavance.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.cleanarchtestadavance.domain.usecase.GetMoviesUseCase
import com.example.cleanarchtestadavance.domain.usecase.GetTvShowsUseCase
import com.example.cleanarchtestadavance.domain.usecase.UpdateMoviesUseCase
import com.example.cleanarchtestadavance.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModel(

  val getTvShowsUseCase: GetTvShowsUseCase,
    val updateTvShowsUseCase: UpdateTvShowsUseCase
):ViewModel() {

    fun getTvShows()= liveData {
        val tvShows=getTvShowsUseCase.execute()
        emit(tvShows)
    }

    fun updateTvShow()= liveData {
        val tvShows=updateTvShowsUseCase.execute()
        emit(tvShows)
    }
}