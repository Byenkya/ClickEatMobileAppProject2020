package com.clickEat.ug.screens.rate

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.*
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.*
import com.clickEat.ug.databinding.FragmentRateBinding
import com.clickEat.ug.screens.CheckInternetConnection
import com.clickEat.ug.screens.comment.*
import com.clickEat.ug.screens.custom_categories.cat
import com.clickEat.ug.screens.custom_categories.searchedProducts
import com.clickEat.ug.screens.menu.CartInformation
import com.clickEat.ug.screens.menu.FoodItemAdapter
import com.clickEat.ug.screens.menu.OnClickListener
import com.clickEat.ug.screens.menu.showCartDialog
import com.clickEat.ug.screens.subcatproducts.SubCatProductsFragmentDirections
import kotlinx.android.synthetic.main.calltoorder.view.*
import kotlinx.android.synthetic.main.progress_dialog_view.view.*
import kotlinx.android.synthetic.main.rate_product_layout.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.math.abs

class RateFragment : Fragment() {
    private val userViewModel: MainActivityViewModel by activityViewModels()
    private lateinit var viewModalFactory: RateViewModalFactory
    private lateinit var rateViewModal: RateViewModal
    private lateinit var binding: FragmentRateBinding
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("ResourceAsColor")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rect = Rect()
        requireActivity().window.decorView.getWindowVisibleDisplayFrame(rect)
        val application  = requireNotNull(activity).application
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_rate, container, false)

        val selectedProduct = SelectedProduct.product
        (activity as AppCompatActivity).supportActionBar?.title = selectedProduct.product_name
        viewModalFactory = RateViewModalFactory(selectedProduct, application)
        rateViewModal = ViewModelProvider(this, viewModalFactory).get(RateViewModal::class.java)
        val commentViewModelFactory = CommentsViewModalFactory(rateViewModal.selectedProduct.value?.product_id!!, application)
        val comments = ViewModelProvider(this, commentViewModelFactory).get(CommentViewModel::class.java)
        binding.lifecycleOwner = this
        binding.viewModel = rateViewModal
        binding.executePendingBindings()
        binding.recentlyViewedProducts.adapter =  FoodItemAdapter(
            CartInformation { product -> showCartDialog(binding.root.context,userViewModel, this, product) },
            OnClickListener { product ->
                addToRecentlyViewed(product)
                SelectedProduct.product = product
                this.findNavController().navigate(R.id.rateFragment)
            },
            rect
        )
        binding.recentlyViewedProducts.searchedProducts(RecentlyViewed.products)

        // Progress Bar Color
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            setColorFilter(binding.progressBar.indeterminateDrawable, ResourcesCompat.getColor(requireContext().resources, R.color.colorPrimaryDark, null))
            setColorFilter(binding.progressBarProductsYouMayLike.indeterminateDrawable, ResourcesCompat.getColor(requireContext().resources, R.color.colorPrimaryDark, null))
        }

        binding.viewMoreComments.isEnabled = false
        binding.viewMoreComments.backgroundTintList = ColorStateList.valueOf(resources.getColor(android.R.color.darker_gray))
        binding.viewMoreComments.visibility = View.VISIBLE
        comments.comments.observe(viewLifecycleOwner, Observer {
            if(null != it){
                binding.commentsLayout.visibility = View.VISIBLE
                if(it.isEmpty()){
                    binding.productComments.visibility = View.GONE
                    binding.progressBar.visibility = View.GONE
                    binding.noComments.visibility = View.VISIBLE
                    binding.addReview.visibility = View.VISIBLE
                }else if(it.isNotEmpty()){
                    binding.progressBar.visibility = View.GONE
                    binding.productComments.adapter = CommentsRecyclerAdapter()
                    binding.productComments.productCommentsRatingSection(comments.comments.value)
                    binding.productComments.visibility = View.VISIBLE
                    binding.addReview.visibility = View.VISIBLE
//                    binding.productLayout.layoutParams?.width = rect.width().div(2).minus(40)
//                    binding.itemImage.layoutParams?.height = rect.width().div(2).minus(40)
                    binding.productImageLayout.layoutParams?.width = rect.width()
                    binding.itemImage.layoutParams?.height = rect.width().div(2)
//                    binding.itemImage.layoutParams?.height = rect.width()/2
//                    binding.itemImage.layoutParams?.width = rect.width()
                    if(it.size <= 3){
                        binding.viewMoreComments.isEnabled = false
                        binding.viewMoreComments.backgroundTintList = ColorStateList.valueOf(resources.getColor(android.R.color.darker_gray))
                        binding.viewMoreComments.visibility = View.VISIBLE
                    }else{
                        binding.viewMoreComments.visibility = View.VISIBLE
                        binding.viewMoreComments.isEnabled = true
                        binding.viewMoreComments.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#FF5722"))
                    }

                }
            }else{
                CoroutineScope(Dispatchers.Main).launch {
                    CheckInternetConnection(requireContext()).isConnectedToInternet(
                        this@RateFragment,
                        binding.commentsLayout
                    )
                    binding.commentsLayout.visibility = View.VISIBLE
                }
            }
        })

        rateViewModal.getProductsYouLike(selectedProduct.sub_category_id)

        rateViewModal.products.observe(viewLifecycleOwner, Observer {
            if(null != it){
                binding.progressBarProductsYouMayLike.visibility = View.GONE
                binding.productsYmayLikeLabel.visibility = View.GONE
                if(it.size == 1){
                    binding.productsYmayLikeLabel.visibility = View.VISIBLE
                    binding.productsYmayLikeLabel.text = "No products"
                }else if (it.isNotEmpty()){
                    binding.subCatProducts.visibility = View.VISIBLE
                    binding.subCatProducts.adapter = FoodItemAdapter(
                        CartInformation { product -> showCartDialog(binding.root.context,userViewModel, this, product) },
                        OnClickListener { product ->
                                            addToRecentlyViewed(product)
                                            SelectedProduct.product = product
                                            this.findNavController().navigate(R.id.rateFragment)
                                        },
                        rect
                    )

                    binding.subCatProducts.searchedProducts(it.filterNot { product -> product.product_id == selectedProduct.product_id })
                }
            }else{
                CoroutineScope(Dispatchers.Main).launch {
                    CheckInternetConnection(requireContext()).isConnectedToInternet(
                        this@RateFragment,
                        binding.productsYouMayLikeID
                    )
                    binding.productsYouMayLikeID.visibility = View.VISIBLE
                }
            }
        })

        binding.add2Cart.setOnClickListener {
            showCartDialog(requireContext(),userViewModel,this, selectedProduct)
        }

        binding.call2Order.setOnClickListener {
            val mDialogView = LayoutInflater.from(binding.root.context).inflate(R.layout.calltoorder, null)
            var id = mDialogView.orderNumbers.orderNumber1.id
            mDialogView.orderNumbers.check(id)
            val mBuilder = androidx.appcompat.app.AlertDialog.Builder(binding.root.context)
                .setView(mDialogView)
                .setTitle("Call to Order")
            mBuilder.setNegativeButton(HtmlCompat.fromHtml("<font color='#FF7F27'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT))
            {dialogInterface, _ ->  dialogInterface.cancel()}
            mBuilder.setPositiveButton(HtmlCompat.fromHtml("<font color='#FF7F27'>Call</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)){dialog, _ ->
                id = mDialogView.orderNumbers.checkedRadioButtonId
                val contact = mDialogView.orderNumbers.findViewById<RadioButton>(id).text.toString()
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:$contact")
                startActivity(intent)
                dialog.dismiss()
            }

            mBuilder.show()
        }

        binding.rateProduct.setOnClickListener {
            showRatings(requireContext(), selectedProduct.product_id, this, userViewModel, rateViewModal)
        }

        binding.addReview.setOnClickListener {
            addCommentDialog(requireContext(),comments,userViewModel,this,selectedProduct.product_id)
        }

        binding.viewMoreComments.setOnClickListener {
            this.findNavController().navigate(RateFragmentDirections.actionRateFragmentToCommentFragment(selectedProduct.product_id, selectedProduct.product_name))
        }
        return binding.root
    }


}

fun checkPreOrderStatus(product: Product){
    if(!product.available){
        PreOrderStatus.status = true
    }
}

fun addToRecentlyViewed(product: Product) {
    val productDetails = RecentlyViewed.products.filter { pdt -> pdt.product_id == product.product_id }
    if(productDetails.isEmpty()){
        if (RecentlyViewed.products.size == 10) {
            val productAt0 = RecentlyViewed.products[0]
            RecentlyViewed.products.remove(productAt0)
            RecentlyViewed.products.add(product)
        } else {
            RecentlyViewed.products.add(product)
        }
    }else{
        try {
            productDetails[0].available = product.available
        }catch (it: Throwable){
            println("Error while adding product to recently reviewed products: $it")
        }
    }

}

fun setColorFilter(drawable: Drawable, color: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        drawable.colorFilter = BlendModeColorFilter(color, BlendMode.SRC_ATOP)
    } else {
        @Suppress("DEPRECATION")
        drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
    }
}

