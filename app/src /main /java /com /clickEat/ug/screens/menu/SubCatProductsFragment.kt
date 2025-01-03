package com.clickEat.ug.screens.menu

import android.graphics.Rect
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.RecentlyViewed
import com.clickEat.ug.data.SelectedProduct
import com.clickEat.ug.data.SubCategory
import com.clickEat.ug.databinding.MenuCustomLayoutBinding
import com.clickEat.ug.screens.drinksbasedonsubcat.ListDrinksFragmentDirections
import com.clickEat.ug.screens.rate.addToRecentlyViewed
import com.clickEat.ug.screens.rate.checkPreOrderStatus

class SubCatProductsFragment(private val subCategory: SubCategory): Fragment() {
    private lateinit var binding: MenuCustomLayoutBinding
    private val viewModel: MainActivityViewModel by activityViewModels()
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rect = Rect()
        requireActivity().window.decorView.getWindowVisibleDisplayFrame(rect)
        binding = DataBindingUtil.inflate(inflater, R.layout.menu_custom_layout, container, false)
        binding.lifecycleOwner = this
        binding.totalLabel.visibility = View.GONE
        binding.foodItems.adapter = FoodItemAdapter(
            CartInformation { product -> showCartDialog(binding.root.context,viewModel,this,product) },
            OnClickListener {
                addToRecentlyViewed(it)
                SelectedProduct.product = it
                this.findNavController().navigate(R.id.rateFragment)
            },
            rect
        )
        binding.item = subCategory
        binding.executePendingBindings()
        return binding.root

    }
}