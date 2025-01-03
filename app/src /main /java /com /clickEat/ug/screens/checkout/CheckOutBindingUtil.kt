package com.clickEat.ug.screens.checkout

import android.view.View
import android.widget.*
import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.R
import com.clickEat.ug.data.*
import com.google.android.material.textview.MaterialTextView
import com.toptoche.searchablespinnerlibrary.SearchableSpinner

@BindingAdapter("addressTitle")
fun MaterialTextView.addressTitle(item: CustomerAddress?){
    item?.let {
        text = item.county
    }
}

@BindingAdapter("addressDetails")
fun MaterialTextView.addressDetails(item: CustomerAddress?){
    item?.let{
        text = run {
            val string = StringBuilder()
            string.append("<html><body>")
            string.append("<p>")
            string.append("<b>County: </b>${it.county}<br/>")
            string.append("<b>Sub county: </b>${it.sub_county}<br/>")
            string.append("<b>Village: </b>${it.village}<br/>")
            string.append("<b>Other details: </b>${it.other_details}.")
            string.append("</p>")
            string.append("</body></html>")
            HtmlCompat.fromHtml(string.toString(), HtmlCompat.FROM_HTML_MODE_COMPACT)
        }
    }
}

@BindingAdapter("addresses")
fun RecyclerView.addresses(items: AllCustomerAddresses?){
    items?.let {
        with(adapter as AddressRecyclerView){
            submitList(it.data)
        }
    }
}



@BindingAdapter("selectedCustomerAddress")
fun ImageView.selectedCustomerAddress(item: CustomerAddress?){
    item?.let {
        visibility = if(it.is_default!!) View.VISIBLE else View.GONE
    }
}

@BindingAdapter("newVillage")
fun SearchableSpinner.newVillage(item: AruaVillages?){
    val vilSpinner: SearchableSpinner = this@newVillage.rootView.findViewById(R.id.spinner_view)
    if (item == null) return
    val villages = ArrayList<String>()
    villages.addAll(item.villages.map { it.village })
    val villageAdapter = ArrayAdapter<String>(this.context, R.layout.support_simple_spinner_dropdown_item, villages)
    villageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    vilSpinner.adapter = villageAdapter
}



