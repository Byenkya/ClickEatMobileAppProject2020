package com.clickEat.ug.screens.menu

import android.R.array
import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Rect
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.CheckBox
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.core.text.HtmlCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.*
import com.clickEat.ug.databinding.MenuCustomLayoutBinding
import com.clickEat.ug.screens.rate.addToRecentlyViewed
import com.clickEat.ug.screens.rate.checkPreOrderStatus
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.item_information.view.*
import kotlinx.android.synthetic.main.item_quantity_layout.view.*


class MenuAdapter(val viewModel: MainActivityViewModel, val fragment: Fragment, val rect: Rect)
    : androidx.recyclerview.widget.ListAdapter<SubCategory, MenuAdapter.ViewHolder>(ProductDiffCallback()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent, viewModel, fragment, rect)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class ViewHolder private constructor(val binding: MenuCustomLayoutBinding, val viewModel: MainActivityViewModel, val fragment: Fragment, val rect: Rect): RecyclerView.ViewHolder(binding.root){
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        fun bind(item: SubCategory){
            when(fragment.findNavController().currentDestination?.id){
                R.id.listDrinksFragment-> {
                    binding.totalLabel.visibility = View.GONE
                }
            }
            binding.foodItems.adapter = FoodItemAdapter(
                    CartInformation { product -> showCartDialog(binding.root.context,viewModel,fragment,product) },
                    OnClickListener {
                        addToRecentlyViewed(it)
                        SelectedProduct.product = it
                        fragment.findNavController().navigate(R.id.rateFragment)
                        fragment.activity?.overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                    },
                    rect
            )
            binding.item = item
            binding.executePendingBindings()
        }
        companion object{
            fun from(parent: ViewGroup, viewModel: MainActivityViewModel, fragment: Fragment, rect: Rect): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context!!)
                val binding = MenuCustomLayoutBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding, viewModel, fragment, rect)
            }
        }


    }
}

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@SuppressLint("ResourceAsColor")
fun showCartDialog(
        context: Context,
        viewModel: MainActivityViewModel,
        fragment: Fragment,
        product: Product
){
    val mDialogView = LayoutInflater.from(context).inflate(R.layout.item_quantity_layout, null)
    val quantities = (1..15).toList()
    var amount: Int = 0
    var quantity = 0
    val served_options = ArrayList<String>()
    val separator = ","
    val adapter = ArrayAdapter<Int>(context, R.layout.support_simple_spinner_dropdown_item, quantities)
    mDialogView.quantities.adapter = adapter

    mDialogView.quantities.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
        override fun onNothingSelected(p0: AdapterView<*>?) {
            TODO("Not yet implemented")
        }

        override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            quantity = mDialogView.quantities.selectedItem.toString().toInt()
            amount = if(product.promotional_price_set){
                        if(null != product.promotional_price){
                            product.promotional_price.times(quantity)
                        }else{
                            product.price.toInt().times(quantity)
                        }
                    }else{
                        product.price.toInt().times(quantity)
                    }
            mDialogView.amount.text = amount.toString()
        }
    }
    if (product.served_with != "none"){
        val checkboxContainer = mDialogView.served_with_layout
        val served_with_options = product.served_with.split(",").toTypedArray()
        for(item in served_with_options){
            val checkBox = CheckBox(fragment.context)
            checkBox.text = item
            checkBox.buttonTintList = ColorStateList.valueOf(Color.parseColor("#FF5722"))
            checkBox.setOnClickListener {
                if(checkBox.isChecked){
                    served_options.add(checkBox.text.toString())
                }else{
                    served_options.remove(checkBox.text.toString())
                }
            }
            checkboxContainer.addView(checkBox)
        }

        mDialogView.served_with_label.visibility = View.VISIBLE
        checkboxContainer.visibility = View.VISIBLE

    }

    val mBuilder = AlertDialog.Builder(context)
            .setView(mDialogView)
            .setTitle(product.product_name)
            .setIcon(R.drawable.ic_baseline_fastfood_24)
    val mAlertDialog = mBuilder.show()

    //dismiss the dialog window
