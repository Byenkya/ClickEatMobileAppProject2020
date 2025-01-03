package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDrinksBindingImpl extends FragmentDrinksBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDrinksBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentDrinksBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.drinks.setTag(null);
        this.drinksLayout.setTag(null);
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
        if (BR.subCats == variableId) {
            setSubCats((com.clickEat.ug.screens.drinks.DrinksViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSubCats(@Nullable com.clickEat.ug.screens.drinks.DrinksViewModel SubCats) {
        this.mSubCats = SubCats;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.subCats);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSubCatsDrink((androidx.lifecycle.LiveData<com.clickEat.ug.data.ClickEatDrinksSubCategories>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSubCatsDrink(androidx.lifecycle.LiveData<com.clickEat.ug.data.ClickEatDrinksSubCategories> SubCatsDrink, int fieldId) {
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
        com.clickEat.ug.screens.drinks.DrinksViewModel subCats = mSubCats;
        androidx.lifecycle.LiveData<com.clickEat.ug.data.ClickEatDrinksSubCategories> subCatsDrink = null;
        com.clickEat.ug.data.ClickEatDrinksSubCategories subCatsDrinkGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (subCats != null) {
                    // read subCats.drink
                    subCatsDrink = subCats.getDrink();
                }
                updateLiveDataRegistration(0, subCatsDrink);


                if (subCatsDrink != null) {
                    // read subCats.drink.getValue()
                    subCatsDrinkGetValue = subCatsDrink.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.clickEat.ug.screens.drinks.DrinksBindingUtilKt.drinksRecycler(this.drinks, subCatsDrinkGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): subCats.drink
        flag 1 (0x2L): subCats
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}