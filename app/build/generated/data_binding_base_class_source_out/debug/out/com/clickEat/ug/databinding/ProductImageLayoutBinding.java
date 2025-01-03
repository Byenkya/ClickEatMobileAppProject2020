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
import com.clickEat.ug.R;
import com.clickEat.ug.screens.rate.RateViewModal;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ProductImageLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ShapeableImageView imageSliderItem;

  @NonNull
  public final LinearLayout imageSliderItemLayout;

  @Bindable
  protected RateViewModal mViewModel;

  protected ProductImageLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ShapeableImageView imageSliderItem, LinearLayout imageSliderItemLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageSliderItem = imageSliderItem;
    this.imageSliderItemLayout = imageSliderItemLayout;
  }

  public abstract void setViewModel(@Nullable RateViewModal viewModel);

  @Nullable
  public RateViewModal getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ProductImageLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.product_image_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ProductImageLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ProductImageLayoutBinding>inflateInternal(inflater, R.layout.product_image_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ProductImageLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.product_image_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ProductImageLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ProductImageLayoutBinding>inflateInternal(inflater, R.layout.product_image_layout, null, false, component);
  }

  public static ProductImageLayoutBinding bind(@NonNull View view) {
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
  public static ProductImageLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (ProductImageLayoutBinding)bind(component, view, R.layout.product_image_layout);
  }
}
