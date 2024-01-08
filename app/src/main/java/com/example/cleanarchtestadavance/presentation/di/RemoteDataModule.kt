package com.example.cleanarchtestadavance.presentation.di

import com.example.cleanarchtestadavance.data.api.TMDBService
import com.example.cleanarchtestadavance.data.repository.movie.datasource.MovieRemoteDataSource
import dagger.Module

@Module
class RemoteDataModule(private val apiKey:String) {

}