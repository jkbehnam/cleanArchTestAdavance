package com.example.cleanarchtestadavance.domain.usecase

import com.example.cleanarchtestadavance.data.model.artist.Artist
import com.example.cleanarchtestadavance.domain.repository.ArtistRepository

class GetArtistsUseCase(val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>?=artistRepository.getArtists()

}