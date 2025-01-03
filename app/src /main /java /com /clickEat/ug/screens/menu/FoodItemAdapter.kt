                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     package com.clickEat.ug.screens.menu
import android.graphics.Rect
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.data.Product
import com.clickEat.ug.databinding.ItemBinding
import android.R

import android.view.animation.Animation
import android.view.animation.AnimationUtils


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     class FoodItemAdapter(
        private val showCart: CartInformation,
        private val onClickListener: OnClickListener,
        private val rect: Rect
)
    : androidx.recyclerview.widget.ListAdapter<Product, FoodItemAdapter.ViewHolder>(PdtDiffCallback()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, showCart, onClickListener, rect)
    }

    class ViewHolder private constructor(val binding: ItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(
                item: Product,
                cartInformation: CartInformation,
                onClickListener: OnClickListener,
                rect: Rect
        ){
            binding.product = item  
            binding.showCart = cartInformation
            binding.onClickListener = onClickListener
            binding.productLayout.layoutParams?.width = rect.width().div(2).minus(40)
//            val shake: Animation = AnimationUtils.loadAnimation(binding.root.context, android.R.anim.)
//            binding.productsCard.layoutParams?.width = rect.width().div(2).minus(40)
            binding.itemImage.layoutParams?.height = rect.width().toFloat().div(2f).times(0.8).toInt()
//            binding.itemImage.animation = shake
            if(item.free_delivery){
                binding.freeDelivery.visibility = View.VISIBLE
            }
            if(item.available){
                binding.availableStatus.visibility = View.GONE
            }

            binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context!!)
                val binding = ItemBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

}

class PdtDiffCallback: DiffUtil.ItemCallback<Product>(){
    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.product_id == newItem.product_id
    }
}


class ProductInformation(val showInfo: (product: Product) -> Unit){
    fun showInformation(item: Product) = showInfo(item)
}

class CartInformation(val showCart: (product: Product) -> Unit){
    fun showCartInformation(item: Product) = showCart(item)
}

class ProductComments(val showComments: (product: Product)-> Unit){
    fun showProductCommentsInformation(item: Product) = showComments(item)
}

class OnClickListener(val clickListener: (product: Product) -> Unit){
    fun onClick(item:Product) = clickListener(item)
}