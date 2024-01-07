package com.example.cleanarchtestadavance.data.repository.movie

import com.example.cleanarchtestadavance.data.db.MovieDao
import com.example.cleanarchtestadavance.data.model.movie.Movie

class MovieLocalDataSourceImpl(val movieDao: MovieDao) : MovieLocalDataSource {
    override suspend fun getMvieFromDB(): List<Movie> {
        return movieDao.getAllMovies()
    }

    override suspend fun saveMovieToDB(movies: List<Movie>) {
        movieDao.saveMovies(movies)
    }

    override suspend fun clearAll() {
        movieDao.deleteAllMovies()
    }
}