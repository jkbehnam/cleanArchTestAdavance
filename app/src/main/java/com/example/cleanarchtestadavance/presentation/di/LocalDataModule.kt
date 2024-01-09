package com.example.cleanarchtestadavance.presentation.di

import com.example.cleanarchtestadavance.data.db.ArtistDao
import com.example.cleanarchtestadavance.data.db.MovieDao
import com.example.cleanarchtestadavance.data.db.TvShowDao
import com.example.cleanarchtestadavance.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.cleanarchtestadavance.data.repository.artist.datasourceimpl.ArtistLocalDataSourceImpl
import com.example.cleanarchtestadavance.data.repository.movie.datasource.MovieLocalDataSource
import com.example.cleanarchtestadavance.data.repository.movie.datasourceimpl.MovieLocalDataSourceImpl
import com.example.cleanarchtestadavance.data.repository.movie.datasourceimpl.MovieRemoteDataSourceImpl
import com.example.cleanarchtestadavance.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.cleanarchtestadavance.data.repository.tvshow.datasourceimpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {
    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {

        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShow: TvShowDao): TvShowLocalDataSource {

        return TvShowLocalDataSourceImpl(tvShow)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource {

        return ArtistLocalDataSourceImpl(artistDao)
    }
}