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
import androidx.viewpager.widget.ViewPager;
import com.clickEat.ug.R;
import com.clickEat.ug.screens.menu.MenuViewModel;
import com.google.android.material.tabs.TabLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentMenuBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout menuLayout;

  @NonNull
  public final TabLayout menuTabs;

  @NonNull
  public final ViewPager menuViewpager;

  @Bindable
  protected MenuViewModel mViewModel;

  protected FragmentMenuBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout menuLayout, TabLayout menuTabs, ViewPager menuViewpager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.menuLayout = menuLayout;
    this.menuTabs = menuTabs;
    this.menuViewpager = menuViewpager;
  }

  public abstract void setViewModel(@Nullable MenuViewModel viewModel);

  @Nullable
  public MenuViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_menu, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMenuBinding>inflateInternal(inflater, R.layout.fragment_menu, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_menu, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMenuBinding>inflateInternal(inflater, R.layout.fragment_menu, null, false, component);
  }

  public static FragmentMenuBinding bind(@NonNull View view) {
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
  public static FragmentMenuBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMenuBinding)bind(component, view, R.layout.fragment_menu);
  }
}
