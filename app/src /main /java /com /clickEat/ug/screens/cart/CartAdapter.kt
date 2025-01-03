package com.clickEat.ug.screens.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.data.CartItemFromServer
import com.clickEat.ug.databinding.CartItemLayoutBinding

class CartAdapter(private val updateCartInformation: UpdateCartInformation, private val deleteCartItem: DeleteCartItem):
    androidx.recyclerview.widget.ListAdapter<CartItemFromServer,CartAdapter.ViewHolder>(CartDiffCallback()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartAdapter.ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, updateCartInformation, deleteCartItem)
    }

    class ViewHolder private constructor(val binding: CartItemLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: CartItemFromServer, updateCartInfo: UpdateCartInformation, deleteCartItem: DeleteCartItem){
            binding.cartItem = item
            binding.updateCart = updateCartInfo
            binding.delCart = deleteCartItem
            binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context!!)
                val binding = CartItemLayoutBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}

class CartDiffCallback: DiffUtil.ItemCallback<CartItemFromServer>(){
    override fun areItemsTheSame(oldItem: CartItemFromServer, newItem: CartItemFromServer): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: CartItemFromServer, newItem: CartItemFromServer): Boolean {
        return oldItem.product_id == newItem.product_id
    }
}

class UpdateCartInformation(val updateCartInformation: (product: CartItemFromServer)-> Unit){
    fun updateCartInfo(item: CartItemFromServer) = updateCartInformation(item)
}

class DeleteCartItem(val deleteCartItem: (product: CartItemFromServer)-> Unit){
    fun deleteCartItemData(item: CartItemFromServer) = deleteCartItem(item)
}