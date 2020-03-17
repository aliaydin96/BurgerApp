package com.example.burgerapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class FoodDatabaseHelper extends SQLiteOpenHelper {
    private static final String TAG = "FoodDatabaseHelper";

    private static final String TABLE_NAME = "food_table";
    private static String COL1 = "foodName";
    private static final String COL2 = "foodNumber";
    private static final String COL3 = "date";
    public FoodDatabaseHelper(Context context) {
        super(context, TABLE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " ("+COL1+" TEXT, " +
                COL2 +" NUMBER," + COL3 +" TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addFoodData(String foodName, int foodNumber, String date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1, foodName);
        contentValues.put(COL2, foodNumber);
        contentValues.put(COL3, date);

        //Log.d(TAG, "addData: Adding " + item + " to " + TABLE_NAME);

        long result = db.insert(TABLE_NAME, null, contentValues);
        db.close();
        //if date as inserted incorrectly it will return -1
        if (result == -1) {
            return false;
        } else {
            return true;
        }

    }
    public List<String> getFoodData(){
        SQLiteDatabase db = this.getWritableDatabase();
        String [] sutunlar = new String[]{COL1, COL2, COL3};
        Cursor cursor = (Cursor) db.query(TABLE_NAME, sutunlar,null,null,null,null,null);
        int foodNamesirano = cursor.getColumnIndex(COL1);
        int foodNumbersirano = cursor.getColumnIndex(COL2);
        int datesirano = cursor.getColumnIndex(COL3);
        List<String> foodData = new ArrayList<>();
        for (cursor.moveToFirst(); !cursor.isAfterLast();cursor.moveToNext()){
            foodData.add(cursor.getString(foodNamesirano));
            foodData.add(cursor.getString(foodNumbersirano));
            foodData.add(cursor.getString(datesirano));
        }
        return foodData;
    }
}
