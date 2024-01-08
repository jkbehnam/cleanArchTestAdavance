package com.example.cleanarchtestadavance.data.repository.movie.datasourceimpl

import com.example.cleanarchtestadavance.data.model.movie.Movie
import com.example.cleanarchtestadavance.data.repository.movie.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl: MovieCacheDataSource {
    var movieList=ArrayList<Movie>()
    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMovieToCache(movies: List<Movie>) {
        movieList=ArrayList(movies)
    }
}