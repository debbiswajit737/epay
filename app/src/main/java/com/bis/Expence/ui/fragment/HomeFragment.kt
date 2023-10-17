package com.bis.Expence.ui.fragment

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import androidx.fragment.app.activityViewModels
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback

import com.bis.Expence.R
import com.bis.Expence.Utils.AutoScrollHandler
import com.bis.Expence.Utils.HorizontalMarginItemDecoration
import com.bis.Expence.data.adapter.BannerViewpagerAdapter
import com.bis.Expence.data.model.ListIcon
import com.bis.Expence.data.network.viewModel.MistryViewModel
import com.bis.Expence.databinding.FragmentHomeBinding
import com.bis.Expence.ui.base.BaseFragment


class HomeFragment : BaseFragment() {
    private var isRotated = true
    private var isRotated2 = true
    private var isRotated3 = true
    private var isRotated4 = true
    private var isRotated5 = true
    var iconList = ArrayList<ListIcon>()
    var iconList2 = ArrayList<ListIcon>()
    lateinit var binding: FragmentHomeBinding
    private lateinit var autoScrollHandler: AutoScrollHandler
    private val mistryViewModel: MistryViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        /*binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.lifecycleOwner = this*/

        binding = FragmentHomeBinding.inflate(layoutInflater)
        val view = binding.root
        init()
        viewOnClick()
        return view
    }

    private fun viewOnClick() {
        binding.apply {
            rotateView(arrowImageView, 0f)
            val collapseAnimation: Animation =
                AnimationUtils.loadAnimation(requireActivity(), R.anim.collapse_animation)
            arrowImageView.setOnClickListener {

                if (isRotated) {

                    rotateView(arrowImageView, 0f)


                    val layoutParams = llContainer.layoutParams
                    layoutParams.height = 40
                    llContainer.layoutParams = layoutParams
                    llContainer.startAnimation(collapseAnimation)

                    llContainer.visibility = View.INVISIBLE

                } else {
                    rotateView(arrowImageView, 180f)
                    val layoutParams = llContainer.layoutParams
                    layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
                    llContainer.layoutParams = layoutParams
                    llContainer.visibility = View.VISIBLE
                    llContainer.startAnimation(
                        AnimationUtils.loadAnimation(
                            requireActivity(),
                            R.anim.expand_animation
                        )
                    )

                }

                isRotated = !isRotated
            }



            arrowImageView2.setOnClickListener {

                if (isRotated2) {

                    rotateView(arrowImageView2, 0f)


                    val layoutParams = linearLayout.layoutParams
                    layoutParams.height = 40
                    linearLayout.layoutParams = layoutParams
                    linearLayout.startAnimation(collapseAnimation)

                    linearLayout.visibility = View.INVISIBLE

                } else {
                    rotateView(arrowImageView2, 180f)
                    val layoutParams = linearLayout.layoutParams
                    layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
                    linearLayout.layoutParams = layoutParams
                    linearLayout.visibility = View.VISIBLE
                    linearLayout.startAnimation(
                        AnimationUtils.loadAnimation(
                            requireActivity(),
                            R.anim.expand_animation
                        )
                    )

                }

                isRotated2 = !isRotated2
            }




            arrowImageViewNew2.setOnClickListener {

                if (isRotated3) {

                    rotateView(arrowImageViewNew2, 0f)


                    val layoutParams = linearLayoutNew2.layoutParams
                    layoutParams.height = 40
                    linearLayoutNew2.layoutParams = layoutParams
                    linearLayoutNew2.startAnimation(collapseAnimation)

                    linearLayoutNew2.visibility = View.INVISIBLE

                } else {
                    rotateView(arrowImageViewNew2, 180f)
                    val layoutParams = linearLayoutNew2.layoutParams
                    layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
                    linearLayoutNew2.layoutParams = layoutParams
                    linearLayoutNew2.visibility = View.VISIBLE
                    linearLayoutNew2.startAnimation(
                        AnimationUtils.loadAnimation(
                            requireActivity(),
                            R.anim.expand_animation
                        )
                    )

                }

                isRotated3 = !isRotated3
            }


            arrowImageViewNew2.setOnClickListener {

                if (isRotated3) {

                    rotateView(arrowImageViewNew2, 0f)


                    val layoutParams = linearLayoutNew2.layoutParams
                    layoutParams.height = 40
                    linearLayoutNew2.layoutParams = layoutParams
                    linearLayoutNew2.startAnimation(collapseAnimation)

                    linearLayoutNew2.visibility = View.INVISIBLE

                } else {
                    rotateView(arrowImageViewNew2, 180f)
                    val layoutParams = linearLayoutNew2.layoutParams
                    layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
                    linearLayoutNew2.layoutParams = layoutParams
                    linearLayoutNew2.visibility = View.VISIBLE
                    linearLayoutNew2.startAnimation(
                        AnimationUtils.loadAnimation(
                            requireActivity(),
                            R.anim.expand_animation
                        )
                    )

                }

                isRotated3 = !isRotated3
            }

            arrowImageViewNew3.setOnClickListener {

                if (isRotated3) {

                    rotateView(arrowImageViewNew3, 0f)


                    val layoutParams = linearLayoutNew3.layoutParams
                    layoutParams.height = 40
                    linearLayoutNew3.layoutParams = layoutParams
                    linearLayoutNew3.startAnimation(collapseAnimation)

                    linearLayoutNew3.visibility = View.INVISIBLE

                } else {
                    rotateView(arrowImageViewNew3, 180f)
                    val layoutParams = linearLayoutNew3.layoutParams
                    layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
                    linearLayoutNew3.layoutParams = layoutParams
                    linearLayoutNew3.visibility = View.VISIBLE
                    linearLayoutNew3.startAnimation(
                        AnimationUtils.loadAnimation(
                            requireActivity(),
                            R.anim.expand_animation
                        )
                    )

                }

                isRotated3 = !isRotated3
            }


            arrowImageViewNew4.setOnClickListener {

                if (isRotated3) {

                    rotateView(arrowImageViewNew4, 0f)


                    val layoutParams = linearLayoutNew4.layoutParams
                    layoutParams.height = 40
                    linearLayoutNew4.layoutParams = layoutParams
                    linearLayoutNew4.startAnimation(collapseAnimation)

                    linearLayoutNew4.visibility = View.INVISIBLE

                } else {
                    rotateView(arrowImageViewNew4, 180f)
                    val layoutParams = linearLayoutNew4.layoutParams
                    layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
                    linearLayoutNew4.layoutParams = layoutParams
                    linearLayoutNew4.visibility = View.VISIBLE
                    linearLayoutNew4.startAnimation(
                        AnimationUtils.loadAnimation(
                            requireActivity(),
                            R.anim.expand_animation
                        )
                    )

                }

                isRotated3 = !isRotated3
            }




        }


    }

    private fun rotateView(view: View, degrees: Float) {
        val rotation = ObjectAnimator.ofFloat(view, "rotation", degrees)
        rotation.duration = 500 // Adjust the duration as needed
        rotation.start()
    }

    fun init() {

        iconList.add(ListIcon("Card", R.drawable.bb1))
        iconList.add(ListIcon("Card", R.drawable.b3))
        iconList.add(ListIcon("Card", R.drawable.card))
        iconList.add(ListIcon("Card", R.drawable.card2))
        iconList.add(ListIcon("Card", R.drawable.bb1))
        iconList.add(ListIcon("Card", R.drawable.card2))
        iconList.add(ListIcon("Card", R.drawable.card))
        iconList.add(ListIcon("Card", R.drawable.card2))
        iconList.add(ListIcon(null, null))


        binding.viewPager2.apply {
            val scaleMin = 0.32f // Minimum scale
            val scaleMax = 0.45f // Maximum scale
            setupCarousel(this, scaleMin, scaleMax)
            //offscreenPageLimit = 3
            /* setPageTransformer { page, position ->
                 page.translationX =
                     -position * (page.width / 3f)
             }*/
            adapter = BannerViewpagerAdapter(iconList)

            currentItem = 2


            registerOnPageChangeCallback(object : OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    // Check if the user scrolls to the first or last item, then perform looping.
                    if (position == 0) {
                        // Scroll to the last item.
                        // currentItem=adapter?.itemCount?.minus(1) ?: 0
                        // binding.viewPager2.setCurrentItem(adapter.getItemCount() - 1, false)
                    } else if (position == (adapter?.itemCount ?: 0)) {
                        // Scroll to the first item.
                        binding.viewPager2.setCurrentItem(0, false)
                    }
                }
            })

        }






        iconList2.add(ListIcon("Card", R.drawable.sa1))
        iconList2.add(ListIcon("Card", R.drawable.sa2))
        iconList2.add(ListIcon("Card", R.drawable.sa3))
        iconList2.add(ListIcon("Card", R.drawable.sa4))
        iconList2.add(ListIcon("Card", R.drawable.sa2))
        iconList2.add(ListIcon("Card", R.drawable.sa5))
        binding.viewPager3.apply {
            autoScrollHandler = AutoScrollHandler(this)
            adapter = BannerViewpagerAdapter(iconList2)
        }
        binding.tvMessage.isSelected = true

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

    override fun onResume() {
        super.onResume()
        autoScrollHandler.startAutoScroll()
    }

    override fun onPause() {
        super.onPause()
        autoScrollHandler.stopAutoScroll()
    }


}