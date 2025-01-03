package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEditAddressBindingImpl extends FragmentEditAddressBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.editAddressLayout, 2);
        sViewsWithIds.put(R.id.address, 3);
        sViewsWithIds.put(R.id.village_label, 4);
        sViewsWithIds.put(R.id.other_details_label, 5);
        sViewsWithIds.put(R.id.other_details, 6);
        sViewsWithIds.put(R.id.updateAddress, 7);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEditAddressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentEditAddressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (com.toptoche.searchablespinnerlibrary.SearchableSpinner) bindings[1]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.spinnerVillages.setTag(null);
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
            setViewModel((com.clickEat.ug.screens.edit_address.EditAddressModalView) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.clickEat.ug.screens.edit_address.EditAddressModalView ViewModel) {
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
                return onChangeViewModelPlaces((androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Village>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPlaces(androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Village>> ViewModelPlaces, int fieldId) {
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
        java.util.List<com.clickEat.ug.data.Village> viewModelPlacesGetValue = null;
        androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.Village>> viewModelPlaces = null;
        com.clickEat.ug.screens.edit_address.EditAddressModalView viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.places
                    viewModelPlaces = viewModel.getPlaces();
                }
                updateLiveDataRegistration(0, viewModelPlaces);


                if (viewModelPlaces != null) {
                    // read viewModel.places.getValue()
                    viewModelPlacesGetValue = viewModelPlaces.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.clickEat.ug.screens.edit_address.EditBindingAdapterKt.edit(this.spinnerVillages, viewModelPlacesGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.places
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}