package com.clickEat.ug.screens.comment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CommentFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private CommentFragmentArgs() {
  }

  private CommentFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static CommentFragmentArgs fromBundle(@NonNull Bundle bundle) {
    CommentFragmentArgs __result = new CommentFragmentArgs();
    bundle.setClassLoader(CommentFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("productId")) {
      int productId;
      productId = bundle.getInt("productId");
      __result.arguments.put("productId", productId);
    } else {
      throw new IllegalArgumentException("Required argument \"productId\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("productName")) {
      String productName;
      productName = bundle.getString("productName");
      if (productName == null) {
        throw new IllegalArgumentException("Argument \"productName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("productName", productName);
    } else {
      throw new IllegalArgumentException("Required argument \"productName\" is missing and does not have an android:defaultValue");
    }
    return __result;
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    CommentFragmentArgs that = (CommentFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getProductId();
    result = 31 * result + (getProductName() != null ? getProductName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "CommentFragmentArgs{"
        + "productId=" + getProductId()
        + ", productName=" + getProductName()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(CommentFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int productId, @NonNull String productName) {
      this.arguments.put("productId", productId);
      if (productName == null) {
        throw new IllegalArgumentException("Argument \"productName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("productName", productName);
    }

    @NonNull
    public CommentFragmentArgs build() {
      CommentFragmentArgs result = new CommentFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setProductId(int productId) {
      this.arguments.put("productId", productId);
      return this;
    }

    @NonNull
    public Builder setProductName(@NonNull String productName) {
      if (productName == null) {
        throw new IllegalArgumentException("Argument \"productName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("productName", productName);
      return this;
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
  }
}
