package com.example.anujmvvm.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.anujmvvm.repository.BaseRepository
import com.example.anujmvvm.repository.EntryRepository
import com.example.anujmvvm.viewModel.EntriesViewModel
import java.lang.IllegalArgumentException

class MyFactory(private val repo: BaseRepository) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(EntriesViewModel::class.java) -> EntriesViewModel(repo as EntryRepository) as T
            else -> throw IllegalArgumentException("VIEW MODEL CLASS NOT FOUND")
        }
    }
}