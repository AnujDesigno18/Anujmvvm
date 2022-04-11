package com.example.anujmvvm.repository

import com.example.anujmvvm.network.ApiService

class EntryRepository(private val  api:ApiService): BaseRepository() {

    suspend fun entryData() = safeApiCall {
        api.entries()
    }
}