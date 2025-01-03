package com.clickEat.ug.screens.comment

import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.clickEat.ug.R
import com.clickEat.ug.data.HomeImages
import com.clickEat.ug.data.ServerComment
import com.clickEat.ug.screens.rate.itemImage
import com.synnapps.carouselview.CarouselView

@BindingAdapter("productComments")
fun RecyclerView.productComments(data: List<ServerComment>?){
    data?.let {
        with(adapter as CommentsRecyclerAdapter){
            this.submitList(it)
        }
    }
}

@BindingAdapter("customerNames")
fun TextView.customerNames(item: ServerComment?){
    item?.let {
        text = item.customerNames
    }
}

@BindingAdapter("commentDate")
fun TextView.commentDate(item: ServerComment?){
    item?.let{
        text = item.date
    }
}

@BindingAdapter("commentValue")
fun TextView.commentValue(item: ServerComment?){
    item?.let {
        text = item.comment
    }
}

@BindingAdapter("reply")
fun TextView.reply(item: ServerComment?){
    item?.let {
        text = item.reply ?: "No reply"
    }
}

