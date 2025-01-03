package com.clickEat.ug.screens.categories

import android.graphics.Rect
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.clickEat.ug.R
import com.clickEat.ug.data.SubCategory
import com.clickEat.ug.databinding.FragmentCategoryBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.account.ViewPagerAdapter
import com.clickEat.ug.screens.menu.SubCatProductsFragment
import com.clickEat.ug.screens.rate.setColorFilter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CategoryFragment : Fragment() {
    private lateinit var binding : FragmentCategoryBinding
    private lateinit var modalFactory: CategoryViewModalFactory
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rect = Rect()
        requireActivity().window.decorView.getWindowVisibleDisplayFrame(rect)
        val application  = requireNotNull(activity).application
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_category, container, false)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            setColorFilter(binding.categoryProductsProgressBar.indeterminateDrawable, ResourcesCompat.getColor(requireContext().resources, R.color.colorPrimaryDark, null))
        }



        modalFactory = CategoryViewModalFactory(CategoryFragmentArgs.fromBundle(requireArguments()).categoryName, application)

        val categoryProductsViewModal: CategoryProductsViewModal by lazy {
            ViewModelProvider(this, modalFactory).get(CategoryProductsViewModal::class.java)
        }

        binding.lifecycleOwner = this

        categoryProductsViewModal.catProducts.observe(viewLifecycleOwner, Observer { products ->
            if(null != products){
                binding.categoryProductsProgressBar.visibility = View.GONE
                if(products.isEmpty()){
                    binding.catProductsLabel.text = "No Products"
                }else{
                    binding.catProductsLabel.visibility = View.GONE
                    binding.categoryViewModal = categoryProductsViewModal
                    val adapter = ViewPagerAdapter(this.childFragmentManager)
                    val restaurants = ArrayList<String>()
                    val subCatProductsFragment = SubCatProductsFragment(SubCategory(products[0].sub_category,products))
                    adapter.addFragment(subCatProductsFragment, "All")
                    for (product in products){
                        if(!restaurants.contains(product.restaurant_name)){
                            restaurants.add(product.restaurant_name)
                        }

                    }

                    for(restaurant in restaurants){
                        val products = products.filter { product ->  product.restaurant_name == restaurant}
                        val subCatProductsFragment = SubCatProductsFragment(SubCategory(restaurant, products))
                        adapter.addFragment(subCatProductsFragment, restaurant)
                    }

                    binding.categoryViewpager.adapter = adapter
                    binding.categoryTabs.setupWithViewPager(binding.categoryViewpager)

                    binding.categoryViewpager.visibility = View.VISIBLE
                    binding.categoryTabs.visibility = View.VISIBLE

                }

                binding.categoryLayout.visibility = View.VISIBLE
            }else{
                binding.categoryProductsProgressBar.visibility = View.GONE
                binding.catProductsLabel.visibility = View.GONE
                CoroutineScope(Dispatchers.Main).launch {
                    CheckInternetConnection(requireContext()).isConnectedToInternet(
                        this@CategoryFragment,
                        binding.categoryLayout
                    )
                    binding.categoryLayout.visibility = View.VISIBLE
                }
            }
        })

        return binding.root
    }

}