package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeSubCategoriesLayoutBindingImpl extends HomeSubCategoriesLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.product_layout, 2);
        sViewsWithIds.put(R.id.seeMoreSubCats, 3);
        sViewsWithIds.put(R.id.cat_image, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeSubCategoriesLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private HomeSubCategoriesLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (com.google.android.material.card.MaterialCardView) bindings[2]
            , (android.widget.LinearLayout) bindings[3]
            );
        this.catsLayout.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
            setViewModel((com.clickEat.ug.screens.custom_categories.CategoriesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.clickEat.ug.screens.custom_categories.CategoriesViewModel ViewModel) {
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
                return onChangeViewModelSubCategories((androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomeSubCategoryDisplay>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSubCategories(androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomeSubCategoryDisplay>> ViewModelSubCategories, int fieldId) {
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
        java.util.List<com.clickEat.ug.data.HomeSubCategoryDisplay> viewModelSubCategoriesGetValue = null;
        com.clickEat.ug.screens.custom_categories.CategoriesViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.HomeSubCategoryDisplay>> viewModelSubCategories = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.subCategories
                    viewModelSubCategories = viewModel.getSubCategories();
                }
                updateLiveDataRegistration(0, viewModelSubCategories);


                if (viewModelSubCategories != null) {
                    // read viewModel.subCategories.getValue()
                    viewModelSubCategoriesGetValue = viewModelSubCategories.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.clickEat.ug.screens.custom_categories.CategoriesBindingUtilKt.sub_cat(this.catsLayout, viewModelSubCategoriesGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subCategories
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}