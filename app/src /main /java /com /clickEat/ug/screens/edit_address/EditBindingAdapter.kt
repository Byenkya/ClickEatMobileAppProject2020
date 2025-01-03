package com.clickEat.ug.screens.edit_address

import android.widget.ArrayAdapter
import androidx.databinding.BindingAdapter
import com.clickEat.ug.R
import com.clickEat.ug.data.AruaVillages
import com.clickEat.ug.data.Village
import com.toptoche.searchablespinnerlibrary.SearchableSpinner

@BindingAdapter("edit")
fun SearchableSpinner.edit(item: List<Village>?){
    val vilSpinner: SearchableSpinner = this@edit.rootView.findViewById(R.id.spinner_villages)
    if (item == null) return
    val villages = ArrayList<String>()
    villages.addAll(item.map { it.village })
    val villageAdapter = ArrayAdapter<String>(this.context, R.layout.support_simple_spinner_dropdown_item, villages)
    villageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    vilSpinner.adapter = villageAdapter
}