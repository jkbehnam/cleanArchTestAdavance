package com.example.cleanarchtestadavance.data.api

import com.example.cleanarchtestadavance.data.model.movie.MovieList
import com.example.cleanarchtestadavance.data.model.artist.ArtistList
import com.example.cleanarchtestadavance.data.model.tvshow.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {
    @GET("movie/popular")
    suspend fun getPopularMovies(@Query(value = "api_key") apiKey: String): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShow(@Query(value = "api_key") apiKey: String): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularPeople(@Query(value = "api_key") apiKey: String): Response<ArtistList>
}