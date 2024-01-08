package com.example.cleanarchtestadavance.data.repository.artist

import com.example.cleanarchtestadavance.data.model.artist.Artist
import com.example.cleanarchtestadavance.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.cleanarchtestadavance.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.cleanarchtestadavance.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.cleanarchtestadavance.domain.repository.ArtistRepository

class ArtistRepositoryImpl(
    private val artistRemoteDataSource: ArtistRemoteDataSource,
    private val artistCacheDataSource: ArtistCacheDataSource,
    private val artistLocalDataSource: ArtistLocalDataSource
) : ArtistRepository {


    override suspend fun getArtists(): List<Artist>? {
        return getArtistsFromCashe()
    }

    override suspend fun updateArtists(): List<Artist>? {
        val newListOfArtist=getArtistFromAPI()
        artistLocalDataSource.clearAll()
        artistLocalDataSource.saveArtistToDB(newListOfArtist)
        artistCacheDataSource.saveArtistsToCache(newListOfArtist)
        return newListOfArtist
    }

    private suspend fun getArtistFromAPI(): List<Artist> {
        lateinit var artistList: List<Artist>

        try {
            val response = artistRemoteDataSource.getArtists()
            val body = response.body()
            if (body != null) {
                artistList = body.people
            }
        } catch (exp: Exception) {

        }
        return artistList
    }

    private suspend fun getArtistsFromDB(): List<Artist> {

        lateinit var artistList: List<Artist>

        try {
            artistList = artistLocalDataSource.getArtistFromDB()

        } catch (exp: Exception) {
        }

        if (artistList.size > 0)
            return artistList
        else {
            artistList = getArtistFromAPI()
            artistLocalDataSource.saveArtistToDB(artistList)
        }
        return artistList
    }
    suspend fun getArtistsFromCashe():List<Artist>{

        lateinit var artistList: List<Artist>

        try {
            artistList=artistCacheDataSource.getArtistsFromCache()

        }catch (exp:Exception){


        }

        if (artistList.size>0)
        {
            return artistList

        }else{
            artistList=getArtistsFromDB()
            artistCacheDataSource.saveArtistsToCache(artistList)
        }

        return artistList


    }
}