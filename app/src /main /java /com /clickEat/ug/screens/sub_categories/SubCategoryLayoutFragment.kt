package com.clickEat.ug.screens.sub_categories

import android.graphics.Rect
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.R
import com.clickEat.ug.data.HomeSubCategoryDisplay
import com.clickEat.ug.databinding.FragmentSubCategoryLayoutBinding
import com.clickEat.ug.screens.custom_categories.CategoriesViewModel
import com.clickEat.ug.screens.custom_categories.HomeSubCategoryAdapter
import com.clickEat.ug.screens.custom_categories.SubCategoriesListener
import com.clickEat.ug.screens.login.CustomProgressDialog

class SubCategoryLayoutFragment : Fragment() {
    private val progressDialog = CustomProgressDialog()
    private lateinit var binding: FragmentSubCategoryLayoutBinding
    private lateinit var viewModal: SubCategoriesViewModal

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val application  = requireNotNull(activity).application
        val rect = Rect()
        requireActivity().window.decorView.getWindowVisibleDisplayFrame(rect)
        (activity as AppCompatActivity).supportActionBar?.title = "Sub Categories"
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater ,R.layout.fragment_sub_category_layout, container, false)
        viewModal = ViewModelProvider(this).get(SubCategoriesViewModal::class.java)
        binding.lifecycleOwner = this
        progressDialog.show(requireContext(),"Please Wait...")
        viewModal.subCats.observe(viewLifecycleOwner, Observer {
            progressDialog.dialog.dismiss()
            if(null != it){
                if(it.isNotEmpty()){
                    binding.viewModel = viewModal
                    val adapter = SubCategoriesRecyclerView(SubCategoriesRecyclerListener{subcat ->
                        this.findNavController().navigate(SubCategoryLayoutFragmentDirections.actionSubCategoryLayoutFragmentToSubCatProductsFragment(subcat.id, subcat.name))
                    })

                    binding.SubCatsLayout.adapter = adapter
//                    binding.executePendingBindings()
                }
            }
        })

        return binding.root
    }
}