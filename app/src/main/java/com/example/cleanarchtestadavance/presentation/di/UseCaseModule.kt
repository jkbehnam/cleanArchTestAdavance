package com.example.cleanarchtestadavance.presentation.di

import com.example.cleanarchtestadavance.domain.repository.ArtistRepository
import com.example.cleanarchtestadavance.domain.repository.MovieRepository
import com.example.cleanarchtestadavance.domain.repository.TvShowRepository
import com.example.cleanarchtestadavance.domain.usecase.GetArtistsUseCase
import com.example.cleanarchtestadavance.domain.usecase.GetMoviesUseCase
import com.example.cleanarchtestadavance.domain.usecase.GetTvShowsUseCase
import com.example.cleanarchtestadavance.domain.usecase.UpdateArtistsUseCase
import com.example.cleanarchtestadavance.domain.usecase.UpdateMoviesUseCase
import com.example.cleanarchtestadavance.domain.usecase.UpdateTvShowsUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {
    @Provides
   fun provideGetMovieUseCase(movieRepository: MovieRepository):GetMoviesUseCase{
       return GetMoviesUseCase(movieRepository)
   }
    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository):UpdateMoviesUseCase{
        return UpdateMoviesUseCase(movieRepository)
    }
    @Provides
    fun provideGetTvShowUseCase(tvShowRepository: TvShowRepository):GetTvShowsUseCase{
        return GetTvShowsUseCase(tvShowRepository)
    }
    @Provides
    fun provideUpdateTvShowUseCase(tvShowRepository: TvShowRepository):UpdateTvShowsUseCase{
        return UpdateTvShowsUseCase(tvShowRepository)
    }
    @Provides
    fun provideGetArtistUseCase(artistRepository: ArtistRepository):GetArtistsUseCase{
        return GetArtistsUseCase(artistRepository)
    }
    @Provides
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository):UpdateArtistsUseCase{
        return UpdateArtistsUseCase(artistRepository)
    }


}