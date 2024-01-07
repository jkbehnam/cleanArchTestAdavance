package com.example.cleanarchtestadavance.data.repository.movie

import com.example.cleanarchtestadavance.data.model.movie.Movie

class MovieCacheDataSourceImpl:MovieCacheDataSource {
    var movieList=ArrayList<Movie>()
    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoveToCache(movies: List<Movie>) {
        movieList=ArrayList(movies)
    }
}