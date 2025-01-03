package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCartBindingImpl extends FragmentCartBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cartLinear, 3);
        sViewsWithIds.put(R.id.divider12, 4);
        sViewsWithIds.put(R.id.viewWidgets, 5);
        sViewsWithIds.put(R.id.product_name, 6);
        sViewsWithIds.put(R.id.quantity, 7);
        sViewsWithIds.put(R.id.unit_price, 8);
        sViewsWithIds.put(R.id.total, 9);
        sViewsWithIds.put(R.id.divider2, 10);
        sViewsWithIds.put(R.id.divider3, 11);
        sViewsWithIds.put(R.id.linearLayout2, 12);
        sViewsWithIds.put(R.id.total_amount, 13);
        sViewsWithIds.put(R.id.divider4, 14);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.LinearLayout) bindings[3]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (com.google.android.material.textview.MaterialTextView) bindings[13]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            );
        this.cartItems.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.totalLabel.setTag(null);
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
        if (BR.cart_item == variableId) {
            setCartItem((com.clickEat.ug.screens.cart.CartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCartItem(@Nullable com.clickEat.ug.screens.cart.CartViewModel CartItem) {
        this.mCartItem = CartItem;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.cart_item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCartItemCart((androidx.lifecycle.LiveData<com.clickEat.ug.data.CustomerCartItems>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCartItemCart(androidx.lifecycle.LiveData<com.clickEat.ug.data.CustomerCartItems> CartItemCart, int fieldId) {
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
        com.clickEat.ug.data.CustomerCartItems cartItemCartGetValue = null;
        com.clickEat.ug.screens.cart.CartViewModel cartItem = mCartItem;
        androidx.lifecycle.LiveData<com.clickEat.ug.data.CustomerCartItems> cartItemCart = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (cartItem != null) {
                    // read cart_item.cart
                    cartItemCart = cartItem.getCart();
                }
                updateLiveDataRegistration(0, cartItemCart);


                if (cartItemCart != null) {
                    // read cart_item.cart.getValue()
                    cartItemCartGetValue = cartItemCart.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.clickEat.ug.screens.cart.CartBindingUtilKt.cartProducts(this.cartItems, cartItemCartGetValue);
            com.clickEat.ug.screens.cart.CartBindingUtilKt.cartTotal(this.totalLabel, cartItemCartGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): cart_item.cart
        flag 1 (0x2L): cart_item
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}