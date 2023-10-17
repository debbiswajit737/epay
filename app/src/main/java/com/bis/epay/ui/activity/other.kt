package com.bis.epay.ui.activity

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

import com.bis.epay.R

import com.bis.epay.data.network.ApiInterface
import com.bis.epay.data.network.ApiUtility
import com.bis.epay.data.network.repository.MistryRepository
import com.bis.epay.data.network.viewModel.MistryViewModel
import com.bis.epay.data.network.viewModel.ViewModelFactory
import com.bis.epay.ui.base.BaseActivity

class other : BaseActivity() {
    lateinit var mistryViewModel: MistryViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        val apiInterface= ApiUtility.getInstance().create(ApiInterface::class.java)
        val mistryRepository= MistryRepository(apiInterface)
        mistryViewModel= ViewModelProvider(this, ViewModelFactory(mistryRepository)).get(MistryViewModel::class.java)

        /*mistryViewModel.mistoryList.observe(this){
            Tag.tag(""+it.toString())
        }*/
    }
}