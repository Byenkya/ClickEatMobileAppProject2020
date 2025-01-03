package com.clickEat.ug.database;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DatabaseDao_Impl implements DatabaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CartTable> __insertionAdapterOfCartTable;

  private final EntityInsertionAdapter<CustomerTable> __insertionAdapterOfCustomerTable;

  private final EntityInsertionAdapter<RestaurantsTable> __insertionAdapterOfRestaurantsTable;

  private final EntityInsertionAdapter<SubDrinksTable> __insertionAdapterOfSubDrinksTable;

  private final EntityInsertionAdapter<HomeTitleCatTable> __insertionAdapterOfHomeTitleCatTable;

  private final EntityInsertionAdapter<HomeProductsTable> __insertionAdapterOfHomeProductsTable;

  private final EntityInsertionAdapter<HomeImagesTable> __insertionAdapterOfHomeImagesTable;

  private final EntityInsertionAdapter<HomeSubCategoriesTable> __insertionAdapterOfHomeSubCategoriesTable;

  private final EntityInsertionAdapter<MoreProductsTable> __insertionAdapterOfMoreProductsTable;

  private final EntityInsertionAdapter<TopSellingProductsTable> __insertionAdapterOfTopSellingProductsTable;

  private final EntityDeletionOrUpdateAdapter<CartTable> __updateAdapterOfCartTable;

  private final EntityDeletionOrUpdateAdapter<CustomerTable> __updateAdapterOfCustomerTable;

  private final SharedSQLiteStatement __preparedStmtOfClearCart;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCustomer;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCustomerToken;

  private final SharedSQLiteStatement __preparedStmtOfDeleteHomeTitleInfo;

  private final SharedSQLiteStatement __preparedStmtOfDeleteHomeProducts;

  private final SharedSQLiteStatement __preparedStmtOfDeleteHomeImages;

  private final SharedSQLiteStatement __preparedStmtOfDeleteHomeSubCategories;

  private final SharedSQLiteStatement __preparedStmtOfDeleteMoreProducts;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTopSellingProducts;

  public DatabaseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCartTable = new EntityInsertionAdapter<CartTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `cart_table` (`product_id`,`customer_id`,`product_name`,`product_image`,`unit_price`,`quantity`,`served_with`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CartTable value) {
        stmt.bindLong(1, value.getProduct_id());
        stmt.bindLong(2, value.getCustomer_id());
        if (value.getProduct_name() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getProduct_name());
        }
        if (value.getProduct_image() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getProduct_image());
        }
        if (value.getUnit_price() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUnit_price());
        }
        if (value.getQuantity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getQuantity());
        }
        if (value.getServed_with() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getServed_with());
        }
      }
    };
    this.__insertionAdapterOfCustomerTable = new EntityInsertionAdapter<CustomerTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `customer_table` (`customer_id`,`customer_names`,`email`,`contact`,`second_contact`,`date_of_reg`,`account_active`,`token`,`cart_size`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CustomerTable value) {
        stmt.bindLong(1, value.getCustomer_id());
        if (value.getNames() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNames());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getContact() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getContact());
        }
        if (value.getSecond_contact() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSecond_contact());
        }
        if (value.getDate_of_reg() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDate_of_reg());
        }
        final int _tmp;
        _tmp = value.getAccount_active() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        if (value.getToken() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getToken());
        }
        if (value.getCart_size() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getCart_size());
        }
      }
    };
    this.__insertionAdapterOfRestaurantsTable = new EntityInsertionAdapter<RestaurantsTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `restaurants_table` (`restuarant_id`,`business_name`,`business_profile_picture`,`address`,`email`,`contact`,`second_contact`,`location`,`description`,`admin_names`,`admin_username`,`admin_email`,`admin_telephone`,`operation_start_time`,`operation_stop_time`,`operation_status`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RestaurantsTable value) {
        stmt.bindLong(1, value.getRestaurant_id());
        if (value.getBusinessName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBusinessName());
        }
        if (value.getBusinessProfilePicture() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBusinessProfilePicture());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAddress());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getEmail());
        }
        if (value.getContact() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getContact());
        }
        if (value.getSecondContact() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSecondContact());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLocation());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getDescription());
        }
        if (value.getAdmin_names() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getAdmin_names());
        }
        if (value.getAdmin_username() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getAdmin_username());
        }
        if (value.getAdmin_email() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getAdmin_email());
        }
        if (value.getAdmin_telephone() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getAdmin_telephone());
        }
        if (value.getOperation_start_time() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getOperation_start_time());
        }
        if (value.getOperation_stop_time() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getOperation_stop_time());
        }
        final int _tmp;
        _tmp = value.getOperational_status() ? 1 : 0;
        stmt.bindLong(16, _tmp);
      }
    };
    this.__insertionAdapterOfSubDrinksTable = new EntityInsertionAdapter<SubDrinksTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `sub_drinks_categories` (`sub_cat_id`,`name`,`category_id`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubDrinksTable value) {
        stmt.bindLong(1, value.getSub_cat_id());
        if (value.getNames() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNames());
        }
        stmt.bindLong(3, value.getCategoryId());
      }
    };
    this.__insertionAdapterOfHomeTitleCatTable = new EntityInsertionAdapter<HomeTitleCatTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `home_title_cat_table` (`id`,`title`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HomeTitleCatTable value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
      }
    };
    this.__insertionAdapterOfHomeProductsTable = new EntityInsertionAdapter<HomeProductsTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `home_products_table` (`product_id`,`product_name`,`product_picture`,`description`,`price`,`restaurant_id`,`restaurant_name`,`brand_id`,`brand_name`,`sub_category_id`,`sub_category`,`home_title_id`,`promotional_price_set`,`promotional_price`,`headsup`,`served_with`,`free_delivery`,`available`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HomeProductsTable value) {
        stmt.bindLong(1, value.getProduct_id());
        if (value.getProductName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProductName());
        }
        if (value.getProductPicture() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getProductPicture());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPrice());
        }
        stmt.bindLong(6, value.getRestaurantId());
        if (value.getRestaurantName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getRestaurantName());
        }
        stmt.bindLong(8, value.getBrandId());
        if (value.getBrandName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getBrandName());
        }
        stmt.bindLong(10, value.getSub_category_id());
        if (value.getSub_category() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getSub_category());
        }
        stmt.bindLong(12, value.getHome_title_id());
        final int _tmp;
        _tmp = value.getPromotional_price_set() ? 1 : 0;
        stmt.bindLong(13, _tmp);
        if (value.getPromotional_price() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getPromotional_price());
        }
        if (value.getHeadsup() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getHeadsup());
        }
        if (value.getServed_with() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getServed_with());
        }
        final int _tmp_1;
        _tmp_1 = value.getFree_delivery() ? 1 : 0;
        stmt.bindLong(17, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.getAvailable() ? 1 : 0;
        stmt.bindLong(18, _tmp_2);
      }
    };
    this.__insertionAdapterOfHomeImagesTable = new EntityInsertionAdapter<HomeImagesTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `home_images_table` (`id`,`info_type`,`image_name`,`image_desc`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HomeImagesTable value) {
        stmt.bindLong(1, value.getId());
        if (value.getInfo_type() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getInfo_type());
        }
        if (value.getImage_name() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage_name());
        }
        if (value.getImage_desc() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImage_desc());
        }
      }
    };
    this.__insertionAdapterOfHomeSubCategoriesTable = new EntityInsertionAdapter<HomeSubCategoriesTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `home_sub_categories_table` (`id`,`subCatImage`,`name`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HomeSubCategoriesTable value) {
        stmt.bindLong(1, value.getId());
        if (value.getSubCatImage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSubCatImage());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
      }
    };
    this.__insertionAdapterOfMoreProductsTable = new EntityInsertionAdapter<MoreProductsTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `more_products_table` (`product_id`,`product_name`,`product_picture`,`description`,`price`,`restaurant_id`,`restaurant_name`,`brand_id`,`brand_name`,`sub_category_id`,`sub_category`,`promotional_price_set`,`promotional_price`,`headsup`,`served_with`,`free_delivery`,`available`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MoreProductsTable value) {
        stmt.bindLong(1, value.getProduct_id());
        if (value.getProductName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProductName());
        }
        if (value.getProductPicture() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getProductPicture());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPrice());
        }
        stmt.bindLong(6, value.getRestaurantId());
        if (value.getRestaurantName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getRestaurantName());
        }
        stmt.bindLong(8, value.getBrandId());
        if (value.getBrandName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getBrandName());
        }
        stmt.bindLong(10, value.getSub_category_id());
        if (value.getSub_category() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getSub_category());
        }
        final int _tmp;
        _tmp = value.getPromotional_price_set() ? 1 : 0;
        stmt.bindLong(12, _tmp);
        if (value.getPromotional_price() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, value.getPromotional_price());
        }
        if (value.getHeadsup() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getHeadsup());
        }
        if (value.getServed_with() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getServed_with());
        }
        final int _tmp_1;
        _tmp_1 = value.getFree_delivery() ? 1 : 0;
        stmt.bindLong(16, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.getAvailable() ? 1 : 0;
        stmt.bindLong(17, _tmp_2);
      }
    };
    this.__insertionAdapterOfTopSellingProductsTable = new EntityInsertionAdapter<TopSellingProductsTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `top_selling_products` (`product_id`,`product_name`,`product_picture`,`description`,`price`,`restaurant_id`,`restaurant_name`,`brand_id`,`brand_name`,`sub_category_id`,`sub_category`,`promotional_price_set`,`promotional_price`,`headsup`,`served_with`,`free_delivery`,`available`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TopSellingProductsTable value) {
        stmt.bindLong(1, value.getProduct_id());
        if (value.getProductName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProductName());
        }
        if (value.getProductPicture() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getProductPicture());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPrice());
        }
        stmt.bindLong(6, value.getRestaurantId());
        if (value.getRestaurantName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getRestaurantName());
        }
        stmt.bindLong(8, value.getBrandId());
        if (value.getBrandName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getBrandName());
        }
        stmt.bindLong(10, value.getSub_category_id());
        if (value.getSub_category() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getSub_category());
        }
        final int _tmp;
        _tmp = value.getPromotional_price_set() ? 1 : 0;
        stmt.bindLong(12, _tmp);
        if (value.getPromotional_price() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, value.getPromotional_price());
        }
        if (value.getHeadsup() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getHeadsup());
        }
        if (value.getServed_with() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getServed_with());
        }
        final int _tmp_1;
        _tmp_1 = value.getFree_delivery() ? 1 : 0;
        stmt.bindLong(16, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.getAvailable() ? 1 : 0;
        stmt.bindLong(17, _tmp_2);
      }
    };
    this.__updateAdapterOfCartTable = new EntityDeletionOrUpdateAdapter<CartTable>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `cart_table` SET `product_id` = ?,`customer_id` = ?,`product_name` = ?,`product_image` = ?,`unit_price` = ?,`quantity` = ?,`served_with` = ? WHERE `product_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CartTable value) {
        stmt.bindLong(1, value.getProduct_id());
        stmt.bindLong(2, value.getCustomer_id());
        if (value.getProduct_name() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getProduct_name());
        }
        if (value.getProduct_image() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getProduct_image());
        }
        if (value.getUnit_price() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUnit_price());
        }
        if (value.getQuantity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getQuantity());
        }
        if (value.getServed_with() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getServed_with());
        }
        stmt.bindLong(8, value.getProduct_id());
      }
    };
    this.__updateAdapterOfCustomerTable = new EntityDeletionOrUpdateAdapter<CustomerTable>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `customer_table` SET `customer_id` = ?,`customer_names` = ?,`email` = ?,`contact` = ?,`second_contact` = ?,`date_of_reg` = ?,`account_active` = ?,`token` = ?,`cart_size` = ? WHERE `customer_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CustomerTable value) {
        stmt.bindLong(1, value.getCustomer_id());
        if (value.getNames() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNames());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getContact() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getContact());
        }
        if (value.getSecond_contact() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSecond_contact());
        }
        if (value.getDate_of_reg() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDate_of_reg());
        }
        final int _tmp;
        _tmp = value.getAccount_active() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        if (value.getToken() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getToken());
        }
        if (value.getCart_size() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getCart_size());
        }
        stmt.bindLong(10, value.getCustomer_id());
      }
    };
    this.__preparedStmtOfClearCart = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM cart_table";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCustomer = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM customer_table";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCustomerToken = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update customer_table set token = ? where token = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteHomeTitleInfo = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM home_title_cat_table";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteHomeProducts = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM home_products_table";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteHomeImages = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM home_images_table";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteHomeSubCategories = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM home_sub_categories_table";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteMoreProducts = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM more_products_table";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTopSellingProducts = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM top_selling_products";
        return _query;
      }
    };
  }

  @Override
  public void addNewCartItem(final CartTable cart) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCartTable.insert(cart);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void saveCustomer(final CustomerTable customer) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCustomerTable.insert(customer);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllRestaurants(final RestaurantsTable... restaurants) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRestaurantsTable.insert(restaurants);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllSubDrinksCat(final SubDrinksTable... subDrinksCat) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSubDrinksTable.insert(subDrinksCat);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertHomeTitleInfo(final HomeTitleCatTable titleInfo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHomeTitleCatTable.insert(titleInfo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertHomeProducts(final HomeProductsTable... products) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHomeProductsTable.insert(products);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertHomeImages(final HomeImagesTable... homeImages) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHomeImagesTable.insert(homeImages);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertHomeSubCategories(final HomeSubCategoriesTable... homeSubCats) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHomeSubCategoriesTable.insert(homeSubCats);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertMoreProducts(final MoreProductsTable... moreProducts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMoreProductsTable.insert(moreProducts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertTopSellingProducts(final TopSellingProductsTable... topSelling) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTopSellingProductsTable.insert(topSelling);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCartItem(final CartTable cart) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCartTable.handle(cart);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCustomer(final CustomerTable customer) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCustomerTable.handle(customer);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clearCart() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearCart.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearCart.release(_stmt);
    }
  }

  @Override
  public void deleteCustomer() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCustomer.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteCustomer.release(_stmt);
    }
  }

  @Override
  public void updateCustomerToken(final String newToken, final String oldToken) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCustomerToken.acquire();
    int _argIndex = 1;
    if (newToken == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, newToken);
    }
    _argIndex = 2;
    if (oldToken == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, oldToken);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateCustomerToken.release(_stmt);
    }
  }

  @Override
  public void deleteHomeTitleInfo() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteHomeTitleInfo.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteHomeTitleInfo.release(_stmt);
    }
  }

  @Override
  public void deleteHomeProducts() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteHomeProducts.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteHomeProducts.release(_stmt);
    }
  }

  @Override
  public void deleteHomeImages() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteHomeImages.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteHomeImages.release(_stmt);
    }
  }

  @Override
  public void deleteHomeSubCategories() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteHomeSubCategories.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteHomeSubCategories.release(_stmt);
    }
  }

  @Override
  public void deleteMoreProducts() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteMoreProducts.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteMoreProducts.release(_stmt);
    }
  }

  @Override
  public void deleteTopSellingProducts() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTopSellingProducts.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTopSellingProducts.release(_stmt);
    }
  }

  @Override
  public List<CartTable> getCartItems() {
    final String _sql = "SELECT `cart_table`.`product_id` AS `product_id`, `cart_table`.`customer_id` AS `customer_id`, `cart_table`.`product_name` AS `product_name`, `cart_table`.`product_image` AS `product_image`, `cart_table`.`unit_price` AS `unit_price`, `cart_table`.`quantity` AS `quantity`, `cart_table`.`served_with` AS `served_with` FROM cart_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
      final int _cursorIndexOfCustomerId = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_id");
      final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
      final int _cursorIndexOfProductImage = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image");
      final int _cursorIndexOfUnitPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "unit_price");
      final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
      final int _cursorIndexOfServedWith = CursorUtil.getColumnIndexOrThrow(_cursor, "served_with");
      final List<CartTable> _result = new ArrayList<CartTable>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CartTable _item;
        final int _tmpProduct_id;
        _tmpProduct_id = _cursor.getInt(_cursorIndexOfProductId);
        final int _tmpCustomer_id;
        _tmpCustomer_id = _cursor.getInt(_cursorIndexOfCustomerId);
        final String _tmpProduct_name;
        _tmpProduct_name = _cursor.getString(_cursorIndexOfProductName);
        final String _tmpProduct_image;
        _tmpProduct_image = _cursor.getString(_cursorIndexOfProductImage);
        final String _tmpUnit_price;
        _tmpUnit_price = _cursor.getString(_cursorIndexOfUnitPrice);
        final String _tmpQuantity;
        _tmpQuantity = _cursor.getString(_cursorIndexOfQuantity);
        final String _tmpServed_with;
        _tmpServed_with = _cursor.getString(_cursorIndexOfServedWith);
        _item = new CartTable(_tmpProduct_id,_tmpCustomer_id,_tmpProduct_name,_tmpProduct_image,_tmpUnit_price,_tmpQuantity,_tmpServed_with);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<Integer> cartSize() {
    final String _sql = "SELECT count(product_id) FROM cart_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"cart_table"}, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public CustomerTable getCustomer() {
    final String _sql = "SELECT `customer_table`.`customer_id` AS `customer_id`, `customer_table`.`customer_names` AS `customer_names`, `customer_table`.`email` AS `email`, `customer_table`.`contact` AS `contact`, `customer_table`.`second_contact` AS `second_contact`, `customer_table`.`date_of_reg` AS `date_of_reg`, `customer_table`.`account_active` AS `account_active`, `customer_table`.`token` AS `token`, `customer_table`.`cart_size` AS `cart_size` FROM customer_table limit 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCustomerId = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_id");
      final int _cursorIndexOfNames = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_names");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfContact = CursorUtil.getColumnIndexOrThrow(_cursor, "contact");
      final int _cursorIndexOfSecondContact = CursorUtil.getColumnIndexOrThrow(_cursor, "second_contact");
      final int _cursorIndexOfDateOfReg = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_reg");
      final int _cursorIndexOfAccountActive = CursorUtil.getColumnIndexOrThrow(_cursor, "account_active");
      final int _cursorIndexOfToken = CursorUtil.getColumnIndexOrThrow(_cursor, "token");
      final int _cursorIndexOfCartSize = CursorUtil.getColumnIndexOrThrow(_cursor, "cart_size");
      final CustomerTable _result;
      if(_cursor.moveToFirst()) {
        final int _tmpCustomer_id;
        _tmpCustomer_id = _cursor.getInt(_cursorIndexOfCustomerId);
        final String _tmpNames;
        _tmpNames = _cursor.getString(_cursorIndexOfNames);
        final String _tmpEmail;
        _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        final String _tmpContact;
        _tmpContact = _cursor.getString(_cursorIndexOfContact);
        final String _tmpSecond_contact;
        _tmpSecond_contact = _cursor.getString(_cursorIndexOfSecondContact);
        final String _tmpDate_of_reg;
        _tmpDate_of_reg = _cursor.getString(_cursorIndexOfDateOfReg);
        final boolean _tmpAccount_active;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfAccountActive);
        _tmpAccount_active = _tmp != 0;
        final String _tmpToken;
        _tmpToken = _cursor.getString(_cursorIndexOfToken);
        final Integer _tmpCart_size;
        if (_cursor.isNull(_cursorIndexOfCartSize)) {
          _tmpCart_size = null;
        } else {
          _tmpCart_size = _cursor.getInt(_cursorIndexOfCartSize);
        }
        _result = new CustomerTable(_tmpCustomer_id,_tmpNames,_tmpEmail,_tmpContact,_tmpSecond_contact,_tmpDate_of_reg,_tmpAccount_active,_tmpToken,_tmpCart_size);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<CustomerTable> getCurrentUser() {
    final String _sql = "SELECT `customer_table`.`customer_id` AS `customer_id`, `customer_table`.`customer_names` AS `customer_names`, `customer_table`.`email` AS `email`, `customer_table`.`contact` AS `contact`, `customer_table`.`second_contact` AS `second_contact`, `customer_table`.`date_of_reg` AS `date_of_reg`, `customer_table`.`account_active` AS `account_active`, `customer_table`.`token` AS `token`, `customer_table`.`cart_size` AS `cart_size` FROM customer_table limit 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"customer_table"}, false, new Callable<CustomerTable>() {
      @Override
      public CustomerTable call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCustomerId = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_id");
          final int _cursorIndexOfNames = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_names");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfContact = CursorUtil.getColumnIndexOrThrow(_cursor, "contact");
          final int _cursorIndexOfSecondContact = CursorUtil.getColumnIndexOrThrow(_cursor, "second_contact");
          final int _cursorIndexOfDateOfReg = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_reg");
          final int _cursorIndexOfAccountActive = CursorUtil.getColumnIndexOrThrow(_cursor, "account_active");
          final int _cursorIndexOfToken = CursorUtil.getColumnIndexOrThrow(_cursor, "token");
          final int _cursorIndexOfCartSize = CursorUtil.getColumnIndexOrThrow(_cursor, "cart_size");
          final CustomerTable _result;
          if(_cursor.moveToFirst()) {
            final int _tmpCustomer_id;
            _tmpCustomer_id = _cursor.getInt(_cursorIndexOfCustomerId);
            final String _tmpNames;
            _tmpNames = _cursor.getString(_cursorIndexOfNames);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpContact;
            _tmpContact = _cursor.getString(_cursorIndexOfContact);
            final String _tmpSecond_contact;
            _tmpSecond_contact = _cursor.getString(_cursorIndexOfSecondContact);
            final String _tmpDate_of_reg;
            _tmpDate_of_reg = _cursor.getString(_cursorIndexOfDateOfReg);
            final boolean _tmpAccount_active;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAccountActive);
            _tmpAccount_active = _tmp != 0;
            final String _tmpToken;
            _tmpToken = _cursor.getString(_cursorIndexOfToken);
            final Integer _tmpCart_size;
            if (_cursor.isNull(_cursorIndexOfCartSize)) {
              _tmpCart_size = null;
            } else {
              _tmpCart_size = _cursor.getInt(_cursorIndexOfCartSize);
            }
            _result = new CustomerTable(_tmpCustomer_id,_tmpNames,_tmpEmail,_tmpContact,_tmpSecond_contact,_tmpDate_of_reg,_tmpAccount_active,_tmpToken,_tmpCart_size);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<RestaurantsTable>> getRestaurants() {
    final String _sql = "SELECT `restaurants_table`.`restuarant_id` AS `restuarant_id`, `restaurants_table`.`business_name` AS `business_name`, `restaurants_table`.`business_profile_picture` AS `business_profile_picture`, `restaurants_table`.`address` AS `address`, `restaurants_table`.`email` AS `email`, `restaurants_table`.`contact` AS `contact`, `restaurants_table`.`second_contact` AS `second_contact`, `restaurants_table`.`location` AS `location`, `restaurants_table`.`description` AS `description`, `restaurants_table`.`admin_names` AS `admin_names`, `restaurants_table`.`admin_username` AS `admin_username`, `restaurants_table`.`admin_email` AS `admin_email`, `restaurants_table`.`admin_telephone` AS `admin_telephone`, `restaurants_table`.`operation_start_time` AS `operation_start_time`, `restaurants_table`.`operation_stop_time` AS `operation_stop_time`, `restaurants_table`.`operation_status` AS `operation_status` FROM restaurants_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"restaurants_table"}, false, new Callable<List<RestaurantsTable>>() {
      @Override
      public List<RestaurantsTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfRestaurantId = CursorUtil.getColumnIndexOrThrow(_cursor, "restuarant_id");
          final int _cursorIndexOfBusinessName = CursorUtil.getColumnIndexOrThrow(_cursor, "business_name");
          final int _cursorIndexOfBusinessProfilePicture = CursorUtil.getColumnIndexOrThrow(_cursor, "business_profile_picture");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfContact = CursorUtil.getColumnIndexOrThrow(_cursor, "contact");
          final int _cursorIndexOfSecondContact = CursorUtil.getColumnIndexOrThrow(_cursor, "second_contact");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAdminNames = CursorUtil.getColumnIndexOrThrow(_cursor, "admin_names");
          final int _cursorIndexOfAdminUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "admin_username");
          final int _cursorIndexOfAdminEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "admin_email");
          final int _cursorIndexOfAdminTelephone = CursorUtil.getColumnIndexOrThrow(_cursor, "admin_telephone");
          final int _cursorIndexOfOperationStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "operation_start_time");
          final int _cursorIndexOfOperationStopTime = CursorUtil.getColumnIndexOrThrow(_cursor, "operation_stop_time");
          final int _cursorIndexOfOperationalStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "operation_status");
          final List<RestaurantsTable> _result = new ArrayList<RestaurantsTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RestaurantsTable _item;
            final int _tmpRestaurant_id;
            _tmpRestaurant_id = _cursor.getInt(_cursorIndexOfRestaurantId);
            final String _tmpBusinessName;
            _tmpBusinessName = _cursor.getString(_cursorIndexOfBusinessName);
            final String _tmpBusinessProfilePicture;
            _tmpBusinessProfilePicture = _cursor.getString(_cursorIndexOfBusinessProfilePicture);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpContact;
            _tmpContact = _cursor.getString(_cursorIndexOfContact);
            final String _tmpSecondContact;
            _tmpSecondContact = _cursor.getString(_cursorIndexOfSecondContact);
            final String _tmpLocation;
            _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpAdmin_names;
            _tmpAdmin_names = _cursor.getString(_cursorIndexOfAdminNames);
            final String _tmpAdmin_username;
            _tmpAdmin_username = _cursor.getString(_cursorIndexOfAdminUsername);
            final String _tmpAdmin_email;
            _tmpAdmin_email = _cursor.getString(_cursorIndexOfAdminEmail);
            final String _tmpAdmin_telephone;
            _tmpAdmin_telephone = _cursor.getString(_cursorIndexOfAdminTelephone);
            final String _tmpOperation_start_time;
            _tmpOperation_start_time = _cursor.getString(_cursorIndexOfOperationStartTime);
            final String _tmpOperation_stop_time;
            _tmpOperation_stop_time = _cursor.getString(_cursorIndexOfOperationStopTime);
            final boolean _tmpOperational_status;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfOperationalStatus);
            _tmpOperational_status = _tmp != 0;
            _item = new RestaurantsTable(_tmpRestaurant_id,_tmpBusinessName,_tmpBusinessProfilePicture,_tmpAddress,_tmpEmail,_tmpContact,_tmpSecondContact,_tmpLocation,_tmpDescription,_tmpAdmin_names,_tmpAdmin_username,_tmpAdmin_email,_tmpAdmin_telephone,_tmpOperation_start_time,_tmpOperation_stop_time,_tmpOperational_status);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<SubDrinksTable>> getDrinksSubCats() {
    final String _sql = "SELECT `sub_drinks_categories`.`sub_cat_id` AS `sub_cat_id`, `sub_drinks_categories`.`name` AS `name`, `sub_drinks_categories`.`category_id` AS `category_id` FROM sub_drinks_categories";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"sub_drinks_categories"}, false, new Callable<List<SubDrinksTable>>() {
      @Override
      public List<SubDrinksTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSubCatId = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_cat_id");
          final int _cursorIndexOfNames = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
          final List<SubDrinksTable> _result = new ArrayList<SubDrinksTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SubDrinksTable _item;
            final int _tmpSub_cat_id;
            _tmpSub_cat_id = _cursor.getInt(_cursorIndexOfSubCatId);
            final String _tmpNames;
            _tmpNames = _cursor.getString(_cursorIndexOfNames);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            _item = new SubDrinksTable(_tmpSub_cat_id,_tmpNames,_tmpCategoryId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<HomeProductsWithTitles>> getHomeProducts() {
    final String _sql = "SELECT `home_title_cat_table`.`id` AS `id`, `home_title_cat_table`.`title` AS `title` FROM home_title_cat_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"home_products_table","home_title_cat_table"}, false, new Callable<List<HomeProductsWithTitles>>() {
      @Override
      public List<HomeProductsWithTitles> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final LongSparseArray<ArrayList<HomeProductsTable>> _collectionProducts = new LongSparseArray<ArrayList<HomeProductsTable>>();
          while (_cursor.moveToNext()) {
            final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
            ArrayList<HomeProductsTable> _tmpProductsCollection = _collectionProducts.get(_tmpKey);
            if (_tmpProductsCollection == null) {
              _tmpProductsCollection = new ArrayList<HomeProductsTable>();
              _collectionProducts.put(_tmpKey, _tmpProductsCollection);
            }
          }
          _cursor.moveToPosition(-1);
          __fetchRelationshiphomeProductsTableAscomClickEatUgDatabaseHomeProductsTable(_collectionProducts);
          final List<HomeProductsWithTitles> _result = new ArrayList<HomeProductsWithTitles>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final HomeProductsWithTitles _item;
            final HomeTitleCatTable _tmpTitleInfo;
            if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfTitle))) {
              final int _tmpId;
              _tmpId = _cursor.getInt(_cursorIndexOfId);
              final String _tmpTitle;
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              _tmpTitleInfo = new HomeTitleCatTable(_tmpId,_tmpTitle);
            }  else  {
              _tmpTitleInfo = null;
            }
            ArrayList<HomeProductsTable> _tmpProductsCollection_1 = null;
            final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
            _tmpProductsCollection_1 = _collectionProducts.get(_tmpKey_1);
            if (_tmpProductsCollection_1 == null) {
              _tmpProductsCollection_1 = new ArrayList<HomeProductsTable>();
            }
            _item = new HomeProductsWithTitles(_tmpTitleInfo,_tmpProductsCollection_1);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<HomeImagesTable>> getHomeImages() {
    final String _sql = "SELECT `home_images_table`.`id` AS `id`, `home_images_table`.`info_type` AS `info_type`, `home_images_table`.`image_name` AS `image_name`, `home_images_table`.`image_desc` AS `image_desc` FROM home_images_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"home_images_table"}, false, new Callable<List<HomeImagesTable>>() {
      @Override
      public List<HomeImagesTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfInfoType = CursorUtil.getColumnIndexOrThrow(_cursor, "info_type");
          final int _cursorIndexOfImageName = CursorUtil.getColumnIndexOrThrow(_cursor, "image_name");
          final int _cursorIndexOfImageDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "image_desc");
          final List<HomeImagesTable> _result = new ArrayList<HomeImagesTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final HomeImagesTable _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpInfo_type;
            _tmpInfo_type = _cursor.getString(_cursorIndexOfInfoType);
            final String _tmpImage_name;
            _tmpImage_name = _cursor.getString(_cursorIndexOfImageName);
            final String _tmpImage_desc;
            _tmpImage_desc = _cursor.getString(_cursorIndexOfImageDesc);
            _item = new HomeImagesTable(_tmpId,_tmpInfo_type,_tmpImage_name,_tmpImage_desc);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<HomeSubCategoriesTable>> getHomeSubCategoreis() {
    final String _sql = "SELECT `home_sub_categories_table`.`id` AS `id`, `home_sub_categories_table`.`subCatImage` AS `subCatImage`, `home_sub_categories_table`.`name` AS `name` FROM home_sub_categories_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"home_sub_categories_table"}, false, new Callable<List<HomeSubCategoriesTable>>() {
      @Override
      public List<HomeSubCategoriesTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSubCatImage = CursorUtil.getColumnIndexOrThrow(_cursor, "subCatImage");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final List<HomeSubCategoriesTable> _result = new ArrayList<HomeSubCategoriesTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final HomeSubCategoriesTable _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpSubCatImage;
            _tmpSubCatImage = _cursor.getString(_cursorIndexOfSubCatImage);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item = new HomeSubCategoriesTable(_tmpId,_tmpSubCatImage,_tmpName);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<MoreProductsTable>> getMoreProducts() {
    final String _sql = "SELECT `more_products_table`.`product_id` AS `product_id`, `more_products_table`.`product_name` AS `product_name`, `more_products_table`.`product_picture` AS `product_picture`, `more_products_table`.`description` AS `description`, `more_products_table`.`price` AS `price`, `more_products_table`.`restaurant_id` AS `restaurant_id`, `more_products_table`.`restaurant_name` AS `restaurant_name`, `more_products_table`.`brand_id` AS `brand_id`, `more_products_table`.`brand_name` AS `brand_name`, `more_products_table`.`sub_category_id` AS `sub_category_id`, `more_products_table`.`sub_category` AS `sub_category`, `more_products_table`.`promotional_price_set` AS `promotional_price_set`, `more_products_table`.`promotional_price` AS `promotional_price`, `more_products_table`.`headsup` AS `headsup`, `more_products_table`.`served_with` AS `served_with`, `more_products_table`.`free_delivery` AS `free_delivery`, `more_products_table`.`available` AS `available` FROM more_products_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"more_products_table"}, false, new Callable<List<MoreProductsTable>>() {
      @Override
      public List<MoreProductsTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
          final int _cursorIndexOfProductPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "product_picture");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfRestaurantId = CursorUtil.getColumnIndexOrThrow(_cursor, "restaurant_id");
          final int _cursorIndexOfRestaurantName = CursorUtil.getColumnIndexOrThrow(_cursor, "restaurant_name");
          final int _cursorIndexOfBrandId = CursorUtil.getColumnIndexOrThrow(_cursor, "brand_id");
          final int _cursorIndexOfBrandName = CursorUtil.getColumnIndexOrThrow(_cursor, "brand_name");
          final int _cursorIndexOfSubCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_category_id");
          final int _cursorIndexOfSubCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_category");
          final int _cursorIndexOfPromotionalPriceSet = CursorUtil.getColumnIndexOrThrow(_cursor, "promotional_price_set");
          final int _cursorIndexOfPromotionalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "promotional_price");
          final int _cursorIndexOfHeadsup = CursorUtil.getColumnIndexOrThrow(_cursor, "headsup");
          final int _cursorIndexOfServedWith = CursorUtil.getColumnIndexOrThrow(_cursor, "served_with");
          final int _cursorIndexOfFreeDelivery = CursorUtil.getColumnIndexOrThrow(_cursor, "free_delivery");
          final int _cursorIndexOfAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "available");
          final List<MoreProductsTable> _result = new ArrayList<MoreProductsTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MoreProductsTable _item;
            final int _tmpProduct_id;
            _tmpProduct_id = _cursor.getInt(_cursorIndexOfProductId);
            final String _tmpProductName;
            _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
            final String _tmpProductPicture;
            _tmpProductPicture = _cursor.getString(_cursorIndexOfProductPicture);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpPrice;
            _tmpPrice = _cursor.getString(_cursorIndexOfPrice);
            final int _tmpRestaurantId;
            _tmpRestaurantId = _cursor.getInt(_cursorIndexOfRestaurantId);
            final String _tmpRestaurantName;
            _tmpRestaurantName = _cursor.getString(_cursorIndexOfRestaurantName);
            final int _tmpBrandId;
            _tmpBrandId = _cursor.getInt(_cursorIndexOfBrandId);
            final String _tmpBrandName;
            _tmpBrandName = _cursor.getString(_cursorIndexOfBrandName);
            final int _tmpSub_category_id;
            _tmpSub_category_id = _cursor.getInt(_cursorIndexOfSubCategoryId);
            final String _tmpSub_category;
            _tmpSub_category = _cursor.getString(_cursorIndexOfSubCategory);
            final boolean _tmpPromotional_price_set;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfPromotionalPriceSet);
            _tmpPromotional_price_set = _tmp != 0;
            final Integer _tmpPromotional_price;
            if (_cursor.isNull(_cursorIndexOfPromotionalPrice)) {
              _tmpPromotional_price = null;
            } else {
              _tmpPromotional_price = _cursor.getInt(_cursorIndexOfPromotionalPrice);
            }
            final String _tmpHeadsup;
            _tmpHeadsup = _cursor.getString(_cursorIndexOfHeadsup);
            final String _tmpServed_with;
            _tmpServed_with = _cursor.getString(_cursorIndexOfServedWith);
            final boolean _tmpFree_delivery;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfFreeDelivery);
            _tmpFree_delivery = _tmp_1 != 0;
            final boolean _tmpAvailable;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfAvailable);
            _tmpAvailable = _tmp_2 != 0;
            _item = new MoreProductsTable(_tmpProduct_id,_tmpProductName,_tmpProductPicture,_tmpDescription,_tmpPrice,_tmpRestaurantId,_tmpRestaurantName,_tmpBrandId,_tmpBrandName,_tmpSub_category_id,_tmpSub_category,_tmpPromotional_price_set,_tmpPromotional_price,_tmpHeadsup,_tmpServed_with,_tmpFree_delivery,_tmpAvailable);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<TopSellingProductsTable>> getTopSellingProducts() {
    final String _sql = "SELECT `top_selling_products`.`product_id` AS `product_id`, `top_selling_products`.`product_name` AS `product_name`, `top_selling_products`.`product_picture` AS `product_picture`, `top_selling_products`.`description` AS `description`, `top_selling_products`.`price` AS `price`, `top_selling_products`.`restaurant_id` AS `restaurant_id`, `top_selling_products`.`restaurant_name` AS `restaurant_name`, `top_selling_products`.`brand_id` AS `brand_id`, `top_selling_products`.`brand_name` AS `brand_name`, `top_selling_products`.`sub_category_id` AS `sub_category_id`, `top_selling_products`.`sub_category` AS `sub_category`, `top_selling_products`.`promotional_price_set` AS `promotional_price_set`, `top_selling_products`.`promotional_price` AS `promotional_price`, `top_selling_products`.`headsup` AS `headsup`, `top_selling_products`.`served_with` AS `served_with`, `top_selling_products`.`free_delivery` AS `free_delivery`, `top_selling_products`.`available` AS `available` FROM top_selling_products";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"top_selling_products"}, false, new Callable<List<TopSellingProductsTable>>() {
      @Override
      public List<TopSellingProductsTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
          final int _cursorIndexOfProductPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "product_picture");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfRestaurantId = CursorUtil.getColumnIndexOrThrow(_cursor, "restaurant_id");
          final int _cursorIndexOfRestaurantName = CursorUtil.getColumnIndexOrThrow(_cursor, "restaurant_name");
          final int _cursorIndexOfBrandId = CursorUtil.getColumnIndexOrThrow(_cursor, "brand_id");
          final int _cursorIndexOfBrandName = CursorUtil.getColumnIndexOrThrow(_cursor, "brand_name");
          final int _cursorIndexOfSubCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_category_id");
          final int _cursorIndexOfSubCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_category");
          final int _cursorIndexOfPromotionalPriceSet = CursorUtil.getColumnIndexOrThrow(_cursor, "promotional_price_set");
          final int _cursorIndexOfPromotionalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "promotional_price");
          final int _cursorIndexOfHeadsup = CursorUtil.getColumnIndexOrThrow(_cursor, "headsup");
          final int _cursorIndexOfServedWith = CursorUtil.getColumnIndexOrThrow(_cursor, "served_with");
          final int _cursorIndexOfFreeDelivery = CursorUtil.getColumnIndexOrThrow(_cursor, "free_delivery");
          final int _cursorIndexOfAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "available");
          final List<TopSellingProductsTable> _result = new ArrayList<TopSellingProductsTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TopSellingProductsTable _item;
            final int _tmpProduct_id;
            _tmpProduct_id = _cursor.getInt(_cursorIndexOfProductId);
            final String _tmpProductName;
            _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
            final String _tmpProductPicture;
            _tmpProductPicture = _cursor.getString(_cursorIndexOfProductPicture);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpPrice;
            _tmpPrice = _cursor.getString(_cursorIndexOfPrice);
            final int _tmpRestaurantId;
            _tmpRestaurantId = _cursor.getInt(_cursorIndexOfRestaurantId);
            final String _tmpRestaurantName;
            _tmpRestaurantName = _cursor.getString(_cursorIndexOfRestaurantName);
            final int _tmpBrandId;
            _tmpBrandId = _cursor.getInt(_cursorIndexOfBrandId);
            final String _tmpBrandName;
            _tmpBrandName = _cursor.getString(_cursorIndexOfBrandName);
            final int _tmpSub_category_id;
            _tmpSub_category_id = _cursor.getInt(_cursorIndexOfSubCategoryId);
            final String _tmpSub_category;
            _tmpSub_category = _cursor.getString(_cursorIndexOfSubCategory);
            final boolean _tmpPromotional_price_set;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfPromotionalPriceSet);
            _tmpPromotional_price_set = _tmp != 0;
            final Integer _tmpPromotional_price;
            if (_cursor.isNull(_cursorIndexOfPromotionalPrice)) {
              _tmpPromotional_price = null;
            } else {
              _tmpPromotional_price = _cursor.getInt(_cursorIndexOfPromotionalPrice);
            }
            final String _tmpHeadsup;
            _tmpHeadsup = _cursor.getString(_cursorIndexOfHeadsup);
            final String _tmpServed_with;
            _tmpServed_with = _cursor.getString(_cursorIndexOfServedWith);
            final boolean _tmpFree_delivery;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfFreeDelivery);
            _tmpFree_delivery = _tmp_1 != 0;
            final boolean _tmpAvailable;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfAvailable);
            _tmpAvailable = _tmp_2 != 0;
            _item = new TopSellingProductsTable(_tmpProduct_id,_tmpProductName,_tmpProductPicture,_tmpDescription,_tmpPrice,_tmpRestaurantId,_tmpRestaurantName,_tmpBrandId,_tmpBrandName,_tmpSub_category_id,_tmpSub_category,_tmpPromotional_price_set,_tmpPromotional_price,_tmpHeadsup,_tmpServed_with,_tmpFree_delivery,_tmpAvailable);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  private void __fetchRelationshiphomeProductsTableAscomClickEatUgDatabaseHomeProductsTable(
      final LongSparseArray<ArrayList<HomeProductsTable>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<HomeProductsTable>> _tmpInnerMap = new LongSparseArray<ArrayList<HomeProductsTable>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshiphomeProductsTableAscomClickEatUgDatabaseHomeProductsTable(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<HomeProductsTable>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshiphomeProductsTableAscomClickEatUgDatabaseHomeProductsTable(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `product_id`,`product_name`,`product_picture`,`description`,`price`,`restaurant_id`,`restaurant_name`,`brand_id`,`brand_name`,`sub_category_id`,`sub_category`,`home_title_id`,`promotional_price_set`,`promotional_price`,`headsup`,`served_with`,`free_delivery`,`available` FROM `home_products_table` WHERE `home_title_id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "home_title_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfProductId = CursorUtil.getColumnIndex(_cursor, "product_id");
      final int _cursorIndexOfProductName = CursorUtil.getColumnIndex(_cursor, "product_name");
      final int _cursorIndexOfProductPicture = CursorUtil.getColumnIndex(_cursor, "product_picture");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndex(_cursor, "description");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndex(_cursor, "price");
      final int _cursorIndexOfRestaurantId = CursorUtil.getColumnIndex(_cursor, "restaurant_id");
      final int _cursorIndexOfRestaurantName = CursorUtil.getColumnIndex(_cursor, "restaurant_name");
      final int _cursorIndexOfBrandId = CursorUtil.getColumnIndex(_cursor, "brand_id");
      final int _cursorIndexOfBrandName = CursorUtil.getColumnIndex(_cursor, "brand_name");
      final int _cursorIndexOfSubCategoryId = CursorUtil.getColumnIndex(_cursor, "sub_category_id");
      final int _cursorIndexOfSubCategory = CursorUtil.getColumnIndex(_cursor, "sub_category");
      final int _cursorIndexOfHomeTitleId = CursorUtil.getColumnIndex(_cursor, "home_title_id");
      final int _cursorIndexOfPromotionalPriceSet = CursorUtil.getColumnIndex(_cursor, "promotional_price_set");
      final int _cursorIndexOfPromotionalPrice = CursorUtil.getColumnIndex(_cursor, "promotional_price");
      final int _cursorIndexOfHeadsup = CursorUtil.getColumnIndex(_cursor, "headsup");
      final int _cursorIndexOfServedWith = CursorUtil.getColumnIndex(_cursor, "served_with");
      final int _cursorIndexOfFreeDelivery = CursorUtil.getColumnIndex(_cursor, "free_delivery");
      final int _cursorIndexOfAvailable = CursorUtil.getColumnIndex(_cursor, "available");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<HomeProductsTable> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final HomeProductsTable _item_1;
          final int _tmpProduct_id;
          if (_cursorIndexOfProductId == -1) {
            _tmpProduct_id = 0;
          } else {
            _tmpProduct_id = _cursor.getInt(_cursorIndexOfProductId);
          }
          final String _tmpProductName;
          if (_cursorIndexOfProductName == -1) {
            _tmpProductName = null;
          } else {
            _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
          }
          final String _tmpProductPicture;
          if (_cursorIndexOfProductPicture == -1) {
            _tmpProductPicture = null;
          } else {
            _tmpProductPicture = _cursor.getString(_cursorIndexOfProductPicture);
          }
          final String _tmpDescription;
          if (_cursorIndexOfDescription == -1) {
            _tmpDescription = null;
          } else {
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
          }
          final String _tmpPrice;
          if (_cursorIndexOfPrice == -1) {
            _tmpPrice = null;
          } else {
            _tmpPrice = _cursor.getString(_cursorIndexOfPrice);
          }
          final int _tmpRestaurantId;
          if (_cursorIndexOfRestaurantId == -1) {
            _tmpRestaurantId = 0;
          } else {
            _tmpRestaurantId = _cursor.getInt(_cursorIndexOfRestaurantId);
          }
          final String _tmpRestaurantName;
          if (_cursorIndexOfRestaurantName == -1) {
            _tmpRestaurantName = null;
          } else {
            _tmpRestaurantName = _cursor.getString(_cursorIndexOfRestaurantName);
          }
          final int _tmpBrandId;
          if (_cursorIndexOfBrandId == -1) {
            _tmpBrandId = 0;
          } else {
            _tmpBrandId = _cursor.getInt(_cursorIndexOfBrandId);
          }
          final String _tmpBrandName;
          if (_cursorIndexOfBrandName == -1) {
            _tmpBrandName = null;
          } else {
            _tmpBrandName = _cursor.getString(_cursorIndexOfBrandName);
          }
          final int _tmpSub_category_id;
          if (_cursorIndexOfSubCategoryId == -1) {
            _tmpSub_category_id = 0;
          } else {
            _tmpSub_category_id = _cursor.getInt(_cursorIndexOfSubCategoryId);
          }
          final String _tmpSub_category;
          if (_cursorIndexOfSubCategory == -1) {
            _tmpSub_category = null;
          } else {
            _tmpSub_category = _cursor.getString(_cursorIndexOfSubCategory);
          }
          final int _tmpHome_title_id;
          if (_cursorIndexOfHomeTitleId == -1) {
            _tmpHome_title_id = 0;
          } else {
            _tmpHome_title_id = _cursor.getInt(_cursorIndexOfHomeTitleId);
          }
          final boolean _tmpPromotional_price_set;
          if (_cursorIndexOfPromotionalPriceSet == -1) {
            _tmpPromotional_price_set = false;
          } else {
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfPromotionalPriceSet);
            _tmpPromotional_price_set = _tmp != 0;
          }
          final Integer _tmpPromotional_price;
          if (_cursorIndexOfPromotionalPrice == -1) {
            _tmpPromotional_price = null;
          } else {
            if (_cursor.isNull(_cursorIndexOfPromotionalPrice)) {
              _tmpPromotional_price = null;
            } else {
              _tmpPromotional_price = _cursor.getInt(_cursorIndexOfPromotionalPrice);
            }
          }
          final String _tmpHeadsup;
          if (_cursorIndexOfHeadsup == -1) {
            _tmpHeadsup = null;
          } else {
            _tmpHeadsup = _cursor.getString(_cursorIndexOfHeadsup);
          }
          final String _tmpServed_with;
          if (_cursorIndexOfServedWith == -1) {
            _tmpServed_with = null;
          } else {
            _tmpServed_with = _cursor.getString(_cursorIndexOfServedWith);
          }
          final boolean _tmpFree_delivery;
          if (_cursorIndexOfFreeDelivery == -1) {
            _tmpFree_delivery = false;
          } else {
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfFreeDelivery);
            _tmpFree_delivery = _tmp_1 != 0;
          }
          final boolean _tmpAvailable;
          if (_cursorIndexOfAvailable == -1) {
            _tmpAvailable = false;
          } else {
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfAvailable);
            _tmpAvailable = _tmp_2 != 0;
          }
          _item_1 = new HomeProductsTable(_tmpProduct_id,_tmpProductName,_tmpProductPicture,_tmpDescription,_tmpPrice,_tmpRestaurantId,_tmpRestaurantName,_tmpBrandId,_tmpBrandName,_tmpSub_category_id,_tmpSub_category,_tmpHome_title_id,_tmpPromotional_price_set,_tmpPromotional_price,_tmpHeadsup,_tmpServed_with,_tmpFree_delivery,_tmpAvailable);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
