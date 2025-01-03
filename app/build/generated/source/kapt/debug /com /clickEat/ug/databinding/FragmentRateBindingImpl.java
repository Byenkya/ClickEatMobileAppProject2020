package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRateBindingImpl extends FragmentRateBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.productImageLayout, 10);
        sViewsWithIds.put(R.id.rateProduct, 11);
        sViewsWithIds.put(R.id.star1, 12);
        sViewsWithIds.put(R.id.star2, 13);
        sViewsWithIds.put(R.id.star4, 14);
        sViewsWithIds.put(R.id.star5, 15);
        sViewsWithIds.put(R.id.star6, 16);
        sViewsWithIds.put(R.id.star3, 17);
        sViewsWithIds.put(R.id.functions, 18);
        sViewsWithIds.put(R.id.add2Cart, 19);
        sViewsWithIds.put(R.id.divider_total, 20);
        sViewsWithIds.put(R.id.call2Order, 21);
        sViewsWithIds.put(R.id.item_desc_label, 22);
        sViewsWithIds.put(R.id.commentsLayout, 23);
        sViewsWithIds.put(R.id.progressBar, 24);
        sViewsWithIds.put(R.id.noComments, 25);
        sViewsWithIds.put(R.id.productComments, 26);
        sViewsWithIds.put(R.id.viewMoreComments, 27);
        sViewsWithIds.put(R.id.addReview, 28);
        sViewsWithIds.put(R.id.recently_viewed_label, 29);
        sViewsWithIds.put(R.id.recentlyViewedProducts, 30);
        sViewsWithIds.put(R.id.productsYouMayLikeID, 31);
        sViewsWithIds.put(R.id.pymlike, 32);
        sViewsWithIds.put(R.id.progressBarProductsYouMayLike, 33);
        sViewsWithIds.put(R.id.productsYmayLikeLabel, 34);
        sViewsWithIds.put(R.id.subCatProducts, 35);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private FragmentRateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.LinearLayout) bindings[7]
            , (com.google.android.material.button.MaterialButton) bindings[19]
            , (com.google.android.material.button.MaterialButton) bindings[28]
            , (com.google.android.material.button.MaterialButton) bindings[21]
            , (android.widget.LinearLayout) bindings[23]
            , (android.view.View) bindings[20]
            , (com.google.android.material.textview.MaterialTextView) bindings[5]
            , (android.widget.LinearLayout) bindings[18]
            , (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) bindings[2]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[9]
            , (com.denzcoskun.imageslider.ImageSlider) bindings[1]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.textview.MaterialTextView) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[26]
            , (com.google.android.material.card.MaterialCardView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[34]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.ProgressBar) bindings[24]
            , (android.widget.ProgressBar) bindings[33]
            , (android.widget.TextView) bindings[32]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[6]
            , (com.google.android.material.textview.MaterialTextView) bindings[29]
            , (androidx.recyclerview.widget.RecyclerView) bindings[30]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[35]
            , (com.google.android.material.button.MaterialButton) bindings[27]
            );
        this.Norating.setTag(null);
        this.freeDeliveryLabel.setTag(null);
        this.headsUp.setTag(null);
        this.itemDescValue.setTag(null);
        this.itemImage.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.priceValue.setTag(null);
        this.productAvailabilty.setTag(null);
        this.productValue.setTag(null);
        this.ratingLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.clickEat.ug.screens.rate.RateViewModal) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.clickEat.ug.screens.rate.RateViewModal ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSelectedProduct((androidx.lifecycle.LiveData<com.clickEat.ug.data.Product>) object, fieldId);
            case 1 :
                return onChangeViewModelRate((androidx.lifecycle.LiveData<com.clickEat.ug.data.ProductRate>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSelectedProduct(androidx.lifecycle.LiveData<com.clickEat.ug.data.Product> ViewModelSelectedProduct, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRate(androidx.lifecycle.LiveData<com.clickEat.ug.data.ProductRate> ViewModelRate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<com.clickEat.ug.data.Product> viewModelSelectedProduct = null;
        androidx.lifecycle.LiveData<com.clickEat.ug.data.ProductRate> viewModelRate = null;
        com.clickEat.ug.data.ProductRate viewModelRateGetValue = null;
        com.clickEat.ug.data.Product viewModelSelectedProductGetValue = null;
        java.lang.String viewModelSelectedProductDescription = null;
        java.lang.String viewModelSelectedProductRestaurantName = null;
        com.clickEat.ug.screens.rate.RateViewModal viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectedProduct
                        viewModelSelectedProduct = viewModel.getSelectedProduct();
                    }
                    updateLiveDataRegistration(0, viewModelSelectedProduct);


                    if (viewModelSelectedProduct != null) {
                        // read viewModel.selectedProduct.getValue()
                        viewModelSelectedProductGetValue = viewModelSelectedProduct.getValue();
                    }


                    if (viewModelSelectedProductGetValue != null) {
                        // read viewModel.selectedProduct.getValue().description
                        viewModelSelectedProductDescription = viewModelSelectedProductGetValue.getDescription();
                        // read viewModel.selectedProduct.getValue().restaurant_name
                        viewModelSelectedProductRestaurantName = viewModelSelectedProductGetValue.getRestaurant_name();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.rate
                        viewModelRate = viewModel.getRate();
                    }
                    updateLiveDataRegistration(1, viewModelRate);


                    if (viewModelRate != null) {
                        // read viewModel.rate.getValue()
                        viewModelRateGetValue = viewModelRate.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.clickEat.ug.screens.rate.RatingBindingUtilKt.ratingIndicator(this.Norating, viewModelRateGetValue);
            com.clickEat.ug.screens.rate.RatingBindingUtilKt.ratingIndicator(this.ratingLayout, viewModelRateGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.clickEat.ug.screens.rate.RatingBindingUtilKt.freeDelivery(this.freeDeliveryLabel, viewModelSelectedProductGetValue);
            com.clickEat.ug.screens.rate.RatingBindingUtilKt.productHeadsUp(this.headsUp, viewModelSelectedProductGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemDescValue, viewModelSelectedProductDescription);
            com.clickEat.ug.screens.rate.RatingBindingUtilKt.productsDisplay(this.itemImage, viewModelSelectedProductGetValue);
            com.clickEat.ug.screens.rate.RatingBindingUtilKt.productPriceValue(this.priceValue, viewModelSelectedProductGetValue);
            com.clickEat.ug.screens.rate.RatingBindingUtilKt.productAvailability(this.productAvailabilty, viewModelSelectedProductGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productValue, viewModelSelectedProductRestaurantName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.selectedProduct
        flag 1 (0x2L): viewModel.rate
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}