package com.bis.Expence.ui.fragment
//fragment_grocery
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.bis.Expence.R
import com.bis.Expence.data.network.viewModel.MistryViewModel
import com.bis.Expence.databinding.FragmentDailyBinding
import com.bis.Expence.databinding.FragmentGroceryBinding
import com.bis.Expence.databinding.FragmentHomeBinding
import com.bis.Expence.ui.base.BaseFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GroceryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GroceryFragment : BaseFragment(){
    lateinit var binding: FragmentGroceryBinding
    private val mistryViewModel: MistryViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
      /*  binding = DataBindingUtil.inflate(inflater, R.layout.fragment_grocery, container, false)
        binding.lifecycleOwner = this*/
        binding= FragmentGroceryBinding.inflate(layoutInflater)
        val view = binding.root
        viewOnClick()
        return view
    }

    private fun viewOnClick() {

    }



}