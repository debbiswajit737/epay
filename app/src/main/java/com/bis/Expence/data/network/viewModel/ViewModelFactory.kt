package com.bis.Expence.data.network.viewModel

import android.view.View
import android.widget.ViewSwitcher.ViewFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bis.Expence.data.network.repository.MistryRepository

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