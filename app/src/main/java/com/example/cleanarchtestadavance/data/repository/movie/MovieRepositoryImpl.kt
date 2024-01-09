package com.example.cleanarchtestadavance.data.repository.movie

import com.example.cleanarchtestadavance.data.model.movie.Movie
import com.example.cleanarchtestadavance.data.repository.movie.datasource.MovieCacheDataSource
import com.example.cleanarchtestadavance.data.repository.movie.datasource.MovieLocalDataSource
import com.example.cleanarchtestadavance.data.repository.movie.datasource.MovieRemoteDataSource
import com.example.cleanarchtestadavance.domain.repository.MovieRepository

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieCacheDataSource: MovieCacheDataSource,
    private val movieLocalDataSource: MovieLocalDataSource
) : MovieRepository {


    override suspend fun getMovies(): List<Movie>? {
        return getMoviesFromCashe()
    }

    override suspend fun updateMovies(): List<Movie>? {
        val newListOfMovie=getMovieFromAPI()
        movieLocalDataSource.clearAll()
        movieLocalDataSource.saveMovieToDB(newListOfMovie)
        movieCacheDataSource.saveMovieToCache(newListOfMovie)
        return newListOfMovie
    }

    private suspend fun getMovieFromAPI(): List<Movie> {
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

    private suspend fun getMoviesFromDB(): List<Movie> {

        lateinit var movieList: List<Movie>

        try {
            movieList = movieLocalDataSource.getMovieFromDB()

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
    suspend fun getMoviesFromCashe():List<Movie>{

        lateinit var movieList: List<Movie>

        try {
            movieList=movieCacheDataSource.getMoviesFromCache()

        }catch (exp:Exception){


        }

        if (movieList.size>0)
        {
            return movieList

        }else{
            movieList=getMoviesFromDB()
            movieCacheDataSource.saveMovieToCache(movieList)
        }

        return movieList


    }
}