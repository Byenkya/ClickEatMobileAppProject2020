package com.clickEat.ug.screens.checkout;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CheckoutFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private CheckoutFragmentArgs() {
  }

  private CheckoutFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static CheckoutFragmentArgs fromBundle(@NonNull Bundle bundle) {
    CheckoutFragmentArgs __result = new CheckoutFragmentArgs();
    bundle.setClassLoader(CheckoutFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("customer_id")) {
      int customerId;
      customerId = bundle.getInt("customer_id");
      __result.arguments.put("customer_id", customerId);
    } else {
      throw new IllegalArgumentException("Required argument \"customer_id\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getCustomerId() {
    return (int) arguments.get("customer_id");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("customer_id")) {
      int customerId = (int) arguments.get("customer_id");
      __result.putInt("customer_id", customerId);
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
    CheckoutFragmentArgs that = (CheckoutFragmentArgs) object;
    if (arguments.containsKey("customer_id") != that.arguments.containsKey("customer_id")) {
      return false;
    }
    if (getCustomerId() != that.getCustomerId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getCustomerId();
    return result;
  }

  @Override
  public String toString() {
    return "CheckoutFragmentArgs{"
        + "customerId=" + getCustomerId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(CheckoutFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int customerId) {
      this.arguments.put("customer_id", customerId);
    }

    @NonNull
    public CheckoutFragmentArgs build() {
      CheckoutFragmentArgs result = new CheckoutFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setCustomerId(int customerId) {
      this.arguments.put("customer_id", customerId);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getCustomerId() {
      return (int) arguments.get("customer_id");
    }
  }
}
