package com.clickEat.ug.screens.resturants

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.data.Restaurant
import com.clickEat.ug.databinding.ResturantsBinding

class RestaurantMainAdapter(val clickListener: RestaurantListener):
        ListAdapter<Restaurant, RestaurantMainAdapter.ViewHolder>(RestaurantDiffCallback()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, clickListener)
    }

    class ViewHolder private constructor(val binding: ResturantsBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: Restaurant, clickListener: RestaurantListener){
            binding.rest = item
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ResturantsBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}

class RestaurantDiffCallback : DiffUtil.ItemCallback<Restaurant>(){
    override fun areItemsTheSame(oldItem: Restaurant, newItem: Restaurant): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Restaurant, newItem: Restaurant): Boolean {
        return oldItem == newItem
    }
}

class RestaurantListener(val clickListener: (restaurant: Restaurant) -> Unit){
    fun onClick(rest:Restaurant) = clickListener(rest)
}