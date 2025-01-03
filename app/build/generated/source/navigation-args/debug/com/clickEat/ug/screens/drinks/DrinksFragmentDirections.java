package com.clickEat.ug.screens.drinks;

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

public class DrinksFragmentDirections {
  private DrinksFragmentDirections() {
  }

  @NonNull
  public static ActionDrinksFragmentToListDrinksFragment actionDrinksFragmentToListDrinksFragment(
      int drinksSubCatID, @NonNull String catType) {
    return new ActionDrinksFragmentToListDrinksFragment(drinksSubCatID, catType);
  }

  @NonNull
  public static NavDirections actionDrinksFragmentToCartFragment3() {
    return new ActionOnlyNavDirections(R.id.action_drinksFragment_to_cartFragment3);
  }

  public static class ActionDrinksFragmentToListDrinksFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionDrinksFragmentToListDrinksFragment(int drinksSubCatID, @NonNull String catType) {
      this.arguments.put("drinksSubCatID", drinksSubCatID);
      if (catType == null) {
        throw new IllegalArgumentException("Argument \"catType\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("catType", catType);
    }

    @NonNull
    public ActionDrinksFragmentToListDrinksFragment setDrinksSubCatID(int drinksSubCatID) {
      this.arguments.put("drinksSubCatID", drinksSubCatID);
      return this;
    }

    @NonNull
    public ActionDrinksFragmentToListDrinksFragment setCatType(@NonNull String catType) {
      if (catType == null) {
        throw new IllegalArgumentException("Argument \"catType\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("catType", catType);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_drinksFragment_to_listDrinksFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDrinksFragmentToListDrinksFragment that = (ActionDrinksFragmentToListDrinksFragment) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getDrinksSubCatID();
      result = 31 * result + (getCatType() != null ? getCatType().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionDrinksFragmentToListDrinksFragment(actionId=" + getActionId() + "){"
          + "drinksSubCatID=" + getDrinksSubCatID()
          + ", catType=" + getCatType()
          + "}";
    }
  }
}
