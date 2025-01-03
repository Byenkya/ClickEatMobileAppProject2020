package com.clickEat.ug;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class FirstFragmentDirections {
  private FirstFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFirstFragmentToSecondFragment() {
    return new ActionOnlyNavDirections(R.id.action_FirstFragment_to_SecondFragment);
  }
}
