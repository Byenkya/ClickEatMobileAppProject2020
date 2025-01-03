package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class OrderItemSummaryLayoutBindingImpl extends OrderItemSummaryLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.itemsViewHeader, 2);
        sViewsWithIds.put(R.id.order_id, 3);
        sViewsWithIds.put(R.id.order_id_value, 4);
        sViewsWithIds.put(R.id.orderSimpleVer, 5);
        sViewsWithIds.put(R.id.simple_version_value, 6);
        sViewsWithIds.put(R.id.order_date_label, 7);
        sViewsWithIds.put(R.id.order_date_value, 8);
        sViewsWithIds.put(R.id.is_paid_label, 9);
        sViewsWithIds.put(R.id.paid_value, 10);
        sViewsWithIds.put(R.id.prepared_label, 11);
        sViewsWithIds.put(R.id.prepared_value, 12);
        sViewsWithIds.put(R.id.terminated_label, 13);
        sViewsWithIds.put(R.id.terminated_value, 14);
        sViewsWithIds.put(R.id.reasonLayout, 15);
        sViewsWithIds.put(R.id.reason_label, 16);
        sViewsWithIds.put(R.id.reason_value, 17);
        sViewsWithIds.put(R.id.received_label, 18);
        sViewsWithIds.put(R.id.received_value, 19);
        sViewsWithIds.put(R.id.delivery_fee_label, 20);
        sViewsWithIds.put(R.id.delivery_fee_value, 21);
        sViewsWithIds.put(R.id.divider10, 22);
        sViewsWithIds.put(R.id.orderedItems, 23);
        sViewsWithIds.put(R.id.divider_total, 24);
        sViewsWithIds.put(R.id.order_cart_total, 25);
        sViewsWithIds.put(R.id.order_cart_total_title, 26);
        sViewsWithIds.put(R.id.order_cart_total_value, 27);
        sViewsWithIds.put(R.id.divider15, 28);
        sViewsWithIds.put(R.id.terminateOrder, 29);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public OrderItemSummaryLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private OrderItemSummaryLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[21]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[28]
            , (android.view.View) bindings[24]
            , (android.widget.TextView) bindings[9]
            , (android.view.View) bindings[2]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (com.clickEat.ug.screens.checkout.MyListView) bindings[23]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.TextView) bindings[16]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[18]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[29]
            , (android.widget.TextView) bindings[13]
            , (android.widget.ImageView) bindings[14]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}