private fun showRatings(context:Context, productID: Int, fragment: Fragment, userViewModal:MainActivityViewModel, rateViewModal: RateViewModal){
    userViewModal.currentUser.observe(fragment.viewLifecycleOwner, Observer {
        if(it.names == "click_it" && it.email =="welcome to click it App" ){
            val builder = android.app.AlertDialog.Builder(context)
            builder.setTitle("Alert")
            builder.setIcon(R.drawable.ic_baseline_error_outline_24)
            builder.setMessage("Your must first signin to Rate a Product")
            builder.setPositiveButton(HtmlCompat.fromHtml("<font color='#FF5722'>SignIn</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)){_, _ ->
                fragment.findNavController().navigate(R.id.login)
            }
            builder.setNegativeButton(
                    HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
            ){dialogInterface, _ ->  dialogInterface.cancel()}

            builder.show()
        }else if(it.names != "click_it" && it.email !="welcome to click it App" ){
            val customerID = it.customer_id
            val mDialogView = LayoutInflater.from(context).inflate(R.layout.rate_product_layout, null)

            val mBuilder = AlertDialog.Builder(context)
                .setView(mDialogView)
                .setTitle("Rate Product")

            mBuilder.setNegativeButton(
                HtmlCompat.fromHtml("<font color='#F81504'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
            ){dialogInterface, _ ->  dialogInterface.cancel()}

            val mAlertDialog = mBuilder.show()

            mDialogView.rate1.setOnClickListener {
                rateViewModal.rateProduct(productID,Rate(productID,customerID,1))
                mAlertDialog.dismiss()
                monitorRate(rateViewModal, fragment, context)
            }

            mDialogView.rate2.setOnClickListener {
                rateViewModal.rateProduct(productID,Rate(productID,customerID,2))
                mAlertDialog.dismiss()
                monitorRate(rateViewModal, fragment, context)
            }

            mDialogView.rate3.setOnClickListener {
                rateViewModal.rateProduct(productID,Rate(productID,customerID,3))
                mAlertDialog.dismiss()
                monitorRate(rateViewModal, fragment, context)
            }

            mDialogView.rate4.setOnClickListener {
                rateViewModal.rateProduct(productID,Rate(productID,customerID,4))
                mAlertDialog.dismiss()
                monitorRate(rateViewModal, fragment, context)
            }

            mDialogView.rate5.setOnClickListener {
                rateViewModal.rateProduct(productID,Rate(productID,customerID,5))
                mAlertDialog.dismiss()
                monitorRate(rateViewModal, fragment, context)
            }


        }
    })

}

private fun monitorRate(
    rateViewModal: RateViewModal,
    fragment: Fragment,
    context: Context
) {
    rateViewModal.rate.observe(fragment.viewLifecycleOwner, Observer { productRate ->
        if (null != productRate) {
            Toast.makeText(
                context,
                HtmlCompat.fromHtml(
                    "<font color='#FF5722'>Product Rated Successfully!!</font>",
                    HtmlCompat.FROM_HTML_MODE_COMPACT
                ),
                Toast.LENGTH_LONG
            ).show()
            reloadFragment(fragment)
        } else {
            Toast.makeText(
                context,
                HtmlCompat.fromHtml(
                    "<font color='#F81504'>Product was not Rated!!.</font>",
                    HtmlCompat.FROM_HTML_MODE_COMPACT
                ),
                Toast.LENGTH_LONG
            ).show()
        }
    })
}

private fun reloadFragment(fragment: Fragment): Int {
    val fragmentTransaction: FragmentTransaction = fragment.parentFragmentManager.beginTransaction()
    fragmentTransaction.detach(fragment)
    fragmentTransaction.attach(fragment)
    return fragmentTransaction.commit()
}
