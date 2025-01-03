package com.clickEat.ug.screens.drinks

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.R
import com.clickEat.ug.data.ClickEatDrinksSubCategories
import com.clickEat.ug.data.DrinkSubCategories

@BindingAdapter("drinksRecycler")
fun RecyclerView.drinksRecycler(items: ClickEatDrinksSubCategories?){
    items?.let{
        with(adapter as DrinksRecyclerAdapter){
            this.submitList(it.drinksSubCat)
        }
    }

}

@BindingAdapter("subCatName")
fun TextView.setTitle(item: DrinkSubCategories?){
    item?.let {
        text = item.name
    }
}

