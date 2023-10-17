package com.bis.epay.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.bis.epay.R


import com.bis.epay.Utils.Tag.Test.API_TAG
import com.bis.epay.data.adapter.ExpenceAdapter
import com.bis.epay.data.network.viewModel.MistryViewModel
import com.bis.epay.databinding.FragmentConstractionBinding

import com.bis.epay.ui.base.BaseFragment

//fragment_constraction
class ConstractionFragment : BaseFragment(){
    lateinit var binding: FragmentConstractionBinding
    private val mistryViewModel: MistryViewModel by activityViewModels()
    //var mistryViewModel: MistryViewModel?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        /*binding = DataBindingUtil.inflate(inflater, R.layout.fragment_constraction, container, false)
        binding.lifecycleOwner = this*/
        binding= FragmentConstractionBinding.inflate(layoutInflater)
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
                binding.regExp.adapter= ExpenceAdapter(it.otherDataValue)
                binding.regExp.isFocusable = false
        }
 }

    private fun initFun() {
        API_TAG="getother"
        mistryViewModel.getOther()
    }
    private fun viewOnClick() {
        binding.addExpence.setOnClickListener{
           findNavController().navigate(R.id.action_constractionFragment_to_addConstractionFragment)
        }
    }
}