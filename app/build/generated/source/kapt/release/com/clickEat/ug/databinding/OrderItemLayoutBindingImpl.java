package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class OrderItemLayoutBindingImpl extends OrderItemLayoutBinding implements com.clickEat.ug.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewMoreInfo, 2);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public OrderItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private OrderItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.orderRef.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new com.clickEat.ug.generated.callback.OnClickListener(this, 1);
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
        if (BR.order_details == variableId) {
            setOrderDetails((com.clickEat.ug.screens.orders.OrderInformation) variable);
        }
        else if (BR.order == variableId) {
            setOrder((com.clickEat.ug.data.CustomerPlaceOrder) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOrderDetails(@Nullable com.clickEat.ug.screens.orders.OrderInformation OrderDetails) {
        this.mOrderDetails = OrderDetails;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.order_details);
        super.requestRebind();
    }
    public void setOrder(@Nullable com.clickEat.ug.data.CustomerPlaceOrder Order) {
        this.mOrder = Order;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.order);
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
        com.clickEat.ug.screens.orders.OrderInformation orderDetails = mOrderDetails;
        com.clickEat.ug.data.CustomerPlaceOrder order = mOrder;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.clickEat.ug.screens.orders.OrdersBindingUtilsKt.orderRef(this.orderRef, order);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // order_details
        com.clickEat.ug.screens.orders.OrderInformation orderDetails = mOrderDetails;
        // order
        com.clickEat.ug.data.CustomerPlaceOrder order = mOrder;
        // order_details != null
        boolean orderDetailsJavaLangObjectNull = false;



        orderDetailsJavaLangObjectNull = (orderDetails) != (null);
        if (orderDetailsJavaLangObjectNull) {



            orderDetails.showOrderWithDetails(order);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): order_details
        flag 1 (0x2L): order
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}