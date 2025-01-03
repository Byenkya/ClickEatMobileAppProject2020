package com.clickEat.ug.screens.custom_categories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.data.HomeSubCategoryDisplay
import com.clickEat.ug.databinding.HomeCategoryItemsBinding


class HomeSubCategoryAdapter(val clickListener: SubCategoriesListener)
    : ListAdapter<HomeSubCategoryDisplay, HomeSubCategoryAdapter.ViewHolder>(
    HomeSubCategoryDiffCallback()
)
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(
            parent
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, clickListener)
    }

    class ViewHolder private constructor(val binding: HomeCategoryItemsBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: HomeSubCategoryDisplay, clickListener: SubCategoriesListener){
            binding.subcat = item
            binding.subclickListener  = clickListener
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = HomeCategoryItemsBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(
                    binding
                )
            }
        }
    }
}

class HomeSubCategoryDiffCallback: DiffUtil.ItemCallback<HomeSubCategoryDisplay>(){
    override fun areItemsTheSame(oldItem: HomeSubCategoryDisplay, newItem: HomeSubCategoryDisplay): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: HomeSubCategoryDisplay, newItem: HomeSubCategoryDisplay): Boolean {
        return oldItem.id == newItem.id
    }
}

class SubCategoriesListener(val clickListener: (subcat:HomeSubCategoryDisplay)-> Unit){
    fun onClick(subcat: HomeSubCategoryDisplay) = clickListener(subcat)
}