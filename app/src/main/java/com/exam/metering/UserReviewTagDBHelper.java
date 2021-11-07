package com.exam.metering;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class UserReviewTagDBHelper extends SQLiteOpenHelper {
    final static String DB_NAME = "userreviewtag.db";
    public final static String TABLE_NAME = "userreviewtag_table";
    public final static String COL_USERREVIEWTAGID = "userReviewTagId";
    public final static String COL_USERREVIEWID = "userReviewId";
    public final static String COL_USERTAGID = "userTagId";

    public UserReviewTagDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABLE_NAME
                + " (" + COL_USERREVIEWTAGID + " integer primary key autoincrement, "
                + COL_USERREVIEWID + " TEXT, "
                + COL_USERTAGID + " TEXT )";
        db.execSQL(sql);

        //샘플데이터
        db.execSQL("INSERT INTO " + UserReviewTagDBHelper.TABLE_NAME + " VALUES (NULL, 1, 2);");
        db.execSQL("INSERT INTO " + UserReviewTagDBHelper.TABLE_NAME + " VALUES (NULL, 1, 5);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_NAME);
        onCreate(db);
    }
}
