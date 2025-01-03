package com.clickEat.ug.screens.rate;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.clickEat.ug.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RateFragmentDirections {
  private RateFragmentDirections() {
  }

  @NonNull
  public static ActionRateFragmentToCommentFragment actionRateFragmentToCommentFragment(
      int productId, @NonNull String productName) {
    return new ActionRateFragmentToCommentFragment(productId, productName);
  }

  public static class ActionRateFragmentToCommentFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionRateFragmentToCommentFragment(int productId, @NonNull String productName) {
      this.arguments.put("productId", productId);
      if (productName == null) {
        throw new IllegalArgumentException("Argument \"productName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("productName", productName);
    }

    @NonNull
    public ActionRateFragmentToCommentFragment setProductId(int productId) {
      this.arguments.put("productId", productId);
      return this;
    }

    @NonNull
    public ActionRateFragmentToCommentFragment setProductName(@NonNull String productName) {
      if (productName == null) {
        throw new IllegalArgumentException("Argument \"productName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("productName", productName);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("productId")) {
        int productId = (int) arguments.get("productId");
        __result.putInt("productId", productId);
      }
      if (arguments.containsKey("productName")) {
        String productName = (String) arguments.get("productName");
        __result.putString("productName", productName);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_rateFragment_to_commentFragment;
    }

    @SuppressWarnings("unchecked")
    public int getProductId() {
      return (int) arguments.get("productId");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getProductName() {
      return (String) arguments.get("productName");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionRateFragmentToCommentFragment that = (ActionRateFragmentToCommentFragment) object;
      if (arguments.containsKey("productId") != that.arguments.containsKey("productId")) {
        return false;
      }
      if (getProductId() != that.getProductId()) {
        return false;
      }
      if (arguments.containsKey("productName") != that.arguments.containsKey("productName")) {
        return false;
      }
      if (getProductName() != null ? !getProductName().equals(that.getProductName()) : that.getProductName() != null) {
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
      result = 31 * result + getProductId();
      result = 31 * result + (getProductName() != null ? getProductName().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionRateFragmentToCommentFragment(actionId=" + getActionId() + "){"
          + "productId=" + getProductId()
          + ", productName=" + getProductName()
          + "}";
    }
  }
}
