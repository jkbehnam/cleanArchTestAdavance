package com.example.cleanarchtestadavance.data.repository.tvshow.datasource

import com.example.cleanarchtestadavance.data.model.movie.Movie
import com.example.cleanarchtestadavance.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowToCache(movies:List<TvShow>)
}