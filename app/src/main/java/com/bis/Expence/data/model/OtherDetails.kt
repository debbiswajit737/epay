package com.bis.Expence.data.model

import com.google.gson.annotations.SerializedName

data class OtherDetails(
    @SerializedName("otherDataValue") var otherDataValue: ArrayList<OtherDataValue> = arrayListOf()
)


data class OtherDataValue(

    @SerializedName("mdate") var mdate: String? = null,
    @SerializedName("things") var things: String? = null,
    @SerializedName("quentity") var quentity: String? = null,
    @SerializedName("billNumber") var billNumber: String? = null,
    @SerializedName("price") var price: String? = null,
    @SerializedName("mBaki") var mBaki: String? = null,
    @SerializedName("mRemark") var mRemark: String? = null,
    @SerializedName("mStatus") var mStatus: String? = null

)
