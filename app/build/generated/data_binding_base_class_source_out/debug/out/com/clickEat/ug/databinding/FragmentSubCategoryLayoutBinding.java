// Generated by data binding compiler. Do not edit!
package com.clickEat.ug.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.clickEat.ug.R;
import com.clickEat.ug.screens.sub_categories.SubCategoriesViewModal;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSubCategoryLayoutBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView SubCatsLayout;

  @Bindable
  protected SubCategoriesViewModal mViewModel;

  protected FragmentSubCategoryLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RecyclerView SubCatsLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.SubCatsLayout = SubCatsLayout;
  }

  public abstract void setViewModel(@Nullable SubCategoriesViewModal viewModel);

  @Nullable
  public SubCategoriesViewModal getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSubCategoryLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sub_category_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSubCategoryLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSubCategoryLayoutBinding>inflateInternal(inflater, R.layout.fragment_sub_category_layout, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSubCategoryLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sub_category_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSubCategoryLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSubCategoryLayoutBinding>inflateInternal(inflater, R.layout.fragment_sub_category_layout, null, false, component);
  }

  public static FragmentSubCategoryLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSubCategoryLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentSubCategoryLayoutBinding)bind(component, view, R.layout.fragment_sub_category_layout);
  }
}
