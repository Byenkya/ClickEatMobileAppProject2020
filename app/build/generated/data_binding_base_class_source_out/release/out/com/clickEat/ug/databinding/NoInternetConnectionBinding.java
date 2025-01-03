// Generated by data binding compiler. Do not edit!
package com.clickEat.ug.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.clickEat.ug.R;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class NoInternetConnectionBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final MaterialButton reloadButton;

  @NonNull
  public final TextView textView35;

  protected NoInternetConnectionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView4, MaterialButton reloadButton, TextView textView35) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView4 = imageView4;
    this.reloadButton = reloadButton;
    this.textView35 = textView35;
  }

  @NonNull
  public static NoInternetConnectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.no_internet_connection, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NoInternetConnectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NoInternetConnectionBinding>inflateInternal(inflater, R.layout.no_internet_connection, root, attachToRoot, component);
  }

  @NonNull
  public static NoInternetConnectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.no_internet_connection, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NoInternetConnectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NoInternetConnectionBinding>inflateInternal(inflater, R.layout.no_internet_connection, null, false, component);
  }

  public static NoInternetConnectionBinding bind(@NonNull View view) {
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
  public static NoInternetConnectionBinding bind(@NonNull View view, @Nullable Object component) {
    return (NoInternetConnectionBinding)bind(component, view, R.layout.no_internet_connection);
  }
}
