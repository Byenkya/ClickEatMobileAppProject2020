package com.clickEat.ug.screens.edit_address;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class EditAddressFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private EditAddressFragmentArgs() {
  }

  private EditAddressFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static EditAddressFragmentArgs fromBundle(@NonNull Bundle bundle) {
    EditAddressFragmentArgs __result = new EditAddressFragmentArgs();
    bundle.setClassLoader(EditAddressFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("addressID")) {
      int addressID;
      addressID = bundle.getInt("addressID");
      __result.arguments.put("addressID", addressID);
    } else {
      throw new IllegalArgumentException("Required argument \"addressID\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("otherDetails")) {
      String otherDetails;
      otherDetails = bundle.getString("otherDetails");
      if (otherDetails == null) {
        throw new IllegalArgumentException("Argument \"otherDetails\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("otherDetails", otherDetails);
    } else {
      throw new IllegalArgumentException("Required argument \"otherDetails\" is missing and does not have an android:defaultValue");
    }
    return __result;
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    EditAddressFragmentArgs that = (EditAddressFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getAddressID();
    result = 31 * result + (getOtherDetails() != null ? getOtherDetails().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "EditAddressFragmentArgs{"
        + "addressID=" + getAddressID()
        + ", otherDetails=" + getOtherDetails()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(EditAddressFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int addressID, @NonNull String otherDetails) {
      this.arguments.put("addressID", addressID);
      if (otherDetails == null) {
        throw new IllegalArgumentException("Argument \"otherDetails\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("otherDetails", otherDetails);
    }

    @NonNull
    public EditAddressFragmentArgs build() {
      EditAddressFragmentArgs result = new EditAddressFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setAddressID(int addressID) {
      this.arguments.put("addressID", addressID);
      return this;
    }

    @NonNull
    public Builder setOtherDetails(@NonNull String otherDetails) {
      if (otherDetails == null) {
        throw new IllegalArgumentException("Argument \"otherDetails\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("otherDetails", otherDetails);
      return this;
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
  }
}
