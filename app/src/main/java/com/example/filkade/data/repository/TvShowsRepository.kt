package com.example.filkade.data.repository

import com.example.filkade.data.service.ApiService
import javax.inject.Inject

class TvShowsRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getTvShows() = apiService.getTvShows()
}