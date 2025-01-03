// Generated by data binding compiler. Do not edit!
package com.clickEat.ug.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.clickEat.ug.R;
import com.clickEat.ug.screens.orders.OrdersViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentOrdersBinding extends ViewDataBinding {
  @NonNull
  public final View divider12;

  @NonNull
  public final RecyclerView myOrders;

  @NonNull
  public final TextView orderRefNum;

  @NonNull
  public final LinearLayout ordersLayout;

  @NonNull
  public final LinearLayout titles;

  @Bindable
  protected OrdersViewModel mViewModal;

  protected FragmentOrdersBinding(Object _bindingComponent, View _root, int _localFieldCount,
      View divider12, RecyclerView myOrders, TextView orderRefNum, LinearLayout ordersLayout,
      LinearLayout titles) {
    super(_bindingComponent, _root, _localFieldCount);
    this.divider12 = divider12;
    this.myOrders = myOrders;
    this.orderRefNum = orderRefNum;
    this.ordersLayout = ordersLayout;
    this.titles = titles;
  }

  public abstract void setViewModal(@Nullable OrdersViewModel viewModal);

  @Nullable
  public OrdersViewModel getViewModal() {
    return mViewModal;
  }

  @NonNull
  public static FragmentOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_orders, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentOrdersBinding>inflateInternal(inflater, R.layout.fragment_orders, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOrdersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_orders, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentOrdersBinding>inflateInternal(inflater, R.layout.fragment_orders, null, false, component);
  }

  public static FragmentOrdersBinding bind(@NonNull View view) {
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
  public static FragmentOrdersBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentOrdersBinding)bind(component, view, R.layout.fragment_orders);
  }
}
