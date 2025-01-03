package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchBindingImpl extends FragmentSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchedProductLayout, 2);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.searchedProducts.setTag(null);
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
            setViewModal((com.clickEat.ug.screens.search.SearchViewModal) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModal(@Nullable com.clickEat.ug.screens.search.SearchViewModal ViewModal) {
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
                return onChangeViewModalSearchedProducts((androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Product>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModalSearchedProducts(androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Product>> ViewModalSearchedProducts, int fieldId) {
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
        java.util.List<com.clickEat.ug.data.Product> viewModalSearchedProductsGetValue = null;
        androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Product>> viewModalSearchedProducts = null;
        com.clickEat.ug.screens.search.SearchViewModal viewModal = mViewModal;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModal != null) {
                    // read viewModal.searchedProducts
                    viewModalSearchedProducts = viewModal.getSearchedProducts();
                }
                updateLiveDataRegistration(0, viewModalSearchedProducts);


                if (viewModalSearchedProducts != null) {
                    // read viewModal.searchedProducts.getValue()
                    viewModalSearchedProductsGetValue = viewModalSearchedProducts.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.clickEat.ug.screens.custom_categories.CategoriesBindingUtilKt.searchedProducts(this.searchedProducts, viewModalSearchedProductsGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModal.searchedProducts
        flag 1 (0x2L): viewModal
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}