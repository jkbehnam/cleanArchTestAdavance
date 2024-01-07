package com.example.cleanarchtestadavance.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cleanarchtestadavance.data.model.movie.Movie
import com.example.cleanarchtestadavance.data.model.tvshow.TvShow

@Dao
interface TvShowDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShow(movieList: List<TvShow>)

    @Query(value = "delete from popular_tvshow")
    suspend fun deleteAllTvShow()

    @Query(value = "select * from popular_tvshow")
    suspend fun getAllTvShow():List<TvShow>
}