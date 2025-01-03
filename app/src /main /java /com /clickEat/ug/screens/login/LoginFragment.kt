package com.clickEat.ug.screens.login

import android.app.AlertDialog
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Rect
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.res.ResourcesCompat
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.LoginCredentials
import com.clickEat.ug.data.toCustomerTable
import com.clickEat.ug.databinding.FragmentLoginBinding
import com.clickEat.ug.screens.CheckInternetConnection
import kotlinx.android.synthetic.main.click_eat_image.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginFragment : Fragment() {
    companion object{
        const val  LOGIN_SUCCESSFUL: String = "LOGIN_SUCCESSFUL"
    }
    private val progressDialog = CustomProgressDialog()
    private val userViewModel: MainActivityViewModel by activityViewModels()
    private lateinit var binding: FragmentLoginBinding
    private lateinit var savedStateHandle: SavedStateHandle

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater ,R.layout.fragment_login, container, false)
        binding.lifecycleOwner = this
        val rect = Rect()
        requireActivity().window.decorView.getWindowVisibleDisplayFrame(rect)

        savedStateHandle = findNavController().previousBackStackEntry!!.savedStateHandle
        savedStateHandle.set(LOGIN_SUCCESSFUL, false)

        binding.button.setOnClickListener {
            progressDialog.show(requireContext(),"Please Wait...")
            if(validateInputs()){
                binding.loginLayout.visibility = View.GONE
                login(binding.telephone.text.toString(), binding.password.text.toString(), requireContext(), this)
            }else{
//                binding.card.layoutParams?.height = rect.height().div(2)
//                binding.imageView.layoutParams?.height = rect.height().div(2)
                binding.loginLayout.visibility = View.VISIBLE
                progressDialog.dialog.dismiss()
            }
        }

        binding.signup.setOnClickListener {
            this.findNavController().navigate(R.id.signUp)
        }

        binding.forgotPassword.setOnClickListener {
            this.findNavController().navigate(R.id.forgotPasswordFragment)
        }


        return binding.root
    }

    private fun login(telephone: String, password: String, context: Context, fragment: Fragment){
        CoroutineScope(Dispatchers.Main).launch {
            val checkInternet = CheckInternetConnection(requireContext()).onlyCheckForInternetConnectionAsync().await()
            if (checkInternet) {
                userViewModel.signInUser(LoginCredentials( telephone, password))
                userViewModel.result.observe(viewLifecycleOwner, Observer {
                    progressDialog.dialog.dismiss()
                    if(it != null){
                        binding.loginLayout.visibility = View.VISIBLE
                        userViewModel.deleteCustomer()
                        userViewModel.saveCustomerInfo(it)
                        savedStateHandle.set(LOGIN_SUCCESSFUL, true)
                        findNavController().navigate(R.id.mainFragment)
                    }else{
                        binding.loginLayout.visibility = View.VISIBLE
                        onAlertDialog(context, "User name or password is incorrect")
                    }
                })
            }else{
                binding.loginLayout.visibility = View.VISIBLE
                progressDialog.dialog.dismiss()
                onAlertDialog(requireContext(), "Please check your internet connection and try again.")
            }
        }
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

    private fun validateInputs():Boolean{
        var validate = false
        binding.apply {
            when {
                binding.telephone.text!!.isEmpty()-> {
                    binding.telephoneLayout.error = "Invalid Telephone number or email address!"
                    binding.telephoneLayout.setErrorTextColor(ColorStateList.valueOf(Color.RED))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                        binding.telephoneLayout.errorIconDrawable = ResourcesCompat.getDrawable(resources, R.drawable.ic_baseline_error_outline_24, null)
                    }

                }

                binding.telephone.text.toString().length !in 10..30-> {
                    binding.telephoneLayout.error = "Incomplete Telephone number or email address!"
                    binding.telephoneLayout.setErrorTextColor(ColorStateList.valueOf(Color.RED))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                        binding.telephoneLayout.errorIconDrawable = ResourcesCompat.getDrawable(resources, R.drawable.ic_baseline_error_outline_24, null)
                    }

                }

                binding.password.text!!.isEmpty()-> {
                    binding.passwordLayout.error = "Invalid Password!"
                    binding.passwordLayout.setErrorTextColor(ColorStateList.valueOf(Color.RED))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                        binding.passwordLayout.errorIconDrawable = ResourcesCompat.getDrawable(resources, R.drawable.ic_baseline_error_outline_24, null)
                    }

                }

                binding.password.text.toString().length !in 8..20-> {
                    binding.passwordLayout.error = "Password must be Atleast 8 characters and above!"
                    binding.passwordLayout.setErrorTextColor(ColorStateList.valueOf(Color.RED))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                        binding.passwordLayout.errorIconDrawable = ResourcesCompat.getDrawable(resources, R.drawable.ic_baseline_error_outline_24, null)
                    }

                }

                else-> validate = true
            }
        }

        return validate
    }

}