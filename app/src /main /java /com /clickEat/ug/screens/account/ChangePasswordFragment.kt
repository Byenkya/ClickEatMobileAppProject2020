package com.clickEat.ug.screens.account

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.core.widget.doOnTextChanged
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.AccountInFormation
import com.clickEat.ug.data.ApiResponse
import com.clickEat.ug.data.ChangePassword
import com.clickEat.ug.databinding.ChangePasswordLayoutBinding
import com.clickEat.ug.databinding.PersonalAccountInfoBinding
import com.clickEat.ug.screens.login.CustomProgressDialog

class ChangePasswordFragment: Fragment() {
    private val progressDialog = CustomProgressDialog()
    private lateinit var binding: ChangePasswordLayoutBinding
    private val userViewModel: MainActivityViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.change_password_layout, container, false)
        binding.changePassword.setOnClickListener {
            if(validateInputs()){
                progressDialog.show(requireContext(),"Please Wait...")
                userViewModel.changeCustomerPassword(
                        AccountInFormation.accountInformation.customer_id,
                        ChangePassword(
                                binding.currentPass.text.toString(),
                                binding.ConfirmPass.text.toString()
                        )
                )
            }

            userViewModel.passwordStatus.observe(viewLifecycleOwner, Observer {
                progressDialog.dialog.dismiss()
                if(it.status == "error"){
                    passwordAlert(it)
                }else{
                    passwordAlert(it)
                }
            })
        }


        return binding.root
    }

    private fun passwordAlert(it: ApiResponse) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle("Alert")
        builder.setIcon(R.drawable.ic_baseline_error_outline_24)
        builder.setMessage(it.message)
        builder.setNegativeButton(
                HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ) { dialogInterface, _ -> dialogInterface.cancel() }

        builder.show()
    }

    private fun validateInputs(): Boolean{
        var validated = false
        binding.apply {
            when{
                binding.currentPass.text!!.isEmpty()-> {
                    binding.currentPassLayout.error = "Invalid Password"
                }

                binding.currentPass.text.toString().length !in 8..20-> {
                    binding.currentPassLayout.error = "Atleast more than 8 characters required!."
                }

                binding.newPass.text!!.isEmpty()-> {
                    binding.newPassLayout.error = "Invalid Password"
                }

                binding.newPass.text.toString().length !in 8..20-> {
                    binding.newPassLayout.error = "Atleast more than 8 characters required!."
                }

                binding.ConfirmPass.text!!.isEmpty()-> {
                    binding.ConfirmPassLayout.error = "Invalid Password"
                }

                binding.ConfirmPass.text.toString().length !in 8..20-> {
                    binding.ConfirmPassLayout.error = "Atleast more than 8 characters required!"
                }

                binding.newPass.text.toString() != binding.ConfirmPass.text.toString()-> {
                    binding.ConfirmPassLayout.error = "Password Mismatch"
                }

                else-> validated = true
            }
        }
        return validated
    }
}