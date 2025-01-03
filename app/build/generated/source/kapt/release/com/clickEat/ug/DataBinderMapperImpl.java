package com.clickEat.ug;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.clickEat.ug.databinding.ActivityMainBindingImpl;
import com.clickEat.ug.databinding.AddressItemLayoutBindingImpl;
import com.clickEat.ug.databinding.AddressLayoutBindingImpl;
import com.clickEat.ug.databinding.AllMenuItemsBindingImpl;
import com.clickEat.ug.databinding.CartItemLayoutBindingImpl;
import com.clickEat.ug.databinding.ChangePasswordLayoutBindingImpl;
import com.clickEat.ug.databinding.CommentItemLayoutBindingImpl;
import com.clickEat.ug.databinding.CorouselViewLayoutBindingImpl;
import com.clickEat.ug.databinding.CustomCatItemsHolderBindingImpl;
import com.clickEat.ug.databinding.CustomCategoriesLayoutBindingImpl;
import com.clickEat.ug.databinding.DealsOfTheDayLayoutBindingImpl;
import com.clickEat.ug.databinding.DrinksSubcatitemLayoutBindingImpl;
import com.clickEat.ug.databinding.FragmentAccountBindingImpl;
import com.clickEat.ug.databinding.FragmentCartBindingImpl;
import com.clickEat.ug.databinding.FragmentCategoryBindingImpl;
import com.clickEat.ug.databinding.FragmentCheckoutBindingImpl;
import com.clickEat.ug.databinding.FragmentCommentBindingImpl;
import com.clickEat.ug.databinding.FragmentDrinksBindingImpl;
import com.clickEat.ug.databinding.FragmentEditAddressBindingImpl;
import com.clickEat.ug.databinding.FragmentForgotPasswordBindingImpl;
import com.clickEat.ug.databinding.FragmentHomeBindingImpl;
import com.clickEat.ug.databinding.FragmentListDrinksBindingImpl;
import com.clickEat.ug.databinding.FragmentLoginBindingImpl;
import com.clickEat.ug.databinding.FragmentMainBindingImpl;
import com.clickEat.ug.databinding.FragmentMenuBindingImpl;
import com.clickEat.ug.databinding.FragmentMyStepperBindingImpl;
import com.clickEat.ug.databinding.FragmentOrdersBindingImpl;
import com.clickEat.ug.databinding.FragmentPaymentsBindingImpl;
import com.clickEat.ug.databinding.FragmentRateBindingImpl;
import com.clickEat.ug.databinding.FragmentResturantsBindingImpl;
import com.clickEat.ug.databinding.FragmentSearchBindingImpl;
import com.clickEat.ug.databinding.FragmentSignUpBindingImpl;
import com.clickEat.ug.databinding.FragmentSubCatProductsBindingImpl;
import com.clickEat.ug.databinding.FragmentSubCategoryLayoutBindingImpl;
import com.clickEat.ug.databinding.HomeCategoryItemsBindingImpl;
import com.clickEat.ug.databinding.HomeSubCategoriesLayoutBindingImpl;
import com.clickEat.ug.databinding.ItemBindingImpl;
import com.clickEat.ug.databinding.ItemBindingV26Impl;
import com.clickEat.ug.databinding.ItemInformationBindingImpl;
import com.clickEat.ug.databinding.MenuCustomLayoutBindingImpl;
import com.clickEat.ug.databinding.MoreProductsLayoutBindingImpl;
import com.clickEat.ug.databinding.NewAddressLayoutBindingImpl;
import com.clickEat.ug.databinding.NoInternetConnectionBindingImpl;
import com.clickEat.ug.databinding.OrderCartItemLayoutBindingImpl;
import com.clickEat.ug.databinding.OrderItemLayoutBindingImpl;
import com.clickEat.ug.databinding.OrderItemSummaryLayoutBindingImpl;
import com.clickEat.ug.databinding.PersonalAccountInfoBindingImpl;
import com.clickEat.ug.databinding.ProductImageLayoutBindingImpl;
import com.clickEat.ug.databinding.ProductsRecommendedLayoutBindingImpl;
import com.clickEat.ug.databinding.RateProductLayoutBindingImpl;
import com.clickEat.ug.databinding.ResturantsBindingImpl;
import com.clickEat.ug.databinding.SampleProductsFromDifferentSubcatLayoutBindingImpl;
import com.clickEat.ug.databinding.SubCategoryItemLayoutBindingImpl;
import com.clickEat.ug.databinding.SubcatCustomLayoutBindingImpl;
import com.clickEat.ug.databinding.TopCategoryItemLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ADDRESSITEMLAYOUT = 2;

  private static final int LAYOUT_ADDRESSLAYOUT = 3;

  private static final int LAYOUT_ALLMENUITEMS = 4;

  private static final int LAYOUT_CARTITEMLAYOUT = 5;

  private static final int LAYOUT_CHANGEPASSWORDLAYOUT = 6;

  private static final int LAYOUT_COMMENTITEMLAYOUT = 7;

  private static final int LAYOUT_COROUSELVIEWLAYOUT = 8;

  private static final int LAYOUT_CUSTOMCATITEMSHOLDER = 9;

  private static final int LAYOUT_CUSTOMCATEGORIESLAYOUT = 10;

  private static final int LAYOUT_DEALSOFTHEDAYLAYOUT = 11;

  private static final int LAYOUT_DRINKSSUBCATITEMLAYOUT = 12;

  private static final int LAYOUT_FRAGMENTACCOUNT = 13;

  private static final int LAYOUT_FRAGMENTCART = 14;

  private static final int LAYOUT_FRAGMENTCATEGORY = 15;

  private static final int LAYOUT_FRAGMENTCHECKOUT = 16;

  private static final int LAYOUT_FRAGMENTCOMMENT = 17;

  private static final int LAYOUT_FRAGMENTDRINKS = 18;

  private static final int LAYOUT_FRAGMENTEDITADDRESS = 19;

  private static final int LAYOUT_FRAGMENTFORGOTPASSWORD = 20;

  private static final int LAYOUT_FRAGMENTHOME = 21;

  private static final int LAYOUT_FRAGMENTLISTDRINKS = 22;

  private static final int LAYOUT_FRAGMENTLOGIN = 23;

  private static final int LAYOUT_FRAGMENTMAIN = 24;

  private static final int LAYOUT_FRAGMENTMENU = 25;

  private static final int LAYOUT_FRAGMENTMYSTEPPER = 26;

  private static final int LAYOUT_FRAGMENTORDERS = 27;

  private static final int LAYOUT_FRAGMENTPAYMENTS = 28;

  private static final int LAYOUT_FRAGMENTRATE = 29;

  private static final int LAYOUT_FRAGMENTRESTURANTS = 30;

  private static final int LAYOUT_FRAGMENTSEARCH = 31;

  private static final int LAYOUT_FRAGMENTSIGNUP = 32;

  private static final int LAYOUT_FRAGMENTSUBCATPRODUCTS = 33;

  private static final int LAYOUT_FRAGMENTSUBCATEGORYLAYOUT = 34;

  private static final int LAYOUT_HOMECATEGORYITEMS = 35;

  private static final int LAYOUT_HOMESUBCATEGORIESLAYOUT = 36;

  private static final int LAYOUT_ITEM = 37;

  private static final int LAYOUT_ITEMINFORMATION = 38;

  private static final int LAYOUT_MENUCUSTOMLAYOUT = 39;

  private static final int LAYOUT_MOREPRODUCTSLAYOUT = 40;

  private static final int LAYOUT_NEWADDRESSLAYOUT = 41;

  private static final int LAYOUT_NOINTERNETCONNECTION = 42;

  private static final int LAYOUT_ORDERCARTITEMLAYOUT = 43;

  private static final int LAYOUT_ORDERITEMLAYOUT = 44;

  private static final int LAYOUT_ORDERITEMSUMMARYLAYOUT = 45;

  private static final int LAYOUT_PERSONALACCOUNTINFO = 46;

  private static final int LAYOUT_PRODUCTIMAGELAYOUT = 47;

  private static final int LAYOUT_PRODUCTSRECOMMENDEDLAYOUT = 48;

  private static final int LAYOUT_RATEPRODUCTLAYOUT = 49;

  private static final int LAYOUT_RESTURANTS = 50;

  private static final int LAYOUT_SAMPLEPRODUCTSFROMDIFFERENTSUBCATLAYOUT = 51;

  private static final int LAYOUT_SUBCATEGORYITEMLAYOUT = 52;

  private static final int LAYOUT_SUBCATCUSTOMLAYOUT = 53;

  private static final int LAYOUT_TOPCATEGORYITEMLAYOUT = 54;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(54);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.address_item_layout, LAYOUT_ADDRESSITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.address_layout, LAYOUT_ADDRESSLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.all_menu_items, LAYOUT_ALLMENUITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.cart_item_layout, LAYOUT_CARTITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.change_password_layout, LAYOUT_CHANGEPASSWORDLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.comment_item_layout, LAYOUT_COMMENTITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.corousel_view_layout, LAYOUT_COROUSELVIEWLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.custom_cat_items_holder, LAYOUT_CUSTOMCATITEMSHOLDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.custom_categories_layout, LAYOUT_CUSTOMCATEGORIESLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.deals_of_the_day_layout, LAYOUT_DEALSOFTHEDAYLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.drinks_subcatitem_layout, LAYOUT_DRINKSSUBCATITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_account, LAYOUT_FRAGMENTACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_cart, LAYOUT_FRAGMENTCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_category, LAYOUT_FRAGMENTCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_checkout, LAYOUT_FRAGMENTCHECKOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_comment, LAYOUT_FRAGMENTCOMMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_drinks, LAYOUT_FRAGMENTDRINKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_edit_address, LAYOUT_FRAGMENTEDITADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_forgot_password, LAYOUT_FRAGMENTFORGOTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_list_drinks, LAYOUT_FRAGMENTLISTDRINKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_menu, LAYOUT_FRAGMENTMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_my_stepper, LAYOUT_FRAGMENTMYSTEPPER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_orders, LAYOUT_FRAGMENTORDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_payments, LAYOUT_FRAGMENTPAYMENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_rate, LAYOUT_FRAGMENTRATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_resturants, LAYOUT_FRAGMENTRESTURANTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_sign_up, LAYOUT_FRAGMENTSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_sub_cat_products, LAYOUT_FRAGMENTSUBCATPRODUCTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.fragment_sub_category_layout, LAYOUT_FRAGMENTSUBCATEGORYLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.home_category_items, LAYOUT_HOMECATEGORYITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.home_sub_categories_layout, LAYOUT_HOMESUBCATEGORIESLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.item, LAYOUT_ITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.item_information, LAYOUT_ITEMINFORMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.menu_custom_layout, LAYOUT_MENUCUSTOMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.more_products_layout, LAYOUT_MOREPRODUCTSLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.new_address_layout, LAYOUT_NEWADDRESSLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.no_internet_connection, LAYOUT_NOINTERNETCONNECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.order_cart_item_layout, LAYOUT_ORDERCARTITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.order_item_layout, LAYOUT_ORDERITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.order_item_summary_layout, LAYOUT_ORDERITEMSUMMARYLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.personal_account_info, LAYOUT_PERSONALACCOUNTINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.product_image_layout, LAYOUT_PRODUCTIMAGELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.products_recommended_layout, LAYOUT_PRODUCTSRECOMMENDEDLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.rate_product_layout, LAYOUT_RATEPRODUCTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.resturants, LAYOUT_RESTURANTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.sample_products_from_different_subcat_layout, LAYOUT_SAMPLEPRODUCTSFROMDIFFERENTSUBCATLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.sub_category_item_layout, LAYOUT_SUBCATEGORYITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.subcat_custom_layout, LAYOUT_SUBCATCUSTOMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.clickEat.ug.R.layout.top_category_item_layout, LAYOUT_TOPCATEGORYITEMLAYOUT);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYMAIN: {
        if ("layout/activity_main_0".equals(tag)) {
          return new ActivityMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDRESSITEMLAYOUT: {
        if ("layout/address_item_layout_0".equals(tag)) {
          return new AddressItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for address_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDRESSLAYOUT: {
        if ("layout/address_layout_0".equals(tag)) {
          return new AddressLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for address_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_ALLMENUITEMS: {
        if ("layout/all_menu_items_0".equals(tag)) {
          return new AllMenuItemsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for all_menu_items is invalid. Received: " + tag);
      }
      case  LAYOUT_CARTITEMLAYOUT: {
        if ("layout/cart_item_layout_0".equals(tag)) {
          return new CartItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for cart_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_CHANGEPASSWORDLAYOUT: {
        if ("layout/change_password_layout_0".equals(tag)) {
          return new ChangePasswordLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for change_password_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_COMMENTITEMLAYOUT: {
        if ("layout/comment_item_layout_0".equals(tag)) {
          return new CommentItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for comment_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_COROUSELVIEWLAYOUT: {
        if ("layout/corousel_view_layout_0".equals(tag)) {
          return new CorouselViewLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for corousel_view_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMCATITEMSHOLDER: {
        if ("layout/custom_cat_items_holder_0".equals(tag)) {
          return new CustomCatItemsHolderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_cat_items_holder is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMCATEGORIESLAYOUT: {
        if ("layout/custom_categories_layout_0".equals(tag)) {
          return new CustomCategoriesLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_categories_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_DEALSOFTHEDAYLAYOUT: {
        if ("layout/deals_of_the_day_layout_0".equals(tag)) {
          return new DealsOfTheDayLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for deals_of_the_day_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_DRINKSSUBCATITEMLAYOUT: {
        if ("layout/drinks_subcatitem_layout_0".equals(tag)) {
          return new DrinksSubcatitemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for drinks_subcatitem_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTACCOUNT: {
        if ("layout/fragment_account_0".equals(tag)) {
          return new FragmentAccountBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_account is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCART: {
        if ("layout/fragment_cart_0".equals(tag)) {
          return new FragmentCartBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_cart is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCATEGORY: {
        if ("layout/fragment_category_0".equals(tag)) {
          return new FragmentCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_category is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCHECKOUT: {
        if ("layout/fragment_checkout_0".equals(tag)) {
          return new FragmentCheckoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_checkout is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCOMMENT: {
        if ("layout/fragment_comment_0".equals(tag)) {
          return new FragmentCommentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_comment is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDRINKS: {
        if ("layout/fragment_drinks_0".equals(tag)) {
          return new FragmentDrinksBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_drinks is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTEDITADDRESS: {
        if ("layout/fragment_edit_address_0".equals(tag)) {
          return new FragmentEditAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_edit_address is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFORGOTPASSWORD: {
        if ("layout/fragment_forgot_password_0".equals(tag)) {
          return new FragmentForgotPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_forgot_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOME: {
        if ("layout/fragment_home_0".equals(tag)) {
          return new FragmentHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTDRINKS: {
        if ("layout/fragment_list_drinks_0".equals(tag)) {
          return new FragmentListDrinksBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_drinks is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOGIN: {
        if ("layout/fragment_login_0".equals(tag)) {
          return new FragmentLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMAIN: {
        if ("layout/fragment_main_0".equals(tag)) {
          return new FragmentMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMENU: {
        if ("layout/fragment_menu_0".equals(tag)) {
          return new FragmentMenuBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_menu is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMYSTEPPER: {
        if ("layout/fragment_my_stepper_0".equals(tag)) {
          return new FragmentMyStepperBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_my_stepper is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTORDERS: {
        if ("layout/fragment_orders_0".equals(tag)) {
          return new FragmentOrdersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_orders is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPAYMENTS: {
        if ("layout/fragment_payments_0".equals(tag)) {
          return new FragmentPaymentsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_payments is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTRATE: {
        if ("layout/fragment_rate_0".equals(tag)) {
          return new FragmentRateBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_rate is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTRESTURANTS: {
        if ("layout/fragment_resturants_0".equals(tag)) {
          return new FragmentResturantsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_resturants is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSEARCH: {
        if ("layout/fragment_search_0".equals(tag)) {
          return new FragmentSearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSIGNUP: {
        if ("layout/fragment_sign_up_0".equals(tag)) {
          return new FragmentSignUpBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_sign_up is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSUBCATPRODUCTS: {
        if ("layout/fragment_sub_cat_products_0".equals(tag)) {
          return new FragmentSubCatProductsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_sub_cat_products is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSUBCATEGORYLAYOUT: {
        if ("layout/fragment_sub_category_layout_0".equals(tag)) {
          return new FragmentSubCategoryLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_sub_category_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMECATEGORYITEMS: {
        if ("layout/home_category_items_0".equals(tag)) {
          return new HomeCategoryItemsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_category_items is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMESUBCATEGORIESLAYOUT: {
        if ("layout/home_sub_categories_layout_0".equals(tag)) {
          return new HomeSubCategoriesLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_sub_categories_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEM: {
        if ("layout-v26/item_0".equals(tag)) {
          return new ItemBindingV26Impl(component, view);
        }
        if ("layout/item_0".equals(tag)) {
          return new ItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMINFORMATION: {
        if ("layout/item_information_0".equals(tag)) {
          return new ItemInformationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_information is invalid. Received: " + tag);
      }
      case  LAYOUT_MENUCUSTOMLAYOUT: {
        if ("layout/menu_custom_layout_0".equals(tag)) {
          return new MenuCustomLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for menu_custom_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_MOREPRODUCTSLAYOUT: {
        if ("layout/more_products_layout_0".equals(tag)) {
          return new MoreProductsLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for more_products_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_NEWADDRESSLAYOUT: {
        if ("layout/new_address_layout_0".equals(tag)) {
          return new NewAddressLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for new_address_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_NOINTERNETCONNECTION: {
        if ("layout/no_internet_connection_0".equals(tag)) {
          return new NoInternetConnectionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for no_internet_connection is invalid. Received: " + tag);
      }
      case  LAYOUT_ORDERCARTITEMLAYOUT: {
        if ("layout/order_cart_item_layout_0".equals(tag)) {
          return new OrderCartItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for order_cart_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_ORDERITEMLAYOUT: {
        if ("layout/order_item_layout_0".equals(tag)) {
          return new OrderItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for order_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_ORDERITEMSUMMARYLAYOUT: {
        if ("layout/order_item_summary_layout_0".equals(tag)) {
          return new OrderItemSummaryLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for order_item_summary_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_PERSONALACCOUNTINFO: {
        if ("layout/personal_account_info_0".equals(tag)) {
          return new PersonalAccountInfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for personal_account_info is invalid. Received: " + tag);
      }
      case  LAYOUT_PRODUCTIMAGELAYOUT: {
        if ("layout/product_image_layout_0".equals(tag)) {
          return new ProductImageLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for product_image_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_PRODUCTSRECOMMENDEDLAYOUT: {
        if ("layout/products_recommended_layout_0".equals(tag)) {
          return new ProductsRecommendedLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for products_recommended_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_RATEPRODUCTLAYOUT: {
        if ("layout/rate_product_layout_0".equals(tag)) {
          return new RateProductLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for rate_product_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_RESTURANTS: {
        if ("layout/resturants_0".equals(tag)) {
          return new ResturantsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for resturants is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_SAMPLEPRODUCTSFROMDIFFERENTSUBCATLAYOUT: {
        if ("layout/sample_products_from_different_subcat_layout_0".equals(tag)) {
          return new SampleProductsFromDifferentSubcatLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for sample_products_from_different_subcat_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBCATEGORYITEMLAYOUT: {
        if ("layout/sub_category_item_layout_0".equals(tag)) {
          return new SubCategoryItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for sub_category_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBCATCUSTOMLAYOUT: {
        if ("layout/subcat_custom_layout_0".equals(tag)) {
          return new SubcatCustomLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for subcat_custom_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_TOPCATEGORYITEMLAYOUT: {
        if ("layout/top_category_item_layout_0".equals(tag)) {
          return new TopCategoryItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for top_category_item_layout is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(30);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "accountInformation");
      sKeys.put(2, "addresses");
      sKeys.put(3, "cartItem");
      sKeys.put(4, "cart_item");
      sKeys.put(5, "cat");
      sKeys.put(6, "categoryViewModal");
      sKeys.put(7, "clickListener");
      sKeys.put(8, "commentViewModal");
      sKeys.put(9, "comments");
      sKeys.put(10, "del_cart");
      sKeys.put(11, "deleteListener");
      sKeys.put(12, "editListener");
      sKeys.put(13, "item");
      sKeys.put(14, "items");
      sKeys.put(15, "onClickListener");
      sKeys.put(16, "order");
      sKeys.put(17, "order_details");
      sKeys.put(18, "places");
      sKeys.put(19, "product");
      sKeys.put(20, "rest");
      sKeys.put(21, "showCart");
      sKeys.put(22, "subCat");
      sKeys.put(23, "subCategory");
      sKeys.put(24, "subCats");
      sKeys.put(25, "subcat");
      sKeys.put(26, "subclickListener");
      sKeys.put(27, "update_cart");
      sKeys.put(28, "viewModal");
      sKeys.put(29, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(55);

    static {
      sKeys.put("layout/activity_main_0", com.clickEat.ug.R.layout.activity_main);
      sKeys.put("layout/address_item_layout_0", com.clickEat.ug.R.layout.address_item_layout);
      sKeys.put("layout/address_layout_0", com.clickEat.ug.R.layout.address_layout);
      sKeys.put("layout/all_menu_items_0", com.clickEat.ug.R.layout.all_menu_items);
      sKeys.put("layout/cart_item_layout_0", com.clickEat.ug.R.layout.cart_item_layout);
      sKeys.put("layout/change_password_layout_0", com.clickEat.ug.R.layout.change_password_layout);
      sKeys.put("layout/comment_item_layout_0", com.clickEat.ug.R.layout.comment_item_layout);
      sKeys.put("layout/corousel_view_layout_0", com.clickEat.ug.R.layout.corousel_view_layout);
      sKeys.put("layout/custom_cat_items_holder_0", com.clickEat.ug.R.layout.custom_cat_items_holder);
      sKeys.put("layout/custom_categories_layout_0", com.clickEat.ug.R.layout.custom_categories_layout);
      sKeys.put("layout/deals_of_the_day_layout_0", com.clickEat.ug.R.layout.deals_of_the_day_layout);
      sKeys.put("layout/drinks_subcatitem_layout_0", com.clickEat.ug.R.layout.drinks_subcatitem_layout);
      sKeys.put("layout/fragment_account_0", com.clickEat.ug.R.layout.fragment_account);
      sKeys.put("layout/fragment_cart_0", com.clickEat.ug.R.layout.fragment_cart);
      sKeys.put("layout/fragment_category_0", com.clickEat.ug.R.layout.fragment_category);
      sKeys.put("layout/fragment_checkout_0", com.clickEat.ug.R.layout.fragment_checkout);
      sKeys.put("layout/fragment_comment_0", com.clickEat.ug.R.layout.fragment_comment);
      sKeys.put("layout/fragment_drinks_0", com.clickEat.ug.R.layout.fragment_drinks);
      sKeys.put("layout/fragment_edit_address_0", com.clickEat.ug.R.layout.fragment_edit_address);
      sKeys.put("layout/fragment_forgot_password_0", com.clickEat.ug.R.layout.fragment_forgot_password);
      sKeys.put("layout/fragment_home_0", com.clickEat.ug.R.layout.fragment_home);
      sKeys.put("layout/fragment_list_drinks_0", com.clickEat.ug.R.layout.fragment_list_drinks);
      sKeys.put("layout/fragment_login_0", com.clickEat.ug.R.layout.fragment_login);
      sKeys.put("layout/fragment_main_0", com.clickEat.ug.R.layout.fragment_main);
      sKeys.put("layout/fragment_menu_0", com.clickEat.ug.R.layout.fragment_menu);
      sKeys.put("layout/fragment_my_stepper_0", com.clickEat.ug.R.layout.fragment_my_stepper);
      sKeys.put("layout/fragment_orders_0", com.clickEat.ug.R.layout.fragment_orders);
      sKeys.put("layout/fragment_payments_0", com.clickEat.ug.R.layout.fragment_payments);
      sKeys.put("layout/fragment_rate_0", com.clickEat.ug.R.layout.fragment_rate);
      sKeys.put("layout/fragment_resturants_0", com.clickEat.ug.R.layout.fragment_resturants);
      sKeys.put("layout/fragment_search_0", com.clickEat.ug.R.layout.fragment_search);
      sKeys.put("layout/fragment_sign_up_0", com.clickEat.ug.R.layout.fragment_sign_up);
      sKeys.put("layout/fragment_sub_cat_products_0", com.clickEat.ug.R.layout.fragment_sub_cat_products);
      sKeys.put("layout/fragment_sub_category_layout_0", com.clickEat.ug.R.layout.fragment_sub_category_layout);
      sKeys.put("layout/home_category_items_0", com.clickEat.ug.R.layout.home_category_items);
      sKeys.put("layout/home_sub_categories_layout_0", com.clickEat.ug.R.layout.home_sub_categories_layout);
      sKeys.put("layout-v26/item_0", com.clickEat.ug.R.layout.item);
      sKeys.put("layout/item_0", com.clickEat.ug.R.layout.item);
      sKeys.put("layout/item_information_0", com.clickEat.ug.R.layout.item_information);
      sKeys.put("layout/menu_custom_layout_0", com.clickEat.ug.R.layout.menu_custom_layout);
      sKeys.put("layout/more_products_layout_0", com.clickEat.ug.R.layout.more_products_layout);
      sKeys.put("layout/new_address_layout_0", com.clickEat.ug.R.layout.new_address_layout);
      sKeys.put("layout/no_internet_connection_0", com.clickEat.ug.R.layout.no_internet_connection);
      sKeys.put("layout/order_cart_item_layout_0", com.clickEat.ug.R.layout.order_cart_item_layout);
      sKeys.put("layout/order_item_layout_0", com.clickEat.ug.R.layout.order_item_layout);
      sKeys.put("layout/order_item_summary_layout_0", com.clickEat.ug.R.layout.order_item_summary_layout);
      sKeys.put("layout/personal_account_info_0", com.clickEat.ug.R.layout.personal_account_info);
      sKeys.put("layout/product_image_layout_0", com.clickEat.ug.R.layout.product_image_layout);
      sKeys.put("layout/products_recommended_layout_0", com.clickEat.ug.R.layout.products_recommended_layout);
      sKeys.put("layout/rate_product_layout_0", com.clickEat.ug.R.layout.rate_product_layout);
      sKeys.put("layout/resturants_0", com.clickEat.ug.R.layout.resturants);
      sKeys.put("layout/sample_products_from_different_subcat_layout_0", com.clickEat.ug.R.layout.sample_products_from_different_subcat_layout);
      sKeys.put("layout/sub_category_item_layout_0", com.clickEat.ug.R.layout.sub_category_item_layout);
      sKeys.put("layout/subcat_custom_layout_0", com.clickEat.ug.R.layout.subcat_custom_layout);
      sKeys.put("layout/top_category_item_layout_0", com.clickEat.ug.R.layout.top_category_item_layout);
    }
  }
}
