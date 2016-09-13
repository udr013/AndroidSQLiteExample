package com.example.android.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.preference.PreferenceFragment;

import com.example.android.data.PetsContract.PetsEntry;
import com.example.android.pets.CatalogActivity;

import static com.example.android.data.PetsContract.PetsEntry.*;

/**
 * Created by udr013 on 13-9-2016.
 */
public class DbHelper extends SQLiteOpenHelper {
    //if you change database schema you need to increment database version
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "shelter.db";

    /*The reason of passing null is you want the standard SQLiteCursor behaviour.
     If you want to implement a specialized Cursor you can get it by by extending the Cursor class
     ( this is for doing additional operations on the query results). And in these cases,
     you can use the CursorFactory class to return an instance of your Cursor implementation. */
    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQL_CREATE_TABLE);
        onCreate(sqLiteDatabase);

    }
}
