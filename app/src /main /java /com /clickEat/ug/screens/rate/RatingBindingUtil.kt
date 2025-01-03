package com.clickEat.ug.screens.rate

import android.app.AlertDialog
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.net.toUri
import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.clickEat.ug.R
import com.clickEat.ug.data.*
import com.clickEat.ug.screens.comment.CommentsRecyclerAdapter
import com.clickEat.ug.screens.menu.formatWithThousandComma
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView
import com.synnapps.carouselview.CarouselView
import kotlin.math.roundToInt

@BindingAdapter("itemImage")
fun ShapeableImageView.itemImage(item: String?){
    item?.let {
        val imageUri = "http://92.205.24.64/static/product_images/$it".toUri()
        Glide.with(context)
            .load(imageUri)
            .apply(
                RequestOptions()
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_baseline_photo_24))
            .into(this)
    }
}

@BindingAdapter("productsDisplay")
fun ImageSlider.productsDisplay(item: Product?){
    item?.let {
        val imageList = ArrayList<SlideModel>()
        val image = SlideModel("http://92.205.24.64/static/product_images/${item.product_picture}", item.product_name, ScaleTypes.CENTER_CROP)
        imageList.add(image)
        imageList.add(image)
        setImageList(imageList)
    }
}

@BindingAdapter("productPriceValue")
fun TextView.productPriceValue(item: Product?){
    item?.let{
        item.let {
            text = if(item.promotional_price_set){
                        if(null != item.promotional_price){
                            val testing = (item.price.toInt() - item.promotional_price)
                            val percentage = (testing.toDouble()/item.price.toInt()) * 100
                            val string = StringBuilder().run {
                                append("<html><body>")
                                append("<p>")
                                append("<del><small>Ugx ${item.price.toInt().formatWithThousandComma()}</small></del><small> | </small><font color='red'><small><b>${percentage.roundToInt()}% OFF</b></small></font><br/>")
                                append("<b>${"Ugx ${item.promotional_price.formatWithThousandComma()}"}</b>")
                                append("</p>")
                                append("</body></html>")
                                toString()
                            }
                            HtmlCompat.fromHtml(string, HtmlCompat.FROM_HTML_MODE_COMPACT).trim()
                        }else{
                            productActualPrice(item)
                        }

                    }else{
                        productActualPrice(item)
                }

        }
    }
}

private fun productActualPrice(item: Product): CharSequence {
    val string = java.lang.StringBuilder().run {
        append("<html><body>")
        append("<div>")
        append("<b>${"Ugx ${item.price.toInt().formatWithThousandComma()}"}</b><br/><br/>")
        append("</div>")
        append("</body></html>")
        toString()
    }
    return HtmlCompat.fromHtml(string, HtmlCompat.FROM_HTML_MODE_COMPACT).trim()
}

@BindingAdapter("productHeadsUp")
fun ExtendedFloatingActionButton.productHeadsUp(item: Product?){
    item?.let {
//        val extendedFloatingActionButton: ExtendedFloatingActionButton = this@productHeadsUp.rootView.findViewById(R.id.headsUp)
        if(it.headsup == "clickEat"){
            visibility = View.GONE
        }else{
            text = it.headsup
        }
    }
}

@BindingAdapter("freeDelivery")
fun MaterialTextView.freeDelivery(item: Product?){
    item?.let{
        visibility = if(it.free_delivery){
                            View.VISIBLE
                    }else{
                            View.GONE
                    }
    }
}

@BindingAdapter("productAvailability")
fun MaterialTextView.productAvailability(item: Product?){
    item?.let {
        if(it.available){
            visibility = View.GONE
        }else{
            val string = java.lang.StringBuilder().run {
                append("<html><body>")
                append("<div>")
                append("<p><font color='#FFFFFF'>Cannot Order At The Moment. Pre Order For A Later Date</font></p>")
                append("</div>")
                append("</body></html>")
                toString()
            }
            text = HtmlCompat.fromHtml(string, HtmlCompat.FROM_HTML_MODE_COMPACT).trim()
        }

    }
}

@BindingAdapter("ratingIndicator")
fun LinearLayout.ratingIndicator(item: ProductRate?){
    item?.let {
        if(item.rate != 0){
            val linearLayout: LinearLayout = this@ratingIndicator.rootView.findViewById(R.id.ratingLayout)
            linearLayout.visibility = View.VISIBLE

            val star1: ImageView = this@ratingIndicator.rootView.findViewById(R.id.star1)
            val star2: ImageView = this@ratingIndicator.rootView.findViewById(R.id.star2)
            val star3: ImageView = this@ratingIndicator.rootView.findViewById(R.id.star4)
            val star4: ImageView = this@ratingIndicator.rootView.findViewById(R.id.star5)
            val star5: ImageView = this@ratingIndicator.rootView.findViewById(R.id.star6)

            when (item.rate) {
                1 -> {
                    star1.visibility = View.VISIBLE
                }
                2 -> {
                    star1.visibility = View.VISIBLE
                    star2.visibility = View.VISIBLE
                }
                3 -> {
                    star1.visibility = View.VISIBLE
                    star2.visibility = View.VISIBLE
                    star3.visibility = View.VISIBLE
                }
                4 -> {
                    star1.visibility = View.VISIBLE
                    star2.visibility = View.VISIBLE
                    star3.visibility = View.VISIBLE
                    star4.visibility = View.VISIBLE
                }
                5 -> {
                    star1.visibility = View.VISIBLE
                    star2.visibility = View.VISIBLE
                    star3.visibility = View.VISIBLE
                    star4.visibility = View.VISIBLE
                    star5.visibility = View.VISIBLE
                }

            }
        }else{
            val linearLayout: LinearLayout = this@ratingIndicator.rootView.findViewById(R.id.Norating)
            linearLayout.visibility = View.VISIBLE
        }
    }
}

@BindingAdapter("productComments")
fun RecyclerView.productCommentsRatingSection(data: List<ServerComment>?){
    data?.let {
        with(adapter as CommentsRecyclerAdapter){
            if (it.size <= 3){
                this.submitList(it)
            }else{
                this.submitList(it.subList(0,3))
            }

        }
    }
}
