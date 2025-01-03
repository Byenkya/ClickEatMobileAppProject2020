package com.clickEat.ug.screens.forgot_password

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.R
import com.clickEat.ug.databinding.FragmentForgotPasswordBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.login.CustomProgressDialog
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ForgotPasswordFragment : Fragment() {
    private val progressDialog = CustomProgressDialog()
    val viewModel: ForgotPasswordViewModel by viewModels()
    private lateinit var binding: FragmentForgotPasswordBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_forgot_password, container, false)
        binding.lifecycleOwner = this

        binding.submitReset.setOnClickListener {
            if (binding.validateInputs()) {
                binding.forgotPasswordLayout.visibility = View.GONE
                progressDialog.show(requireContext(),"Please Wait...")
                binding.submitReset.isEnabled = false
                CoroutineScope(Dispatchers.Main).launch {
                    val checkInternet = CheckInternetConnection(requireContext()).onlyCheckForInternetConnectionAsync().await()

                    if(checkInternet){
                        viewModel.forgotPassword(binding.resetEmail.text.toString())
                        viewModel.result.observe(viewLifecycleOwner) {
                            progressDialog.dialog.dismiss()
                            if(it.message == "success"){
                                binding.forgotPasswordLayout.visibility = View.VISIBLE
                                binding.submitReset.isEnabled = true
                                binding.resetEmail.text!!.clear()
                                onAlertDialog(binding.root.context, "Alert",it.message.toString())
                                this@ForgotPasswordFragment.findNavController().navigate(R.id.login)
                            }else{
                                binding.submitReset.isEnabled = true
                                binding.forgotPasswordLayout.visibility = View.VISIBLE
                                onAlertDialog(binding.root.context, "Alert",it.message.toString())
                            }

                        }
                    }else{
                        progressDialog.dialog.dismiss()
                        binding.forgotPasswordLayout.visibility = View.VISIBLE
                        binding.submitReset.isEnabled = true
                        onAlertDialog(binding.root.context, "Network Error","Please check your internet connection and try again.")
                    }
                }

            }
        }
        return binding.root
    }

    private fun onAlertDialog(context: Context, title:String, message: String){
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setIcon(R.drawable.ic_baseline_info_24)
        builder.setMessage(message)
        builder.setNegativeButton(
            HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ){dialogInterface, _ ->  dialogInterface.cancel()}

        builder.show()
    }

    private fun isValidEmail(email: String): Boolean {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun FragmentForgotPasswordBinding.validateInputs(): Boolean {
        var validateInputs = false
        when {
            resetEmail.text!!.isEmpty() -> {
                resetEmailLayout.error = "Email is needed"
            }

            !isValidEmail(resetEmail.text.toString())-> {
                resetEmailLayout.error = "Invalid Email Address"
            }

            else -> {
                validateInputs = true
            }
        }
        return validateInputs
    }

}