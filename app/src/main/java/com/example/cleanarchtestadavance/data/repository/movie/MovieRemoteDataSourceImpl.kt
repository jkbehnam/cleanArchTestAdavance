package com.example.cleanarchtestadavance.data.repository.movie

import com.example.cleanarchtestadavance.data.api.TMDBService
import com.example.cleanarchtestadavance.data.model.movie.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(val tmdbService: TMDBService, val apiKey: String) :
    MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> {
        return tmdbService.getPopularMovies(apiKey)
    }
}