package com.clickEat.ug.screens.resturants

import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.clickEat.ug.R
import com.clickEat.ug.data.ClickEatRestaurants
import com.clickEat.ug.data.HomeSubCategoryDisplay
import com.clickEat.ug.data.Restaurant
import com.clickEat.ug.screens.menu.formatWithThousandComma
import com.google.android.material.textview.MaterialTextView
import kotlin.math.roundToInt

@BindingAdapter("rest_name")
fun TextView.setTitle(item: Restaurant?){
    item?.let{
//        text = item.business_name
        val string = java.lang.StringBuilder().run {
            append("<html><body>")
            append("<div>")
            append("<p>${it.business_name}</p>")
            append("</div>")
            append("<div>")
            if(it.operational_status){
                append("${"<small>Open from <b>${it.operation_start_time} To ${it.operation_stop_time}"}</b><br/>Current status: <font color='green'><b>Open</b></font></small>")
            }else{
                append("${"<small>Open from <b>${it.operation_start_time} To ${it.operation_stop_time}"}</b><br/>Current status: <font color='red'><b>Closed</b></font></small>")
            }
            append("</div>")
            append("</body></html>")
            toString()
        }
        text = HtmlCompat.fromHtml(string, HtmlCompat.FROM_HTML_MODE_COMPACT).trim()
    }
}

@BindingAdapter("rest_logo")
fun ImageView.setIcon(item: Restaurant?){
    item?.let{
        setImageResource(R.drawable.ic_baseline_restaurant_24)
    }
}

@BindingAdapter("restaurants")
fun RecyclerView.restaurants(data: ClickEatRestaurants?){
    data?.let {
        with(adapter as RestaurantMainAdapter){
            this.submitList(it.restaurants)
        }
    }
}

@BindingAdapter("restaurantImage")
fun ImageView.restaurantImage(data: Restaurant?){
    data.let {
        val imageUri = "http://92.205.24.64/static/business_profile_picture/${it?.business_profile_picture}".toUri()
        Glide.with(context)
            .load(imageUri)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.loading)
                    .error(R.drawable.ic_baseline_photo_24))
            .into(this)
    }
}
