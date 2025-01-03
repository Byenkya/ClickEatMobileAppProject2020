package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SubcatCustomLayoutBindingImpl extends SubcatCustomLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SubcatCustomLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private SubcatCustomLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.subCatProducts.setTag(null);
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
        if (BR.viewModal == variableId) {
            setViewModal((com.clickEat.ug.screens.subcatproducts.SubCatProductsViewModal) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModal(@Nullable com.clickEat.ug.screens.subcatproducts.SubCatProductsViewModal ViewModal) {
        this.mViewModal = ViewModal;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModal);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModalSubCatProducts((androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Product>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModalSubCatProducts(androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Product>> ViewModalSubCatProducts, int fieldId) {
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
        java.util.List<com.clickEat.ug.data.Product> viewModalSubCatProductsGetValue = null;
        com.clickEat.ug.screens.subcatproducts.SubCatProductsViewModal viewModal = mViewModal;
        androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Product>> viewModalSubCatProducts = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModal != null) {
                    // read viewModal.subCatProducts
                    viewModalSubCatProducts = viewModal.getSubCatProducts();
                }
                updateLiveDataRegistration(0, viewModalSubCatProducts);


                if (viewModalSubCatProducts != null) {
                    // read viewModal.subCatProducts.getValue()
                    viewModalSubCatProductsGetValue = viewModalSubCatProducts.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.clickEat.ug.screens.custom_categories.CategoriesBindingUtilKt.searchedProducts(this.subCatProducts, viewModalSubCatProductsGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModal.subCatProducts
        flag 1 (0x2L): viewModal
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}