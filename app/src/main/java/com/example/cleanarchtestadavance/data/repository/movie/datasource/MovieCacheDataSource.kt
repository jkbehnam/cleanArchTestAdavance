package com.example.cleanarchtestadavance.data.repository.movie.datasource

import com.example.cleanarchtestadavance.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMovieToCache(movies:List<Movie>)
}