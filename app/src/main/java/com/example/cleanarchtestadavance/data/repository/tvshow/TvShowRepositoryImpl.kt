package com.example.cleanarchtestadavance.data.repository.tvshow

import com.example.cleanarchtestadavance.data.model.tvshow.TvShow
import com.example.cleanarchtestadavance.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.example.cleanarchtestadavance.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.cleanarchtestadavance.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.example.cleanarchtestadavance.domain.repository.TvShowRepository

class TvShowRepositoryImpl(
    private val tvShowRemoteDataSource: TvShowRemoteDataSource,
    private val tvShowCacheDataSource: TvShowCacheDataSource,
    private val tvShowLocalDataSource: TvShowLocalDataSource
) : TvShowRepository {


    override suspend fun getTvShows(): List<TvShow>? {
        return getTvShowsFromCashe()
    }

    override suspend fun updateTvShows(): List<TvShow>? {
        val newListOfTvShow=getTvShowFromAPI()
        tvShowLocalDataSource.clearAll()
        tvShowLocalDataSource.saveTvShowToDB(newListOfTvShow)
        tvShowCacheDataSource.saveTvShowToCache(newListOfTvShow)
        return newListOfTvShow
    }

    private suspend fun getTvShowFromAPI(): List<TvShow> {
        lateinit var tvShowList: List<TvShow>

        try {
            val response = tvShowRemoteDataSource.getTvShows()
            val body = response.body()
            if (body != null) {
                tvShowList = body.tvShows
            }
        } catch (exp: Exception) {

        }
        return tvShowList
    }

    private suspend fun getTvShowsFromDB(): List<TvShow> {

        lateinit var tvShowList: List<TvShow>

        try {
            tvShowList = tvShowLocalDataSource.getTvShowFromDB()

        } catch (exp: Exception) {
        }

        if (tvShowList.size > 0)
            return tvShowList
        else {
            tvShowList = getTvShowFromAPI()
            tvShowLocalDataSource.saveTvShowToDB(tvShowList)
        }
        return tvShowList
    }
    suspend fun getTvShowsFromCashe():List<TvShow>{

        lateinit var tvShowList: List<TvShow>

        try {
            tvShowList=tvShowCacheDataSource.getTvShowsFromCache()

        }catch (exp:Exception){


        }

        if (tvShowList.size>0)
        {
            return tvShowList

        }else{
            tvShowList=getTvShowsFromDB()
            tvShowCacheDataSource.saveTvShowToCache(tvShowList)
        }

        return tvShowList


    }
}