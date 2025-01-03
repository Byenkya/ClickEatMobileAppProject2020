package com.clickEat.ug.screens.custom_categories

import android.graphics.Rect
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.clickEat.ug.MainActivityViewModel
import com.clickEat.ug.R
import com.clickEat.ug.data.*
import com.clickEat.ug.databinding.*
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.clickEat.ug.screens.menu.CartInformation
import com.clickEat.ug.screens.menu.FoodItemAdapter
import com.clickEat.ug.screens.menu.OnClickListener
import com.clickEat.ug.screens.menu.showCartDialog
import com.clickEat.ug.screens.rate.addToRecentlyViewed
import com.clickEat.ug.screens.rate.checkPreOrderStatus
import kotlin.math.abs

class HomePageRecyclerAdapter(
    val fragment: Fragment,
    val categoriesViewModel: CategoriesViewModel,
    val userViewModel: MainActivityViewModel,
    val rect: Rect
):
    ListAdapter<AllHomeProducts,  RecyclerView.ViewHolder>(HomePageRecyclerAdapterDiffCallback()) {
        companion object{
            const val VIEW_TYPE_COROUSEL = 0
            const val VIEW_TYPE_SUBCATEGORY = 1
            const val VIEW_TYPE_DEALOFTHEDAY = 2
            const val VIEW_TYPE_TOPCATEGORIES = 3
            const val VIEW_TYPE_SAMPLE_PRODUCTS = 4
            const val VIEW_TYPE_MORE_PRODUCTS = 5
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_COROUSEL -> ViewHolder1.from(parent,categoriesViewModel, fragment)
            VIEW_TYPE_SUBCATEGORY -> ViewHolder2.from(parent,categoriesViewModel, fragment)
            VIEW_TYPE_DEALOFTHEDAY -> ViewHolder3.from(parent,categoriesViewModel,fragment,userViewModel,rect)
            VIEW_TYPE_TOPCATEGORIES -> ViewHolder4.from(parent,fragment)
            VIEW_TYPE_SAMPLE_PRODUCTS -> ViewHolder5.from(parent,categoriesViewModel,fragment,userViewModel,rect)
            VIEW_TYPE_MORE_PRODUCTS -> ViewHolder6.from(parent,fragment,userViewModel,rect)
            else -> throw ClassCastException("Unknown view type $viewType)")
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(val item = getItem(position)){
            is AllHomeProducts.HomePictures -> VIEW_TYPE_COROUSEL
            is AllHomeProducts.HomeSubCategories -> VIEW_TYPE_SUBCATEGORY
            is AllHomeProducts.TopSellingProducts -> VIEW_TYPE_DEALOFTHEDAY
            is AllHomeProducts.TopHomeCategories -> VIEW_TYPE_TOPCATEGORIES
            is AllHomeProducts.HomeDisplayProducts -> VIEW_TYPE_SAMPLE_PRODUCTS
            is AllHomeProducts.MoreProducts -> VIEW_TYPE_MORE_PRODUCTS

        }
    }


    override fun onViewRecycled(holder: RecyclerView.ViewHolder) {
        super.onViewRecycled(holder)
        holder.setIsRecyclable(false)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is ViewHolder1 -> {
                 holder.bind()
            }

            is ViewHolder2 -> {
                holder.bind()
            }

            is ViewHolder3 -> {
                holder.bind()
            }

            is ViewHolder4 -> {
                holder.bind()
            }

            is ViewHolder5 -> {
                holder.bind()
            }

            is ViewHolder6 -> {
                val item = getItem(position) as AllHomeProducts.MoreProducts
                holder.bind(item.item)
            }
        }
    }

    class ViewHolder1 private constructor(val binding: CorouselViewLayoutBinding, val categoriesViewModel: CategoriesViewModel, val fragment: Fragment): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            categoriesViewModel.home_images.observe(fragment.viewLifecycleOwner, Observer {
                if (null != it){
                    binding.invalidateAll()
                    binding.viewModel = categoriesViewModel
                    binding.executePendingBindings()
                }
            })

        }

        companion object{
            fun from(parent: ViewGroup, categoriesViewModel: CategoriesViewModel, fragment: Fragment): ViewHolder1{
                val layoutInflater = LayoutInflater.from(parent.context!!)
                val binding = CorouselViewLayoutBinding.inflate(layoutInflater)
                return ViewHolder1(binding, categoriesViewModel, fragment)
            }
        }
    }

    class ViewHolder2 private  constructor(val binding: HomeSubCategoriesLayoutBinding, val categoriesViewModel: CategoriesViewModel, val fragment: Fragment): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            categoriesViewModel.subCategories.observe(fragment.viewLifecycleOwner, Observer {
                if(it != null){
                    binding.invalidateAll()
                    binding.viewModel = categoriesViewModel
                    val adapter = HomeSubCategoryAdapter(SubCategoriesListener{subcat: HomeSubCategoryDisplay ->
                        fragment.findNavController().navigate(MainFragmentDirections.actionMainFragmentToSubCatProductsFragment(subcat.id, subcat.name))
                    })
                    binding.seeMoreSubCats.setOnClickListener {
                        fragment.findNavController().navigate(MainFragmentDirections.actionMainFragmentToSubCategoryLayoutFragment())
                    }
                    binding.catsLayout.adapter = adapter
                    binding.executePendingBindings()
                }
            })

        }

        companion object{
            fun from(parent: ViewGroup, categoriesViewModel: CategoriesViewModel, fragment: Fragment): ViewHolder2{
                val layoutInflater = LayoutInflater.from(parent.context!!)
                val binding = HomeSubCategoriesLayoutBinding.inflate(layoutInflater)
                return ViewHolder2(binding, categoriesViewModel, fragment)
            }
        }
    }

    class ViewHolder3 private constructor(
        val binding: DealsOfTheDayLayoutBinding,
        val categoriesViewModel: CategoriesViewModel,
        val fragment: Fragment,
        val userViewModel: MainActivityViewModel,
        val rect: Rect
    ): RecyclerView.ViewHolder(binding.root){
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        fun bind(){
            categoriesViewModel.topSellingProducts.observe(fragment.viewLifecycleOwner, Observer { topSellingProducts ->
                if(null != topSellingProducts){
                    if(topSellingProducts.isNotEmpty()){
                        binding.invalidateAll()
                        binding.viewModel = categoriesViewModel
                        val imageSliderAdapter = FoodItemAdapter(
                            CartInformation { product -> showCartDialog(binding.root.context,userViewModel, fragment, product)},
                            OnClickListener { product ->
                                addToRecentlyViewed(product)
                                SelectedProduct.product = product
                                fragment.findNavController().navigate(R.id.rateFragment)
                            },
                            rect
                        )
                        val layoutManager =  LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
                        binding.dealsOfTheDayproducts.layoutManager = layoutManager
                        binding.dealsOfTheDayproducts.adapter = imageSliderAdapter
                        binding.dealsOfTheDayproducts.addOnScrollListener(object :
                            RecyclerView.OnScrollListener() {
                            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                                super.onScrolled(recyclerView, dx, dy)
                                scaleChildren()
                            }

                            private fun scaleChildren(
                                containerCenter: Int = rect.width() / 2,
                                minScaleDistanceFactor: Float = 2.2f,
                                scaleDownBy: Float = 0.5f
                            ) {
                                val scaleDistanceThreshold = minScaleDistanceFactor * containerCenter
                                for (i in 0 until imageSliderAdapter.itemCount) {
                                    if(layoutManager.getChildAt(i) != null){
                                        val child = layoutManager.getChildAt(i)!!
                                        val childCenter = (child.left + child.right) / 2f
                                        val distanceToCenter = abs(childCenter - containerCenter)

                                        val scaleDownAmount =
                                            (distanceToCenter / scaleDistanceThreshold).coerceAtMost(1f)
                                        val scale = 1f - scaleDownBy * scaleDownAmount

                                        child.scaleX = scale
                                        child.scaleY = scale
                                        val translationDirection = if (childCenter > containerCenter) -1 else 1
                                        val translationXFromScale =
                                            translationDirection * child.width * (1 - scale) / 2f
                                        child.translationX = translationXFromScale
                                    }

                                }
                            }
                        })
                        binding.dealsOfTheDayproducts.scrollY = 40
                        binding.dealsOfTheDayLayout.visibility = View.VISIBLE
                        binding.dealsOfTheDayTitle.visibility = View.VISIBLE
                        binding.dealsOfTheDayproducts.visibility = View.VISIBLE
                        binding.executePendingBindings()
                    }

                }else{
                    binding.dealsOfTheDayLayout.visibility = View.GONE
                }
            })
        }

        companion object{
            fun from(
                parent: ViewGroup,
                categoriesViewModel: CategoriesViewModel,
                fragment: Fragment,
                userViewModel: MainActivityViewModel,
                rect: Rect
            ): ViewHolder3{
                val layoutInflater = LayoutInflater.from(parent.context!!)
                val binding = DealsOfTheDayLayoutBinding.inflate(layoutInflater)
                return ViewHolder3(binding, categoriesViewModel, fragment,userViewModel, rect)
            }
        }
    }

    class ViewHolder4 private constructor(val binding: TopCategoryItemLayoutBinding, val fragment: Fragment): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            binding.invalidateAll()
            binding.breakfastLayout.setOnClickListener {
                fragment.findNavController().navigate(MainFragmentDirections.actionMainFragmentToCategoryFragment("Breakfast"))
            }
            binding.lunchLayout.setOnClickListener {
                fragment.findNavController().navigate(MainFragmentDirections.actionMainFragmentToCategoryFragment("Lunch"))
            }
            binding.dinnerLayout.setOnClickListener {
                fragment.findNavController().navigate(MainFragmentDirections.actionMainFragmentToCategoryFragment("Dinner"))
            }
        }

        companion object{
            fun from(parent: ViewGroup, fragment: Fragment): ViewHolder4{
                val layoutInflater = LayoutInflater.from(parent.context!!)
                val binding = TopCategoryItemLayoutBinding.inflate(layoutInflater)
                return ViewHolder4(binding,fragment)
            }
        }
    }

    class ViewHolder5 private constructor(
        val binding: SampleProductsFromDifferentSubcatLayoutBinding,
        val categoriesViewModel: CategoriesViewModel,
        val fragment: Fragment,
        val userViewModel: MainActivityViewModel,
        val rect: Rect
    ):RecyclerView.ViewHolder(binding.root){
        fun bind(){
            binding.invalidateAll()
            categoriesViewModel.products.observe(fragment.viewLifecycleOwner, Observer { homeProducts ->
                if(null != homeProducts){
                    binding.viewModel = categoriesViewModel
                    binding.homeProducts.adapter = HomeAdapter(userViewModel, fragment, rect)
                    binding.executePendingBindings()
                }
            })
        }

        companion object{
            fun from(
                parent: ViewGroup,
                categoriesViewModel: CategoriesViewModel,
                fragment: Fragment,
                userViewModel: MainActivityViewModel,
                rect: Rect): ViewHolder5{
                val layoutInflater = LayoutInflater.from(parent.context!!)
                val binding = SampleProductsFromDifferentSubcatLayoutBinding.inflate(layoutInflater)
                return ViewHolder5(binding,categoriesViewModel,fragment,userViewModel,rect)
            }
        }
    }

    class ViewHolder6 private constructor(
        val binding: MoreProductsLayoutBinding,
        val fragment: Fragment,
        val userViewModel: MainActivityViewModel,
        val rect: Rect
    ):RecyclerView.ViewHolder(binding.root){
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        fun bind(product: Product){
//            setColorFilter(binding.allProductsProgressBar.indeterminateDrawable, ResourcesCompat.getColor(binding.root.context.resources, R.color.colorPrimaryDark, null))
            binding.invalidateAll()
            binding.product = product
//            binding.allProductsLabel.text = "Recommened For You"
            binding.showCart = CartInformation { product -> showCartDialog(binding.root.context,userViewModel, fragment, product)}
            binding.onClickListener =  OnClickListener { product ->
                addToRecentlyViewed(product)
                SelectedProduct.product = product
                fragment.findNavController().navigate(R.id.rateFragment)
            }
            if(product.free_delivery){
                binding.freeDelivery.visibility = View.VISIBLE
            }

            if(product.available){
                binding.availableStatus.visibility = View.GONE
            }

            binding.productLinearlayout.layoutParams?.width = rect.width().div(2)
//            binding.productLayout.layoutParams?.width = rect.width().div(2)
            binding.itemImage.layoutParams?.height = rect.width().toFloat().div(2f).times(0.8).toInt()
            binding.executePendingBindings()
        }

        companion object{
            fun from(
                parent: ViewGroup,
                fragment: Fragment,
                userViewModel: MainActivityViewModel,
                rect: Rect): ViewHolder6{
                val layoutInflater = LayoutInflater.from(parent.context!!)
                val binding = MoreProductsLayoutBinding.inflate(layoutInflater)
                return ViewHolder6(binding,fragment,userViewModel,rect)
            }
        }
    }
}

class HomePageRecyclerAdapterDiffCallback: DiffUtil.ItemCallback<AllHomeProducts>(){
    override fun areItemsTheSame(oldItem: AllHomeProducts, newItem: AllHomeProducts): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: AllHomeProducts, newItem: AllHomeProducts): Boolean {
        return oldItem.itemId == newItem.itemId
    }
}

sealed class AllHomeProducts{

    object HomePictures: AllHomeProducts(){
        override val itemId: Int = 123
    }

    object HomeSubCategories: AllHomeProducts(){
        override val itemId: Int =124
    }

    object TopSellingProducts: AllHomeProducts(){
        override val itemId: Int = Int.MAX_VALUE
    }

    object TopHomeCategories: AllHomeProducts(){
        override val itemId: Int = Int.MIN_VALUE
    }

    object HomeDisplayProducts: AllHomeProducts(){
        override val itemId: Int = 1000 + Int.MIN_VALUE
    }

    data class MoreProducts(val item: Product): AllHomeProducts(){
        override val itemId: Int = 200 + item.product_id
    }

    abstract val itemId: Int

}



