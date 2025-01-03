package com.clickEat.ug.screens.subcatproducts

import android.app.AlertDialog
import android.graphics.Rect
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.SelectedProduct
import com.clickEat.ug.data.SubCategory
import com.clickEat.ug.databinding.FragmentSubCatProductsBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.account.ViewPagerAdapter
import com.clickEat.ug.screens.login.CustomProgressDialog
import com.clickEat.ug.screens.menu.*
import com.clickEat.ug.screens.menu.SubCatProductsFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SubCatProductsFragment : Fragment() {
    private val progressDialog = CustomProgressDialog()
    private lateinit var binding: FragmentSubCatProductsBinding
    private lateinit var subCatProductsModalFactory: SubCatProductsModalFactory
    private val userViewModel: MainActivityViewModel by activityViewModels()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rect = Rect()
        requireActivity().window.decorView.getWindowVisibleDisplayFrame(rect)
        val application = requireNotNull(activity).application
        val subCatID = SubCatProductsFragmentArgs.fromBundle(requireArguments()).subCatId
        (activity as AppCompatActivity).supportActionBar?.title = SubCatProductsFragmentArgs.fromBundle(requireArguments()).subCatName
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sub_cat_products, container, false)
        progressDialog.show(requireContext(), "Please Wait...")
        subCatProductsModalFactory = SubCatProductsModalFactory(subCatID,application)
        val subCatProductsViewModal: SubCatProductsViewModal by lazy {
            ViewModelProvider(this, subCatProductsModalFactory).get(SubCatProductsViewModal::class.java)
        }
        binding.lifecycleOwner = this

        subCatProductsViewModal.subCatProducts.observe(viewLifecycleOwner, Observer {products ->
            progressDialog.dialog.dismiss()
            if (null != products){
                if (products.isEmpty()){
                    showAlert()
                }else {
                    binding.viewModal = subCatProductsViewModal
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
                    binding.subcatProductsViewpager.adapter = adapter
                    binding.subcatProductsTabs.setupWithViewPager(binding.subcatProductsViewpager)
                }

                binding.subCatHomeProductsLayout.visibility = View.VISIBLE

            }else{
                CoroutineScope(Dispatchers.Main).launch {
                    CheckInternetConnection(requireContext()).isConnectedToInternet(
                        this@SubCatProductsFragment,
                        binding.subCatHomeProductsLayout
                    )
                    binding.subCatHomeProductsLayout.visibility = View.VISIBLE
                }
            }
        })

        return binding.root
    }

    private fun showAlert() {
        progressDialog.dialog.dismiss()
        val builder = AlertDialog.Builder(this.context)
        builder.setTitle("Alert")
        builder.setIcon(R.drawable.ic_baseline_error_outline_24)
        builder.setMessage("No products for this Sub Category")
        builder.setNegativeButton(
            HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ) { dialogInterface, _ -> dialogInterface.cancel() }

        builder.show()
    }


}                                                                                                                                                                                       