package com.example.burgerapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {


    private static final String TAG = "DatabaseHelper";

    private static final String TABLE_NAME = "people_table";
    private static final String COL1 = "ID";
    private static final String COL2 = "username";
    private static final String COL3 = "password";



    public DatabaseHelper(Context context) {
        super(context, TABLE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " ("+COL1+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL2 +" TEXT," + COL3 +" TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addData(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, username);
        contentValues.put(COL3, password);

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

    /**
     * Returns all the data from database
     * @return
     */
    public Cursor getData(){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME;
        Cursor data = db.rawQuery(query, null);
        return data;
    }

    /**
     * Returns only the ID that matches the name passed in
     * @param name
     * @return
     */
    public List<String> getItemUsername(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = (Cursor) db.query(TABLE_NAME, new String[]{COL2},null,null,null,null,null);
        int usernamesirano = cursor.getColumnIndex(COL2);
        List<String> usernameliste = new ArrayList<>();
        for (cursor.moveToFirst(); !cursor.isAfterLast();cursor.moveToNext()){
            usernameliste.add(cursor.getString(usernamesirano));
        }
        return usernameliste;
    }
    public List<String> getItemPassword(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = (Cursor) db.query(TABLE_NAME, new String[]{COL3},null,null,null,null,null);
        int passwordsirano = cursor.getColumnIndex(COL3);
        List<String> passwordliste = new ArrayList<>();
        for (cursor.moveToFirst(); !cursor.isAfterLast();cursor.moveToNext()){
            passwordliste.add(cursor.getString(passwordsirano));
        }
        return passwordliste;
    }
    /**
     * Updates the name field
     * @param newName
     * @param id
     * @param oldName
     */
    public void updateName(String newName, int id, String oldName){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "UPDATE " + TABLE_NAME + " SET " + COL2 +
                " = '" + newName + "' WHERE " + COL1 + " = '" + id + "'" +
                " AND " + COL2 + " = '" + oldName + "'";
        Log.d(TAG, "updateName: query: " + query);
        Log.d(TAG, "updateName: Setting name to " + newName);
        db.execSQL(query);
    }

    /**
     * Delete from database
     * @param id
     * @param name
     */
    public void deleteName(int id, String name){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "DELETE FROM " + TABLE_NAME + " WHERE "
                + COL1 + " = '" + id + "'" +
                " AND " + COL2 + " = '" + name + "'";
        Log.d(TAG, "deleteName: query: " + query);
        Log.d(TAG, "deleteName: Deleting " + name + " from database.");
        db.execSQL(query);
    }
}
