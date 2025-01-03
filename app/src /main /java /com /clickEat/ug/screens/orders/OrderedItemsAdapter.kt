package com.clickEat.ug.screens.orders

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.core.text.HtmlCompat
import com.clickEat.ug.data.CartItemFromServer
import com.clickEat.ug.data.CustomerPlaceOrder
import com.clickEat.ug.databinding.OrderCartItemLayoutBinding
import com.clickEat.ug.screens.menu.formatWithThousandComma
import java.lang.StringBuilder

class OrderedItemsAdapter(private  val context: Context, private val dataSource: CustomerPlaceOrder): BaseAdapter(){
    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getCount(): Int {
        return dataSource.orderItems.size
    }

    override fun getItem(position: Int): Any {
        return dataSource.orderItems[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(parent!!.context)
        val binding = OrderCartItemLayoutBinding.inflate(layoutInflater)

        val cartItem = getItem(position) as CartItemFromServer
        binding.orderCartItem.text = cartItem.product_name
        binding.orderCartItemPrice.text = cartItem.unit_price.formatWithThousandComma()
        binding.orderCartItemQuantity.text = cartItem.quantity.toString()
        binding.orderCartItemTotal.text = cartItem.total.formatWithThousandComma()

        if(cartItem.served_with != "none"){
            val options = cartItem.served_with.split(",").toTypedArray()
            val string = StringBuilder().run {
                append("<html><body>")
                append("<div>")
                append("<h6>Served With:</h6>")
                append("<ul>")
                for(option in options){
                    append("<li>${option}</li>")
                }
                append("</ul>")
                append("</div>")
                append("</body></html>")
                toString()
            }
            binding.servedWith.text =
                HtmlCompat.fromHtml(string, HtmlCompat.FROM_HTML_MODE_COMPACT).trim()
            binding.servedWith.visibility = View.VISIBLE
        }else{
            binding.servedWith.visibility = View.GONE
        }

        return binding.root
    }
}