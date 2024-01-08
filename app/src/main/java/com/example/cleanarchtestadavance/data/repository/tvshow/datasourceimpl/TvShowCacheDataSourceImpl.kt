package com.example.cleanarchtestadavance.data.repository.tvshow.datasourceimpl

import com.example.cleanarchtestadavance.data.model.tvshow.TvShow
import com.example.cleanarchtestadavance.data.repository.tvshow.datasource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl: TvShowCacheDataSource {
    var tvShowList=ArrayList<TvShow>()
    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowToCache(tvShows: List<TvShow>) {
        tvShowList=ArrayList(tvShows)
    }
}