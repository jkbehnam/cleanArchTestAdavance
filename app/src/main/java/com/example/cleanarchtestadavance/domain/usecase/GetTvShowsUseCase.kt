package com.example.cleanarchtestadavance.domain.usecase

import com.example.cleanarchtestadavance.data.model.tvshow.TvShow
import com.example.cleanarchtestadavance.domain.repository.TvShowRepository

class GetTvShowsUseCase(val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.getTvShows()


}