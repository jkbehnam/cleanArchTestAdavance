package com.example.cleanarchtestadavance.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cleanarchtestadavance.domain.usecase.GetArtistsUseCase
import com.example.cleanarchtestadavance.domain.usecase.GetMoviesUseCase
import com.example.cleanarchtestadavance.domain.usecase.UpdateArtistsUseCase
import com.example.cleanarchtestadavance.domain.usecase.UpdateMoviesUseCase

class ArtistViewModelFactory(
  val  getArtistsUseCase: GetArtistsUseCase,
    val updateArtistsUseCase: UpdateArtistsUseCase
):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ArtistViewModel(getArtistsUseCase ,updateArtistsUseCase) as T
    }
}