//    mDialogView.cancel.setOnClickListener { mAlertDialog.dismiss() }
    mDialogView.add.setOnClickListener {view ->
        viewModel.currentUser.observe(fragment.viewLifecycleOwner, Observer { it ->
            if(it.names == "click_it" && it.email =="welcome to click it App" ){
                mAlertDialog.dismiss()
                val builder = android.app.AlertDialog.Builder(context)
                builder.setTitle("Alert")
                builder.setIcon(R.drawable.ic_baseline_error_outline_24)
                builder.setMessage("Your must first signin to add items to the Cart!.")
                builder.setPositiveButton( HtmlCompat.fromHtml("<font color='#FF7F27'>SignIn</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)){ _, _ ->
                    fragment.findNavController().navigate(R.id.login)
                }
                builder.setNegativeButton(
                        HtmlCompat.fromHtml("<font color='#FF7F27'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
                ){dialogInterface, _ ->  dialogInterface.cancel()}

                builder.show()
            }else{
                checkPreOrderStatus(product)
                if(product.free_delivery){
                    FreeDelivery.free_delivery = true
                }

                if(product.promotional_price_set && null != product.promotional_price){
                    if(product.served_with != "none" && served_options.isNotEmpty()){
                        val options = served_options.joinToString(separator)
                        viewModel.addToCart(
                            CartItem(product.product_id,it.customer_id,product.product_name,product.product_picture,product.promotional_price!!.toString(),quantity.toString(), options, product.free_delivery, product.restaurant_name)
                        )
                    }else{
                        viewModel.addToCart(
                            CartItem(product.product_id,it.customer_id,product.product_name,product.product_picture,product.promotional_price!!.toString(),quantity.toString(),"none", product.free_delivery, product.restaurant_name)
                        )
                    }
                }else{
                    if(product.served_with != "none" && served_options.isNotEmpty()){
                        val options = served_options.joinToString(separator)
                        viewModel.addToCart(
                            CartItem(product.product_id,it.customer_id,product.product_name,product.product_picture,product.price,quantity.toString(),options, product.free_delivery, product.restaurant_name)
                        )
                    }else{
                        viewModel.addToCart(
                            CartItem(product.product_id,it.customer_id,product.product_name,product.product_picture,product.price,quantity.toString(),"none", product.free_delivery, product.restaurant_name)
                        )
                    }

                }


                viewModel.addedToCart.observe(fragment.viewLifecycleOwner, Observer {
                    it?.let {
                        if(it.status == "success"){
                            mAlertDialog.dismiss()
                            Snackbar.make(fragment.requireActivity().findViewById(android.R.id.content), "Product: ${product.product_name} added to Cart", Snackbar.LENGTH_LONG)
                                .setAction("View Cart") {
                                fragment.findNavController().navigate(R.id.myStepperFragment)
                            }
                                .setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF5722")))
                                .setActionTextColor(ColorStateList.valueOf(Color.parseColor("#FFFFFF")))
                                .show()
                        }else{
                            it.message?.let { error ->
                                onAlertDialog(context, "Error", error)
                                mAlertDialog.dismiss()
                            }
                        }
                    }
                })

            }
        })

    }
}

class ProductDiffCallback: DiffUtil.ItemCallback<SubCategory>(){
    override fun areItemsTheSame(oldItem: SubCategory, newItem: SubCategory): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: SubCategory, newItem: SubCategory): Boolean {
        return oldItem.sub_category == newItem.sub_category && oldItem.products == newItem.products
    }
}

fun onAlertDialog(context: Context,title: String, message: String){
    val builder = android.app.AlertDialog.Builder(context)
    builder.setTitle(title)
    builder.setIcon(R.drawable.ic_baseline_error_outline_24)
    builder.setMessage(message)
    builder.setNegativeButton(
            HtmlCompat.fromHtml("<font color='#FF7F27'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
    ){dialogInterface, _ ->  dialogInterface.cancel()}

    builder.show()
}



