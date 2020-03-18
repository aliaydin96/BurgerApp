package com.example.burgerapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class FoodDatabaseHelper extends SQLiteOpenHelper {
    private static final String TAG = "FoodDatabaseHelper";

    private static final String TABLE_NAME = "food_table_2";
    private static String COL1 = "masaNo";
    private static String COL2 = "foodName";
    private static final String COL3 = "foodNumber";
    private static final String COL4 = "date";
    public FoodDatabaseHelper(Context context) {
        super(context, TABLE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " ("+COL1+" TEXT, " + COL2+" TEXT, " +
                COL3 +" NUMBER," + COL4 +" TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addFoodData(String masaNo, String foodName, int foodNumber) {//, String date
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1, masaNo);
        contentValues.put(COL2, foodName);
        contentValues.put(COL3, foodNumber);
       // contentValues.put(COL4, date);

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
        String [] sutunlar = new String[]{COL1, COL2, COL3, COL4};
        Cursor cursor = (Cursor) db.query(TABLE_NAME, sutunlar,null,null,null,null,null);
        int masanosirano = cursor.getColumnIndex(COL1);
        int foodNamesirano = cursor.getColumnIndex(COL2);
        int foodNumbersirano = cursor.getColumnIndex(COL3);
        //int datesirano = cursor.getColumnIndex(COL3);
        List<String> foodData = new ArrayList<>();
        for (cursor.moveToFirst(); !cursor.isAfterLast();cursor.moveToNext()){
            foodData.add(cursor.getString(masanosirano));
            foodData.add(cursor.getString(foodNamesirano));
            foodData.add(cursor.getString(foodNumbersirano));
            //foodData.add(cursor.getString(datesirano));
        }
        return foodData;
    }
    public void updateFoodNumber(int newNumber, int id, int oldNumber){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "UPDATE " + TABLE_NAME + " SET " + COL2 +
                " = '" + newNumber + "' WHERE " + COL1 + " = '" + id + "'" +
                " AND " + COL2 + " = '" + oldNumber + "'";
        //Log.d(TAG, "updateName: query: " + query);
        //Log.d(TAG, "updateName: Setting name to " + newName);
        db.execSQL(query);
    }
    public void deleteAllFood(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "DELETE FROM " + TABLE_NAME + " WHERE "
                + COL1 + " = '" + id + "'";
        //Log.d(TAG, "deleteName: query: " + query);
        /*
        String query = "DELETE FROM " + TABLE_NAME + " WHERE "
                + COL1 + " = '" + id + "'" +
                " AND " + COL2 + " = '" + name + "'";
        Log.d(TAG, "deleteName: query: " + query);
        Log.d(TAG, "deleteName: Deleting " + name + " from database.");*/

        db.execSQL(query);

    }
}
