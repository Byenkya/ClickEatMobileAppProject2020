package com.clickEat.ug.screens.cart

import android.view.View
import android.widget.Button
import androidx.core.net.toUri
import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.clickEat.ug.R
import com.clickEat.ug.data.CartItemFromServer
import com.clickEat.ug.data.CustomerCartItems
import com.clickEat.ug.screens.menu.formatWithThousandComma
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView
import de.hdodenhof.circleimageview.CircleImageView
import java.lang.StringBuilder
import kotlin.math.roundToInt

@BindingAdapter("cartProducts")
fun RecyclerView.cartProducts(items: CustomerCartItems?){
    items?.let{
        with(adapter as CartAdapter){
            this.submitList(items.cart_items)
        }
    }

}

@BindingAdapter("cartTotal")
fun MaterialTextView.cartTotal(items: CustomerCartItems?){
    items?.let{
        text = try {
                    "Ugx ${items.cart_items[0].cart_total_amount.formatWithThousandComma()}"
                }catch (it: Throwable){
                    "Ugx 0"
                }

    }
}

@BindingAdapter("served_with")
fun MaterialTextView.served_with(item: CartItemFromServer?){
    item?.let {
        if(item.served_with != "none"){
            val options = item.served_with.split(",").toTypedArray()
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
            text = HtmlCompat.fromHtml(string, HtmlCompat.FROM_HTML_MODE_COMPACT).trim()
            visibility = View.VISIBLE
        }
    }
}

@BindingAdapter("productImage")
fun CircleImageView.productImage(item: CartItemFromServer?){
    item?.let{
        val imageUri = "http://92.205.24.64/static/product_images/${it.product_image}".toUri()
        Glide.with(context)
            .load(imageUri)
            .apply(
                RequestOptions()
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_baseline_photo_24))
            .into(this)
    }
}

@BindingAdapter("productName")
fun MaterialTextView.productName(item: CartItemFromServer?){
    item?.let{
        text = item.product_name
    }
}

@BindingAdapter("productQuantity")
fun Button.productQuantity(item: CartItemFromServer?){
    item?.let{
        text = item.quantity.toString()
    }
}

@BindingAdapter("unitPrice")
fun MaterialTextView.unitPrice(item: CartItemFromServer?){
    item?.let{
        text = item.unit_price.formatWithThousandComma()
    }
}

@BindingAdapter("productTotal")
fun MaterialTextView.productTotal(item: CartItemFromServer?){
    item?.let{
        text = item.total.formatWithThousandComma()
    }
}