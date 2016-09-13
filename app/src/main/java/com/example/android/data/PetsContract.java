package com.example.android.data;

import android.provider.BaseColumns;

/**
 * Created by udr013 on 13-9-2016.
 */
public class PetsContract {

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private PetsContract() {
    }

    /* Inner class that defines the table contents
    * By implementing the BaseColumns interface, your inner class can
    * inherit a primary key field called _ID that some Android classes
    * such as cursor adaptors will expect it to have. It's not required,
    * but this can help your database work harmoniously with the Android framework.
                * package android.provider;

                public interface BaseColumns {
                String _COUNT = "_count";
                String _ID = "_id";
        }
        */
    public static class PetsEntry implements BaseColumns {

        //CONSTANTS FOR TABLE
        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        //DATABASE STATEMENTS
        public static final String SQL_CREATE_TABLE = "CREATE TABLE "+ TABLE_NAME+"(" +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                COLUMN_PET_NAME+" TEXT NOT NULL,"+
                COLUMN_PET_BREED+ " TEXT NOT NULL,"+
                COLUMN_PET_GENDER+ " INTEGER NOT NULL,"+
                COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT VALUE 1);";

        public static final String SQL_DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME+ ";";

        //VALUES FOR VARIOUS GENDER CONSTANTS
        public static final int GENDER_FEMALE =2;
        public static final int GENDER_MALE =1;
        public static final int GENDER_UNKNOWN =0;

    }


}
