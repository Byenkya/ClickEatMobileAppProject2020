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
import com.clickEat.ug.data.HomeSubCategoryDisplay;
import com.clickEat.ug.screens.sub_categories.SubCategoriesRecyclerListener;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SubCategoryItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView SubCatTitle;

  @NonNull
  public final ImageView subCatImage;

  @Bindable
  protected HomeSubCategoryDisplay mSubcat;

  @Bindable
  protected SubCategoriesRecyclerListener mSubclickListener;

  protected SubCategoryItemLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView SubCatTitle, ImageView subCatImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.SubCatTitle = SubCatTitle;
    this.subCatImage = subCatImage;
  }

  public abstract void setSubcat(@Nullable HomeSubCategoryDisplay subcat);

  @Nullable
  public HomeSubCategoryDisplay getSubcat() {
    return mSubcat;
  }

  public abstract void setSubclickListener(
      @Nullable SubCategoriesRecyclerListener subclickListener);

  @Nullable
  public SubCategoriesRecyclerListener getSubclickListener() {
    return mSubclickListener;
  }

  @NonNull
  public static SubCategoryItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.sub_category_item_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SubCategoryItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SubCategoryItemLayoutBinding>inflateInternal(inflater, R.layout.sub_category_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static SubCategoryItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.sub_category_item_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SubCategoryItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SubCategoryItemLayoutBinding>inflateInternal(inflater, R.layout.sub_category_item_layout, null, false, component);
  }

  public static SubCategoryItemLayoutBinding bind(@NonNull View view) {
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
  public static SubCategoryItemLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (SubCategoryItemLayoutBinding)bind(component, view, R.layout.sub_category_item_layout);
  }
}
