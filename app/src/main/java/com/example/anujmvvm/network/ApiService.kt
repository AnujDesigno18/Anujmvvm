package com.example.anujmvvm.network

import com.example.anujmvvm.model.EntriesResponse
import retrofit2.http.GET

interface ApiService {

    @GET("entries")
    suspend fun entries():EntriesResponse
}