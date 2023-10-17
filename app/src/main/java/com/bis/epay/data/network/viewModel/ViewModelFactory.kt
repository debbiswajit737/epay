package com.bis.epay.data.network.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bis.epay.data.network.repository.MistryRepository

class ViewModelFactory(private val repository: MistryRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return when {
            modelClass.isAssignableFrom(MistryViewModel::class.java) -> MistryViewModel(
                repository as MistryRepository
            ) as T

            else -> throw IllegalArgumentException("ViewModelClass Not found")
        }



    }
}