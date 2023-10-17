package com.bis.epay.data.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.bis.epay.data.model.OtherDataValue
import com.bis.epay.databinding.ExpenceListBinding


class ExpenceAdapter(var productAttrList: List<OtherDataValue?>?) :
    RecyclerView.Adapter<ExpenceAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        //val inflater = LayoutInflater.from(parent.context)
        val listItem = ExpenceListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        //val listItem = ProductSpecificationItemBinding.inflate(inflater, parent, false)
        return ViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        productAttrList?.get(position)?.let { holder.bind(it, position, itemCount) }

    }

    class ViewHolder(val binding: ExpenceListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: OtherDataValue, position: Int, itemCount: Int) {
            binding.tvBillNo.setText("Bill No.: "+item.billNumber.toString())
            binding.tvDate.setText(item.mdate.toString())
            binding.tvDetails.setText("Details\n"+item.things.toString())
            binding.tvPrice.setText("Price : ₹"+item.price.toString())
            binding.tvQty.setText("Qty : "+item.quentity.toString())
            binding.tvDue.setText("Due : "+item.mBaki.toString())
            binding.tvRemark.setText("Remark : "+item.mRemark.toString())
            binding.tvStatus.setText("Status : "+item.mStatus.toString())

        }

    }

    override fun getItemCount() = productAttrList?.size ?: 0
}