package com.clickEat.ug.screens.rate;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.clickEat.ug.data.Product;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RateFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private RateFragmentArgs() {
  }

  private RateFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static RateFragmentArgs fromBundle(@NonNull Bundle bundle) {
    RateFragmentArgs __result = new RateFragmentArgs();
    bundle.setClassLoader(RateFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("selectedProduct")) {
      Product selectedProduct;
      if (Parcelable.class.isAssignableFrom(Product.class) || Serializable.class.isAssignableFrom(Product.class)) {
        selectedProduct = (Product) bundle.get("selectedProduct");
      } else {
        throw new UnsupportedOperationException(Product.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (selectedProduct == null) {
        throw new IllegalArgumentException("Argument \"selectedProduct\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("selectedProduct", selectedProduct);
    } else {
      throw new IllegalArgumentException("Required argument \"selectedProduct\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Product getSelectedProduct() {
    return (Product) arguments.get("selectedProduct");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    RateFragmentArgs that = (RateFragmentArgs) object;
    if (arguments.containsKey("selectedProduct") != that.arguments.containsKey("selectedProduct")) {
      return false;
    }
    if (getSelectedProduct() != null ? !getSelectedProduct().equals(that.getSelectedProduct()) : that.getSelectedProduct() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getSelectedProduct() != null ? getSelectedProduct().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "RateFragmentArgs{"
        + "selectedProduct=" + getSelectedProduct()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(RateFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Product selectedProduct) {
      if (selectedProduct == null) {
        throw new IllegalArgumentException("Argument \"selectedProduct\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedProduct", selectedProduct);
    }

    @NonNull
    public RateFragmentArgs build() {
      RateFragmentArgs result = new RateFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setSelectedProduct(@NonNull Product selectedProduct) {
      if (selectedProduct == null) {
        throw new IllegalArgumentException("Argument \"selectedProduct\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedProduct", selectedProduct);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Product getSelectedProduct() {
      return (Product) arguments.get("selectedProduct");
    }
  }
}
