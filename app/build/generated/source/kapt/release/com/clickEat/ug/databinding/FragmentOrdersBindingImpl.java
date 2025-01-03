package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrdersBindingImpl extends FragmentOrdersBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.titles, 2);
        sViewsWithIds.put(R.id.orderRefNum, 3);
        sViewsWithIds.put(R.id.divider12, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOrdersBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentOrdersBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.view.View) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[2]
            );
        this.myOrders.setTag(null);
        this.ordersLayout.setTag(null);
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
            setViewModal((com.clickEat.ug.screens.orders.OrdersViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModal(@Nullable com.clickEat.ug.screens.orders.OrdersViewModel ViewModal) {
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
                return onChangeViewModalOrders((androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.CustomerPlaceOrder>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModalOrders(androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.CustomerPlaceOrder>> ViewModalOrders, int fieldId) {
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
        java.util.List<com.clickEat.ug.data.CustomerPlaceOrder> viewModalOrdersGetValue = null;
        androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.CustomerPlaceOrder>> viewModalOrders = null;
        com.clickEat.ug.screens.orders.OrdersViewModel viewModal = mViewModal;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModal != null) {
                    // read viewModal.orders
                    viewModalOrders = viewModal.getOrders();
                }
                updateLiveDataRegistration(0, viewModalOrders);


                if (viewModalOrders != null) {
                    // read viewModal.orders.getValue()
                    viewModalOrdersGetValue = viewModalOrders.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.clickEat.ug.screens.orders.OrdersBindingUtilsKt.allOrders(this.myOrders, viewModalOrdersGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModal.orders
        flag 1 (0x2L): viewModal
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}