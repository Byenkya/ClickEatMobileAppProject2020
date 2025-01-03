package com.clickEat.ug.screens.login;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.clickEat.ug.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToMainFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_mainFragment);
  }

  @NonNull
  public static NavDirections actionLoginToCartFragment() {
    return new ActionOnlyNavDirections(R.id.action_login_to_cartFragment);
  }

  @NonNull
  public static NavDirections actionLoginToForgotPasswordFragment() {
    return new ActionOnlyNavDirections(R.id.action_login_to_forgotPasswordFragment);
  }
}
