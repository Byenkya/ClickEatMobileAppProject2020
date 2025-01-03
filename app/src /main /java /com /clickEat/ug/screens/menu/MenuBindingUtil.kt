package com.clickEat.ug.screens.menu

import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.core.text.HtmlCompat
import androidx.core.view.marginBottom
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.clickEat.ug.R
import com.clickEat.ug.data.Product
import com.clickEat.ug.data.SubCategory
import java.lang.StringBuilder
import kotlin.math.roundToInt


@BindingAdapter("itemName")
fun TextView.itemName(item: Product?){
    item?.let{
        text = item.product_name
    }
}

@BindingAdapter("productAvailable")
fun TextView.productAvailable(item: Product?){
    item?.let {
        val string = StringBuilder().run {
            append("<html><body>")
            append("<div>")
            append("<p><font color='#FFFFFF'><small>Cannot Order At The Moment</small></font></p>")
            append("<p><font color='#FFFFFF'><small>Pre Order For A Later Date</small></font></p>")
            append("</div>")
            append("</body></html>")
            toString()
        }
        text = HtmlCompat.fromHtml(string, HtmlCompat.FROM_HTML_MODE_COMPACT).trim()
    }
}

@BindingAdapter("itemDesc")
fun TextView.itemDesc(item: Product?){
    item?.let{
        text = item.description
    }
}

@BindingAdapter("itemPrice")
fun TextView.itemPrice(item: Product?){
    item?.let {
        text = if(item.promotional_price_set){
                   if(null != item.promotional_price){
                       val testing = (item.price.toInt() - item.promotional_price)
                       val percentage = (testing.toDouble()/item.price.toInt()) * 100
                       val string = StringBuilder().run {
                           append("<html><body>")
                           append("<div>")
                           append("<del><small>Ugx ${item.price.toInt().formatWithThousandComma()}</small></del><sup><font color='red'><small>${percentage.roundToInt()}%</small></font></sup><br/>")
                           append("<b>${"Ugx ${item.promotional_price?.formatWithThousandComma()}"}</b>")
                           append("</div>")
                           append("</body></html>")
                           toString()
                       }
                       HtmlCompat.fromHtml(string, HtmlCompat.FROM_HTML_MODE_COMPACT).trim()
                   }else{
                        itemActualPrice(item)
                   }
                }else{
                    itemActualPrice(item)
            }

    }
}

private fun itemActualPrice(item: Product): CharSequence {
    val string = StringBuilder().run {
        append("<html><body>")
        append("<div>")
        append("<b>${"Ugx ${item.price.toInt().formatWithThousandComma()}"}</b>")
        append("</div>")
        append("</body></html>")
        toString()
    }
    return HtmlCompat.fromHtml(string, HtmlCompat.FROM_HTML_MODE_COMPACT).trim()
}

@BindingAdapter("productImage")
fun ImageView.productImage(item: Product ?){
    item?.product_picture.let {
        val imageUri = "http://92.205.24.64/static/product_images/$it".toUri()
        Glide.with(context)
                .load(imageUri)
                .apply(RequestOptions()
                        .placeholder(R.drawable.loading)
                        .error(R.drawable.ic_baseline_photo_24))
                .into(this)
    }
}

@BindingAdapter("subCategories")
fun RecyclerView.subCategoreis(data: List<SubCategory>?){
    data?.let {
        with(adapter as MenuAdapter){
            this.submitList(it)
        }
    }
}

@BindingAdapter("menuItems")
fun RecyclerView.foodItems(data: SubCategory?){
    data?.let {
        with(adapter as FoodItemAdapter){
            this.submitList(it.products)
        }
    }
}

@BindingAdapter("subCategoryName")
fun TextView.subCategoryName(data: SubCategory?){
    data?.let {
        text = it.sub_category
    }
}

fun Int.formatWithThousandComma(): String {
    val result = StringBuilder()
    val size = this.toString().length
    return if (size > 3) {
        for (i in size -1 downTo 0){
            result.insert(0, this.toString()[i])
            if((i != size - 1) && i != 0 && (size - i) % 3 == 0)
                result.insert(0, ",")
        }
        result.toString()
    }else{
        this.toString()
    }
}