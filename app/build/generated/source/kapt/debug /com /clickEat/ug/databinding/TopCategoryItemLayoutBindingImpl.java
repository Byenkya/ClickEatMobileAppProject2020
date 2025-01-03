package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TopCategoryItemLayoutBindingImpl extends TopCategoryItemLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cate, 1);
        sViewsWithIds.put(R.id.breakfastLayout, 2);
        sViewsWithIds.put(R.id.breakfast_image, 3);
        sViewsWithIds.put(R.id.breakfast_label, 4);
        sViewsWithIds.put(R.id.lunchLayout, 5);
        sViewsWithIds.put(R.id.lunch_image, 6);
        sViewsWithIds.put(R.id.lunch_label, 7);
        sViewsWithIds.put(R.id.dinnerLayout, 8);
        sViewsWithIds.put(R.id.dinner_image, 9);
        sViewsWithIds.put(R.id.dinner_label, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TopCategoryItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private TopCategoryItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.card.MaterialCardView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (com.google.android.material.card.MaterialCardView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (com.google.android.material.card.MaterialCardView) bindings[5]
            );
        this.gravity.setTag(null);
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