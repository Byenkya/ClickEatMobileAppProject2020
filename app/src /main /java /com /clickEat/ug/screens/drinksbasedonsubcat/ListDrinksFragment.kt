package com.clickEat.ug.screens.drinksbasedonsubcat

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
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.SubCategory
import com.clickEat.ug.databinding.FragmentListDrinksBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.account.ViewPagerAdapter
import com.clickEat.ug.screens.login.CustomProgressDialog
import com.clickEat.ug.screens.menu.MenuAdapter
import com.clickEat.ug.screens.menu.SubCatProductsFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class  ListDrinksFragment : Fragment() {
    private val progressDialog = CustomProgressDialog()
    private lateinit var binding: FragmentListDrinksBinding
    private lateinit var modalFactory: ListDrinksModalFactory
    private val userViewModel: MainActivityViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rect = Rect()
        requireActivity().window.decorView.getWindowVisibleDisplayFrame(rect)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list_drinks, container, false)
        val application  = requireNotNull(activity).application
        (activity as AppCompatActivity).supportActionBar?.title = ListDrinksFragmentArgs.fromBundle(requireArguments()).catType

        modalFactory = ListDrinksModalFactory(ListDrinksFragmentArgs.fromBundle(requireArguments()).drinksSubCatID, application)

        val listDrinksViewModel: ListDrinksViewModal by lazy {
            ViewModelProvider(this, modalFactory).get(ListDrinksViewModal::class.java)
        }

        binding.lifecycleOwner = this
        progressDialog.show(requireContext(),"Please Wait...")

        listDrinksViewModel.products.observe(viewLifecycleOwner, Observer {
            progressDialog.dialog.dismiss()
            if(null !=it){
                if (it.isEmpty()){
                    val builder = AlertDialog.Builder(this.context)
                    builder.setTitle("Alert")
                    builder.setIcon(R.drawable.ic_baseline_error_outline_24)
                    builder.setMessage("No Drinks for this Category.")
                    builder.setNegativeButton(
                            HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
                    ){dialogInterface, _ ->  dialogInterface.cancel()}

                    builder.show()
                }
                binding.viewModel = listDrinksViewModel
                val adapter = ViewPagerAdapter(this.childFragmentManager)
                val brands = ArrayList<String>()
                for(data in listDrinksViewModel.products.value!!){
                    val subCatProductsFragment = SubCatProductsFragment(data)
                    adapter.addFragment(subCatProductsFragment, "All")
                    for (product in data.products){
                        if(!brands.contains(product.brand_name)){
                                brands.add(product.brand_name)
                            }

                    }

                    for(brand in brands){
                        val products = data.products.filter { product ->  product.brand_name == brand}
                        val subCatProductsFragment = SubCatProductsFragment(SubCategory(brand, products))
                        adapter.addFragment(subCatProductsFragment, brand)
                    }

                }
                binding.subcatViewpager.adapter = adapter
                binding.subcatTabs.setupWithViewPager(binding.subcatViewpager)
//                binding.subCat.adapter = MenuAdapter(userViewModel, this, rect)
                binding.DrinksMenuLayout.visibility = View.VISIBLE
            }else{
                CoroutineScope(Dispatchers.Main).launch {
                    CheckInternetConnection(requireContext()).isConnectedToInternet(
                            this@ListDrinksFragment,
                            binding.DrinksMenuLayout
                    )
                    binding.DrinksMenuLayout.visibility = View.VISIBLE
                }
            }
        })

        return binding.root
    }

}