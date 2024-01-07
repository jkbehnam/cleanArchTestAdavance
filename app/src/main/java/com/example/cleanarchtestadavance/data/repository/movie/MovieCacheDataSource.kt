package com.example.cleanarchtestadavance.data.repository.movie

import com.example.cleanarchtestadavance.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoveToCache(movies:List<Movie>)
}