package com.clickEat.ug.screens.signup

import android.app.Activity.RESULT_OK
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.Color
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.res.ResourcesCompat
import androidx.core.text.HtmlCompat
import androidx.core.widget.doOnTextChanged
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.R
import com.clickEat.ug.data.NewUser
import com.clickEat.ug.databinding.FragmentSignUpBinding
import com.clickEat.ug.screens.login.CustomProgressDialog


class SignUpFragment : Fragment() {
    private val progressDialog = CustomProgressDialog()
    private lateinit var signUpModelView: SignUpModelView
    private lateinit var bitmap: Bitmap
    private lateinit var imageView: ImageView
    private val pickImage = 100
    private var imageUri: Uri? = null
    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  DataBindingUtil.inflate(inflater ,R.layout.fragment_sign_up, container, false)
        signUpModelView = ViewModelProvider(this).get(SignUpModelView::class.java)

        binding.lifecycleOwner = this
        binding.viewModel = signUpModelView
        binding.executePendingBindings()
        binding.signUpLayout.visibility = View.VISIBLE

//        imageView = binding.imageView
//        binding.buttonLoadPicture.setOnClickListener {
//            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
//            startActivityForResult(gallery, pickImage)
//        }

        binding.saveDetails.setOnClickListener {
            progressDialog.show(requireContext(),"Please Wait...")
            if(validateInputs()){
                binding.apply{
                    signUpModelView.signUpUser(
                        NewUser(
                            customerNames.text.toString(),
                            customerEmail.text.toString(),
                            contact.text.toString(),
                            "clickEat.png",
                            confirmPass.text.toString()
                        )
                    )
                }


                signUpModelView.result.observe(viewLifecycleOwner, Observer {
                    progressDialog.dialog.dismiss()
                    it?.let {
                        if (it.status == "success"){
                            onAlertDialog(requireContext(), "Success", it.message.toString())
                            findNavController().navigate(SignUpFragmentDirections.actionSignUpFragmentToLoginFragment())
                        }else{
                            it.message?.let { error -> onAlertDialog(requireContext(), "Error", error) }
                        }
                        signUpModelView.result.value  = null
                    }
                })
            }else{
                progressDialog.dialog.dismiss()
            }

        }

        binding.customerEmail.doOnTextChanged { text, _, _, _ ->
            if (!isValidEmail(text.toString())){
                binding.emailLayout.error = "Invalid Email Address"
                binding.emailLayout.setErrorTextColor(ColorStateList.valueOf(Color.RED))
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    binding.emailLayout.errorIconDrawable = ResourcesCompat.getDrawable(resources, android.R.drawable.ic_dialog_alert, null)
                }
                binding.emailLayout.isErrorEnabled = true
            }else {
                binding.emailLayout.error = null
                binding.emailLayout.boxStrokeColor = Color.GREEN
                binding.emailLayout.setErrorTextColor(ColorStateList.valueOf(Color.GREEN))
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    binding.emailLayout.errorIconDrawable =
                        ResourcesCompat.getDrawable(
                            resources,
                            R.drawable.ic_baseline_check_circle_24,
                            null
                        )
                }

