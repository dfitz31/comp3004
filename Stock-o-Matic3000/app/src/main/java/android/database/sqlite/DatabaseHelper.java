package android.database.sqlite;


import no_idea.stock_o_matic3000.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List<E>;
import java.util.Locale;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.nfc.Tag;
import android.util.Log;


/**
 * Created by firef on 2017-10-24.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    //Log tag
    private static final String LOG = "DatabaseHelper";

    //Database version
    private static final int DATABASE_VERSION = 1;

    //Database Name
    private static final String DATABASE_NAME = "stockOMaticDb";

    //Table names
    private static final String TABLE_FOOD_LIST = "food_list";
    private static final String TABLE_RECIPE_LIST = "recipe_list";
    private static final String TABLE_MEAL_LIST = "meal_list";

    //Common Column Names
    private static final String KEY_ID = "id";
    private static final String KEY_CREATED_AT = "created_at";

    //Food List table keys
    private static final String KEY_FOOD_LIST_ITEM = "item";
    private static final String KEY_FOOD_LIST_QUANTITY = "quantity";
    private static final String KEY_FOOD_LIST_MONTH = "month";
    private static final String KEY_FOOD_LIST_DAY = "day";
    private static final String KEY_FOOD_LIST_YEAR = "year";

    //Recipe list table keys

    //Table Creat statements
    //Food List Table Create Statement
    private static final String CREATE_TABLE_FOOD_LIST = "CREATE TABLE "
            + TABLE_FOOD_LIST + " (" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_FOOD_LIST_ITEM
            + " TEXT," + KEY_FOOD_LIST_QUANTITY + " INTEGER," + KEY_FOOD_LIST_MONTH + " INTEGER,"
            + KEY_FOOD_LIST_DAY + " INTEGER," + KEY_FOOD_LIST_YEAR + " INTEGER," + KEY_CREATED_AT
            + " DATETIM" + ")";

    //Recipe List Table Create Statement
    private static final String CREATE_TABLE_RECIPE_LIST = "CREATE TABLE " + TABLE_RECIPE_LIST;

    //Meal List Table Create Statement
    private static final String CREATE_TABLE_MEAL_LIST = "CREATE TABLE " + TABLE_MEAL_LIST;



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_FOOD_LIST);
        db.execSQL(CREATE_TABLE_RECIPE_LIST);
        db.execSQL(CREATE_TABLE_MEAL_LIST);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        // On upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FOOD_LIST);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RECIPE_LIST);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEAL_LIST);

        onCreate(db);

    }

    public long createFoodList(FoodItem foodItem, long[] tag_ids){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_FOOD_LIST_ITEM, foodItem.getName());
        values.put(KEY_FOOD_LIST_QUANTITY, foodItem.getQuantity());
        values.put(KEY_FOOD_LIST_MONTH, foodItem.getMonth());
        values.put(KEY_FOOD_LIST_DAY, foodItem.getDay());
        values.put(KEY_FOOD_LIST_YEAR, foodItem.getYear());
        values.put(KEY_CREATED_AT, getDateTime());
    }

    //Get a FoodItem from the FoodList
    public FoodItem getFoodItem(long fooditem_id) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT * FROM " + TABLE_FOOD_LIST + " WHERE " + KEY_ID + " = " + fooditem_id;

        Log.e(LOG, selectQuery);
        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        FoodItem fi = new FoodItem();
        fi.setName(c.getString(c.getColumnIndex(KEY_ID)));
        fi.setQuantity(c.getInt(c.getColumnIndex(KEY_ID)));
        fi.setMonth(c.getInt(c.getColumnIndex(KEY_ID)));
        fi.setDay(c.getInt(c.getColumnIndex(KEY_ID)));
        fi.setYear(c.getInt(c.getColumnIndex(KEY_ID)));

        return fi;

    }

    //Fetch all FoodItems in FoodList
    public List<FoodItem> getAllFoodItems(){
        List<FoodItem> inventory = new ArrayList<FoodItem>();
        String selectQuery = "SELECT * FROM " +  TABLE_FOOD_LIST;

        Log.e(LOG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        //Loop through all rows and add values to list
        if(c.moveToFirst()){
            do {
                FoodItem fi = new FoodItem();
                fi.setName(c.getString(c.getColumnIndex(KEY_ID)));
                fi.setQuantity(c.getInt(c.getColumnIndex(KEY_ID)));
                fi.setMonth(c.getInt(c.getColumnIndex(KEY_ID)));
                fi.setDay(c.getInt(c.getColumnIndex(KEY_ID)));
                fi.setYear(c.getInt(c.getColumnIndex(KEY_ID)));

                inventory.add(fi);
            } while (c.moveToNext());
        }

        return inventory;
    }

    /*Update a FoodItem in the FoodList THIS NEEDS WORK
    public int updateFoodItem(FoodItem foodItem){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_FOOD_LIST_ITEM, foodItem.getName());
        values.put(KEY_FOOD_LIST_QUANTITY, foodItem.getQuantity());
        values.put(KEY_FOOD_LIST_MONTH, foodItem.getMonth());
        values.put(KEY_FOOD_LIST_DAY, foodItem.getDay());
        values.put(KEY_FOOD_LIST_YEAR, foodItem.getYear());
        values.put(KEY_CREATED_AT, getDateTime());

        return db.update(TABLE_FOOD_LIST, values, KEY_ID + " = ?", new String[] {String.valueOf})
    }*/

    //Delete a FoodItem from the FoodList
    public void deleteFoodItem(long foodItem_id){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_FOOD_LIST, KEY_ID + " = ?", new String[] { String.valueOf(foodItem_id)});
    }

    //Close the Database connection
    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
        }


    private String getDateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        return dateFormat.format(date);
    }



}
