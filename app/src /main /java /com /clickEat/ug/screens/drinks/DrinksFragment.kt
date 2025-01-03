package com.clickEat.ug.screens.drinks

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
import com.clickEat.ug.databinding.FragmentDrinksBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.login.CustomProgressDialog
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DrinksFragment : Fragment() {
    private val progressDialog = CustomProgressDialog()
    private lateinit var binding: FragmentDrinksBinding
    private lateinit var viewModel: DrinksViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_drinks, container, false)
        viewModel = ViewModelProvider(this).get(DrinksViewModel::class.java)

        binding.lifecycleOwner = this
        progressDialog.show(requireContext(),"Please Wait...")

        viewModel.drink.observe(viewLifecycleOwner, Observer {
            progressDialog.dialog.dismiss()
            if(null != it){
                binding.subCats = viewModel
                binding.drinks.adapter = DrinksRecyclerAdapter(
                        OnClickDrinkListener { subCat ->
                            this.findNavController().navigate(DrinksFragmentDirections.actionDrinksFragmentToListDrinksFragment(subCat.sub_category_id, subCat.name)) }
                )
                binding.executePendingBindings()
                binding.drinksLayout.visibility = View.VISIBLE
            }else{
                CoroutineScope(Dispatchers.Main).launch {
                    CheckInternetConnection(requireContext()).isConnectedToInternet(
                        this@DrinksFragment,
                        binding.drinksLayout
                    )
                    binding.drinksLayout.visibility = View.VISIBLE
                }
            }
        })



        return binding.root
    }

}