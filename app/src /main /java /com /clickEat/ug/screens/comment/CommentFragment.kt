package com.clickEat.ug.screens.comment

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.Comment
import com.clickEat.ug.databinding.FragmentCommentBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.login.CustomProgressDialog
import com.clickEat.ug.screens.rate.setColorFilter
import kotlinx.android.synthetic.main.add_comment_layout.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class CommentFragment : Fragment() {
    private val userViewModel: MainActivityViewModel by activityViewModels()
    private val progressDialog = CustomProgressDialog()
    private lateinit var binding: FragmentCommentBinding
    private lateinit var commentViewModel: CommentViewModel
    private lateinit var commentViewModelFactory: CommentsViewModalFactory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_comment, container, false)
        (activity as AppCompatActivity).supportActionBar?.title = CommentFragmentArgs.fromBundle(requireArguments()).productName
        val application  = requireNotNull(activity).application
        commentViewModelFactory = CommentsViewModalFactory(CommentFragmentArgs.fromBundle(requireArguments()).productId, application)
        commentViewModel = ViewModelProvider(this, commentViewModelFactory).get(CommentViewModel::class.java)

        binding.lifecycleOwner = this
//        progressDialog.show(requireContext(),"Please Wait...")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            setColorFilter(binding.progressBarComments.indeterminateDrawable, ResourcesCompat.getColor(requireContext().resources, R.color.colorPrimaryDark, null))
        }

        binding.noCommentsID.text = "Pleas Wait..."
        commentViewModel.comments.observe(viewLifecycleOwner, Observer {
//            progressDialog.dialog.dismiss()
            binding.progressBarComments.visibility = View.GONE
            if(null != it){
                if (it.isEmpty()){
//                    alert("No Comments Are Available!!")
                    binding.noCommentsID.text = "No comments"
                    binding.commentsLayout.visibility = View.VISIBLE
                } else {
                    binding.noCommentsID.visibility = View.GONE
                    binding.commentViewModal = commentViewModel
                    binding.productComments.adapter = CommentsRecyclerAdapter()
                    binding.commentsLayout.visibility = View.VISIBLE
                }

            }else{
                binding.noCommentsID.text = "Check your Internet Connection"
            }
        })

        binding.addComment.setOnClickListener {
            addCommentDialog(requireContext(),commentViewModel,userViewModel,this,CommentFragmentArgs.fromBundle(requireArguments()).productId)
        }

        return binding.root
    }

    private fun alert(message: String) {
        val builder = android.app.AlertDialog.Builder(this.context)
        builder.setTitle("Alert")
        builder.setIcon(R.drawable.ic_baseline_error_outline_24)
        builder.setMessage(message)
        builder.setNegativeButton(
                HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ) { dialogInterface, _ -> dialogInterface.cancel() }

        builder.show()
    }


}


fun addCommentDialog(
    context:Context,
    commentViewModel: CommentViewModel,
    userViewModel: MainActivityViewModel,
    fragment: Fragment,
    productID:Int
){
    val mDialogView = LayoutInflater.from(context).inflate(R.layout.add_comment_layout, null)

    val mBuilder = AlertDialog.Builder(context)
        .setView(mDialogView)
        .setTitle("Add Comment")
    val mAlertDialog = mBuilder.show()

    //dismiss dialog
//    mDialogView.no.setOnClickListener { mAlertDialog.dismiss() }

    //positive button
    mDialogView.add_comment.setOnClickListener {
        if(mDialogView.comment_value.text.isNullOrEmpty() || mDialogView.comment_value.text.isNullOrBlank()){
            mDialogView.comment_value.error = "Please Enter a Comment"
        }else{
            mAlertDialog.dismiss()
            userViewModel.currentUser.observe(fragment.viewLifecycleOwner, Observer { it ->
                if(it.names == "click_it" && it.email =="welcome to click it App" ){
                    val builder = android.app.AlertDialog.Builder(context)
                    builder.setTitle("Alert")
                    builder.setIcon(R.drawable.ic_baseline_error_outline_24)
                    builder.setMessage("Your must first signin to Comment on a Product")
                    builder.setPositiveButton("Signin"){_, _ ->
                        fragment.findNavController().navigate(R.id.login)
                    }
                    builder.setNegativeButton(
                        "Cancel"
                    ){dialogInterface, _ ->  dialogInterface.cancel()}

                    builder.show()
                }else if(it.names != "click_it" && it.email !="welcome to click it App" ){
                    commentViewModel.addProductComment(it.customer_id, Comment(productID, mDialogView.comment_value.text.toString()))

                    commentViewModel.comments.observe(fragment.viewLifecycleOwner, Observer {
                        it?.let {
                            if(it.isNullOrEmpty()){
                                Toast.makeText(
                                    context,
                                    HtmlCompat.fromHtml("<font color='#F81504'>Comment was not added successfully!!.</font>", HtmlCompat.FROM_HTML_MODE_COMPACT),
                                    Toast.LENGTH_LONG
                                ).run {
                                    setGravity(Gravity.CENTER, 0, 0)
                                    show()
                                }
                            }else{
                                Toast.makeText(
                                    context,
                                    HtmlCompat.fromHtml("<font color='#FF5722'>Comment added successfully</font>", HtmlCompat.FROM_HTML_MODE_COMPACT),
                                    Toast.LENGTH_LONG
                                ).run {
                                    setGravity(Gravity.CENTER, 0, 0)
                                    show()
                                }

                                reloadFragment(fragment)

                            }
                        }
                    })
                }
            })
        }
    }

}

private fun reloadFragment(fragment: Fragment): Int {
    val fragmentTransaction: FragmentTransaction = fragment.parentFragmentManager.beginTransaction()
    fragmentTransaction.detach(fragment)
    fragmentTransaction.attach(fragment)
    return fragmentTransaction.commit()
}