package com.clickEat.ug.screens.sub_categories;

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

public class SubCategoryLayoutFragmentDirections {
  private SubCategoryLayoutFragmentDirections() {
  }

  @NonNull
  public static ActionSubCategoryLayoutFragmentToSubCatProductsFragment actionSubCategoryLayoutFragmentToSubCatProductsFragment(
      int subCatId, @NonNull String subCatName) {
    return new ActionSubCategoryLayoutFragmentToSubCatProductsFragment(subCatId, subCatName);
  }

  public static class ActionSubCategoryLayoutFragmentToSubCatProductsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionSubCategoryLayoutFragmentToSubCatProductsFragment(int subCatId,
        @NonNull String subCatName) {
      this.arguments.put("subCatId", subCatId);
      if (subCatName == null) {
        throw new IllegalArgumentException("Argument \"subCatName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("subCatName", subCatName);
    }

    @NonNull
    public ActionSubCategoryLayoutFragmentToSubCatProductsFragment setSubCatId(int subCatId) {
      this.arguments.put("subCatId", subCatId);
      return this;
    }

    @NonNull
    public ActionSubCategoryLayoutFragmentToSubCatProductsFragment setSubCatName(
        @NonNull String subCatName) {
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
      return R.id.action_subCategoryLayoutFragment_to_subCatProductsFragment;
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
      ActionSubCategoryLayoutFragmentToSubCatProductsFragment that = (ActionSubCategoryLayoutFragmentToSubCatProductsFragment) object;
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
      return "ActionSubCategoryLayoutFragmentToSubCatProductsFragment(actionId=" + getActionId() + "){"
          + "subCatId=" + getSubCatId()
          + ", subCatName=" + getSubCatName()
          + "}";
    }
  }
}
