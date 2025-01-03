package com.clickEat.ug.screens.account

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.AccountInFormation
import com.clickEat.ug.data.Customer
import com.clickEat.ug.data.ListCustomerAddresses
import com.clickEat.ug.database.toCustomer
import com.clickEat.ug.databinding.FragmentAccountBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.cart.securityAlert
import com.clickEat.ug.screens.login.CustomProgressDialog
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AccountFragment : Fragment() {
    private val progressDialog = CustomProgressDialog()
    private lateinit var binding: FragmentAccountBinding
    private lateinit var viewModalFactory: AccountsViewModalFactory
    private lateinit var viewModal: AccountsViewModal
    private val userViewModel: MainActivityViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val application  = requireNotNull(activity).application
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_account, container, false)

        userViewModel.currentUser.observe(viewLifecycleOwner, Observer { customerDetails ->
            if(customerDetails.names == "click_it"  && customerDetails.email == "welcome to click it App"){
                securityAlert(requireContext(),this)
            }else{
//                val accountInformation = AccountFragmentArgs.fromBundle(requireArguments()).accountInformation
                val accountInformation = customerDetails.toCustomer()
                (activity as AppCompatActivity).supportActionBar?.title = accountInformation.names
                viewModalFactory = AccountsViewModalFactory(accountInformation, application)
                viewModal = ViewModelProvider(this, viewModalFactory).get(AccountsViewModal::class.java)
                binding.lifecycleOwner = this
                progressDialog.show(requireContext(),"Please Wait...")
                viewModal.addresses.observe(viewLifecycleOwner, Observer {
                    progressDialog.dialog.dismiss()
                    if(null != it){
                        val customerInfo: Customer? = accountInformation
                        AccountInFormation.addresses = ListCustomerAddresses(it)
                        AccountInFormation.accountInformation = customerInfo!!
                        val personalFragment = PersonalInfoFragment()


                        val adapter = ViewPagerAdapter(this.childFragmentManager)
                        adapter.addFragment(personalFragment, "Personal Info")
                        adapter.addFragment(ChangePasswordFragment(), "Accounts Info")
                        binding.viewpager.adapter = adapter
                        binding.tabs.setupWithViewPager(binding.viewpager)
                        binding.accountsLayout.visibility = View.VISIBLE
                    }else{
                        CoroutineScope(Dispatchers.Main).launch {
                            CheckInternetConnection(requireContext()).isConnectedToInternet(
                                this@AccountFragment,
                                binding.accountsLayout
                            )
                            binding.accountsLayout.visibility = View.VISIBLE
                        }
                    }
                })
            }
        })



        return binding.root
    }

}