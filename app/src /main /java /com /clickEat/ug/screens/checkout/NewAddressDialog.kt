package com.clickEat.ug.screens.checkout

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.core.text.HtmlCompat
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.AruaDistrict
import com.clickEat.ug.data.AruaVillages
import com.clickEat.ug.data.CustomerNewAddress
import com.clickEat.ug.data.Village
import com.clickEat.ug.databinding.NewAddressLayoutBinding

class NewAddressDialog(): DialogFragment(){
    private  val viewModel: MainActivityViewModel by activityViewModels()
    companion object{
        fun newInstance(places: AruaVillages, customerID: Int):NewAddressDialog{
            val args = Bundle()
            args.putParcelable("places", places)
            args.putInt("customer_id", customerID)
            val fragment = NewAddressDialog()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let{
            val builder = AlertDialog.Builder(it)
            val binding = NewAddressLayoutBinding.inflate(layoutInflater)
            val places = requireArguments().get("places")
            binding.places = places as AruaVillages?
            binding.executePendingBindings()
            builder.setView(binding.root)

            builder.setNegativeButton(HtmlCompat.fromHtml("<font color='#FF7F27'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)) { dialogInterface, _ ->
                dialogInterface.dismiss()
            }

            builder.setPositiveButton(HtmlCompat.fromHtml("<font color='#FF7F27'>Save Address</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)) { dialogInterface, _ ->
                binding.apply {
                    val villagesDetails = this.places?.villages?.filter { village -> village.village == spinnerView.selectedItem as String }
                    viewModel.saveNewAddress(
                        CustomerNewAddress(
                                villagesDetails?.get(0)?.county_name,
                                villagesDetails?.get(0)?.sub_county_name,
                            spinnerView.selectedItem as String,
                            newOtherDetails.text.toString(),
                            newIsDefault.isChecked
                        )
                    )
                    dialogInterface.dismiss()
                }

            }

            builder.setTitle("New Address")
            builder.setIcon(R.drawable.ic_baseline_add_location_alt_24)
            builder.setCancelable(false)
            builder.create()



        }?: throw IllegalStateException("Activity cannot be null")


    }

}