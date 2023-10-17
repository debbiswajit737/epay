package com.bis.epay.ui.fragment
//fragment_daily
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels

import com.bis.epay.data.network.viewModel.MistryViewModel
import com.bis.epay.databinding.FragmentDailyBinding

import com.bis.epay.ui.base.BaseFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DailyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DailyFragment  : BaseFragment(){
    lateinit var binding: FragmentDailyBinding
    private val mistryViewModel: MistryViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        /*binding = DataBindingUtil.inflate(inflater, R.layout.fragment_daily, container, false)
        binding.lifecycleOwner = this*/
        binding= FragmentDailyBinding.inflate(layoutInflater)
        val view = binding.root
        viewOnClick()
        return view
    }

    private fun viewOnClick() {

    }



}