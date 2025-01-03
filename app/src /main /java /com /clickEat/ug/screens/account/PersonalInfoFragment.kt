package com.clickEat.ug.screens.account

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.*
import com.clickEat.ug.databinding.PersonalAccountInfoBinding
import com.clickEat.ug.screens.cart.reloadFragment
import com.clickEat.ug.screens.checkout.*
import com.clickEat.ug.screens.custom_categories.MainFragmentDirections
import com.clickEat.ug.screens.login.CustomProgressDialog

class PersonalInfoFragment: Fragment() {
    private val progressDialog = CustomProgressDialog()
    private lateinit var binding: PersonalAccountInfoBinding
    private lateinit var adapter: AddressRecyclerView
    private lateinit var viewModalFactory: AccountsViewModalFactory
    private lateinit var viewModal: AccountsViewModal
    private lateinit var addresses: ListCustomerAddresses
    private val userViewModel: MainActivityViewModel by activityViewModels()
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        addresses = AccountInFormation.addresses
        val accountInformation = AccountInFormation.accountInformation
        val application  = requireNotNull(activity).application
        viewModalFactory = AccountsViewModalFactory(accountInformation, application)
        viewModal = ViewModelProvider(this, viewModalFactory).get(AccountsViewModal::class.java)

        binding = DataBindingUtil.inflate(inflater, R.layout.personal_account_info, container, false)
        binding.lifecycleOwner = this
        viewModal.addresses.observe(this.viewLifecycleOwner, Observer {
            if(null != it){
                adapter = AddressRecyclerView(
                        AddressListener { id: Int ->
                            adapter.currentList.forEach { customerAddress ->
                                customerAddress.is_default = customerAddress.id == id
                            }
                            adapter.notifyDataSetChanged()
                        },
                        EditLocationListener { customerAddress: CustomerAddress ->
                            when (this.findNavController().currentDestination?.id){
                                R.id.mainFragment -> {
                                    this.findNavController().navigate(
                                        MainFragmentDirections.actionMainFragmentToEditAddressFragment2(customerAddress.id, customerAddress.other_details)
                                    )
                                }

                                R.id.accountFragment -> {
                                    this.findNavController().navigate(AccountFragmentDirections.actionAccountFragmentToEditAddressFragment2(customerAddress.id, customerAddress.other_details))
                                }
                            }
                        },
                        DeleteLocationListener { id: Int -> deleteAddressAlert(id,this,this.viewLifecycleOwner,requireContext(),userViewModel,progressDialog, addresses) }
                )
                binding.customerDeliveryAddresses.adapter = adapter
                binding.accountInformation = accountInformation
                binding.addresses = addresses
            }
        })


        binding.updateInfo.setOnClickListener {
            binding.apply {
                progressDialog.show(binding.root.context, "Please Wait...")
                var names: String? = null
                var email: String? = null
                var telContact: String? = null
                var secondTel: String? = null

                names = if(customerNames.text.isNullOrEmpty() || customerNames.text.isNullOrBlank()){
                    accountInformation.names
                }else{
                    customerNames.text.toString()
                }

                email = if(customerEmail.text.isNullOrEmpty() || customerEmail.text.isNullOrBlank()){
                    accountInformation.email
                }else{
                    customerEmail.text.toString()
                }

                telContact = if(contact.text.isNullOrEmpty() || contact.text.isNullOrBlank()){
                    accountInformation.contact
                }else{
                    contact.text.toString()
                }

                secondTel = if(secondContact.text.isNullOrEmpty() || secondContact.text.isNullOrBlank()){
                    accountInformation.second_contact
                }else{
                    secondContact.text.toString()
                }
                viewModal.updateCustomerInformation(
                        accountInformation.customer_id,
                        UpdateCustomer(names,email,telContact,secondTel)
                )
            }

            viewModal.accountInformation.observe(viewLifecycleOwner, Observer {
                if(it != null){
                    binding.apply {
                        progressDialog.dialog.dismiss()
                        customerNames.setText(it.names)
                        customerEmail.setText(it.email)
                        contact.setText(it.contact)
                        secondContact.setText(it.second_contact)
                        Toast.makeText(requireContext(),
                                HtmlCompat
                                        .fromHtml("<font color='#F81504'>Account Information Updated successfully!!<br/> Logout To complete Update.</font>",
                                                HtmlCompat.FROM_HTML_MODE_COMPACT),
                                Toast.LENGTH_LONG).run {
                            setGravity(Gravity.CENTER, 0, 0)
                            show()
                        }
                    }


                }else{
                    progressDialog.dialog.dismiss()
                    Toast.makeText(requireContext(),
                            HtmlCompat.fromHtml(
                                    "<font color='#F81504'>Account Information was not Updated!!</font>",
                                    HtmlCompat.FROM_HTML_MODE_COMPACT
                            ),
                            Toast.LENGTH_LONG).run {
                        setGravity(Gravity.CENTER, 0, 0)
                        show()
                    }
                }
            })
        }

