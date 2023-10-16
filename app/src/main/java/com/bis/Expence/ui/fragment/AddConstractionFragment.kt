package com.bis.Expence.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.bis.Expence.R
import com.bis.Expence.Utils.Tag
import com.bis.Expence.data.adapter.ExpenceAdapter
import com.bis.Expence.data.network.viewModel.MistryViewModel
import com.bis.Expence.databinding.FragmentAddConstractionBinding
import com.bis.Expence.databinding.FragmentConstractionBinding
import com.bis.Expence.ui.base.BaseFragment
//fragment_add_constraction
class AddConstractionFragment : BaseFragment(){
    lateinit var binding: FragmentAddConstractionBinding
    private val mistryViewModel: MistryViewModel by activityViewModels()
    //var mistryViewModel: MistryViewModel?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        /*binding = DataBindingUtil.inflate(inflater, R.layout.fragment_constraction, container, false)
        binding.lifecycleOwner = this*/
        binding= FragmentAddConstractionBinding.inflate(layoutInflater)
        /* activity?.run {
             mistryViewModel = ViewModelProvider(requireActivity()).get(MistryViewModel::class.java)
             //mistryViewModel = ViewModelProvider(this)[MistryViewModel::class.java]
         }*/
        initFun()
        observer()
        viewOnClick()
        val view = binding.root



        return view
    }

    private fun observer() {

        mistryViewModel.otherExpenceList.observe(viewLifecycleOwner){
            var data=it.otherDataValue
            Log.d("TAG_id", "observer: "+data[data.size-1].mBaki)
        }
    }

    private fun initFun() {
        Tag.API_TAG ="getother"
        mistryViewModel.getOther()
    }
    private fun viewOnClick() {

    }
}