package com.example.cleanarchtestadavance.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cleanarchtestadavance.data.model.movie.Movie


@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movieList: List<Movie>)

    @Query(value = "delete from popular_movies")
    suspend fun deleteAllMovies()

    @Query(value = "select * from popular_movies")
    suspend fun getAllMovies():List<Movie>

}