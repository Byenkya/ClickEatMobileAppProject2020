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
import androidx.recyclerview.widget.RecyclerView;
import com.clickEat.ug.R;
import com.clickEat.ug.screens.custom_categories.CategoriesViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ProductsRecommendedLayoutBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout allProducts;

  @NonNull
  public final TextView allProductsLabel;

  @NonNull
  public final ProgressBar allProductsProgressBar;

  @NonNull
  public final RecyclerView getAllProducts;

  @Bindable
  protected CategoriesViewModel mViewModel;

  protected ProductsRecommendedLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, LinearLayout allProducts, TextView allProductsLabel,
      ProgressBar allProductsProgressBar, RecyclerView getAllProducts) {
    super(_bindingComponent, _root, _localFieldCount);
    this.allProducts = allProducts;
    this.allProductsLabel = allProductsLabel;
    this.allProductsProgressBar = allProductsProgressBar;
    this.getAllProducts = getAllProducts;
  }

  public abstract void setViewModel(@Nullable CategoriesViewModel viewModel);

  @Nullable
  public CategoriesViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ProductsRecommendedLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.products_recommended_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ProductsRecommendedLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ProductsRecommendedLayoutBinding>inflateInternal(inflater, R.layout.products_recommended_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ProductsRecommendedLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.products_recommended_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ProductsRecommendedLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ProductsRecommendedLayoutBinding>inflateInternal(inflater, R.layout.products_recommended_layout, null, false, component);
  }

  public static ProductsRecommendedLayoutBinding bind(@NonNull View view) {
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
  public static ProductsRecommendedLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ProductsRecommendedLayoutBinding)bind(component, view, R.layout.products_recommended_layout);
  }
}
