package com.exam.metering;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class CategoryDBHelper extends SQLiteOpenHelper  {
    final static String DB_NAME = "category.db";
    public final static String TABLE_NAME = "category_table";
    public final static String COL_CATEGORYID = "categoryId";
    public final static String COL_CATEGORYNAME = "categoryName";

    public CategoryDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABLE_NAME
                + " (" + COL_CATEGORYID + " integer primary key autoincrement, "
                + COL_CATEGORYNAME + " TEXT )";
        db.execSQL(sql);

        //샘플데이터
        db.execSQL("INSERT INTO " + CategoryDBHelper.TABLE_NAME + " VALUES (NULL, '자연');");
        db.execSQL("INSERT INTO " + CategoryDBHelper.TABLE_NAME + " VALUES (NULL, '사회과학');");
        db.execSQL("INSERT INTO " + CategoryDBHelper.TABLE_NAME + " VALUES (NULL, '예체능');");
        db.execSQL("INSERT INTO " + CategoryDBHelper.TABLE_NAME + " VALUES (NULL, '어학');");
        db.execSQL("INSERT INTO " + CategoryDBHelper.TABLE_NAME + " VALUES (NULL, '공학');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_NAME);
        onCreate(db);
    }
}
