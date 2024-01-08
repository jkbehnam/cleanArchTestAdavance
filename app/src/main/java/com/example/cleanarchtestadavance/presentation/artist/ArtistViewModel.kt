package com.example.cleanarchtestadavance.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.cleanarchtestadavance.domain.usecase.GetArtistsUseCase
import com.example.cleanarchtestadavance.domain.usecase.GetMoviesUseCase
import com.example.cleanarchtestadavance.domain.usecase.UpdateArtistsUseCase
import com.example.cleanarchtestadavance.domain.usecase.UpdateMoviesUseCase

class ArtistViewModel(

    val getArtistsUseCase: GetArtistsUseCase,
    val updateArtistsUseCase: UpdateArtistsUseCase
):ViewModel() {

    fun getArtists()= liveData {
        val ArtistList=getArtistsUseCase.execute()
        emit(ArtistList)
    }

    fun updateArtists()= liveData {
        val ArtistList=updateArtistsUseCase.execute()
        emit(ArtistList)
    }
}