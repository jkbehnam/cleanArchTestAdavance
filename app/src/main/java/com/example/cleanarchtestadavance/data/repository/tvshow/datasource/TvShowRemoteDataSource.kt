package com.example.cleanarchtestadavance.data.repository.tvshow.datasource

import com.example.cleanarchtestadavance.data.model.movie.Movie
import com.example.cleanarchtestadavance.data.model.movie.MovieList
import com.example.cleanarchtestadavance.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getTvShows():Response<TvShowList>
}