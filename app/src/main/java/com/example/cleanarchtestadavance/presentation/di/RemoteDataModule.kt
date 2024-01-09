package com.example.cleanarchtestadavance.presentation.di

import com.example.cleanarchtestadavance.data.api.TMDBService
import com.example.cleanarchtestadavance.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.cleanarchtestadavance.data.repository.artist.datasourceimpl.ArtistRemoteDataSourceImpl
import com.example.cleanarchtestadavance.data.repository.movie.datasource.MovieRemoteDataSource
import com.example.cleanarchtestadavance.data.repository.movie.datasourceimpl.MovieRemoteDataSourceImpl
import com.example.cleanarchtestadavance.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.example.cleanarchtestadavance.data.repository.tvshow.datasourceimpl.TvShowRemoteDataSourceImpl
import dagger.Module

@Module
class RemoteDataModule(private val apiKey:String) {
    fun provideMovieRemoteDataSource(tmdbService: TMDBService):MovieRemoteDataSource{
        return  MovieRemoteDataSourceImpl(tmdbService,apiKey)
    }
    fun provideTvShowRemoteDataSource(tmdbService: TMDBService):TvShowRemoteDataSource{
        return  TvShowRemoteDataSourceImpl(tmdbService,apiKey)
    }
    fun provideArtistRemoteDataSource(tmdbService: TMDBService):ArtistRemoteDataSource{
        return  ArtistRemoteDataSourceImpl(tmdbService,apiKey)
    }
}