package com.example.cleanarchtestadavance.presentation.di

import dagger.Component

@Component(modules = [AppModule::class, NetModule::class, DataBaseModule::class,
UseCaseModule::class,
RepositoryModule::class,
RemoteDataModule::class,
LocalDataModule::class,
CasheDataModule::class,


])
interface AppComponent {
}