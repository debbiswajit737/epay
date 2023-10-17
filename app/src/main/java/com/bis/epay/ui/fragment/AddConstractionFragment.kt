package com.bis.epay.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels

import com.bis.epay.Utils.Tag
import com.bis.epay.data.network.viewModel.MistryViewModel
import com.bis.epay.databinding.FragmentAddConstractionBinding

import com.bis.epay.ui.base.BaseFragment
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