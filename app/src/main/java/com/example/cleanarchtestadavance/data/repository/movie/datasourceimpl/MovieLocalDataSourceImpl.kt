package com.example.cleanarchtestadavance.data.repository.movie.datasourceimpl

import com.example.cleanarchtestadavance.data.db.MovieDao
import com.example.cleanarchtestadavance.data.model.movie.Movie
import com.example.cleanarchtestadavance.data.repository.movie.datasource.MovieLocalDataSource

class MovieLocalDataSourceImpl(val movieDao: MovieDao) : MovieLocalDataSource {
    override suspend fun getMovieFromDB(): List<Movie> {
        return movieDao.getAllMovies()
    }

    override suspend fun saveMovieToDB(movies: List<Movie>) {
        movieDao.saveMovies(movies)
    }

    override suspend fun clearAll() {
        movieDao.deleteAllMovies()
    }
}