                binding.emailLayout.isErrorEnabled = true

            }
        }

        binding.contact.doOnTextChanged { text,_ ,_ ,_ ->
            if (text.toString().length  !in 10..13) {
                binding.contactLayout.error = "invalid contact"
                binding.contactLayout.setErrorTextColor(ColorStateList.valueOf(Color.RED))
                binding.contactLayout.boxStrokeColor = Color.RED
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    binding.contactLayout.errorIconDrawable = ResourcesCompat.getDrawable(resources, android.R.drawable.ic_dialog_alert, null)
                }

                binding.contactLayout.isErrorEnabled = true
            }else {
                binding.contactLayout.error = null
                binding.contactLayout.boxStrokeColor = Color.GREEN
                binding.contactLayout.setErrorTextColor(ColorStateList.valueOf(Color.GREEN))
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    binding.contactLayout.errorIconDrawable = ResourcesCompat.getDrawable(
                        resources,
                        R.drawable.ic_baseline_check_circle_24,
                        null
                    )
                }

                binding.contactLayout.isErrorEnabled = true
            }
        }

        binding.pass.doOnTextChanged { text, _, _, _ ->
            if ( binding.pass.text.toString().length !in 8..20) {
                binding.passLayout.error = "Atleast more than 8 characters required!."
                binding.passLayout.setErrorTextColor(ColorStateList.valueOf(Color.RED))
                binding.passLayout.boxStrokeColor = Color.RED
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    binding.passLayout.errorIconDrawable = ResourcesCompat.getDrawable(resources, android.R.drawable.ic_dialog_alert, null)
                }

                binding.passLayout.isErrorEnabled = true
            }else {
                binding.passLayout.error = null
                binding.passLayout.boxStrokeColor = Color.GREEN
                binding.passLayout.setErrorTextColor(ColorStateList.valueOf(Color.GREEN))
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    binding.passLayout.errorIconDrawable =  ResourcesCompat.getDrawable(
                        resources,
                        R.drawable.ic_baseline_check_circle_24,
                        null
                    )
                }

                binding.passLayout.isErrorEnabled = true
            }
        }

        binding.confirmPass.doOnTextChanged { text, _, _, _ ->
            if (binding.pass.text.toString() != text.toString()){
                binding.confirmLayout.error = "Confirm password should equal to new password."
                binding.confirmLayout.setErrorTextColor(ColorStateList.valueOf(Color.RED))
                binding.confirmLayout.boxStrokeColor = Color.RED
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    binding.confirmLayout.errorIconDrawable = ResourcesCompat.getDrawable(resources, android.R.drawable.ic_dialog_alert, null)
                }

                binding.confirmLayout.isErrorEnabled = true

            }else {
                binding.confirmLayout.error = null
                binding.confirmLayout.boxStrokeColor = Color.GREEN
                binding.confirmLayout.setErrorTextColor(ColorStateList.valueOf(Color.GREEN))
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    binding.confirmLayout.errorIconDrawable =
                        ResourcesCompat.getDrawable(
                            resources,
                            R.drawable.ic_baseline_check_circle_24,
                            null
                        )
                }

                binding.confirmLayout.isErrorEnabled = true
            }
        }

        return binding.root
    }

    private fun onAlertDialog(context: Context,title: String, message: String){
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setIcon(R.drawable.ic_baseline_info_24)
        builder.setMessage(message)
        builder.setNegativeButton(
                HtmlCompat.fromHtml("<font color='#FF7F27'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ){dialogInterface, _ ->  dialogInterface.cancel()}

        builder.show()
    }

    private fun isValidEmail(email: String): Boolean {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }


//    private fun convertToString(): String? {
//        val byteArrayOutputStream = ByteArrayOutputStream()
//        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream)
//        val imgByte = byteArrayOutputStream.toByteArray()
//        return Base64.encodeToString(imgByte, Base64.DEFAULT)
//    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            try{
                imageUri = data?.data
//                bitmap = MediaStore.Images.Media.getBitmap(context?.contentResolver,imageUri);
                imageView.setImageURI(imageUri)
            }catch (it: Throwable){
                it.message?.let { error -> onAlertDialog(requireContext(), "Error", error) }

            }

        }
    }

    private fun validateInputs(): Boolean{
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            val drawable = ResourcesCompat.getDrawable(resources,R.drawable.ic_baseline_error_outline_24,null)
            drawable?.setBounds(0,0, drawable.intrinsicWidth, drawable.intrinsicHeight)
        }

        var validated = false
        binding.apply {
            when {
                binding.customerNames.text!!.isEmpty()-> {
                    binding.namesLayout.error = "Invalid Names"
                    binding.namesLayout.setErrorTextColor(ColorStateList.valueOf(Color.RED))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                        binding.namesLayout.errorIconDrawable = ResourcesCompat.getDrawable(resources, R.drawable.ic_baseline_error_outline_24, null)
                    }

                }

                binding.customerNames.text.toString().length < 5-> {
                    binding.namesLayout.error = "Names field must be more than 5 characters."
                    binding.namesLayout.setErrorTextColor(ColorStateList.valueOf(Color.RED))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                        binding.namesLayout.errorIconDrawable = ResourcesCompat.getDrawable(resources, R.drawable.ic_baseline_error_outline_24, null)
                    }

                }

                binding.confirmPass.text!!.isEmpty()-> {
                    binding.confirmLayout.error = "Invalid Password."
                    binding.confirmLayout.setErrorTextColor(ColorStateList.valueOf(Color.RED))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                        binding.confirmLayout.errorIconDrawable = ResourcesCompat.getDrawable(resources, R.drawable.ic_baseline_error_outline_24, null)
                    }

                }

                binding.confirmPass.text.toString().length !in 8..20-> {
                    binding.confirmLayout.error = "Atleast more than 8 characters required!."
                    binding.confirmLayout.setErrorTextColor(ColorStateList.valueOf(Color.RED))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                        binding.confirmLayout.errorIconDrawable = ResourcesCompat.getDrawable(resources, R.drawable.ic_baseline_error_outline_24, null)
                    }

                }

                binding.pass.text.toString() != binding.confirmPass.text.toString()-> {
                    binding.confirmLayout.error = "Password Mismatch"
                    binding.confirmLayout.setErrorTextColor(ColorStateList.valueOf(Color.RED))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                        binding.confirmLayout.errorIconDrawable = ResourcesCompat.getDrawable(resources, R.drawable.ic_baseline_error_outline_24, null)
                    }

                }

                else-> validated = true

            }
        }

        return validated

    }



}

