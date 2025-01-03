package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SubCategoryItemLayoutBindingImpl extends SubCategoryItemLayoutBinding implements com.clickEat.ug.generated.callback.OnClickListener.Listener {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SubCategoryItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private SubCategoryItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            );
        this.SubCatTitle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.card.MaterialCardView) bindings[1];
        this.mboundView1.setTag(null);
        this.subCatImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.clickEat.ug.generated.callback.OnClickListener(this, 1);
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
            setSubclickListener((com.clickEat.ug.screens.sub_categories.SubCategoriesRecyclerListener) variable);
        }
        else if (BR.subcat == variableId) {
            setSubcat((com.clickEat.ug.data.HomeSubCategoryDisplay) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSubclickListener(@Nullable com.clickEat.ug.screens.sub_categories.SubCategoriesRecyclerListener SubclickListener) {
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
        com.clickEat.ug.screens.sub_categories.SubCategoriesRecyclerListener subclickListener = mSubclickListener;
        com.clickEat.ug.data.HomeSubCategoryDisplay subcat = mSubcat;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.clickEat.ug.screens.custom_categories.CategoriesBindingUtilKt.subCatText(this.SubCatTitle, subcat);
            com.clickEat.ug.screens.custom_categories.CategoriesBindingUtilKt.SubCatImage(this.subCatImage, subcat);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback15);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // subclickListener != null
        boolean subclickListenerJavaLangObjectNull = false;
        // subclickListener
        com.clickEat.ug.screens.sub_categories.SubCategoriesRecyclerListener subclickListener = mSubclickListener;
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