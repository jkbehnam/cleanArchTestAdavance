package com.example.cleanarchtestadavance.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cleanarchtestadavance.data.model.artist.Artist
import com.example.cleanarchtestadavance.data.model.movie.Movie
import com.example.cleanarchtestadavance.data.model.tvshow.TvShow


@Database(entities = [Movie::class,TvShow::class,Artist::class], version = 1, exportSchema = false)
abstract class TMDBDatabase: RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun artistDao(): ArtistDao
    abstract fun tvShowDao(): TvShowDao

}