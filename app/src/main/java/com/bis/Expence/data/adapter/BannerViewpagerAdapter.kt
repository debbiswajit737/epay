package com.bis.Expence.data.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bis.Expence.data.model.ListIcon
import com.bis.Expence.databinding.BannerItemsBinding


class BannerViewpagerAdapter(private val items: List<ListIcon>) : RecyclerView.Adapter<BannerViewpagerAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        /*val view = LayoutInflater.from(parent.context).inflate(R.layout.banner_items, parent, false)
        return MyViewHolder(view)*/
       /* val binding = BannerItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding.root)*/


        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: BannerItemsBinding = BannerItemsBinding.inflate(layoutInflater, parent, false)
        return MyViewHolder(binding)
    }



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }




    inner class MyViewHolder(binding: BannerItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val binding: BannerItemsBinding

        init {
            this.binding = binding
        }

        fun bind(item: ListIcon) {
            binding.imgBanner.setImageResource(item.image)

        }
    }


}