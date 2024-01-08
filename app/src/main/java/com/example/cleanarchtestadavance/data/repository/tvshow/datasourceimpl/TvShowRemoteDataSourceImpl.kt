package com.example.cleanarchtestadavance.data.repository.tvshow.datasourceimpl

import com.example.cleanarchtestadavance.data.api.TMDBService
import com.example.cleanarchtestadavance.data.model.tvshow.TvShowList
import com.example.cleanarchtestadavance.data.repository.tvshow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(val tmdbService: TMDBService, val apiKey: String) :
    TvShowRemoteDataSource {
    override suspend fun getTvShows(): Response<TvShowList> {
        return tmdbService.getPopularTvShow(apiKey)
    }
}