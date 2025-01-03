package com.clickEat.ug.screens.edit_address

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.clickEat.ug.R
import com.clickEat.ug.data.CustomerNewAddress
import com.clickEat.ug.data.EditAddress
import com.clickEat.ug.databinding.FragmentEditAddressBinding
import com.clickEat.ug.screens.login.CustomProgressDialog

class EditAddressFragment : Fragment() {
    private val progressDialog = CustomProgressDialog()
    private lateinit var binding: FragmentEditAddressBinding
    private val viewModal: EditAddressModalView by viewModels()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        if(null != EditAddress.editAddress){
            val addressID = EditAddress.editAddress!!.id
            val otherDetails = EditAddress.editAddress!!.other_details
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_edit_address, container, false)
            binding.lifecycleOwner = this
            progressDialog.show(requireContext(),"Please Wait...")

            viewModal.places.observe(viewLifecycleOwner, Observer {
                progressDialog.dialog.dismiss()
                if(null != it){
                    binding.viewModel = viewModal
                    binding.otherDetails.setText(otherDetails)
                    binding.editAddressLayout.visibility = View.VISIBLE

                }else{
                    showAlert("No places found!!.")
                }
            })

            binding.updateAddress.setOnClickListener {
                if(validateInput()){
                    progressDialog.show(requireContext(),"Please Wait...")
                    binding.apply {
                        val selectedVillage = viewModal.places.value?.find { it.village == spinnerVillages.selectedItem as String }
                        viewModal.updateAddress(
                            addressID,
                            CustomerNewAddress(
                                selectedVillage?.county_name as String,
                                selectedVillage.sub_county_name,
                                selectedVillage.village,
                                binding.otherDetails.text.toString(),
                                false
                            )
                        )
                    }

                    viewModal.response.observe(viewLifecycleOwner, Observer {
                        progressDialog.dialog.dismiss()
                        if(null != it){
                            showAlert(it.message!!)
                        }else{
                            showAlert("Address was not updated!!.")
                        }
                    })

                }
            }
        }else{
            showAlert("No address selected!!")
        }


        return binding.root
    }

    private fun validateInput(): Boolean{
        var validated = false
        binding.apply {
            when{
                binding.otherDetails.text!!.isEmpty()-> {
                    binding.otherDetails.error = "Other details of your address are required!."
                }

                binding.otherDetails.text.toString().length !in 8..500-> {
                    binding.otherDetails.error = "Must be Atleast more than 8 characters!."
                }

                else-> validated = true
            }
        }

        return validated
    }

    private fun showAlert(message: String) {
        progressDialog.dialog.dismiss()
        val builder = AlertDialog.Builder(this.context)
        builder.setTitle("Alert")
        builder.setIcon(R.drawable.ic_baseline_error_outline_24)
        builder.setMessage(message)
        builder.setNegativeButton(
                HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ) { dialogInterface, _ -> dialogInterface.cancel() }

        builder.show()
    }

}