        binding.addAddress.setOnClickListener {
            progressDialog.show(requireContext(), "Please Wait...")
            val viewModelFactory = CheckOutModelFactory(accountInformation.customer_id, application)
            val checkoutModel = activity?.run { ViewModelProvider(this, viewModelFactory).get(CheckOutViewModel::class.java) }
            checkoutModel?.getAllPlaces()
            checkoutModel?.places!!.observe(viewLifecycleOwner, Observer {
                if(null != it){
                    progressDialog.dialog.dismiss()
                    val dialog = NewAddressDialog.newInstance(AruaVillages(checkoutModel.places.value!!),accountInformation.customer_id)
                    dialog.setTargetFragment(this, 2)
                    dialog.isCancelable = false
                    dialog.show(this.parentFragmentManager, "NewAddressDialog")

                    userViewModel.newAddress.observe(viewLifecycleOwner, Observer {customerAddress->
                        progressDialog.show(requireContext(), "Please Wait...")
                        if(null != customerAddress){
                            viewModal.addNewAddress(accountInformation.customer_id, customerAddress)

                            viewModal.addresses.observe(viewLifecycleOwner, Observer {customerAddresses->
                                if(null != customerAddresses){
                                    progressDialog.dialog.dismiss()
                                    userViewModel._newAddress.value = null
                                    Toast.makeText(requireContext(),
                                            HtmlCompat
                                                    .fromHtml("<font color='#F81504'>Address added Successfully!!.</font>",
                                                            HtmlCompat.FROM_HTML_MODE_COMPACT),
                                            Toast.LENGTH_LONG).run {
                                        setGravity(Gravity.CENTER, 0, 0)
                                        show()
                                        var f = ArrayList<CustomerAddress>()
                                        for (addr in AccountInFormation.addresses.data!!){
                                            f.add(addr)
                                        }

                                        f.add(
                                                CustomerAddress(
                                                    f.count() + 1,
                                                    customerAddress.county!!,
                                                    customerAddress.sub_county!!,
                                                    customerAddress.village!!,
                                                    customerAddress.other_details!!,
                                                    customerAddress.is_default!!,
                                                    accountInformation.customer_id!!
                                            )
                                        )
                                        AccountInFormation.addresses = ListCustomerAddresses(f.toList())
                                        reloadFragment(this@PersonalInfoFragment)
                                    }

                                }else{
                                    progressDialog.dialog.dismiss()
                                    Toast.makeText(requireContext(),
                                            HtmlCompat
                                                    .fromHtml("<font color='#F81504'>Address not saved successfully!!.</font>",
                                                            HtmlCompat.FROM_HTML_MODE_COMPACT),
                                            Toast.LENGTH_LONG).run {
                                        setGravity(Gravity.CENTER, 0, 0)
                                        show()
                                    }
                                }
                            })
                        }else{
                            progressDialog.dialog.dismiss()
                        }
                    })
                }else{
                    progressDialog.dialog.dismiss()
                }
            })
        }

        return binding.root
    }

}

fun deleteAddressAlert(
        id: Int,
        fragment: Fragment,
        lifeCycle: LifecycleOwner,
        context: Context ,
        userViewModal: MainActivityViewModel,
        progressDialog: CustomProgressDialog,
        addresses: ListCustomerAddresses
) {
    val builder = AlertDialog.Builder(context)
    builder.setTitle("Alert")
    builder.setIcon(R.drawable.ic_baseline_error_outline_24)
    builder.setMessage("Are you sure you want to delete this address?")
    builder.setPositiveButton(HtmlCompat.fromHtml("<font color='#FF5722'>Yes</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)) { dialogInterface, _ ->
        dialogInterface.dismiss(); deleteAddress(id,fragment,lifeCycle,context,userViewModal, progressDialog, addresses)
    }
    builder.setNegativeButton(
            HtmlCompat.fromHtml("<font color='#FF5722'>No</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
    ) { dialogInterface, _ -> dialogInterface.cancel() }

    builder.show()
}

fun deleteAddress(
        id: Int,
        fragment: Fragment,
        lifeCycle: LifecycleOwner,
        context: Context,
        userViewModal: MainActivityViewModel,
        progressDialog: CustomProgressDialog,
        addresses: ListCustomerAddresses
) {
    progressDialog.show(context, "Please Wait...")
    userViewModal.deleteAddress(id)
    userViewModal.response.observe(lifeCycle, Observer {
        if (it.status == "error") {
            progressDialog.dialog.dismiss()
            showMessage(it, context)
        } else {
            progressDialog.dialog.dismiss()
            var customerAddresses = ListCustomerAddresses(addresses.data!!.filterNot { address -> address.id == id })
            AccountInFormation.addresses = customerAddresses
            reloadFragment(fragment)
            showMessage(it, context)

        }
    })
}

fun showMessage(it: ApiResponse, context: Context) {
    Toast.makeText(context,
            HtmlCompat
                    .fromHtml("<font color='#F81504'>${it.message}<br/> Logout To complete Update.</font>",
                            HtmlCompat.FROM_HTML_MODE_COMPACT),
            Toast.LENGTH_LONG).run {
        setGravity(Gravity.CENTER, 0, 0)
        show()
    }
}