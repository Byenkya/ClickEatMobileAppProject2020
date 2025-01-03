package com.clickEat.ug.databinding;
import com.clickEat.ug.R;
import com.clickEat.ug.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCommentBindingImpl extends FragmentCommentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.commentsLayout, 2);
        sViewsWithIds.put(R.id.constraintLayout, 3);
        sViewsWithIds.put(R.id.noCommentsID, 4);
        sViewsWithIds.put(R.id.addComment, 5);
        sViewsWithIds.put(R.id.progressBarComments, 6);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCommentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentCommentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) bindings[5]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.ProgressBar) bindings[6]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.productComments.setTag(null);
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
        if (BR.commentViewModal == variableId) {
            setCommentViewModal((com.clickEat.ug.screens.comment.CommentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCommentViewModal(@Nullable com.clickEat.ug.screens.comment.CommentViewModel CommentViewModal) {
        this.mCommentViewModal = CommentViewModal;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.commentViewModal);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCommentViewModalComments((androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.ServerComment>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCommentViewModalComments(androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.ServerComment>> CommentViewModalComments, int fieldId) {
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
        androidx.lifecycle.LiveData<java.util.List<com.clickEat.ug.data.ServerComment>> commentViewModalComments = null;
        java.util.List<com.clickEat.ug.data.ServerComment> commentViewModalCommentsGetValue = null;
        com.clickEat.ug.screens.comment.CommentViewModel commentViewModal = mCommentViewModal;

        if ((dirtyFlags & 0x7L) != 0) {



                if (commentViewModal != null) {
                    // read commentViewModal.comments
                    commentViewModalComments = commentViewModal.getComments();
                }
                updateLiveDataRegistration(0, commentViewModalComments);


                if (commentViewModalComments != null) {
                    // read commentViewModal.comments.getValue()
                    commentViewModalCommentsGetValue = commentViewModalComments.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.clickEat.ug.screens.rate.RatingBindingUtilKt.productCommentsRatingSection(this.productComments, commentViewModalCommentsGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): commentViewModal.comments
        flag 1 (0x2L): commentViewModal
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}