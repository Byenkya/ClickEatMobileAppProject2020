package com.clickEat.ug.screens.edit_address;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.clickEat.ug.R;

public class EditAddressFragmentDirections {
  private EditAddressFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionEditAddressFragment2ToAccountFragment() {
    return new ActionOnlyNavDirections(R.id.action_editAddressFragment2_to_accountFragment);
  }

  @NonNull
  public static NavDirections actionEditAddressFragment2ToOrdersFragment() {
    return new ActionOnlyNavDirections(R.id.action_editAddressFragment2_to_ordersFragment);
  }
}
