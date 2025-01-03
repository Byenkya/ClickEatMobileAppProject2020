package com.clickEat.ug.screens.orders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.data.CustomerPlaceOrder
import com.clickEat.ug.databinding.OrderItemLayoutBinding

class OrdersRecyclerAdapter(private val showOrder: OrderInformation):
        androidx.recyclerview.widget.ListAdapter<CustomerPlaceOrder, OrdersRecyclerAdapter.ViewHolder>(OrderDiffCallback()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrdersRecyclerAdapter.ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: OrdersRecyclerAdapter.ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, showOrder)
    }

    class ViewHolder private constructor(val binding: OrderItemLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: CustomerPlaceOrder, orderDetails: OrderInformation){
            binding.order = item
            binding.orderDetails = orderDetails
            binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup): ViewHolder{
                val layoutInflater = LayoutInflater.from(parent.context!!)
                val binding = OrderItemLayoutBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}

class OrderDiffCallback: DiffUtil.ItemCallback<CustomerPlaceOrder>(){
    override fun areItemsTheSame(oldItem: CustomerPlaceOrder, newItem: CustomerPlaceOrder): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: CustomerPlaceOrder, newItem: CustomerPlaceOrder): Boolean {
        return oldItem.id == newItem.id
    }
}

class OrderInformation(val showOrderDetails: (order: CustomerPlaceOrder)-> Unit){
    fun showOrderWithDetails(item: CustomerPlaceOrder) = showOrderDetails(item)
}

