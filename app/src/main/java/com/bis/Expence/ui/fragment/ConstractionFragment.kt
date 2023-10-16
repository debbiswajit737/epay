package com.bis.Expence.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.bis.Expence.R
import com.bis.Expence.Utils.Tag
import com.bis.Expence.Utils.Tag.Test.API_TAG
import com.bis.Expence.data.adapter.ExpenceAdapter
import com.bis.Expence.data.network.viewModel.MistryViewModel
import com.bis.Expence.databinding.FragmentConstractionBinding
import com.bis.Expence.databinding.FragmentDailyBinding
import com.bis.Expence.databinding.FragmentHomeBinding
import com.bis.Expence.ui.base.BaseFragment
import java.lang.Exception

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