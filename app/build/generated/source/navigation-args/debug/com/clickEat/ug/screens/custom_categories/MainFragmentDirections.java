package com.clickEat.ug.screens.custom_categories;

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

public class MainFragmentDirections {
  private MainFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMainFragmentToOrdersFragment() {
    return new ActionOnlyNavDirections(R.id.action_mainFragment_to_ordersFragment);
  }

  @NonNull
  public static NavDirections actionMainFragmentToAccountFragment() {
    return new ActionOnlyNavDirections(R.id.action_mainFragment_to_accountFragment);
  }

  @NonNull
  public static NavDirections actionMainFragmentToResturantsFragment() {
    return new ActionOnlyNavDirections(R.id.action_mainFragment_to_resturantsFragment);
  }

  @NonNull
  public static NavDirections actionMainFragmentToSignUpFragment() {
    return new ActionOnlyNavDirections(R.id.action_mainFragment_to_signUpFragment);
  }

  @NonNull
  public static NavDirections actionMainFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_mainFragment_to_loginFragment);
  }

  @NonNull
  public static NavDirections actionMainFragmentToCartFragment2() {
    return new ActionOnlyNavDirections(R.id.action_mainFragment_to_cartFragment2);
  }

  @NonNull
  public static NavDirections actionMainFragmentToDrinksFragment() {
    return new ActionOnlyNavDirections(R.id.action_mainFragment_to_drinksFragment);
  }

  @NonNull
  public static NavDirections actionMainFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_mainFragment_to_homeFragment);
  }

  @NonNull
  public static ActionMainFragmentToCommentFragment actionMainFragmentToCommentFragment(
      int productId, @NonNull String productName) {
    return new ActionMainFragmentToCommentFragment(productId, productName);
  }

  @NonNull
  public static ActionMainFragmentToSubCatProductsFragment actionMainFragmentToSubCatProductsFragment(
      int subCatId, @NonNull String subCatName) {
    return new ActionMainFragmentToSubCatProductsFragment(subCatId, subCatName);
  }

  @NonNull
  public static ActionMainFragmentToCheckoutFragment actionMainFragmentToCheckoutFragment(
      int customerId) {
    return new ActionMainFragmentToCheckoutFragment(customerId);
  }

  @NonNull
  public static ActionMainFragmentToEditAddressFragment2 actionMainFragmentToEditAddressFragment2(
      int addressID, @NonNull String otherDetails) {
    return new ActionMainFragmentToEditAddressFragment2(addressID, otherDetails);
  }

  @NonNull
  public static ActionMainFragmentToCategoryFragment actionMainFragmentToCategoryFragment(
      @NonNull String categoryName) {
    return new ActionMainFragmentToCategoryFragment(categoryName);
  }

  @NonNull
  public static NavDirections actionMainFragmentToSubCategoryLayoutFragment() {
    return new ActionOnlyNavDirections(R.id.action_mainFragment_to_subCategoryLayoutFragment);
  }

  public static class ActionMainFragmentToCommentFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionMainFragmentToCommentFragment(int productId, @NonNull String productName) {
      this.arguments.put("productId", productId);
      if (productName == null) {
        throw new IllegalArgumentException("Argument \"productName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("productName", productName);
    }

    @NonNull
    public ActionMainFragmentToCommentFragment setProductId(int productId) {
      this.arguments.put("productId", productId);
      return this;
    }

    @NonNull
    public ActionMainFragmentToCommentFragment setProductName(@NonNull String productName) {
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
      return R.id.action_mainFragment_to_commentFragment;
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
      ActionMainFragmentToCommentFragment that = (ActionMainFragmentToCommentFragment) object;
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
      return "ActionMainFragmentToCommentFragment(actionId=" + getActionId() + "){"
          + "productId=" + getProductId()
          + ", productName=" + getProductName()
          + "}";
    }
  }

  public static class ActionMainFragmentToSubCatProductsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionMainFragmentToSubCatProductsFragment(int subCatId, @NonNull String subCatName) {
      this.arguments.put("subCatId", subCatId);
      if (subCatName == null) {
        throw new IllegalArgumentException("Argument \"subCatName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("subCatName", subCatName);
    }

    @NonNull
    public ActionMainFragmentToSubCatProductsFragment setSubCatId(int subCatId) {
      this.arguments.put("subCatId", subCatId);
      return this;
    }

    @NonNull
    public ActionMainFragmentToSubCatProductsFragment setSubCatName(@NonNull String subCatName) {
      if (subCatName == null) {
        throw new IllegalArgumentException("Argument \"subCatName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("subCatName", subCatName);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_mainFragment_to_subCatProductsFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMainFragmentToSubCatProductsFragment that = (ActionMainFragmentToSubCatProductsFragment) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getSubCatId();
      result = 31 * result + (getSubCatName() != null ? getSubCatName().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMainFragmentToSubCatProductsFragment(actionId=" + getActionId() + "){"
          + "subCatId=" + getSubCatId()
          + ", subCatName=" + getSubCatName()
          + "}";
    }
  }

  public static class ActionMainFragmentToCheckoutFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionMainFragmentToCheckoutFragment(int customerId) {
      this.arguments.put("customer_id", customerId);
    }

    @NonNull
    public ActionMainFragmentToCheckoutFragment setCustomerId(int customerId) {
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
      return R.id.action_mainFragment_to_checkoutFragment;
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
      ActionMainFragmentToCheckoutFragment that = (ActionMainFragmentToCheckoutFragment) object;
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
      return "ActionMainFragmentToCheckoutFragment(actionId=" + getActionId() + "){"
          + "customerId=" + getCustomerId()
          + "}";
    }
  }

  public static class ActionMainFragmentToEditAddressFragment2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionMainFragmentToEditAddressFragment2(int addressID, @NonNull String otherDetails) {
      this.arguments.put("addressID", addressID);
      if (otherDetails == null) {
        throw new IllegalArgumentException("Argument \"otherDetails\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("otherDetails", otherDetails);
    }

    @NonNull
    public ActionMainFragmentToEditAddressFragment2 setAddressID(int addressID) {
      this.arguments.put("addressID", addressID);
      return this;
    }

    @NonNull
    public ActionMainFragmentToEditAddressFragment2 setOtherDetails(@NonNull String otherDetails) {
      if (otherDetails == null) {
        throw new IllegalArgumentException("Argument \"otherDetails\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("otherDetails", otherDetails);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("addressID")) {
        int addressID = (int) arguments.get("addressID");
        __result.putInt("addressID", addressID);
      }
      if (arguments.containsKey("otherDetails")) {
        String otherDetails = (String) arguments.get("otherDetails");
        __result.putString("otherDetails", otherDetails);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_mainFragment_to_editAddressFragment2;
    }

    @SuppressWarnings("unchecked")
    public int getAddressID() {
      return (int) arguments.get("addressID");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getOtherDetails() {
      return (String) arguments.get("otherDetails");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMainFragmentToEditAddressFragment2 that = (ActionMainFragmentToEditAddressFragment2) object;
      if (arguments.containsKey("addressID") != that.arguments.containsKey("addressID")) {
        return false;
      }
      if (getAddressID() != that.getAddressID()) {
        return false;
      }
      if (arguments.containsKey("otherDetails") != that.arguments.containsKey("otherDetails")) {
        return false;
      }
      if (getOtherDetails() != null ? !getOtherDetails().equals(that.getOtherDetails()) : that.getOtherDetails() != null) {
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
      result = 31 * result + getAddressID();
      result = 31 * result + (getOtherDetails() != null ? getOtherDetails().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMainFragmentToEditAddressFragment2(actionId=" + getActionId() + "){"
          + "addressID=" + getAddressID()
          + ", otherDetails=" + getOtherDetails()
          + "}";
    }
  }

  public static class ActionMainFragmentToCategoryFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionMainFragmentToCategoryFragment(@NonNull String categoryName) {
      if (categoryName == null) {
        throw new IllegalArgumentException("Argument \"categoryName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("categoryName", categoryName);
    }

    @NonNull
    public ActionMainFragmentToCategoryFragment setCategoryName(@NonNull String categoryName) {
      if (categoryName == null) {
        throw new IllegalArgumentException("Argument \"categoryName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("categoryName", categoryName);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("categoryName")) {
        String categoryName = (String) arguments.get("categoryName");
        __result.putString("categoryName", categoryName);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_mainFragment_to_categoryFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCategoryName() {
      return (String) arguments.get("categoryName");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMainFragmentToCategoryFragment that = (ActionMainFragmentToCategoryFragment) object;
      if (arguments.containsKey("categoryName") != that.arguments.containsKey("categoryName")) {
        return false;
      }
      if (getCategoryName() != null ? !getCategoryName().equals(that.getCategoryName()) : that.getCategoryName() != null) {
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
      result = 31 * result + (getCategoryName() != null ? getCategoryName().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMainFragmentToCategoryFragment(actionId=" + getActionId() + "){"
          + "categoryName=" + getCategoryName()
          + "}";
    }
  }
}
