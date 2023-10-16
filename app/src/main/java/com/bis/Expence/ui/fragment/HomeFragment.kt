package com.bis.Expence.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.viewpager2.widget.ViewPager2

import com.bis.Expence.R
import com.bis.Expence.Utils.HorizontalMarginItemDecoration
import com.bis.Expence.data.adapter.BannerViewpagerAdapter
import com.bis.Expence.data.model.ListIcon
import com.bis.Expence.data.network.viewModel.MistryViewModel
import com.bis.Expence.databinding.ActivityMainBinding
import com.bis.Expence.databinding.FragmentHomeBinding
import com.bis.Expence.ui.base.BaseFragment


class HomeFragment : BaseFragment(){
    var iconList= ArrayList<ListIcon>()
    lateinit var binding: FragmentHomeBinding
    private val mistryViewModel: MistryViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        /*binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.lifecycleOwner = this*/

        binding= FragmentHomeBinding.inflate(layoutInflater)
        val view = binding.root
        init()
        viewOnClick()
        return view
    }

    private fun viewOnClick() {

    }

    fun init(){

            iconList.add(ListIcon("Card", R.drawable.b1))
            iconList.add(ListIcon("Card", R.drawable.b3))
            iconList.add(ListIcon("Card", R.drawable.card))
            iconList.add(ListIcon("Card", R.drawable.card2))
            iconList.add(ListIcon("Card", R.drawable.b2))
            iconList.add(ListIcon("Card", R.drawable.card2))
            iconList.add(ListIcon("Card", R.drawable.card))
            iconList.add(ListIcon("Card", R.drawable.card2))


            binding.viewPager2.apply {
                val scaleMin = 0.32f // Minimum scale
                val scaleMax = 0.45f // Maximum scale
                setupCarousel(this,scaleMin, scaleMax)
                //offscreenPageLimit = 3
                /* setPageTransformer { page, position ->
                     page.translationX =
                         -position * (page.width / 3f)
                 }*/
                adapter = BannerViewpagerAdapter(iconList)

                currentItem = 2

            }

    }
    fun setupCarousel(
        viewPager: ViewPager2,
        minScale: Float = 0.35f,
        nextItemAlpha: Float = 0.5f
    ) {
        viewPager.offscreenPageLimit = 1

        val nextItemVisiblePx =
            viewPager.context.resources.getDimension(R.dimen.viewpager_next_item_visible)
        val currentItemHorizontalMarginPx =
            viewPager.context.resources.getDimension(R.dimen.viewpager_current_item_horizontal_margin)
        val pageTranslationX = nextItemVisiblePx + currentItemHorizontalMarginPx
        val pageTransformer = ViewPager2.PageTransformer { page: View, position: Float ->
            page.translationX = -pageTranslationX * position

            //get x-y ratio
            val ratio = page.scaleX / page.scaleY
            // Next line scales the item's height. You can remove it if you don't want this effect
            page.scaleY = 1 - (minScale * Math.abs(position))
            // Next line scales the item's width. You can remove it if you don't want this effect
            /*if (!(ratio * page.scaleY).isNaN())
                page.scaleX = ratio * page.scaleY
            else
                page.scaleX = 1 - (minScale * abs(position))*/
            page.scaleX = 1 - (minScale * Math.abs(position))

            // If you want a fading effect uncomment the next line:
            page.alpha = nextItemAlpha + (1 - Math.abs(position))
            page.elevation = -Math.abs(position)
        }
        viewPager.setPageTransformer(pageTransformer)

        //// The ItemDecoration gives the current (centered) item horizontal margin so that
        //// it doesn't occupy the whole screen width. Without it the items overlap
        val itemDecoration = HorizontalMarginItemDecoration(
            viewPager.context,
            R.dimen.viewpager_current_item_horizontal_margin
        )
        viewPager.addItemDecoration(itemDecoration)

    }


}