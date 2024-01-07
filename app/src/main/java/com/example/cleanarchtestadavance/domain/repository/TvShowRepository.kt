package com.example.cleanarchtestadavance.domain.repository

import com.example.cleanarchtestadavance.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}