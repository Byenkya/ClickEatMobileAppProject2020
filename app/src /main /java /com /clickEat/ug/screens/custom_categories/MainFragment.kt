package com.clickEat.ug.screens.custom_categories

import android.graphics.Rect
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.Transformations
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.MemoryCategory
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.*
import com.clickEat.ug.database.asHomeImagesDomainModel
import com.clickEat.ug.databinding.FragmentMainBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.login.CustomProgressDialog
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_search.view.*
import kotlinx.android.synthetic.main.top_category_item_layout.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private val progressDialog = CustomProgressDialog()
    private val homeViewModel: CategoriesViewModel by viewModels()
    private val userViewModel: MainActivityViewModel by activityViewModels()
    private lateinit var productsObserver: Observer<List<AllHomeProducts>>
    private lateinit var adapter: HomePageRecyclerAdapter
    private var visibleItemCount = 0
    private var totalItemCount = 0
    private var pastVisibleItems = 0
    private var productsLoading = true
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val application  = requireNotNull(activity).application
        val rect = Rect()
        requireActivity().window.decorView.getWindowVisibleDisplayFrame(rect)
        (activity as AppCompatActivity).supportActionBar?.title = "ClickEat"
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater ,R.layout.fragment_main, container, false)
        binding.viewModel = homeViewModel
        binding.lifecycleOwner = this
//        setColorFilter(binding.allProductsProgressBar.indeterminateDrawable, ResourcesCompat.getColor(requireContext().resources, R.color.colorPrimaryDark, null))
        progressDialog.show(requireContext(),"Please Wait...")
        val layoutManager = GridLayoutManager(requireContext(), 2)//LinearLayoutManager(requireContext())

        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return try {
                    when (homeViewModel.mainRecycler.value?.get(position)) {
                        is AllHomeProducts.HomePictures -> 2
                        is AllHomeProducts.HomeSubCategories -> 2
                        is AllHomeProducts.TopSellingProducts -> 2
                        is AllHomeProducts.TopHomeCategories -> 2
                        is AllHomeProducts.HomeDisplayProducts -> 2
                        is AllHomeProducts.MoreProducts -> 1
                        else -> 0
                    }
                } catch (t: Throwable) {
                    0
                }
            }
        }

        adapter = HomePageRecyclerAdapter(this,homeViewModel,userViewModel,rect)
        binding.AllProducts.layoutManager =  layoutManager
        binding.AllProducts.adapter = adapter
//        adapter.stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY
        Glide.get(requireContext()).setMemoryCategory(MemoryCategory.HIGH)
        binding.AllProducts.addOnScrollListener(object: RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if(dy > 0){
                    visibleItemCount = layoutManager.childCount
                    totalItemCount = layoutManager.itemCount
                    pastVisibleItems = layoutManager.findFirstVisibleItemPosition()
                    if(productsLoading){
                        if(visibleItemCount.plus(pastVisibleItems) >= totalItemCount){
                            productsLoading = false
                            //Add products
                            homeViewModel.addProducts()
                            productsLoading = true
                        }
                    }
                }
            }
        })

        productsObserver = Observer<List<AllHomeProducts>> {
            if(it.isNullOrEmpty()){
                CoroutineScope(Dispatchers.Main).launch {
                    val checkInternet = CheckInternetConnection(requireContext()).isConnectedToInternet(
                        this@MainFragment, binding.homeLayout
                    )
                    if(!checkInternet){
                        binding.homeLayout.visibility = View.VISIBLE
                    }
                }
            }else{
                progressDialog.dialog.dismiss()
                homeViewModel.dataToDisplay(it)
                binding.homeLayout.visibility = View.VISIBLE
                binding.AllProducts.visibility = View.VISIBLE
            }
        }
//        adapter.stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY

        homeViewModel.moreProducts.observe(viewLifecycleOwner, productsObserver)



        return binding.root
    }

}