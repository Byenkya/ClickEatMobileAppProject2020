package com.clickEat.ug.screens.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.R
import com.clickEat.ug.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val application  = requireNotNull(activity).application
        (activity as AppCompatActivity).supportActionBar?.title = "Categories"
        binding = DataBindingUtil.inflate(inflater , R.layout.fragment_home, container, false)
        val viewModel = ViewModelProvider(this).get(HomeFragmentViewModel::class.java)
        val adapter = CategoriesAdapter(viewModel.categories , CategoriesListener {
            category_name -> when(category_name){
            "Drinks" -> this.findNavController().navigate(R.id.drinksFragment)
            else -> this.findNavController().navigate(R.id.resturantsFragment)
        }

        })
        binding.categoriesList.adapter = adapter


        return binding.root
    }

}