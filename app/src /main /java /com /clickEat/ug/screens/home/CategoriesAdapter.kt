package com.clickEat.ug.screens.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.databinding.CustomCategoriesLayoutBinding


class CategoriesAdapter(val categories: List<String>,val clickListener: CategoriesListener): ListAdapter<String, CategoriesAdapter.ViewHolder>(CategoriesDiffCallback()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(categories[position]!!, clickListener)
    }


    class ViewHolder private constructor(val binding: CustomCategoriesLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: String, clickListener: CategoriesListener) {
            binding.cat = item
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = CustomCategoriesLayoutBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

}

class CategoriesDiffCallback : DiffUtil.ItemCallback<String>(){
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
       return oldItem == newItem
    }

}


class CategoriesListener(val clickListener: (category:String) -> Unit){
    fun onClick(cat: String) = clickListener(cat)
}

