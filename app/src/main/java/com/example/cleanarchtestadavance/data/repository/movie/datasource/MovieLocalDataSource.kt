package com.example.cleanarchtestadavance.data.repository.movie.datasource

import com.example.cleanarchtestadavance.data.model.movie.Movie
import com.example.cleanarchtestadavance.data.model.movie.MovieList
import retrofit2.Response

interface MovieLocalDataSource {
    suspend fun getMovieFromDB():List<Movie>
    suspend fun saveMovieToDB(movies: List<Movie>)
    suspend fun clearAll()
}