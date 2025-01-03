package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CartItemLayoutBindingImpl extends CartItemLayoutBinding implements com.clickEat.ug.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.served_with_layout, 8);
        sViewsWithIds.put(R.id.divider12, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CartItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private CartItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[6]
            , (android.view.View) bindings[9]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (com.google.android.material.textview.MaterialTextView) bindings[5]
            , (com.google.android.material.textview.MaterialTextView) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[8]
            , (com.google.android.material.textview.MaterialTextView) bindings[7]
            );
        this.delPdt.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pdtName.setTag(null);
        this.pdtQuantity.setTag(null);
        this.pdtTotal.setTag(null);
        this.pdtUnitPrice.setTag(null);
        this.productImage.setTag(null);
        this.servedWithValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback16 = new com.clickEat.ug.generated.callback.OnClickListener(this, 1);
        mCallback17 = new com.clickEat.ug.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.del_cart == variableId) {
            setDelCart((com.clickEat.ug.screens.cart.DeleteCartItem) variable);
        }
        else if (BR.cartItem == variableId) {
            setCartItem((com.clickEat.ug.data.CartItemFromServer) variable);
        }
        else if (BR.update_cart == variableId) {
            setUpdateCart((com.clickEat.ug.screens.cart.UpdateCartInformation) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDelCart(@Nullable com.clickEat.ug.screens.cart.DeleteCartItem DelCart) {
        this.mDelCart = DelCart;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.del_cart);
        super.requestRebind();
    }
    public void setCartItem(@Nullable com.clickEat.ug.data.CartItemFromServer CartItem) {
        this.mCartItem = CartItem;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.cartItem);
        super.requestRebind();
    }
    public void setUpdateCart(@Nullable com.clickEat.ug.screens.cart.UpdateCartInformation UpdateCart) {
        this.mUpdateCart = UpdateCart;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.update_cart);
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
        com.clickEat.ug.screens.cart.DeleteCartItem delCart = mDelCart;
        com.clickEat.ug.data.CartItemFromServer cartItem = mCartItem;
        com.clickEat.ug.screens.cart.UpdateCartInformation updateCart = mUpdateCart;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.delPdt.setOnClickListener(mCallback17);
            this.pdtQuantity.setOnClickListener(mCallback16);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.clickEat.ug.screens.cart.CartBindingUtilKt.productName(this.pdtName, cartItem);
            com.clickEat.ug.screens.cart.CartBindingUtilKt.productQuantity(this.pdtQuantity, cartItem);
            com.clickEat.ug.screens.cart.CartBindingUtilKt.productTotal(this.pdtTotal, cartItem);
            com.clickEat.ug.screens.cart.CartBindingUtilKt.unitPrice(this.pdtUnitPrice, cartItem);
            com.clickEat.ug.screens.cart.CartBindingUtilKt.productImage(this.productImage, cartItem);
            com.clickEat.ug.screens.cart.CartBindingUtilKt.served_with(this.servedWithValue, cartItem);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // update_cart
                com.clickEat.ug.screens.cart.UpdateCartInformation updateCart = mUpdateCart;
                // cartItem
                com.clickEat.ug.data.CartItemFromServer cartItem = mCartItem;
                // update_cart != null
                boolean updateCartJavaLangObjectNull = false;



                updateCartJavaLangObjectNull = (updateCart) != (null);
                if (updateCartJavaLangObjectNull) {



                    updateCart.updateCartInfo(cartItem);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // del_cart
                com.clickEat.ug.screens.cart.DeleteCartItem delCart = mDelCart;
                // cartItem
                com.clickEat.ug.data.CartItemFromServer cartItem = mCartItem;
                // del_cart != null
                boolean delCartJavaLangObjectNull = false;



                delCartJavaLangObjectNull = (delCart) != (null);
                if (delCartJavaLangObjectNull) {



                    delCart.deleteCartItemData(cartItem);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): del_cart
        flag 1 (0x2L): cartItem
        flag 2 (0x3L): update_cart
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}