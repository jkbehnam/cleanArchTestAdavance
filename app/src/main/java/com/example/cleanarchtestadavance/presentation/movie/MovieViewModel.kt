package com.example.cleanarchtestadavance.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.cleanarchtestadavance.domain.usecase.GetMoviesUseCase
import com.example.cleanarchtestadavance.domain.usecase.UpdateMoviesUseCase

class MovieViewModel(

    val getMoviesUseCase: GetMoviesUseCase,
    val updateMoviesUseCase: UpdateMoviesUseCase
):ViewModel() {

    fun getMovies()= liveData {
        val movieList=getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies()= liveData {
        val movieList=updateMoviesUseCase.execute()
        emit(movieList)
    }
}