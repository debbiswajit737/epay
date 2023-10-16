package com.bis.Expence.data.network

import com.bis.Expence.data.model.MistoryDetails
import com.bis.Expence.data.model.OtherDetails
import okhttp3.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {
    @FormUrlEncoded
    @POST("exec")
    suspend fun getMistry(@Field("action")  param1:String) : retrofit2.Response<MistoryDetails>

    @FormUrlEncoded
    @POST("exec")
    suspend fun getOther(@Field("action")  param1:String) : retrofit2.Response<OtherDetails>

}