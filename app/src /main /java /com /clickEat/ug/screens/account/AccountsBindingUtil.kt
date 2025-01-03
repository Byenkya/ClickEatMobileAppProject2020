package com.clickEat.ug.screens.account

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.data.Customer
import com.clickEat.ug.data.ListCustomerAddresses
import com.clickEat.ug.screens.checkout.AddressRecyclerView
import com.google.android.material.textfield.TextInputEditText

@BindingAdapter("customerNames")
fun TextInputEditText.customerNames(item: Customer?){
    item?.let {
        hint = item.names
        setText(item.names)
    }
}

@BindingAdapter("customerEmail")
fun TextInputEditText.customerEmail(item: Customer?){
    item?.let {
        hint = item.email
        setText(item.email)
    }
}

@BindingAdapter("contact")
fun TextInputEditText.contact(item: Customer?){
    item?.let{
        hint = item.contact
        setText(item.contact)
    }
}

@BindingAdapter("secondContact")
fun TextInputEditText.secondContact(item: Customer?){
    item?.let{
        hint = item.second_contact
        setText(item.second_contact)
    }
}

@BindingAdapter("deliveryAddresses")
fun RecyclerView.deliveryAddresses(items: ListCustomerAddresses?){
    items?.let {
        with(adapter as AddressRecyclerView){
            submitList(it.data)
        }
    }
}