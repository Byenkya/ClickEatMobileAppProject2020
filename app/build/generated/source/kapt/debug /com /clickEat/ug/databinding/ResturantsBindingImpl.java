package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ResturantsBindingImpl extends ResturantsBinding implements com.clickEat.ug.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_menu, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ResturantsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ResturantsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[3]
            );
        this.catImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.restName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.clickEat.ug.generated.callback.OnClickListener(this, 1);
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
        if (BR.rest == variableId) {
            setRest((com.clickEat.ug.data.Restaurant) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((com.clickEat.ug.screens.resturants.RestaurantListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRest(@Nullable com.clickEat.ug.data.Restaurant Rest) {
        this.mRest = Rest;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.rest);
        super.requestRebind();
    }
    public void setClickListener(@Nullable com.clickEat.ug.screens.resturants.RestaurantListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickListener);
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
        com.clickEat.ug.data.Restaurant rest = mRest;
        com.clickEat.ug.screens.resturants.RestaurantListener clickListener = mClickListener;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.clickEat.ug.screens.resturants.ResturantBindingUtilKt.restaurantImage(this.catImage, rest);
            com.clickEat.ug.screens.resturants.ResturantBindingUtilKt.setTitle(this.restName, rest);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback8);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // rest
        com.clickEat.ug.data.Restaurant rest = mRest;
        // clickListener
        com.clickEat.ug.screens.resturants.RestaurantListener clickListener = mClickListener;
        // clickListener != null
        boolean clickListenerJavaLangObjectNull = false;



        clickListenerJavaLangObjectNull = (clickListener) != (null);
        if (clickListenerJavaLangObjectNull) {



            clickListener.onClick(rest);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): rest
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}