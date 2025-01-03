// Generated by data binding compiler. Do not edit!
package com.clickEat.ug.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.clickEat.ug.R;
import com.stepstone.stepper.StepperLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentMyStepperBinding extends ViewDataBinding {
  @NonNull
  public final StepperLayout stepperLayout;

  protected FragmentMyStepperBinding(Object _bindingComponent, View _root, int _localFieldCount,
      StepperLayout stepperLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.stepperLayout = stepperLayout;
  }

  @NonNull
  public static FragmentMyStepperBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_my_stepper, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMyStepperBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMyStepperBinding>inflateInternal(inflater, R.layout.fragment_my_stepper, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMyStepperBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_my_stepper, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMyStepperBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMyStepperBinding>inflateInternal(inflater, R.layout.fragment_my_stepper, null, false, component);
  }

  public static FragmentMyStepperBinding bind(@NonNull View view) {
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
  public static FragmentMyStepperBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMyStepperBinding)bind(component, view, R.layout.fragment_my_stepper);
  }
}