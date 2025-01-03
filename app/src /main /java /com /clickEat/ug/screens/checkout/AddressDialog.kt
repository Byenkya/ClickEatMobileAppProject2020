package com.clickEat.ug.screens.checkout

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.core.text.HtmlCompat
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.*
import com.clickEat.ug.databinding.AddressLayoutBinding
import com.clickEat.ug.screens.account.deleteAddressAlert
import com.clickEat.ug.screens.cart.reloadFragment
import com.clickEat.ug.screens.login.CustomProgressDialog
import kotlinx.android.synthetic.main.item_information.*

class AddressDialog(): DialogFragment(){
    private val userViewModel: MainActivityViewModel by activityViewModels()
    internal lateinit var listener: AddressSelectedListener
    internal lateinit var adapter: AddressRecyclerView
    private val progressDialog = CustomProgressDialog()
    private var addressId: Int? = null

    companion object{
        fun newInstance(addresses: AllCustomerAddresses?):AddressDialog{
            val args = Bundle()
            args.putParcelable("addresses", addresses)
            val fragment = AddressDialog()
            fragment.arguments = args
            return fragment

        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let{
            val builder = AlertDialog.Builder(it)
            val binding = AddressLayoutBinding.inflate(layoutInflater)
            requireArguments().get("addresses").run {
                with(this as AllCustomerAddresses){
                    if(null != this.data){
                        for(i in this.data!!){
                            i.is_default = false
                        }
                        binding.items = this
                    }

                }
            }
//            binding.items = addresses as AllCustomerAddresses
            adapter = AddressRecyclerView(
                AddressListener { id: Int ->
                    addressId = id
                    adapter.currentList.forEach { customerAddress ->
                        customerAddress.is_default = customerAddress.id == addressId
                    }
                    adapter.notifyDataSetChanged()
                },
                    EditLocationListener { customerAddress: CustomerAddress ->
                        this.dialog?.dismiss()
                        EditAddress.editAddress = customerAddress
                        this.findNavController().navigate(R.id.editAddressFragment2)
//                        this.findNavController().navigate(
//                                CheckoutFragmentDirections.actionCheckoutFragmentToEditAddressFragment2(customerAddress.id, customerAddress.other_details)
//                        )
                    },
                    DeleteLocationListener { id: Int -> deleteAddressAlert(id,this,requireContext(),userViewModel,progressDialog).also { findNavController().navigate(R.id.mainFragment) } }
            )
            binding.availableAddressesView.adapter = adapter
            binding.executePendingBindings()
            builder.setView(binding.root)
            builder.setNegativeButton(HtmlCompat.fromHtml("<font color='#FF7F27'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)) { dialogInterface, _ ->
                dialogInterface.dismiss()
            }

            builder.setPositiveButton(HtmlCompat.fromHtml("<font color='#FF7F27'>Okay</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)) { dialogInterface, _ ->
                if (addressId != null) {
                    dialogInterface.dismiss()
                    listener.onDialogClickListener(addressId!!)
                } else {
                    Toast.makeText(
                        requireContext(),
                        "Please select an address to continue.",
                        Toast.LENGTH_LONG
                    ).run {
                        setGravity(Gravity.CENTER, 0, 0)
                        show()
                    }
                }
            }

            builder.setTitle("Your Addresses")
            builder.setIcon(R.drawable.ic_baseline_location_on_24)
            builder.setCancelable(false)
            builder.create()

        } ?: throw IllegalStateException("Activity cannot be null")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            listener = targetFragment as AddressSelectedListener
        } catch (e: ClassCastException) {
            throw ClassCastException("$e must implement AddressListener")
        }
    }

    interface AddressSelectedListener {
        fun onDialogClickListener(id: Int)
    }

    private fun deleteAddressAlert(
            id: Int,
            fragment: Fragment,
            context: Context,
            userViewModal: MainActivityViewModel,
            progressDialog: CustomProgressDialog
    ) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle("Alert")
        builder.setIcon(R.drawable.ic_baseline_error_outline_24)
        builder.setMessage("Are you sure you want to delete this address?")
        builder.setPositiveButton(HtmlCompat.fromHtml("<font color='#FF5722'>Yes</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)) { dialogInterface, _ ->
            dialogInterface.dismiss(); deleteAddress(id,fragment,context,userViewModal, progressDialog)
        }
        builder.setNegativeButton(
                HtmlCompat.fromHtml("<font color='#FF5722'>No</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ) { dialogInterface, _ -> dialogInterface.cancel() }

        builder.show()
    }

    private fun deleteAddress(
            id: Int,
            fragment: Fragment,
            context: Context,
            userViewModal: MainActivityViewModel,
            progressDialog: CustomProgressDialog
    ) {
        progressDialog.show(context, "Please Wait...")
        userViewModal.deleteAddress(id)
        userViewModal.response.observe(fragment, Observer {
            if (it.status == "error") {
                progressDialog.dialog.dismiss()
                showMessage(it, context)
            } else {
                progressDialog.dialog.dismiss()
                this.dismiss()
                showMessage(it, context)

            }
        })
    }

    private fun showMessage(it: ApiResponse, context: Context) {
        Toast.makeText(context,
                HtmlCompat
                        .fromHtml("<font color='#F81504'>${it.message}<br/> Logout To complete Update.</font>",
                                HtmlCompat.FROM_HTML_MODE_COMPACT),
                Toast.LENGTH_LONG).run {
            setGravity(Gravity.CENTER, 0, 0)
            show()
        }
    }
}