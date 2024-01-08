package com.example.cleanarchtestadavance.data.repository.artist.datasource

import com.example.cleanarchtestadavance.data.model.artist.Artist
import com.example.cleanarchtestadavance.data.model.movie.Movie
import com.example.cleanarchtestadavance.data.model.movie.MovieList
import retrofit2.Response

interface ArtistLocalDataSource {
    suspend fun getArtistFromDB():List<Artist>
    suspend fun saveArtistToDB(artists: List<Artist>)
    suspend fun clearAll()
}