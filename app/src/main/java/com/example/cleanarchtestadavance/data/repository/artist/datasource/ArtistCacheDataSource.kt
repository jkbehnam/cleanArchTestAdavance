package com.example.cleanarchtestadavance.data.repository.artist.datasource

import com.example.cleanarchtestadavance.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)
}