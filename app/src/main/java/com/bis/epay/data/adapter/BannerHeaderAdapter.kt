package com.bis.epay.data.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.bis.epay.data.model.ListIcon
import com.bis.epay.databinding.BannerItemsBinding
import com.bis.epay.databinding.BannerItemsLayoutBinding


class BannerHeaderAdapter(private val items: List<ListIcon>) : RecyclerView.Adapter<BannerHeaderAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        /*val view = LayoutInflater.from(parent.context).inflate(R.layout.banner_items, parent, false)
        return MyViewHolder(view)*/
       /* val binding = BannerItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding.root)*/

        //banner_items_layout
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: BannerItemsLayoutBinding = BannerItemsLayoutBinding.inflate(layoutInflater, parent, false)
        return MyViewHolder(binding)
    }



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }




    inner class MyViewHolder(binding: BannerItemsLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val binding: BannerItemsLayoutBinding

        init {
            this.binding = binding
        }

        fun bind(item: ListIcon) {
            item.image?.let {image->
                binding.image.setImageResource(image)
            }
        }
    }


}