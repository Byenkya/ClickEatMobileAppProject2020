package com.clickEat.ug.screens.menu;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MenuFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private MenuFragmentArgs() {
  }

  private MenuFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MenuFragmentArgs fromBundle(@NonNull Bundle bundle) {
    MenuFragmentArgs __result = new MenuFragmentArgs();
    bundle.setClassLoader(MenuFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("restaurant_id")) {
      int restaurantId;
      restaurantId = bundle.getInt("restaurant_id");
      __result.arguments.put("restaurant_id", restaurantId);
    } else {
      throw new IllegalArgumentException("Required argument \"restaurant_id\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("restaurantName")) {
      String restaurantName;
      restaurantName = bundle.getString("restaurantName");
      if (restaurantName == null) {
        throw new IllegalArgumentException("Argument \"restaurantName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("restaurantName", restaurantName);
    } else {
      throw new IllegalArgumentException("Required argument \"restaurantName\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getRestaurantId() {
    return (int) arguments.get("restaurant_id");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getRestaurantName() {
    return (String) arguments.get("restaurantName");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("restaurant_id")) {
      int restaurantId = (int) arguments.get("restaurant_id");
      __result.putInt("restaurant_id", restaurantId);
    }
    if (arguments.containsKey("restaurantName")) {
      String restaurantName = (String) arguments.get("restaurantName");
      __result.putString("restaurantName", restaurantName);
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
    MenuFragmentArgs that = (MenuFragmentArgs) object;
    if (arguments.containsKey("restaurant_id") != that.arguments.containsKey("restaurant_id")) {
      return false;
    }
    if (getRestaurantId() != that.getRestaurantId()) {
      return false;
    }
    if (arguments.containsKey("restaurantName") != that.arguments.containsKey("restaurantName")) {
      return false;
    }
    if (getRestaurantName() != null ? !getRestaurantName().equals(that.getRestaurantName()) : that.getRestaurantName() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getRestaurantId();
    result = 31 * result + (getRestaurantName() != null ? getRestaurantName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "MenuFragmentArgs{"
        + "restaurantId=" + getRestaurantId()
        + ", restaurantName=" + getRestaurantName()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(MenuFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int restaurantId, @NonNull String restaurantName) {
      this.arguments.put("restaurant_id", restaurantId);
      if (restaurantName == null) {
        throw new IllegalArgumentException("Argument \"restaurantName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("restaurantName", restaurantName);
    }

    @NonNull
    public MenuFragmentArgs build() {
      MenuFragmentArgs result = new MenuFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setRestaurantId(int restaurantId) {
      this.arguments.put("restaurant_id", restaurantId);
      return this;
    }

    @NonNull
    public Builder setRestaurantName(@NonNull String restaurantName) {
      if (restaurantName == null) {
        throw new IllegalArgumentException("Argument \"restaurantName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("restaurantName", restaurantName);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getRestaurantId() {
      return (int) arguments.get("restaurant_id");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getRestaurantName() {
      return (String) arguments.get("restaurantName");
    }
  }
}
