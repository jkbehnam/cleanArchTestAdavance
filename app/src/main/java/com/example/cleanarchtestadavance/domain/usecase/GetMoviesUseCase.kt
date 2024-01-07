package com.example.cleanarchtestadavance.domain.usecase

import com.example.cleanarchtestadavance.data.model.movie.Movie
import com.example.cleanarchtestadavance.domain.repository.MovieRepository

class GetMoviesUseCase(val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>?=movieRepository.getMovies()
}