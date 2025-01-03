package com.clickEat.ug.screens.menu

import android.app.AlertDialog
import android.content.Context
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
import com.clickEat.ug.databinding.FragmentMenuBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.account.ViewPagerAdapter
import com.clickEat.ug.screens.login.CustomProgressDialog
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MenuFragment : Fragment() {
    private val progressDialog = CustomProgressDialog()
    private lateinit var binding: FragmentMenuBinding
    private lateinit var viewModalFactory: MenuViewModalFactory
    private val userViewModel: MainActivityViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val rect = Rect()
        requireActivity().window.decorView.getWindowVisibleDisplayFrame(rect)
        val application  = requireNotNull(activity).application
        (activity as AppCompatActivity).supportActionBar?.title = "Menu (${MenuFragmentArgs.fromBundle(requireArguments()).restaurantName})"
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_menu, container, false)
        viewModalFactory = MenuViewModalFactory(MenuFragmentArgs.fromBundle(requireArguments()).restaurantId, application)

        val menuViewModel: MenuViewModel by lazy {
            ViewModelProvider(this, viewModalFactory).get(MenuViewModel::class.java)
        }

        binding.lifecycleOwner = this
        progressDialog.show(requireContext(),"Please Wait...")

        menuViewModel.products.observe(viewLifecycleOwner, Observer {
            progressDialog.dialog.dismiss()
            if(null !=it){
                if (it.isEmpty()){
                    onAlertDialog(requireContext(),"Alert", "Menu not available")
                }else{
                    binding.viewModel = menuViewModel
                    val adapter = ViewPagerAdapter(this.childFragmentManager)
                    adapter.addFragment(AllMenuItemsFragment(
                        menuViewModel,
                        MenuFragmentArgs.fromBundle(requireArguments()).restaurantId,
                        MenuFragmentArgs.fromBundle(requireArguments()).restaurantName
                        ),
                        "All"
                    )
                    for (data in menuViewModel.products.value!!){
                        val subCatProductsFragment = SubCatProductsFragment(data)
                        adapter.addFragment(subCatProductsFragment, data.sub_category)
                    }
                    binding.menuViewpager.adapter = adapter
                    binding.menuTabs.setupWithViewPager(binding.menuViewpager)
                    binding.menuLayout.visibility = View.VISIBLE
                }

            }else{
                binding.menuLayout.visibility = View.VISIBLE
                CoroutineScope(Dispatchers.Main).launch {
                    CheckInternetConnection(requireContext()).isConnectedToInternet(
                        this@MenuFragment,
                        binding.menuLayout
                    )
                }
            }
        })


        return binding.root
    }

    private fun onAlertDialog(context: Context, message: String){
        val builder = AlertDialog.Builder(context)
        builder.setTitle("Authentication Failed !!!")
        builder.setIcon(R.drawable.ic_baseline_error_outline_24)
        builder.setMessage(message)
        builder.setNegativeButton(
                HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ){dialogInterface, _ ->  dialogInterface.cancel()}

        builder.show()
    }
    
}