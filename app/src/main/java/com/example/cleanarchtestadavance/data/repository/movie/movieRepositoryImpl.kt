package com.example.cleanarchtestadavance.data.repository.movie

import com.example.cleanarchtestadavance.data.model.movie.Movie
import com.example.cleanarchtestadavance.data.model.movie.MovieList
import com.example.cleanarchtestadavance.domain.repository.MovieRepository

class movieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieCacheDataSource: MovieCacheDataSource,
    private val movieLocalDataSource: MovieLocalDataSource
) : MovieRepository {


    override suspend fun getMovies(): List<Movie>? {
        TODO("Not yet implemented")
    }

    override suspend fun updateMovies(): List<Movie>? {
        TODO("Not yet implemented")
    }

    suspend fun getMovieFromAPI(): List<Movie> {
        lateinit var movieList: List<Movie>

        try {
            val response = movieRemoteDataSource.getMovies()
            val body = response.body()
            if (body != null) {
                movieList = body.movies
            }
        } catch (exp: Exception) {

        }
        return movieList
    }

    suspend fun getmoviesFromDB(): List<Movie> {

        lateinit var movieList: List<Movie>

        try {
            movieList = movieLocalDataSource.getMvieFromDB()

        } catch (exp: Exception) {
        }

        if (movieList.size > 0)
            return movieList
        else {
            movieList = getMovieFromAPI()
            movieLocalDataSource.saveMovieToDB(movieList)
        }
        return movieList
    }
    suspend fun getMoviesFromCashe(){
        
    }
}