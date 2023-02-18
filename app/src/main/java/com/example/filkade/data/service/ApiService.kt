package com.example.filkade.data.service

import com.example.filkade.data.model.TvShowsResponse
import com.example.filkade.utils.Constant
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET(Constant.END_POINT)
    suspend fun getTvShows():Response<TvShowsResponse>
}