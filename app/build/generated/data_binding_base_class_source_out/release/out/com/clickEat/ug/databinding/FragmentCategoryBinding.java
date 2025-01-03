// Generated by data binding compiler. Do not edit!
package com.clickEat.ug.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.clickEat.ug.R;
import com.clickEat.ug.screens.categories.CategoryProductsViewModal;
import com.google.android.material.tabs.TabLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCategoryBinding extends ViewDataBinding {
  @NonNull
  public final TextView catProductsLabel;

  @NonNull
  public final LinearLayout categoryLayout;

  @NonNull
  public final ProgressBar categoryProductsProgressBar;

  @NonNull
  public final TabLayout categoryTabs;

  @NonNull
  public final ViewPager categoryViewpager;

  @Bindable
  protected CategoryProductsViewModal mCategoryViewModal;

  protected FragmentCategoryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView catProductsLabel, LinearLayout categoryLayout,
      ProgressBar categoryProductsProgressBar, TabLayout categoryTabs,
      ViewPager categoryViewpager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.catProductsLabel = catProductsLabel;
    this.categoryLayout = categoryLayout;
    this.categoryProductsProgressBar = categoryProductsProgressBar;
    this.categoryTabs = categoryTabs;
    this.categoryViewpager = categoryViewpager;
  }

  public abstract void setCategoryViewModal(@Nullable CategoryProductsViewModal categoryViewModal);

  @Nullable
  public CategoryProductsViewModal getCategoryViewModal() {
    return mCategoryViewModal;
  }

  @NonNull
  public static FragmentCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_category, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCategoryBinding>inflateInternal(inflater, R.layout.fragment_category, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_category, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCategoryBinding>inflateInternal(inflater, R.layout.fragment_category, null, false, component);
  }

  public static FragmentCategoryBinding bind(@NonNull View view) {
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
  public static FragmentCategoryBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCategoryBinding)bind(component, view, R.layout.fragment_category);
  }
}
