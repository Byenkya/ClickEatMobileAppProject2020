package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainBindingImpl extends FragmentMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_layout, 2);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (com.google.android.material.card.MaterialCardView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.AllProducts.setTag(null);
        this.homeLayout.setTag(null);
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
                return onChangeViewModelMainRecycler((androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.screens.custom_categories.AllHomeProducts>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMainRecycler(androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.screens.custom_categories.AllHomeProducts>> ViewModelMainRecycler, int fieldId) {
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
        com.clickEat.ug.screens.custom_categories.CategoriesViewModel viewModel = mViewModel;
        java.util.List<com.clickEat.ug.screens.custom_categories.AllHomeProducts> viewModelMainRecyclerGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.clickEat.ug.screens.custom_categories.AllHomeProducts>> viewModelMainRecycler = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.mainRecycler
                    viewModelMainRecycler = viewModel.getMainRecycler();
                }
                updateLiveDataRegistration(0, viewModelMainRecycler);


                if (viewModelMainRecycler != null) {
                    // read viewModel.mainRecycler.getValue()
                    viewModelMainRecyclerGetValue = viewModelMainRecycler.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.clickEat.ug.screens.custom_categories.CategoriesBindingUtilKt.sample(this.AllProducts, viewModelMainRecyclerGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.mainRecycler
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}