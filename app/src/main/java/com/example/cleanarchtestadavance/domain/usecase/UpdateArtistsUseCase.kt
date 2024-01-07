package com.example.cleanarchtestadavance.domain.usecase

import com.example.cleanarchtestadavance.data.model.artist.Artist
import com.example.cleanarchtestadavance.domain.repository.ArtistRepository

class UpdateArtistsUseCase(val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>?=artistRepository.updateArtists()

}