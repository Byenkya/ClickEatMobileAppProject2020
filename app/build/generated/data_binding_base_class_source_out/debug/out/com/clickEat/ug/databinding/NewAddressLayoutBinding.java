// Generated by data binding compiler. Do not edit!
package com.clickEat.ug.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.clickEat.ug.R;
import com.clickEat.ug.data.AruaVillages;
import com.google.android.material.textfield.TextInputEditText;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class NewAddressLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView newDefaultAddress;

  @NonNull
  public final CheckBox newIsDefault;

  @NonNull
  public final TextInputEditText newOtherDetails;

  @NonNull
  public final TextView newOtherDetailsLabel;

  @NonNull
  public final TextView newVillageLabel;

  @NonNull
  public final SearchableSpinner spinnerView;

  @Bindable
  protected AruaVillages mPlaces;

  protected NewAddressLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView newDefaultAddress, CheckBox newIsDefault, TextInputEditText newOtherDetails,
      TextView newOtherDetailsLabel, TextView newVillageLabel, SearchableSpinner spinnerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.newDefaultAddress = newDefaultAddress;
    this.newIsDefault = newIsDefault;
    this.newOtherDetails = newOtherDetails;
    this.newOtherDetailsLabel = newOtherDetailsLabel;
    this.newVillageLabel = newVillageLabel;
    this.spinnerView = spinnerView;
  }

  public abstract void setPlaces(@Nullable AruaVillages places);

  @Nullable
  public AruaVillages getPlaces() {
    return mPlaces;
  }

  @NonNull
  public static NewAddressLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.new_address_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NewAddressLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NewAddressLayoutBinding>inflateInternal(inflater, R.layout.new_address_layout, root, attachToRoot, component);
  }

  @NonNull
  public static NewAddressLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.new_address_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NewAddressLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NewAddressLayoutBinding>inflateInternal(inflater, R.layout.new_address_layout, null, false, component);
  }

  public static NewAddressLayoutBinding bind(@NonNull View view) {
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
  public static NewAddressLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (NewAddressLayoutBinding)bind(component, view, R.layout.new_address_layout);
  }
}
