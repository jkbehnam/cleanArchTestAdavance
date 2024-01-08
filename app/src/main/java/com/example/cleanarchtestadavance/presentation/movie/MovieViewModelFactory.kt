package com.example.cleanarchtestadavance.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cleanarchtestadavance.domain.usecase.GetMoviesUseCase
import com.example.cleanarchtestadavance.domain.usecase.UpdateMoviesUseCase

class MovieViewModelFactory(
   val getMoviesUseCase: GetMoviesUseCase,
  val  updateMoviesUseCase: UpdateMoviesUseCase
):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase ,updateMoviesUseCase) as T
    }
}
