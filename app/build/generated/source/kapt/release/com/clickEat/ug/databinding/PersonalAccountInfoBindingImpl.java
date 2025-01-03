package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PersonalAccountInfoBindingImpl extends PersonalAccountInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.update_info, 6);
        sViewsWithIds.put(R.id.addressLabel, 7);
        sViewsWithIds.put(R.id.addAddress, 8);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PersonalAccountInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private PersonalAccountInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (android.widget.Button) bindings[6]
            );
        this.contact.setTag(null);
        this.customerDeliveryAddresses.setTag(null);
        this.customerEmail.setTag(null);
        this.customerNames.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.secondContact.setTag(null);
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
        if (BR.accountInformation == variableId) {
            setAccountInformation((com.clickEat.ug.data.Customer) variable);
        }
        else if (BR.addresses == variableId) {
            setAddresses((com.clickEat.ug.data.ListCustomerAddresses) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAccountInformation(@Nullable com.clickEat.ug.data.Customer AccountInformation) {
        this.mAccountInformation = AccountInformation;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.accountInformation);
        super.requestRebind();
    }
    public void setAddresses(@Nullable com.clickEat.ug.data.ListCustomerAddresses Addresses) {
        this.mAddresses = Addresses;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.addresses);
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
        com.clickEat.ug.data.Customer accountInformation = mAccountInformation;
        com.clickEat.ug.data.ListCustomerAddresses addresses = mAddresses;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.clickEat.ug.screens.account.AccountsBindingUtilKt.contact(this.contact, accountInformation);
            com.clickEat.ug.screens.account.AccountsBindingUtilKt.customerEmail(this.customerEmail, accountInformation);
            com.clickEat.ug.screens.account.AccountsBindingUtilKt.customerNames(this.customerNames, accountInformation);
            com.clickEat.ug.screens.account.AccountsBindingUtilKt.secondContact(this.secondContact, accountInformation);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.clickEat.ug.screens.account.AccountsBindingUtilKt.deliveryAddresses(this.customerDeliveryAddresses, addresses);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): accountInformation
        flag 1 (0x2L): addresses
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}