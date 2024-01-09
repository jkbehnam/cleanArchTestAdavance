package com.example.cleanarchtestadavance.presentation.di

import com.example.cleanarchtestadavance.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.cleanarchtestadavance.data.repository.artist.datasourceimpl.ArtistCacheDataSourceImpl
import com.example.cleanarchtestadavance.data.repository.movie.datasource.MovieCacheDataSource
import com.example.cleanarchtestadavance.data.repository.movie.datasourceimpl.MovieCacheDataSourceImpl
import com.example.cleanarchtestadavance.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.example.cleanarchtestadavance.data.repository.tvshow.datasourceimpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CasheDataModule {
    @Singleton
    @Provides
    fun provideMovieCasheDataSource():MovieCacheDataSource{

        return MovieCacheDataSourceImpl()
    }
    @Singleton
    @Provides
    fun provideTvShowCasheDataSource(): TvShowCacheDataSource {

        return TvShowCacheDataSourceImpl()
    }
    @Singleton
    @Provides
    fun provideArtistCasheDataSource():ArtistCacheDataSource{

        return ArtistCacheDataSourceImpl()
    }
}