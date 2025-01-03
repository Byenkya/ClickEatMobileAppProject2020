package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DrinksSubcatitemLayoutBindingImpl extends DrinksSubcatitemLayoutBinding implements com.clickEat.ug.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.icon_image, 2);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DrinksSubcatitemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private DrinksSubcatitemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            );
        this.catTitle.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback14 = new com.clickEat.ug.generated.callback.OnClickListener(this, 1);
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
        if (BR.subCategory == variableId) {
            setSubCategory((com.clickEat.ug.data.DrinkSubCategories) variable);
        }
        else if (BR.subCat == variableId) {
            setSubCat((com.clickEat.ug.screens.drinks.OnClickDrinkListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSubCategory(@Nullable com.clickEat.ug.data.DrinkSubCategories SubCategory) {
        this.mSubCategory = SubCategory;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.subCategory);
        super.requestRebind();
    }
    public void setSubCat(@Nullable com.clickEat.ug.screens.drinks.OnClickDrinkListener SubCat) {
        this.mSubCat = SubCat;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.subCat);
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
        com.clickEat.ug.data.DrinkSubCategories subCategory = mSubCategory;
        com.clickEat.ug.screens.drinks.OnClickDrinkListener subCat = mSubCat;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.clickEat.ug.screens.drinks.DrinksBindingUtilKt.setTitle(this.catTitle, subCategory);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback14);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // subCat != null
        boolean subCatJavaLangObjectNull = false;
        // subCategory
        com.clickEat.ug.data.DrinkSubCategories subCategory = mSubCategory;
        // subCat
        com.clickEat.ug.screens.drinks.OnClickDrinkListener subCat = mSubCat;



        subCatJavaLangObjectNull = (subCat) != (null);
        if (subCatJavaLangObjectNull) {



            subCat.onClick(subCategory);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): subCategory
        flag 1 (0x2L): subCat
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}