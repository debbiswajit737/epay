package com.bis.epay.data.network.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bis.epay.Utils.Tag.Test.API_TAG
import com.bis.epay.data.model.MistoryDetails
import com.bis.epay.data.model.OtherDetails
import com.bis.epay.data.network.ApiInterface

class MistryRepository(private val apiInterface: ApiInterface) {
    private val _mistoryDetails=MutableLiveData<MistoryDetails>()
    val mistoryDetails : LiveData<MistoryDetails> get()=_mistoryDetails
    suspend fun getMistry(){
        val result=apiInterface.getMistry(API_TAG)
        if (result.body()!=null){
            _mistoryDetails.postValue(result.body())
        }
    }

    private val _otherDetails=MutableLiveData<OtherDetails>()
    val otherDetails : LiveData<OtherDetails> get()=_otherDetails
    suspend fun getOther(){
        val result=apiInterface.getOther(API_TAG)
        if (result.body()!=null){
            _otherDetails.postValue(result.body())
        }
    }


}