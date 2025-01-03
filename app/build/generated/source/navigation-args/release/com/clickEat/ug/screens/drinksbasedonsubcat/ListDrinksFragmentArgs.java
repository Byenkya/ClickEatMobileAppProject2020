package com.clickEat.ug.screens.drinksbasedonsubcat;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ListDrinksFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ListDrinksFragmentArgs() {
  }

  private ListDrinksFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ListDrinksFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ListDrinksFragmentArgs __result = new ListDrinksFragmentArgs();
    bundle.setClassLoader(ListDrinksFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("drinksSubCatID")) {
      int drinksSubCatID;
      drinksSubCatID = bundle.getInt("drinksSubCatID");
      __result.arguments.put("drinksSubCatID", drinksSubCatID);
    } else {
      throw new IllegalArgumentException("Required argument \"drinksSubCatID\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("catType")) {
      String catType;
      catType = bundle.getString("catType");
      if (catType == null) {
        throw new IllegalArgumentException("Argument \"catType\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("catType", catType);
    } else {
      throw new IllegalArgumentException("Required argument \"catType\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getDrinksSubCatID() {
    return (int) arguments.get("drinksSubCatID");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getCatType() {
    return (String) arguments.get("catType");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("drinksSubCatID")) {
      int drinksSubCatID = (int) arguments.get("drinksSubCatID");
      __result.putInt("drinksSubCatID", drinksSubCatID);
    }
    if (arguments.containsKey("catType")) {
      String catType = (String) arguments.get("catType");
      __result.putString("catType", catType);
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
    ListDrinksFragmentArgs that = (ListDrinksFragmentArgs) object;
    if (arguments.containsKey("drinksSubCatID") != that.arguments.containsKey("drinksSubCatID")) {
      return false;
    }
    if (getDrinksSubCatID() != that.getDrinksSubCatID()) {
      return false;
    }
    if (arguments.containsKey("catType") != that.arguments.containsKey("catType")) {
      return false;
    }
    if (getCatType() != null ? !getCatType().equals(that.getCatType()) : that.getCatType() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getDrinksSubCatID();
    result = 31 * result + (getCatType() != null ? getCatType().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ListDrinksFragmentArgs{"
        + "drinksSubCatID=" + getDrinksSubCatID()
        + ", catType=" + getCatType()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ListDrinksFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int drinksSubCatID, @NonNull String catType) {
      this.arguments.put("drinksSubCatID", drinksSubCatID);
      if (catType == null) {
        throw new IllegalArgumentException("Argument \"catType\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("catType", catType);
    }

    @NonNull
    public ListDrinksFragmentArgs build() {
      ListDrinksFragmentArgs result = new ListDrinksFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setDrinksSubCatID(int drinksSubCatID) {
      this.arguments.put("drinksSubCatID", drinksSubCatID);
      return this;
    }

    @NonNull
    public Builder setCatType(@NonNull String catType) {
      if (catType == null) {
        throw new IllegalArgumentException("Argument \"catType\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("catType", catType);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getDrinksSubCatID() {
      return (int) arguments.get("drinksSubCatID");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCatType() {
      return (String) arguments.get("catType");
    }
  }
}
