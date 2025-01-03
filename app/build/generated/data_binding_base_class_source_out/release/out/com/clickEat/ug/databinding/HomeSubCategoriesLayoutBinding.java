// Generated by data binding compiler. Do not edit!
package com.clickEat.ug.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.clickEat.ug.R;
import com.clickEat.ug.screens.custom_categories.CategoriesViewModel;
import com.google.android.material.card.MaterialCardView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HomeSubCategoriesLayoutBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView catImage;

  @NonNull
  public final RecyclerView catsLayout;

  @NonNull
  public final MaterialCardView productLayout;

  @NonNull
  public final LinearLayout seeMoreSubCats;

  @Bindable
  protected CategoriesViewModel mViewModel;

  protected HomeSubCategoriesLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CircleImageView catImage, RecyclerView catsLayout,
      MaterialCardView productLayout, LinearLayout seeMoreSubCats) {
    super(_bindingComponent, _root, _localFieldCount);
    this.catImage = catImage;
    this.catsLayout = catsLayout;
    this.productLayout = productLayout;
    this.seeMoreSubCats = seeMoreSubCats;
  }

  public abstract void setViewModel(@Nullable CategoriesViewModel viewModel);

  @Nullable
  public CategoriesViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static HomeSubCategoriesLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_sub_categories_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HomeSubCategoriesLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HomeSubCategoriesLayoutBinding>inflateInternal(inflater, R.layout.home_sub_categories_layout, root, attachToRoot, component);
  }

  @NonNull
  public static HomeSubCategoriesLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_sub_categories_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HomeSubCategoriesLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HomeSubCategoriesLayoutBinding>inflateInternal(inflater, R.layout.home_sub_categories_layout, null, false, component);
  }

  public static HomeSubCategoriesLayoutBinding bind(@NonNull View view) {
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
  public static HomeSubCategoriesLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (HomeSubCategoriesLayoutBinding)bind(component, view, R.layout.home_sub_categories_layout);
  }
}