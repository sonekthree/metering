package com.exam.metering;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ClassTagDBHelper extends SQLiteOpenHelper {
    final static String DB_NAME = "classtag.db";
    public final static String TABLE_NAME = "classtag_table";
    public final static String COL_CLASSTAGID = "classTagId";
    public final static String COL_CLASSTAGNAME = "classTagName";

    public ClassTagDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABLE_NAME
                + " (" + COL_CLASSTAGID + " integer primary key autoincrement, "
                + COL_CLASSTAGNAME + " TEXT )";
        db.execSQL(sql);

        //샘플데이터
        db.execSQL("INSERT INTO " + ClassTagDBHelper.TABLE_NAME + " VALUES (NULL, '친절');");
        db.execSQL("INSERT INTO " + ClassTagDBHelper.TABLE_NAME + " VALUES (NULL, '열정');");
        db.execSQL("INSERT INTO " + ClassTagDBHelper.TABLE_NAME + " VALUES (NULL, '꼼꼼');");
        db.execSQL("INSERT INTO " + ClassTagDBHelper.TABLE_NAME + " VALUES (NULL, '느림');");
        db.execSQL("INSERT INTO " + ClassTagDBHelper.TABLE_NAME + " VALUES (NULL, '성실');");
        db.execSQL("INSERT INTO " + ClassTagDBHelper.TABLE_NAME + " VALUES (NULL, '과묵');");
        db.execSQL("INSERT INTO " + ClassTagDBHelper.TABLE_NAME + " VALUES (NULL, '시끄러움');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_NAME);
        onCreate(db);
    }
}
