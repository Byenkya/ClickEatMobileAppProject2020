package com.clickEat.ug.screens.custom_categories

import android.app.AlertDialog
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.net.toUri
import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.clickEat.ug.R
import com.clickEat.ug.data.*
import com.clickEat.ug.screens.menu.FoodItemAdapter
import com.clickEat.ug.screens.sub_categories.SubCategoriesRecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.synnapps.carouselview.CarouselView

@BindingAdapter("title")
fun TextView.title(data: HomePageInfo?){
    data?.let {
        text = it.titleInfo.title
    }
}

@BindingAdapter("subCatHomeName")
fun TextView.subCatHomeName(data: HomeSubCategoryDisplay?){
    data?.let {
        text = it.name
    }
}

@BindingAdapter("SubCatImage")
fun ImageView.SubCatImage(data: HomeSubCategoryDisplay){
    data.let {
        val imageUri = "http://92.205.24.64/static/product_images/${it.subCatImage}".toUri()
        Glide.with(context)
                .load(imageUri)
                .apply(
                        RequestOptions()
                                .placeholder(R.drawable.loading)
                                .error(R.drawable.ic_baseline_photo_24))
                .into(this)
    }
}

@BindingAdapter("subCatText")
fun TextView.subCatText(data: HomeSubCategoryDisplay){
    data.let {
        text = it.name
    }
}

@BindingAdapter("cat")
fun RecyclerView.cat(data: List<HomePageInfo>?){
    data?.let {
        with(adapter as HomeAdapter){
            this.submitList(it)
        }
    }
}

@BindingAdapter("sub_cat")
fun RecyclerView.sub_cat(data: List<HomeSubCategoryDisplay>?){
    data?.let {
        with(adapter as HomeSubCategoryAdapter){
            if(it.size <= 4){
                this.submitList(it)
            }else{
                this.submitList(it.subList(0, 4))
            }

        }
    }
}

@BindingAdapter("subCategoryLayoutFragmentBinding")
fun RecyclerView.subCategoryLayoutFragmentBinding(data: List<HomeSubCategoryDisplay>?){
    data?.let {
        with(adapter as? SubCategoriesRecyclerView){
            this?.submitList(it)

        }
    }
}

@BindingAdapter("homeItems")
fun RecyclerView.homeItems(data: HomePageInfo?){
    data?.let {
        with(adapter as FoodItemAdapter){
            this.submitList(it.products)
        }
    }
}


@BindingAdapter("searchedProducts")
fun RecyclerView.searchedProducts(data: List<Product>?){
    data?.let {
        with(adapter as FoodItemAdapter){
            this.submitList(it)
        }
    }
}

@BindingAdapter("topDealsOfTheDay")
fun RecyclerView.topDealsOfTheDay(data: List<Product>?){
    data?.let{
        with(adapter as FoodItemAdapter){
            this.submitList(it)
        }
    }
}

@BindingAdapter("moreProducts")
fun RecyclerView.moreProducts(data: List<Product>?){
    data?.let {
        with(adapter as FoodItemAdapter){
            this.submitList(it)

        }
    }
}

@BindingAdapter("homeProductsAdapter")
fun RecyclerView.sample(data: List<AllHomeProducts>?){
    data?.let{
        with(adapter as HomePageRecyclerAdapter){
            this.submitList(it)
        }
    }
}

//@BindingAdapter("homeImageSlider")
//fun ImageSlider.homeImageSlider(item: List<HomeImages>?){
//    item?.let {
//        val imageList = ArrayList<SlideModel>()
//        for(img in it){
//            val image = SlideModel("http://10.0.2.2:5000/static/home_images/${img.image_name}", img.image_desc, ScaleTypes.FIT)
//            imageList.add(image)
//        }
//        setImageList(imageList)
//    }
//}

@BindingAdapter("carouselView")
fun CarouselView.carouselView(item: List<HomeImages>?){
    item?.let {

        setImageListener { position, imageView ->
            val imageUri = "http://92.205.24.64/static/home_images/${item[position].image_name}".toUri()
            Glide.with(context)
                .load(imageUri)
                .apply(
                    RequestOptions()
                        .placeholder(R.drawable.loading)
                        .error(R.drawable.ic_baseline_photo_24))
                .into(imageView)
        }

        pageCount = item.size

        setImageClickListener { position ->
            val builder = AlertDialog.Builder(context)
            builder.setTitle(item[position].info_type)
            builder.setIcon(R.drawable.ic_baseline_info_24)
            builder.setMessage(item[position].image_desc)
            builder.setNegativeButton(
                    HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
            ) { dialogInterface, _ -> dialogInterface.cancel() }

            builder.show()
        }
    }
}