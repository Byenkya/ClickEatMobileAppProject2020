package com.clickEat.ug.screens.subcatproducts;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SubCatProductsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private SubCatProductsFragmentArgs() {
  }

  private SubCatProductsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SubCatProductsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    SubCatProductsFragmentArgs __result = new SubCatProductsFragmentArgs();
    bundle.setClassLoader(SubCatProductsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("subCatId")) {
      int subCatId;
      subCatId = bundle.getInt("subCatId");
      __result.arguments.put("subCatId", subCatId);
    } else {
      throw new IllegalArgumentException("Required argument \"subCatId\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("subCatName")) {
      String subCatName;
      subCatName = bundle.getString("subCatName");
      if (subCatName == null) {
        throw new IllegalArgumentException("Argument \"subCatName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("subCatName", subCatName);
    } else {
      throw new IllegalArgumentException("Required argument \"subCatName\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getSubCatId() {
    return (int) arguments.get("subCatId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getSubCatName() {
    return (String) arguments.get("subCatName");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("subCatId")) {
      int subCatId = (int) arguments.get("subCatId");
      __result.putInt("subCatId", subCatId);
    }
    if (arguments.containsKey("subCatName")) {
      String subCatName = (String) arguments.get("subCatName");
      __result.putString("subCatName", subCatName);
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
    SubCatProductsFragmentArgs that = (SubCatProductsFragmentArgs) object;
    if (arguments.containsKey("subCatId") != that.arguments.containsKey("subCatId")) {
      return false;
    }
    if (getSubCatId() != that.getSubCatId()) {
      return false;
    }
    if (arguments.containsKey("subCatName") != that.arguments.containsKey("subCatName")) {
      return false;
    }
    if (getSubCatName() != null ? !getSubCatName().equals(that.getSubCatName()) : that.getSubCatName() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getSubCatId();
    result = 31 * result + (getSubCatName() != null ? getSubCatName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "SubCatProductsFragmentArgs{"
        + "subCatId=" + getSubCatId()
        + ", subCatName=" + getSubCatName()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(SubCatProductsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int subCatId, @NonNull String subCatName) {
      this.arguments.put("subCatId", subCatId);
      if (subCatName == null) {
        throw new IllegalArgumentException("Argument \"subCatName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("subCatName", subCatName);
    }

    @NonNull
    public SubCatProductsFragmentArgs build() {
      SubCatProductsFragmentArgs result = new SubCatProductsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setSubCatId(int subCatId) {
      this.arguments.put("subCatId", subCatId);
      return this;
    }

    @NonNull
    public Builder setSubCatName(@NonNull String subCatName) {
      if (subCatName == null) {
        throw new IllegalArgumentException("Argument \"subCatName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("subCatName", subCatName);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getSubCatId() {
      return (int) arguments.get("subCatId");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getSubCatName() {
      return (String) arguments.get("subCatName");
    }
  }
}
