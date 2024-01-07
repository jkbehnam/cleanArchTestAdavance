package com.example.cleanarchtestadavance.domain.usecase

import com.example.cleanarchtestadavance.data.model.tvshow.TvShow
import com.example.cleanarchtestadavance.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.updateTvShows()


}