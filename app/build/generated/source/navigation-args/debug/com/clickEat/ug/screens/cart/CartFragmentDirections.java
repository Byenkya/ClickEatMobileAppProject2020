package com.clickEat.ug.screens.cart;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.clickEat.ug.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CartFragmentDirections {
  private CartFragmentDirections() {
  }

  @NonNull
  public static ActionCartFragmentToCheckoutFragment actionCartFragmentToCheckoutFragment(
      int customerId) {
    return new ActionCartFragmentToCheckoutFragment(customerId);
  }

  @NonNull
  public static NavDirections actionCartFragmentToResturantsFragment() {
    return new ActionOnlyNavDirections(R.id.action_cartFragment_to_resturantsFragment);
  }

  public static class ActionCartFragmentToCheckoutFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionCartFragmentToCheckoutFragment(int customerId) {
      this.arguments.put("customer_id", customerId);
    }

    @NonNull
    public ActionCartFragmentToCheckoutFragment setCustomerId(int customerId) {
      this.arguments.put("customer_id", customerId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("customer_id")) {
        int customerId = (int) arguments.get("customer_id");
        __result.putInt("customer_id", customerId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_cartFragment_to_checkoutFragment;
    }

    @SuppressWarnings("unchecked")
    public int getCustomerId() {
      return (int) arguments.get("customer_id");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionCartFragmentToCheckoutFragment that = (ActionCartFragmentToCheckoutFragment) object;
      if (arguments.containsKey("customer_id") != that.arguments.containsKey("customer_id")) {
        return false;
      }
      if (getCustomerId() != that.getCustomerId()) {
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
      result = 31 * result + getCustomerId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionCartFragmentToCheckoutFragment(actionId=" + getActionId() + "){"
          + "customerId=" + getCustomerId()
          + "}";
    }
  }
}
