package com.clickEat.ug.screens.drinks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.data.DrinkSubCategories
import com.clickEat.ug.databinding.DrinksSubcatitemLayoutBinding

class DrinksRecyclerAdapter(private val drinksListener: OnClickDrinkListener):
    androidx.recyclerview.widget.ListAdapter<DrinkSubCategories, DrinksRecyclerAdapter.ViewHolder>(DrinksDiffCallback()){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DrinksRecyclerAdapter.ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: DrinksRecyclerAdapter.ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, drinksListener)
    }

    class ViewHolder private constructor(val binding: DrinksSubcatitemLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: DrinkSubCategories, drinksListener: OnClickDrinkListener){
            binding.subCategory = item
            binding.subCat = drinksListener
            binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup): ViewHolder{
                val layoutInflater = LayoutInflater.from(parent.context!!)
                val binding = DrinksSubcatitemLayoutBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}

class DrinksDiffCallback: DiffUtil.ItemCallback<DrinkSubCategories>(){
    override fun areItemsTheSame(
        oldItem: DrinkSubCategories,
        newItem: DrinkSubCategories
    ): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(
        oldItem: DrinkSubCategories,
        newItem: DrinkSubCategories
    ): Boolean {
        return oldItem.sub_category_id == newItem.sub_category_id
    }
}

class OnClickDrinkListener(val clickListener: (product: DrinkSubCategories) -> Unit){
    fun onClick(item: DrinkSubCategories) = clickListener(item)
}