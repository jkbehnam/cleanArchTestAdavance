package com.example.cleanarchtestadavance.data.repository.tvshow.datasource

import com.example.cleanarchtestadavance.data.model.movie.Movie
import com.example.cleanarchtestadavance.data.model.movie.MovieList
import com.example.cleanarchtestadavance.data.model.tvshow.TvShow
import retrofit2.Response

interface TvShowLocalDataSource {
    suspend fun getTvShowFromDB():List<TvShow>
    suspend fun saveTvShowToDB(tvShows: List<TvShow>)
    suspend fun clearAll()
}