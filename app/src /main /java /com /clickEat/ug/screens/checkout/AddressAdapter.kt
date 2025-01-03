package com.clickEat.ug.screens.checkout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.data.CustomerAddress
import com.clickEat.ug.databinding.AddressItemLayoutBinding

class AddressRecyclerView(
        private val clickListener: AddressListener,
        private val editListener: EditLocationListener,
        private val deleteListener: DeleteLocationListener
):
        androidx.recyclerview.widget.ListAdapter<CustomerAddress, AddressRecyclerView.ViewHolder>((AddressCallback())){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AddressRecyclerView.ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: AddressRecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, clickListener, editListener, deleteListener)
    }

    class ViewHolder private constructor(val binding: AddressItemLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: CustomerAddress, clickListener: AddressListener, editListener: EditLocationListener, deleteListener: DeleteLocationListener){
            binding.item = item
            binding.clickListener = clickListener
            binding.editListener = editListener
            binding.deleteListener = deleteListener
            binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup):ViewHolder{
                val layoutInflater = LayoutInflater.from(parent!!.context)
                val binding = AddressItemLayoutBinding.inflate(layoutInflater)
                return ViewHolder(binding)
            }
        }
    }
}

class AddressCallback: DiffUtil.ItemCallback<CustomerAddress>(){
    override fun areItemsTheSame(oldItem: CustomerAddress, newItem: CustomerAddress): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: CustomerAddress, newItem: CustomerAddress): Boolean {
        return oldItem.id == newItem.id
    }
}

class AddressListener(val clickListener: (id:Int)-> Unit){
    fun onClick(item: CustomerAddress) = clickListener(item.id)
}

class EditLocationListener(val clickListener: (item: CustomerAddress) -> Unit){
    fun onClick(item: CustomerAddress) = clickListener(item)
}

class DeleteLocationListener(val clickListener: (id:Int)-> Unit){
    fun onClick(item: CustomerAddress) = clickListener(item.id)
}