package com.clickEat.ug.screens.home

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.clickEat.ug.R


@BindingAdapter("title")
fun TextView.setTitle(item: String?){
    item?.let {
        text = item
    }
}

@BindingAdapter("icon")
fun ImageView.setIcon(item: String?){
    item?.let {
        setImageResource(
                when (item) {
                    "Drinks" -> R.drawable.ic_baseline_sports_bar_24
                    "Food" -> R.drawable.ic_baseline_food_bank_24
                    else -> R.drawable.ic_baseline_local_hospital_24
                }
        )
    }

}