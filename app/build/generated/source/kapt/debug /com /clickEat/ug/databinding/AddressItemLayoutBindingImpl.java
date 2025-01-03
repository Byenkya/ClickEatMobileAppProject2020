package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AddressItemLayoutBindingImpl extends AddressItemLayoutBinding implements com.clickEat.ug.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout4, 7);
        sViewsWithIds.put(R.id.divider3, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AddressItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private AddressItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.textview.MaterialTextView) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (android.view.View) bindings[8]
            , (android.widget.ImageView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            );
        this.AddressDetails.setTag(null);
        this.deleteLocation.setTag(null);
        this.editLocation.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.cardview.widget.CardView) bindings[1];
        this.mboundView1.setTag(null);
        this.pickupAddressTitle.setTag(null);
        this.viewMoreInfo.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new com.clickEat.ug.generated.callback.OnClickListener(this, 2);
        mCallback13 = new com.clickEat.ug.generated.callback.OnClickListener(this, 3);
        mCallback11 = new com.clickEat.ug.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.item == variableId) {
            setItem((com.clickEat.ug.data.CustomerAddress) variable);
        }
        else if (BR.editListener == variableId) {
            setEditListener((com.clickEat.ug.screens.checkout.EditLocationListener) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((com.clickEat.ug.screens.checkout.AddressListener) variable);
        }
        else if (BR.deleteListener == variableId) {
            setDeleteListener((com.clickEat.ug.screens.checkout.DeleteLocationListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.clickEat.ug.data.CustomerAddress Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setEditListener(@Nullable com.clickEat.ug.screens.checkout.EditLocationListener EditListener) {
        this.mEditListener = EditListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.editListener);
        super.requestRebind();
    }
    public void setClickListener(@Nullable com.clickEat.ug.screens.checkout.AddressListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setDeleteListener(@Nullable com.clickEat.ug.screens.checkout.DeleteLocationListener DeleteListener) {
        this.mDeleteListener = DeleteListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.deleteListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.clickEat.ug.data.CustomerAddress item = mItem;
        com.clickEat.ug.screens.checkout.EditLocationListener editListener = mEditListener;
        com.clickEat.ug.screens.checkout.AddressListener clickListener = mClickListener;
        com.clickEat.ug.screens.checkout.DeleteLocationListener deleteListener = mDeleteListener;

        if ((dirtyFlags & 0x11L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            com.clickEat.ug.screens.checkout.CheckOutBindingUtilKt.addressDetails(this.AddressDetails, item);
            com.clickEat.ug.screens.checkout.CheckOutBindingUtilKt.addressTitle(this.pickupAddressTitle, item);
            com.clickEat.ug.screens.checkout.CheckOutBindingUtilKt.selectedCustomerAddress(this.viewMoreInfo, item);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.deleteLocation.setOnClickListener(mCallback13);
            this.editLocation.setOnClickListener(mCallback12);
            this.mboundView1.setOnClickListener(mCallback11);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // item
                com.clickEat.ug.data.CustomerAddress item = mItem;
                // editListener != null
                boolean editListenerJavaLangObjectNull = false;
                // editListener
                com.clickEat.ug.screens.checkout.EditLocationListener editListener = mEditListener;



                editListenerJavaLangObjectNull = (editListener) != (null);
                if (editListenerJavaLangObjectNull) {



                    editListener.onClick(item);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // item
                com.clickEat.ug.data.CustomerAddress item = mItem;
                // deleteListener
                com.clickEat.ug.screens.checkout.DeleteLocationListener deleteListener = mDeleteListener;
                // deleteListener != null
                boolean deleteListenerJavaLangObjectNull = false;



                deleteListenerJavaLangObjectNull = (deleteListener) != (null);
                if (deleteListenerJavaLangObjectNull) {



                    deleteListener.onClick(item);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // clickListener
                com.clickEat.ug.screens.checkout.AddressListener clickListener = mClickListener;
                // item
                com.clickEat.ug.data.CustomerAddress item = mItem;
                // clickListener != null
                boolean clickListenerJavaLangObjectNull = false;



                clickListenerJavaLangObjectNull = (clickListener) != (null);
                if (clickListenerJavaLangObjectNull) {



                    clickListener.onClick(item);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): editListener
        flag 2 (0x3L): clickListener
        flag 3 (0x4L): deleteListener
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}