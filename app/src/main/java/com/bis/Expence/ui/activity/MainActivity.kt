package com.bis.Expence.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.bis.Expence.R
import com.bis.Expence.Utils.Tag
import com.bis.Expence.data.network.ApiInterface
import com.bis.Expence.data.network.ApiUtility
import com.bis.Expence.data.network.repository.MistryRepository
import com.bis.Expence.data.network.viewModel.MistryViewModel
import com.bis.Expence.data.network.viewModel.ViewModelFactory
import com.bis.Expence.ui.base.BaseActivity

class MainActivity : BaseActivity() {
    lateinit var mistryViewModel: MistryViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apiInterface=ApiUtility.getInstance().create(ApiInterface::class.java)
        val mistryRepository= MistryRepository(apiInterface)
        mistryViewModel=ViewModelProvider(this,ViewModelFactory(mistryRepository)).get(MistryViewModel::class.java)

       /* mistryViewModel.mistoryList.observe(this){
        Tag.tag(""+it.toString())
        }*/
    }
}