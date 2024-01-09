package com.example.cleanarchtestadavance.presentation.di

import com.example.cleanarchtestadavance.data.repository.artist.ArtistRepositoryImpl
import com.example.cleanarchtestadavance.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.cleanarchtestadavance.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.cleanarchtestadavance.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.cleanarchtestadavance.data.repository.movie.datasource.MovieCacheDataSource
import com.example.cleanarchtestadavance.data.repository.movie.datasource.MovieLocalDataSource
import com.example.cleanarchtestadavance.data.repository.movie.datasource.MovieRemoteDataSource
import com.example.cleanarchtestadavance.data.repository.movie.MovieRepositoryImpl
import com.example.cleanarchtestadavance.data.repository.tvshow.TvShowRepositoryImpl
import com.example.cleanarchtestadavance.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.example.cleanarchtestadavance.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.cleanarchtestadavance.data.repository.tvshow.datasource.TvShowRemoteDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieCacheDataSource: MovieCacheDataSource,
        movieLocalDataSource: MovieLocalDataSource
    ): MovieRepositoryImpl {

        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieCacheDataSource,
            movieLocalDataSource
        )
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
        tvShowRemoteDataSource: TvShowRemoteDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource
    ): TvShowRepositoryImpl {

        return TvShowRepositoryImpl(
            tvShowRemoteDataSource, tvShowCacheDataSource, tvShowLocalDataSource
        )
    }

    @Singleton
    @Provides
    fun provideArtistRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistCacheDataSource: ArtistCacheDataSource,
        artistLocalDataSource: ArtistLocalDataSource
    ): ArtistRepositoryImpl {

        return ArtistRepositoryImpl(
            artistRemoteDataSource, artistCacheDataSource, artistLocalDataSource
        )
    }
}