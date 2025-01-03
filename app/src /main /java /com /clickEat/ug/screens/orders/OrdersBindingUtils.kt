package com.clickEat.ug.screens.orders

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.data.CustomerPlaceOrder

@BindingAdapter("allOrders")
fun RecyclerView.allOrders(data: List<CustomerPlaceOrder>?){
    data?.let {
        with(adapter as OrdersRecyclerAdapter){
            this.submitList(it)
        }
    }
}


@BindingAdapter("orderRef")
fun TextView.orderRef(item: CustomerPlaceOrder?){
    item?.let {
        text = if(!item.isPrepared && !item.customerReceived && !item.isPaid && !item.isTerminated) "${item.orderRefSimpleVersion}  (pending)" else item.orderRefSimpleVersion
    }
}

@BindingAdapter("orderDate")
fun TextView.orderDate(item: CustomerPlaceOrder?){
    item?.let {
        text = item.orderDate
    }
}
