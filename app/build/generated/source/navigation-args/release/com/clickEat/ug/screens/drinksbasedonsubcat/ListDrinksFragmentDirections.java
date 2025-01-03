package com.clickEat.ug.screens.drinksbasedonsubcat;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.clickEat.ug.R;
import com.clickEat.ug.data.Product;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ListDrinksFragmentDirections {
  private ListDrinksFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListDrinksFragmentToCartFragment() {
    return new ActionOnlyNavDirections(R.id.action_listDrinksFragment_to_cartFragment);
  }

  @NonNull
  public static ActionListDrinksFragmentToCommentFragment actionListDrinksFragmentToCommentFragment(
      int productId, @NonNull String productName) {
    return new ActionListDrinksFragmentToCommentFragment(productId, productName);
  }

  @NonNull
  public static ActionListDrinksFragmentToRateFragment2 actionListDrinksFragmentToRateFragment2(
      @NonNull Product selectedProduct) {
    return new ActionListDrinksFragmentToRateFragment2(selectedProduct);
  }

  public static class ActionListDrinksFragmentToCommentFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionListDrinksFragmentToCommentFragment(int productId, @NonNull String productName) {
      this.arguments.put("productId", productId);
      if (productName == null) {
        throw new IllegalArgumentException("Argument \"productName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("productName", productName);
    }

    @NonNull
    public ActionListDrinksFragmentToCommentFragment setProductId(int productId) {
      this.arguments.put("productId", productId);
      return this;
    }

    @NonNull
    public ActionListDrinksFragmentToCommentFragment setProductName(@NonNull String productName) {
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
      return R.id.action_listDrinksFragment_to_commentFragment;
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
      ActionListDrinksFragmentToCommentFragment that = (ActionListDrinksFragmentToCommentFragment) object;
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
      return "ActionListDrinksFragmentToCommentFragment(actionId=" + getActionId() + "){"
          + "productId=" + getProductId()
          + ", productName=" + getProductName()
          + "}";
    }
  }

  public static class ActionListDrinksFragmentToRateFragment2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionListDrinksFragmentToRateFragment2(@NonNull Product selectedProduct) {
      if (selectedProduct == null) {
        throw new IllegalArgumentException("Argument \"selectedProduct\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedProduct", selectedProduct);
    }

    @NonNull
    public ActionListDrinksFragmentToRateFragment2 setSelectedProduct(
        @NonNull Product selectedProduct) {
      if (selectedProduct == null) {
        throw new IllegalArgumentException("Argument \"selectedProduct\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedProduct", selectedProduct);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("selectedProduct")) {
        Product selectedProduct = (Product) arguments.get("selectedProduct");
        if (Parcelable.class.isAssignableFrom(Product.class) || selectedProduct == null) {
          __result.putParcelable("selectedProduct", Parcelable.class.cast(selectedProduct));
        } else if (Serializable.class.isAssignableFrom(Product.class)) {
          __result.putSerializable("selectedProduct", Serializable.class.cast(selectedProduct));
        } else {
          throw new UnsupportedOperationException(Product.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_listDrinksFragment_to_rateFragment2;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Product getSelectedProduct() {
      return (Product) arguments.get("selectedProduct");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionListDrinksFragmentToRateFragment2 that = (ActionListDrinksFragmentToRateFragment2) object;
      if (arguments.containsKey("selectedProduct") != that.arguments.containsKey("selectedProduct")) {
        return false;
      }
      if (getSelectedProduct() != null ? !getSelectedProduct().equals(that.getSelectedProduct()) : that.getSelectedProduct() != null) {
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
      result = 31 * result + (getSelectedProduct() != null ? getSelectedProduct().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionListDrinksFragmentToRateFragment2(actionId=" + getActionId() + "){"
          + "selectedProduct=" + getSelectedProduct()
          + "}";
    }
  }
}
