package com.clickEat.ug.screens.resturants

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.R
import com.clickEat.ug.databinding.FragmentResturantsBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.login.CustomProgressDialog
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ResturantsFragment : Fragment() {
    private val progressDialog = CustomProgressDialog()
    private lateinit var binding: FragmentResturantsBinding
    private lateinit var viewModel: ResturantViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater , R.layout.fragment_resturants, container, false)
        viewModel = ViewModelProvider(this).get(ResturantViewModel::class.java)

        binding.lifecycleOwner = this
        progressDialog.show(requireContext(),"Please Wait...")

        viewModel.restaurants.observe(viewLifecycleOwner, Observer {
            progressDialog.dialog.dismiss()
            if(null != it){
                binding.viewModel = viewModel
                binding.resturantsRecycler.adapter =  RestaurantMainAdapter(RestaurantListener{
                        rest -> this.findNavController().navigate(ResturantsFragmentDirections.actionResturantsFragmentToMenuFragment(rest.id, rest.business_name))
                })
                binding.executePendingBindings()
                binding.restaurantLayout.visibility = View.VISIBLE

            }else{
                binding.restaurantLayout.visibility = View.VISIBLE
                CoroutineScope(Dispatchers.Main).launch {
                    CheckInternetConnection(requireContext()).isConnectedToInternet(
                        this@ResturantsFragment,
                        binding.restaurantLayout
                    )
                }
            }
        })




        return binding.root
    }


}