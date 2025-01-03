package com.clickEat.ug.screens.signup;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.clickEat.ug.R;

public class SignUpFragmentDirections {
  private SignUpFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSignUpFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_signUpFragment_to_loginFragment);
  }
}
