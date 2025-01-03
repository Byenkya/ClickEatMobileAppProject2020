// Generated by data binding compiler. Do not edit!
package com.clickEat.ug.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.clickEat.ug.R;
import com.clickEat.ug.screens.cart.CartViewModel;
import com.google.android.material.textview.MaterialTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCartBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView cartItems;

  @NonNull
  public final LinearLayout cartLinear;

  @NonNull
  public final View divider12;

  @NonNull
  public final View divider2;

  @NonNull
  public final View divider3;

  @NonNull
  public final View divider4;

  @NonNull
  public final ConstraintLayout linearLayout2;

  @NonNull
  public final TextView productName;

  @NonNull
  public final TextView quantity;

  @NonNull
  public final TextView total;

  @NonNull
  public final MaterialTextView totalAmount;

  @NonNull
  public final MaterialTextView totalLabel;

  @NonNull
  public final TextView unitPrice;

  @NonNull
  public final ConstraintLayout viewWidgets;

  @Bindable
  protected CartViewModel mCartItem;

  protected FragmentCartBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView cartItems, LinearLayout cartLinear, View divider12, View divider2, View divider3,
      View divider4, ConstraintLayout linearLayout2, TextView productName, TextView quantity,
      TextView total, MaterialTextView totalAmount, MaterialTextView totalLabel, TextView unitPrice,
      ConstraintLayout viewWidgets) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cartItems = cartItems;
    this.cartLinear = cartLinear;
    this.divider12 = divider12;
    this.divider2 = divider2;
    this.divider3 = divider3;
    this.divider4 = divider4;
    this.linearLayout2 = linearLayout2;
    this.productName = productName;
    this.quantity = quantity;
    this.total = total;
    this.totalAmount = totalAmount;
    this.totalLabel = totalLabel;
    this.unitPrice = unitPrice;
    this.viewWidgets = viewWidgets;
  }

  public abstract void setCartItem(@Nullable CartViewModel cart_item);

  @Nullable
  public CartViewModel getCartItem() {
    return mCartItem;
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_cart, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCartBinding>inflateInternal(inflater, R.layout.fragment_cart, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_cart, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCartBinding>inflateInternal(inflater, R.layout.fragment_cart, null, false, component);
  }

  public static FragmentCartBinding bind(@NonNull View view) {
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
  public static FragmentCartBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCartBinding)bind(component, view, R.layout.fragment_cart);
  }
}
