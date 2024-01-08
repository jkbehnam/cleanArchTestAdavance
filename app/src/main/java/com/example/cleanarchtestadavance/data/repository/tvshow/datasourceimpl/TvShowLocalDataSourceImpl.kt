package com.example.cleanarchtestadavance.data.repository.tvshow.datasourceimpl

import com.example.cleanarchtestadavance.data.db.TvShowDao
import com.example.cleanarchtestadavance.data.model.tvshow.TvShow
import com.example.cleanarchtestadavance.data.repository.tvshow.datasource.TvShowLocalDataSource

class TvShowLocalDataSourceImpl(val tvShowDao: TvShowDao) : TvShowLocalDataSource {
    override suspend fun getTvShowFromDB(): List<TvShow> {
        return tvShowDao.getAllTvShow()
    }

    override suspend fun saveTvShowToDB(tvShows: List<TvShow>) {
        tvShowDao.saveTvShow(tvShows)
    }

    override suspend fun clearAll() {
        tvShowDao.deleteAllTvShow()
    }
}