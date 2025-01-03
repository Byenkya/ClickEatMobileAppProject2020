package com.clickEat.ug.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDataBase_Impl extends AppDataBase {
  private volatile DatabaseDao _databaseDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(6) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `home_title_cat_table` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `cart_table` (`product_id` INTEGER NOT NULL, `customer_id` INTEGER NOT NULL, `product_name` TEXT NOT NULL, `product_image` TEXT NOT NULL, `unit_price` TEXT NOT NULL, `quantity` TEXT NOT NULL, `served_with` TEXT NOT NULL, PRIMARY KEY(`product_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `customer_table` (`customer_id` INTEGER NOT NULL, `customer_names` TEXT NOT NULL, `email` TEXT, `contact` TEXT NOT NULL, `second_contact` TEXT, `date_of_reg` TEXT NOT NULL, `account_active` INTEGER NOT NULL, `token` TEXT, `cart_size` INTEGER, PRIMARY KEY(`customer_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `restaurants_table` (`restuarant_id` INTEGER NOT NULL, `business_name` TEXT NOT NULL, `business_profile_picture` TEXT, `address` TEXT NOT NULL, `email` TEXT NOT NULL, `contact` TEXT NOT NULL, `second_contact` TEXT NOT NULL, `location` TEXT NOT NULL, `description` TEXT NOT NULL, `admin_names` TEXT NOT NULL, `admin_username` TEXT NOT NULL, `admin_email` TEXT NOT NULL, `admin_telephone` TEXT NOT NULL, `operation_start_time` TEXT NOT NULL, `operation_stop_time` TEXT NOT NULL, `operation_status` INTEGER NOT NULL, PRIMARY KEY(`restuarant_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `sub_drinks_categories` (`sub_cat_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `category_id` INTEGER NOT NULL, PRIMARY KEY(`sub_cat_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `home_products_table` (`product_id` INTEGER NOT NULL, `product_name` TEXT NOT NULL, `product_picture` TEXT, `description` TEXT NOT NULL, `price` TEXT NOT NULL, `restaurant_id` INTEGER NOT NULL, `restaurant_name` TEXT NOT NULL, `brand_id` INTEGER NOT NULL, `brand_name` TEXT NOT NULL, `sub_category_id` INTEGER NOT NULL, `sub_category` TEXT NOT NULL, `home_title_id` INTEGER NOT NULL, `promotional_price_set` INTEGER NOT NULL, `promotional_price` INTEGER, `headsup` TEXT, `served_with` TEXT NOT NULL, `free_delivery` INTEGER NOT NULL, `available` INTEGER NOT NULL, PRIMARY KEY(`product_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `products_table` (`product_id` INTEGER NOT NULL, `product_name` TEXT NOT NULL, `product_picture` TEXT, `description` TEXT NOT NULL, `price` TEXT NOT NULL, `restaurant_id` INTEGER NOT NULL, `restaurant_name` TEXT NOT NULL, `brand_id` INTEGER NOT NULL, `brand_name` TEXT NOT NULL, `sub_category_id` INTEGER NOT NULL, `sub_category` TEXT NOT NULL, `promotional_price_set` INTEGER NOT NULL, `promotional_price` INTEGER, `headsup` TEXT, `served_with` TEXT NOT NULL, `free_delivery` INTEGER NOT NULL, `available` INTEGER NOT NULL, PRIMARY KEY(`product_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `home_images_table` (`id` INTEGER NOT NULL, `info_type` TEXT NOT NULL, `image_name` TEXT NOT NULL, `image_desc` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `home_sub_categories_table` (`id` INTEGER NOT NULL, `subCatImage` TEXT NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `more_products_table` (`product_id` INTEGER NOT NULL, `product_name` TEXT NOT NULL, `product_picture` TEXT, `description` TEXT NOT NULL, `price` TEXT NOT NULL, `restaurant_id` INTEGER NOT NULL, `restaurant_name` TEXT NOT NULL, `brand_id` INTEGER NOT NULL, `brand_name` TEXT NOT NULL, `sub_category_id` INTEGER NOT NULL, `sub_category` TEXT NOT NULL, `promotional_price_set` INTEGER NOT NULL, `promotional_price` INTEGER, `headsup` TEXT, `served_with` TEXT NOT NULL, `free_delivery` INTEGER NOT NULL, `available` INTEGER NOT NULL, PRIMARY KEY(`product_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `top_selling_products` (`product_id` INTEGER NOT NULL, `product_name` TEXT NOT NULL, `product_picture` TEXT, `description` TEXT NOT NULL, `price` TEXT NOT NULL, `restaurant_id` INTEGER NOT NULL, `restaurant_name` TEXT NOT NULL, `brand_id` INTEGER NOT NULL, `brand_name` TEXT NOT NULL, `sub_category_id` INTEGER NOT NULL, `sub_category` TEXT NOT NULL, `promotional_price_set` INTEGER NOT NULL, `promotional_price` INTEGER, `headsup` TEXT, `served_with` TEXT NOT NULL, `free_delivery` INTEGER NOT NULL, `available` INTEGER NOT NULL, PRIMARY KEY(`product_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cb153dc92537b8f4e781d7575befe1fe')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `home_title_cat_table`");
        _db.execSQL("DROP TABLE IF EXISTS `cart_table`");
        _db.execSQL("DROP TABLE IF EXISTS `customer_table`");
        _db.execSQL("DROP TABLE IF EXISTS `restaurants_table`");
        _db.execSQL("DROP TABLE IF EXISTS `sub_drinks_categories`");
        _db.execSQL("DROP TABLE IF EXISTS `home_products_table`");
        _db.execSQL("DROP TABLE IF EXISTS `products_table`");
        _db.execSQL("DROP TABLE IF EXISTS `home_images_table`");
        _db.execSQL("DROP TABLE IF EXISTS `home_sub_categories_table`");
        _db.execSQL("DROP TABLE IF EXISTS `more_products_table`");
        _db.execSQL("DROP TABLE IF EXISTS `top_selling_products`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsHomeTitleCatTable = new HashMap<String, TableInfo.Column>(2);
        _columnsHomeTitleCatTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeTitleCatTable.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHomeTitleCatTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHomeTitleCatTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHomeTitleCatTable = new TableInfo("home_title_cat_table", _columnsHomeTitleCatTable, _foreignKeysHomeTitleCatTable, _indicesHomeTitleCatTable);
        final TableInfo _existingHomeTitleCatTable = TableInfo.read(_db, "home_title_cat_table");
        if (! _infoHomeTitleCatTable.equals(_existingHomeTitleCatTable)) {
          return new RoomOpenHelper.ValidationResult(false, "home_title_cat_table(com.clickEat.ug.database.HomeTitleCatTable).\n"
                  + " Expected:\n" + _infoHomeTitleCatTable + "\n"
                  + " Found:\n" + _existingHomeTitleCatTable);
        }
        final HashMap<String, TableInfo.Column> _columnsCartTable = new HashMap<String, TableInfo.Column>(7);
        _columnsCartTable.put("product_id", new TableInfo.Column("product_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartTable.put("customer_id", new TableInfo.Column("customer_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartTable.put("product_name", new TableInfo.Column("product_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartTable.put("product_image", new TableInfo.Column("product_image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartTable.put("unit_price", new TableInfo.Column("unit_price", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartTable.put("quantity", new TableInfo.Column("quantity", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartTable.put("served_with", new TableInfo.Column("served_with", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCartTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCartTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCartTable = new TableInfo("cart_table", _columnsCartTable, _foreignKeysCartTable, _indicesCartTable);
        final TableInfo _existingCartTable = TableInfo.read(_db, "cart_table");
        if (! _infoCartTable.equals(_existingCartTable)) {
          return new RoomOpenHelper.ValidationResult(false, "cart_table(com.clickEat.ug.database.CartTable).\n"
                  + " Expected:\n" + _infoCartTable + "\n"
                  + " Found:\n" + _existingCartTable);
        }
        final HashMap<String, TableInfo.Column> _columnsCustomerTable = new HashMap<String, TableInfo.Column>(9);
        _columnsCustomerTable.put("customer_id", new TableInfo.Column("customer_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("customer_names", new TableInfo.Column("customer_names", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("contact", new TableInfo.Column("contact", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("second_contact", new TableInfo.Column("second_contact", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("date_of_reg", new TableInfo.Column("date_of_reg", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("account_active", new TableInfo.Column("account_active", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("token", new TableInfo.Column("token", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerTable.put("cart_size", new TableInfo.Column("cart_size", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCustomerTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCustomerTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCustomerTable = new TableInfo("customer_table", _columnsCustomerTable, _foreignKeysCustomerTable, _indicesCustomerTable);
        final TableInfo _existingCustomerTable = TableInfo.read(_db, "customer_table");
        if (! _infoCustomerTable.equals(_existingCustomerTable)) {
          return new RoomOpenHelper.ValidationResult(false, "customer_table(com.clickEat.ug.database.CustomerTable).\n"
                  + " Expected:\n" + _infoCustomerTable + "\n"
                  + " Found:\n" + _existingCustomerTable);
        }
        final HashMap<String, TableInfo.Column> _columnsRestaurantsTable = new HashMap<String, TableInfo.Column>(16);
        _columnsRestaurantsTable.put("restuarant_id", new TableInfo.Column("restuarant_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("business_name", new TableInfo.Column("business_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("business_profile_picture", new TableInfo.Column("business_profile_picture", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("address", new TableInfo.Column("address", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("contact", new TableInfo.Column("contact", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("second_contact", new TableInfo.Column("second_contact", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("location", new TableInfo.Column("location", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("admin_names", new TableInfo.Column("admin_names", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("admin_username", new TableInfo.Column("admin_username", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("admin_email", new TableInfo.Column("admin_email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("admin_telephone", new TableInfo.Column("admin_telephone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("operation_start_time", new TableInfo.Column("operation_start_time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("operation_stop_time", new TableInfo.Column("operation_stop_time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestaurantsTable.put("operation_status", new TableInfo.Column("operation_status", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRestaurantsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRestaurantsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRestaurantsTable = new TableInfo("restaurants_table", _columnsRestaurantsTable, _foreignKeysRestaurantsTable, _indicesRestaurantsTable);
        final TableInfo _existingRestaurantsTable = TableInfo.read(_db, "restaurants_table");
        if (! _infoRestaurantsTable.equals(_existingRestaurantsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "restaurants_table(com.clickEat.ug.database.RestaurantsTable).\n"
                  + " Expected:\n" + _infoRestaurantsTable + "\n"
                  + " Found:\n" + _existingRestaurantsTable);
        }
        final HashMap<String, TableInfo.Column> _columnsSubDrinksCategories = new HashMap<String, TableInfo.Column>(3);
        _columnsSubDrinksCategories.put("sub_cat_id", new TableInfo.Column("sub_cat_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubDrinksCategories.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubDrinksCategories.put("category_id", new TableInfo.Column("category_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSubDrinksCategories = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSubDrinksCategories = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSubDrinksCategories = new TableInfo("sub_drinks_categories", _columnsSubDrinksCategories, _foreignKeysSubDrinksCategories, _indicesSubDrinksCategories);
        final TableInfo _existingSubDrinksCategories = TableInfo.read(_db, "sub_drinks_categories");
        if (! _infoSubDrinksCategories.equals(_existingSubDrinksCategories)) {
          return new RoomOpenHelper.ValidationResult(false, "sub_drinks_categories(com.clickEat.ug.database.SubDrinksTable).\n"
                  + " Expected:\n" + _infoSubDrinksCategories + "\n"
                  + " Found:\n" + _existingSubDrinksCategories);
        }
        final HashMap<String, TableInfo.Column> _columnsHomeProductsTable = new HashMap<String, TableInfo.Column>(18);
        _columnsHomeProductsTable.put("product_id", new TableInfo.Column("product_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("product_name", new TableInfo.Column("product_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("product_picture", new TableInfo.Column("product_picture", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("price", new TableInfo.Column("price", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("restaurant_id", new TableInfo.Column("restaurant_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("restaurant_name", new TableInfo.Column("restaurant_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("brand_id", new TableInfo.Column("brand_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("brand_name", new TableInfo.Column("brand_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("sub_category_id", new TableInfo.Column("sub_category_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("sub_category", new TableInfo.Column("sub_category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("home_title_id", new TableInfo.Column("home_title_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("promotional_price_set", new TableInfo.Column("promotional_price_set", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("promotional_price", new TableInfo.Column("promotional_price", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("headsup", new TableInfo.Column("headsup", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("served_with", new TableInfo.Column("served_with", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("free_delivery", new TableInfo.Column("free_delivery", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeProductsTable.put("available", new TableInfo.Column("available", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHomeProductsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHomeProductsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHomeProductsTable = new TableInfo("home_products_table", _columnsHomeProductsTable, _foreignKeysHomeProductsTable, _indicesHomeProductsTable);
        final TableInfo _existingHomeProductsTable = TableInfo.read(_db, "home_products_table");
        if (! _infoHomeProductsTable.equals(_existingHomeProductsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "home_products_table(com.clickEat.ug.database.HomeProductsTable).\n"
                  + " Expected:\n" + _infoHomeProductsTable + "\n"
                  + " Found:\n" + _existingHomeProductsTable);
        }
        final HashMap<String, TableInfo.Column> _columnsProductsTable = new HashMap<String, TableInfo.Column>(17);
        _columnsProductsTable.put("product_id", new TableInfo.Column("product_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("product_name", new TableInfo.Column("product_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("product_picture", new TableInfo.Column("product_picture", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("price", new TableInfo.Column("price", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("restaurant_id", new TableInfo.Column("restaurant_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("restaurant_name", new TableInfo.Column("restaurant_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("brand_id", new TableInfo.Column("brand_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("brand_name", new TableInfo.Column("brand_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("sub_category_id", new TableInfo.Column("sub_category_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("sub_category", new TableInfo.Column("sub_category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("promotional_price_set", new TableInfo.Column("promotional_price_set", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("promotional_price", new TableInfo.Column("promotional_price", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("headsup", new TableInfo.Column("headsup", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("served_with", new TableInfo.Column("served_with", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("free_delivery", new TableInfo.Column("free_delivery", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsTable.put("available", new TableInfo.Column("available", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProductsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProductsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProductsTable = new TableInfo("products_table", _columnsProductsTable, _foreignKeysProductsTable, _indicesProductsTable);
        final TableInfo _existingProductsTable = TableInfo.read(_db, "products_table");
        if (! _infoProductsTable.equals(_existingProductsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "products_table(com.clickEat.ug.database.ProductsTable).\n"
                  + " Expected:\n" + _infoProductsTable + "\n"
                  + " Found:\n" + _existingProductsTable);
        }
        final HashMap<String, TableInfo.Column> _columnsHomeImagesTable = new HashMap<String, TableInfo.Column>(4);
        _columnsHomeImagesTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeImagesTable.put("info_type", new TableInfo.Column("info_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeImagesTable.put("image_name", new TableInfo.Column("image_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeImagesTable.put("image_desc", new TableInfo.Column("image_desc", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHomeImagesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHomeImagesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHomeImagesTable = new TableInfo("home_images_table", _columnsHomeImagesTable, _foreignKeysHomeImagesTable, _indicesHomeImagesTable);
        final TableInfo _existingHomeImagesTable = TableInfo.read(_db, "home_images_table");
        if (! _infoHomeImagesTable.equals(_existingHomeImagesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "home_images_table(com.clickEat.ug.database.HomeImagesTable).\n"
                  + " Expected:\n" + _infoHomeImagesTable + "\n"
                  + " Found:\n" + _existingHomeImagesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsHomeSubCategoriesTable = new HashMap<String, TableInfo.Column>(3);
        _columnsHomeSubCategoriesTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeSubCategoriesTable.put("subCatImage", new TableInfo.Column("subCatImage", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomeSubCategoriesTable.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHomeSubCategoriesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHomeSubCategoriesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHomeSubCategoriesTable = new TableInfo("home_sub_categories_table", _columnsHomeSubCategoriesTable, _foreignKeysHomeSubCategoriesTable, _indicesHomeSubCategoriesTable);
        final TableInfo _existingHomeSubCategoriesTable = TableInfo.read(_db, "home_sub_categories_table");
        if (! _infoHomeSubCategoriesTable.equals(_existingHomeSubCategoriesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "home_sub_categories_table(com.clickEat.ug.database.HomeSubCategoriesTable).\n"
                  + " Expected:\n" + _infoHomeSubCategoriesTable + "\n"
                  + " Found:\n" + _existingHomeSubCategoriesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsMoreProductsTable = new HashMap<String, TableInfo.Column>(17);
        _columnsMoreProductsTable.put("product_id", new TableInfo.Column("product_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("product_name", new TableInfo.Column("product_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("product_picture", new TableInfo.Column("product_picture", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("price", new TableInfo.Column("price", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("restaurant_id", new TableInfo.Column("restaurant_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("restaurant_name", new TableInfo.Column("restaurant_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("brand_id", new TableInfo.Column("brand_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("brand_name", new TableInfo.Column("brand_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("sub_category_id", new TableInfo.Column("sub_category_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("sub_category", new TableInfo.Column("sub_category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("promotional_price_set", new TableInfo.Column("promotional_price_set", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("promotional_price", new TableInfo.Column("promotional_price", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("headsup", new TableInfo.Column("headsup", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("served_with", new TableInfo.Column("served_with", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("free_delivery", new TableInfo.Column("free_delivery", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoreProductsTable.put("available", new TableInfo.Column("available", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMoreProductsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMoreProductsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMoreProductsTable = new TableInfo("more_products_table", _columnsMoreProductsTable, _foreignKeysMoreProductsTable, _indicesMoreProductsTable);
        final TableInfo _existingMoreProductsTable = TableInfo.read(_db, "more_products_table");
        if (! _infoMoreProductsTable.equals(_existingMoreProductsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "more_products_table(com.clickEat.ug.database.MoreProductsTable).\n"
                  + " Expected:\n" + _infoMoreProductsTable + "\n"
                  + " Found:\n" + _existingMoreProductsTable);
        }
        final HashMap<String, TableInfo.Column> _columnsTopSellingProducts = new HashMap<String, TableInfo.Column>(17);
        _columnsTopSellingProducts.put("product_id", new TableInfo.Column("product_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("product_name", new TableInfo.Column("product_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("product_picture", new TableInfo.Column("product_picture", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("price", new TableInfo.Column("price", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("restaurant_id", new TableInfo.Column("restaurant_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("restaurant_name", new TableInfo.Column("restaurant_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("brand_id", new TableInfo.Column("brand_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("brand_name", new TableInfo.Column("brand_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("sub_category_id", new TableInfo.Column("sub_category_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("sub_category", new TableInfo.Column("sub_category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("promotional_price_set", new TableInfo.Column("promotional_price_set", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("promotional_price", new TableInfo.Column("promotional_price", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("headsup", new TableInfo.Column("headsup", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("served_with", new TableInfo.Column("served_with", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("free_delivery", new TableInfo.Column("free_delivery", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTopSellingProducts.put("available", new TableInfo.Column("available", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTopSellingProducts = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTopSellingProducts = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTopSellingProducts = new TableInfo("top_selling_products", _columnsTopSellingProducts, _foreignKeysTopSellingProducts, _indicesTopSellingProducts);
        final TableInfo _existingTopSellingProducts = TableInfo.read(_db, "top_selling_products");
        if (! _infoTopSellingProducts.equals(_existingTopSellingProducts)) {
          return new RoomOpenHelper.ValidationResult(false, "top_selling_products(com.clickEat.ug.database.TopSellingProductsTable).\n"
                  + " Expected:\n" + _infoTopSellingProducts + "\n"
                  + " Found:\n" + _existingTopSellingProducts);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "cb153dc92537b8f4e781d7575befe1fe", "f40146c07fd3b5e85bd5dceceabdc896");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "home_title_cat_table","cart_table","customer_table","restaurants_table","sub_drinks_categories","home_products_table","products_table","home_images_table","home_sub_categories_table","more_products_table","top_selling_products");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `home_title_cat_table`");
      _db.execSQL("DELETE FROM `cart_table`");
      _db.execSQL("DELETE FROM `customer_table`");
      _db.execSQL("DELETE FROM `restaurants_table`");
      _db.execSQL("DELETE FROM `sub_drinks_categories`");
      _db.execSQL("DELETE FROM `home_products_table`");
      _db.execSQL("DELETE FROM `products_table`");
      _db.execSQL("DELETE FROM `home_images_table`");
      _db.execSQL("DELETE FROM `home_sub_categories_table`");
      _db.execSQL("DELETE FROM `more_products_table`");
      _db.execSQL("DELETE FROM `top_selling_products`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public DatabaseDao getDatabaseDao() {
    if (_databaseDao != null) {
      return _databaseDao;
    } else {
      synchronized(this) {
        if(_databaseDao == null) {
          _databaseDao = new DatabaseDao_Impl(this);
        }
        return _databaseDao;
      }
    }
  }
}
