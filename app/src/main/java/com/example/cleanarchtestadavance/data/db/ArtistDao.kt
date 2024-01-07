package com.example.cleanarchtestadavance.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cleanarchtestadavance.data.model.artist.Artist
import com.example.cleanarchtestadavance.data.model.tvshow.TvShow

@Dao
interface ArtistDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveArtist(artist: List<Artist>)

    @Query(value = "delete from popular_artists")
    suspend fun deleteAllArtist()

    @Query(value = "select * from popular_artists")
    suspend fun getAllArtist():List<Artist>
}