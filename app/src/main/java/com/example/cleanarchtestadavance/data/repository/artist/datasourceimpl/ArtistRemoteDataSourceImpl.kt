package com.example.cleanarchtestadavance.data.repository.artist.datasourceimpl

import com.example.cleanarchtestadavance.data.api.TMDBService
import com.example.cleanarchtestadavance.data.model.artist.ArtistList
import com.example.cleanarchtestadavance.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(val tmdbService: TMDBService, val apiKey: String) :
    ArtistRemoteDataSource {
    override suspend fun getArtists(): Response<ArtistList> {
        return tmdbService.getPopularPeople(apiKey)
    }
}