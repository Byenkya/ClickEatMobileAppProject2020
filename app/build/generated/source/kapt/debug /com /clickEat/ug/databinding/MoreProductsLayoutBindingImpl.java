package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MoreProductsLayoutBindingImpl extends MoreProductsLayoutBinding implements com.clickEat.ug.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.freeDelivery, 8);
        sViewsWithIds.put(R.id.buttons, 9);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MoreProductsLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private MoreProductsLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (com.google.android.material.card.MaterialCardView) bindings[1]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.ImageButton) bindings[6]
            );
        this.addToCart.setTag(null);
        this.availableStatus.setTag(null);
        this.itemImage.setTag(null);
        this.itemNameLabel.setTag(null);
        this.itemPrice.setTag(null);
        this.productLayout.setTag(null);
        this.productLinearlayout.setTag(null);
        this.rate.setTag(null);
        setRootTag(root);
        // listeners
        mCallback18 = new com.clickEat.ug.generated.callback.OnClickListener(this, 1);
        mCallback19 = new com.clickEat.ug.generated.callback.OnClickListener(this, 2);
        mCallback20 = new com.clickEat.ug.generated.callback.OnClickListener(this, 3);
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
        if (BR.showCart == variableId) {
            setShowCart((com.clickEat.ug.screens.menu.CartInformation) variable);
        }
        else if (BR.product == variableId) {
            setProduct((com.clickEat.ug.data.Product) variable);
        }
        else if (BR.onClickListener == variableId) {
            setOnClickListener((com.clickEat.ug.screens.menu.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setShowCart(@Nullable com.clickEat.ug.screens.menu.CartInformation ShowCart) {
        this.mShowCart = ShowCart;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.showCart);
        super.requestRebind();
    }
    public void setProduct(@Nullable com.clickEat.ug.data.Product Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.product);
        super.requestRebind();
    }
    public void setOnClickListener(@Nullable com.clickEat.ug.screens.menu.OnClickListener OnClickListener) {
        this.mOnClickListener = OnClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.onClickListener);
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
        com.clickEat.ug.screens.menu.CartInformation showCart = mShowCart;
        com.clickEat.ug.data.Product product = mProduct;
        com.clickEat.ug.screens.menu.OnClickListener onClickListener = mOnClickListener;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.addToCart.setOnClickListener(mCallback20);
            this.productLayout.setOnClickListener(mCallback18);
            this.rate.setOnClickListener(mCallback19);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.clickEat.ug.screens.menu.MenuBindingUtilKt.productAvailable(this.availableStatus, product);
            com.clickEat.ug.screens.menu.MenuBindingUtilKt.productImage(this.itemImage, product);
            com.clickEat.ug.screens.menu.MenuBindingUtilKt.itemName(this.itemNameLabel, product);
            com.clickEat.ug.screens.menu.MenuBindingUtilKt.itemPrice(this.itemPrice, product);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // product
                com.clickEat.ug.data.Product product = mProduct;
                // onClickListener
                com.clickEat.ug.screens.menu.OnClickListener onClickListener = mOnClickListener;
                // onClickListener != null
                boolean onClickListenerJavaLangObjectNull = false;



                onClickListenerJavaLangObjectNull = (onClickListener) != (null);
                if (onClickListenerJavaLangObjectNull) {



                    onClickListener.onClick(product);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // product
                com.clickEat.ug.data.Product product = mProduct;
                // onClickListener
                com.clickEat.ug.screens.menu.OnClickListener onClickListener = mOnClickListener;
                // onClickListener != null
                boolean onClickListenerJavaLangObjectNull = false;



                onClickListenerJavaLangObjectNull = (onClickListener) != (null);
                if (onClickListenerJavaLangObjectNull) {



                    onClickListener.onClick(product);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // showCart
                com.clickEat.ug.screens.menu.CartInformation showCart = mShowCart;
                // product
                com.clickEat.ug.data.Product product = mProduct;
                // showCart != null
                boolean showCartJavaLangObjectNull = false;



                showCartJavaLangObjectNull = (showCart) != (null);
                if (showCartJavaLangObjectNull) {



                    showCart.showCartInformation(product);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): showCart
        flag 1 (0x2L): product
        flag 2 (0x3L): onClickListener
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}