package com.clickEat.ug.screens.account;

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

public class PersonalInfoFragmentDirections {
  private PersonalInfoFragmentDirections() {
  }

  @NonNull
  public static ActionPersonalInfoFragment2ToEditAddressFragment2 actionPersonalInfoFragment2ToEditAddressFragment2(
      int addressID, @NonNull String otherDetails) {
    return new ActionPersonalInfoFragment2ToEditAddressFragment2(addressID, otherDetails);
  }

  public static class ActionPersonalInfoFragment2ToEditAddressFragment2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionPersonalInfoFragment2ToEditAddressFragment2(int addressID,
        @NonNull String otherDetails) {
      this.arguments.put("addressID", addressID);
      if (otherDetails == null) {
        throw new IllegalArgumentException("Argument \"otherDetails\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("otherDetails", otherDetails);
    }

    @NonNull
    public ActionPersonalInfoFragment2ToEditAddressFragment2 setAddressID(int addressID) {
      this.arguments.put("addressID", addressID);
      return this;
    }

    @NonNull
    public ActionPersonalInfoFragment2ToEditAddressFragment2 setOtherDetails(
        @NonNull String otherDetails) {
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
      return R.id.action_personalInfoFragment2_to_editAddressFragment2;
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
      ActionPersonalInfoFragment2ToEditAddressFragment2 that = (ActionPersonalInfoFragment2ToEditAddressFragment2) object;
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
      return "ActionPersonalInfoFragment2ToEditAddressFragment2(actionId=" + getActionId() + "){"
          + "addressID=" + getAddressID()
          + ", otherDetails=" + getOtherDetails()
          + "}";
    }
  }
}
