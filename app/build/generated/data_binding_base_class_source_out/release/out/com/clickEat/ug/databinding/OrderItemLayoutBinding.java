// Generated by data binding compiler. Do not edit!
package com.clickEat.ug.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.clickEat.ug.R;
import com.clickEat.ug.data.CustomerPlaceOrder;
import com.clickEat.ug.screens.orders.OrderInformation;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class OrderItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView orderRef;

  @NonNull
  public final ImageView viewMoreInfo;

  @Bindable
  protected CustomerPlaceOrder mOrder;

  @Bindable
  protected OrderInformation mOrderDetails;

  protected OrderItemLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView orderRef, ImageView viewMoreInfo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.orderRef = orderRef;
    this.viewMoreInfo = viewMoreInfo;
  }

  public abstract void setOrder(@Nullable CustomerPlaceOrder order);

  @Nullable
  public CustomerPlaceOrder getOrder() {
    return mOrder;
  }

  public abstract void setOrderDetails(@Nullable OrderInformation order_details);

  @Nullable
  public OrderInformation getOrderDetails() {
    return mOrderDetails;
  }

  @NonNull
  public static OrderItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.order_item_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static OrderItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<OrderItemLayoutBinding>inflateInternal(inflater, R.layout.order_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static OrderItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.order_item_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static OrderItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<OrderItemLayoutBinding>inflateInternal(inflater, R.layout.order_item_layout, null, false, component);
  }

  public static OrderItemLayoutBinding bind(@NonNull View view) {
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
  public static OrderItemLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (OrderItemLayoutBinding)bind(component, view, R.layout.order_item_layout);
  }
}
