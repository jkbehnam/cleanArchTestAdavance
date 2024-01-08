package com.example.cleanarchtestadavance.data.repository.artist.datasourceimpl

import com.example.cleanarchtestadavance.data.db.ArtistDao
import com.example.cleanarchtestadavance.data.model.artist.Artist
import com.example.cleanarchtestadavance.data.repository.artist.datasource.ArtistLocalDataSource

class ArtistLocalDataSourceImpl(private val movieDao: ArtistDao) : ArtistLocalDataSource {
    override suspend fun getArtistFromDB(): List<Artist> {
        return movieDao.getAllArtist()
    }

    override suspend fun saveArtistToDB(movies: List<Artist>) {
        movieDao.saveArtist(movies)
    }

    override suspend fun clearAll() {
        movieDao.deleteAllArtist()
    }
}