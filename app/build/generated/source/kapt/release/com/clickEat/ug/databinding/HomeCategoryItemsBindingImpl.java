package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeCategoryItemsBindingImpl extends HomeCategoryItemsBinding implements com.clickEat.ug.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeCategoryItemsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private HomeCategoryItemsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.catImage.setTag(null);
        this.mboundView1 = (com.google.android.material.card.MaterialCardView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.relativeLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.clickEat.ug.generated.callback.OnClickListener(this, 1);
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
        if (BR.subclickListener == variableId) {
            setSubclickListener((com.clickEat.ug.screens.custom_categories.SubCategoriesListener) variable);
        }
        else if (BR.subcat == variableId) {
            setSubcat((com.clickEat.ug.data.HomeSubCategoryDisplay) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSubclickListener(@Nullable com.clickEat.ug.screens.custom_categories.SubCategoriesListener SubclickListener) {
        this.mSubclickListener = SubclickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.subclickListener);
        super.requestRebind();
    }
    public void setSubcat(@Nullable com.clickEat.ug.data.HomeSubCategoryDisplay Subcat) {
        this.mSubcat = Subcat;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.subcat);
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
        com.clickEat.ug.screens.custom_categories.SubCategoriesListener subclickListener = mSubclickListener;
        com.clickEat.ug.data.HomeSubCategoryDisplay subcat = mSubcat;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.clickEat.ug.screens.custom_categories.CategoriesBindingUtilKt.SubCatImage(this.catImage, subcat);
            com.clickEat.ug.screens.custom_categories.CategoriesBindingUtilKt.subCatHomeName(this.mboundView3, subcat);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // subclickListener != null
        boolean subclickListenerJavaLangObjectNull = false;
        // subclickListener
        com.clickEat.ug.screens.custom_categories.SubCategoriesListener subclickListener = mSubclickListener;
        // subcat
        com.clickEat.ug.data.HomeSubCategoryDisplay subcat = mSubcat;



        subclickListenerJavaLangObjectNull = (subclickListener) != (null);
        if (subclickListenerJavaLangObjectNull) {



            subclickListener.onClick(subcat);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): subclickListener
        flag 1 (0x2L): subcat
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}