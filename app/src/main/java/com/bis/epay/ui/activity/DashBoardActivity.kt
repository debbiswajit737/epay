package com.bis.epay.ui.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.bis.epay.R


import com.bis.epay.data.network.ApiInterface
import com.bis.epay.data.network.ApiUtility
import com.bis.epay.data.network.repository.MistryRepository
import com.bis.epay.data.network.viewModel.MistryViewModel
import com.bis.epay.data.network.viewModel.ViewModelFactory
import com.bis.epay.databinding.ActivityDashBoardBinding


class DashBoardActivity : AppCompatActivity() {
    private lateinit var activityDashBoardBinding: ActivityDashBoardBinding
    var navController: NavController?= null
    lateinit var mistryViewModel: MistryViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initFun()

    }

    private fun initFun() {
        val apiInterface=ApiUtility.getInstance().create(ApiInterface::class.java)
        val mistryRepository= MistryRepository(apiInterface)
        mistryViewModel=ViewModelProvider(this,ViewModelFactory(mistryRepository)).get(MistryViewModel::class.java)

        /*mistryViewModel.mistoryList.observe(this){
            Tag.tag(""+it.toString())
        }*/

        //setContentView(R.layout.activity_dash_board)
        activityDashBoardBinding= ActivityDashBoardBinding.inflate(getLayoutInflater());

        val navHostFragment: NavHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        val view: View = activityDashBoardBinding.root
        setContentView(view)

        activityDashBoardBinding.bottomNav.setOnItemSelectedListener {


            when (it.itemId) {
                R.id.home -> {
                   // navController?.navigate(R.id.homeFragment, null)
                    true
                }
                R.id.constraction->{
                  //  navController?.navigate(R.id.constractionFragment)
                    true
                }
                R.id.daily_market->{
                 //   navController?.navigate(R.id.dailyFragment)
                    true
                }

                else -> {
                  //  navController?.navigate(R.id.groceryFragment)
                    true
                }
            }

        }

       /* activityDashBoardBinding.bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(firstFragment)
                else -> {}
            }
        }*/
    }
}