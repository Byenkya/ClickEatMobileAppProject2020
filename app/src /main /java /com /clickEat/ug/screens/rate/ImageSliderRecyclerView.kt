package com.clickEat.ug.screens.rate

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.data.Product
import com.clickEat.ug.data.SelectedProduct
import com.clickEat.ug.databinding.ProductImageLayoutBinding

class ImageSliderRecyclerView(val rateViewModal: RateViewModal): ListAdapter<Product, ImageSliderRecyclerView.ViewHolder>(
    ImageSliderRecyclerViewDiffCallback()
)
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(
            parent
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(rateViewModal)
    }

    class ViewHolder private constructor(val binding: ProductImageLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(rateViewModal: RateViewModal){
            binding.invalidateAll()
            binding.viewModel = rateViewModal
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ProductImageLayoutBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(
                    binding
                )
            }
        }
    }
}

class ImageSliderRecyclerViewDiffCallback: DiffUtil.ItemCallback<Product>(){
    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.product_id == newItem.product_id
    }
}