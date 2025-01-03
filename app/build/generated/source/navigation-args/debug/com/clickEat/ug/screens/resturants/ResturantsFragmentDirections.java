package com.clickEat.ug.screens.resturants;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.clickEat.ug.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ResturantsFragmentDirections {
  private ResturantsFragmentDirections() {
  }

  @NonNull
  public static ActionResturantsFragmentToMenuFragment actionResturantsFragmentToMenuFragment(
      int restaurantId, @NonNull String restaurantName) {
    return new ActionResturantsFragmentToMenuFragment(restaurantId, restaurantName);
  }

  @NonNull
  public static NavDirections actionResturantsFragmentToCartFragment() {
    return new ActionOnlyNavDirections(R.id.action_resturantsFragment_to_cartFragment);
  }

  public static class ActionResturantsFragmentToMenuFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionResturantsFragmentToMenuFragment(int restaurantId,
        @NonNull String restaurantName) {
      this.arguments.put("restaurant_id", restaurantId);
      if (restaurantName == null) {
        throw new IllegalArgumentException("Argument \"restaurantName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("restaurantName", restaurantName);
    }

    @NonNull
    public ActionResturantsFragmentToMenuFragment setRestaurantId(int restaurantId) {
      this.arguments.put("restaurant_id", restaurantId);
      return this;
    }

    @NonNull
    public ActionResturantsFragmentToMenuFragment setRestaurantName(
        @NonNull String restaurantName) {
      if (restaurantName == null) {
        throw new IllegalArgumentException("Argument \"restaurantName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("restaurantName", restaurantName);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_resturantsFragment_to_menuFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionResturantsFragmentToMenuFragment that = (ActionResturantsFragmentToMenuFragment) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getRestaurantId();
      result = 31 * result + (getRestaurantName() != null ? getRestaurantName().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionResturantsFragmentToMenuFragment(actionId=" + getActionId() + "){"
          + "restaurantId=" + getRestaurantId()
          + ", restaurantName=" + getRestaurantName()
          + "}";
    }
  }
}
