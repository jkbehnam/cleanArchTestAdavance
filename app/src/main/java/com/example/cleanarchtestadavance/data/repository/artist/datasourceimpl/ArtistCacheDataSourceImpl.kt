package com.example.cleanarchtestadavance.data.repository.artist.datasourceimpl

import com.example.cleanarchtestadavance.data.model.artist.Artist
import com.example.cleanarchtestadavance.data.repository.artist.datasource.ArtistCacheDataSource

class ArtistCacheDataSourceImpl: ArtistCacheDataSource {
    var artistList=ArrayList<Artist>()
    override suspend fun getArtistsFromCache(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistsToCache(artists: List<Artist>) {
        artistList=ArrayList(artists)
    }
}