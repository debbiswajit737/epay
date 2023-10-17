package com.bis.epay.data.network.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bis.epay.data.model.OtherDetails
import com.bis.epay.data.network.repository.MistryRepository
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