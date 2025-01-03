package com.clickEat.ug.screens.categories;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CategoryFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private CategoryFragmentArgs() {
  }

  private CategoryFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static CategoryFragmentArgs fromBundle(@NonNull Bundle bundle) {
    CategoryFragmentArgs __result = new CategoryFragmentArgs();
    bundle.setClassLoader(CategoryFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("categoryName")) {
      String categoryName;
      categoryName = bundle.getString("categoryName");
      if (categoryName == null) {
        throw new IllegalArgumentException("Argument \"categoryName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("categoryName", categoryName);
    } else {
      throw new IllegalArgumentException("Required argument \"categoryName\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getCategoryName() {
    return (String) arguments.get("categoryName");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("categoryName")) {
      String categoryName = (String) arguments.get("categoryName");
      __result.putString("categoryName", categoryName);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    CategoryFragmentArgs that = (CategoryFragmentArgs) object;
    if (arguments.containsKey("categoryName") != that.arguments.containsKey("categoryName")) {
      return false;
    }
    if (getCategoryName() != null ? !getCategoryName().equals(that.getCategoryName()) : that.getCategoryName() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getCategoryName() != null ? getCategoryName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "CategoryFragmentArgs{"
        + "categoryName=" + getCategoryName()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(CategoryFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String categoryName) {
      if (categoryName == null) {
        throw new IllegalArgumentException("Argument \"categoryName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("categoryName", categoryName);
    }

    @NonNull
    public CategoryFragmentArgs build() {
      CategoryFragmentArgs result = new CategoryFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setCategoryName(@NonNull String categoryName) {
      if (categoryName == null) {
        throw new IllegalArgumentException("Argument \"categoryName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("categoryName", categoryName);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCategoryName() {
      return (String) arguments.get("categoryName");
    }
  }
}
