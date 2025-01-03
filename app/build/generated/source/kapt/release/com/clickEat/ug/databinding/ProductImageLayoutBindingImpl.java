package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProductImageLayoutBindingImpl extends ProductImageLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ProductImageLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ProductImageLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.imageSliderItem.setTag(null);
        this.imageSliderItemLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSelectedProduct((androidx.lifecycle.LiveData<com.clickEat.ug.data.Product>) object, fieldId);
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<com.clickEat.ug.data.Product> viewModelSelectedProduct = null;
        java.lang.String viewModelSelectedProductProductPicture = null;
        com.clickEat.ug.data.Product viewModelSelectedProductGetValue = null;
        com.clickEat.ug.screens.rate.RateViewModal viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



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
                    // read viewModel.selectedProduct.getValue().product_picture
                    viewModelSelectedProductProductPicture = viewModelSelectedProductGetValue.getProduct_picture();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.clickEat.ug.screens.rate.RatingBindingUtilKt.itemImage(this.imageSliderItem, viewModelSelectedProductProductPicture);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.selectedProduct
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}