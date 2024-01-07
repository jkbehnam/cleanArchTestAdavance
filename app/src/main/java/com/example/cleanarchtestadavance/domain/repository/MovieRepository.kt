package com.example.cleanarchtestadavance.domain.repository

import com.example.cleanarchtestadavance.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?
}