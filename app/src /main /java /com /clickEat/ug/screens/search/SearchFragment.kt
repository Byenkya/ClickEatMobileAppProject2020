package com.clickEat.ug.screens.search

import android.app.AlertDialog
import android.graphics.Rect
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.RecentlyViewed
import com.clickEat.ug.data.SearchString
import com.clickEat.ug.data.SelectedProduct
import com.clickEat.ug.databinding.FragmentSearchBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.login.CustomProgressDialog
import com.clickEat.ug.screens.menu.*
import com.clickEat.ug.screens.rate.addToRecentlyViewed
import com.clickEat.ug.screens.rate.checkPreOrderStatus
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SearchFragment : Fragment() {
    private val progressDialog = CustomProgressDialog()
    private lateinit var binding: FragmentSearchBinding
    private lateinit var searchModalFactory: SearchModalFactory
    private val userViewModel: MainActivityViewModel by activityViewModels()
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rect = Rect()
        requireActivity().window.decorView.getWindowVisibleDisplayFrame(rect)
        val application  = requireNotNull(activity).application
        binding = DataBindingUtil.inflate(inflater ,R.layout.fragment_search, container, false)
        progressDialog.show(requireContext(),"Please Wait...")

        when{
            !SearchString.searchTerm.isNullOrBlank() -> {
                (activity as AppCompatActivity).supportActionBar?.title = String.format("Results for ${SearchString.searchTerm}")
                searchModalFactory = SearchModalFactory(SearchString.searchTerm, application)

                val searchViewModal: SearchViewModal  by lazy {
                    ViewModelProvider(this,  searchModalFactory).get(SearchViewModal::class.java)

                }
                binding.lifecycleOwner = this

                searchViewModal.searchedProducts.observe(viewLifecycleOwner, Observer {products->
                    progressDialog.dialog.dismiss()
                    if(products != null){
                        if (products.isEmpty()){
                            showAlert()
                        }else{
                            binding.viewModal = searchViewModal
                            binding.searchedProducts.adapter = FoodItemAdapter(
                                    CartInformation { product -> showCartDialog(binding.root.context,userViewModel,this,product)},
                                    OnClickListener { product ->
                                        addToRecentlyViewed(product)
                                        SelectedProduct.product = product
                                        this.findNavController().navigate(R.id.rateFragment)
                                        this.activity?.overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                                    },
                                    rect
                            )
                            binding.searchedProductLayout.visibility = View.VISIBLE
                        }




                    }else{
                        CoroutineScope(Dispatchers.Main).launch {
                            CheckInternetConnection(requireContext()).isConnectedToInternet(
                                    this@SearchFragment,
                                    binding.searchedProductLayout
                            )
                            binding.searchedProductLayout.visibility = View.VISIBLE
                        }
                    }
                })

            }

            else -> showAlert()
        }

        return binding.root
    }

    private fun showAlert() {
        progressDialog.dialog.dismiss()
        val builder = AlertDialog.Builder(this.context)
        builder.setTitle("Alert")
        builder.setIcon(R.drawable.ic_baseline_error_outline_24)
        builder.setMessage("Search for more Food or Drinks")
        builder.setNegativeButton(
            HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ) { dialogInterface, _ -> dialogInterface.cancel() }

        builder.show()
    }

}