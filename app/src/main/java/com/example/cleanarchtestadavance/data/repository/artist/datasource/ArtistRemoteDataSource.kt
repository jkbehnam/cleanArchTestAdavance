package com.example.cleanarchtestadavance.data.repository.artist.datasource

import com.example.cleanarchtestadavance.data.model.artist.ArtistList

import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists():Response<ArtistList>
}