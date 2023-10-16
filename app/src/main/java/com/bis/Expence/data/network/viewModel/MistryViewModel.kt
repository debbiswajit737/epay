package com.bis.Expence.data.network.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bis.Expence.data.model.MistoryDetails
import com.bis.Expence.data.model.OtherDetails
import com.bis.Expence.data.network.repository.MistryRepository
import kotlinx.coroutines.launch

class MistryViewModel(private val repository: MistryRepository):ViewModel() {
    /*fun getExpence(){
        viewModelScope.launch {
            repository.getMistry()
        }
    }
    val mistoryList:LiveData<MistoryDetails> get()=repository.mistoryDetails
*/
    fun getOther(){
        viewModelScope.launch {
            repository.getOther()
        }
    }
    val otherExpenceList:LiveData<OtherDetails> get()=repository.otherDetails

}