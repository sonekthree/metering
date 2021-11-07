package com.exam.metering;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ClassReviewTagDBHelper extends SQLiteOpenHelper {
    final static String DB_NAME = "classreviewtag.db";
    public final static String TABLE_NAME = "classreviewtag_table";
    public final static String COL_CLASSREVIEWTAGID = "classReviewTagId";
    public final static String COL_CLASSREVIEWID = "classReviewId";
    public final static String COL_CLASSTAGID = "classTagId";

    public ClassReviewTagDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABLE_NAME
                + " (" + COL_CLASSREVIEWTAGID + " integer primary key autoincrement, "
                + COL_CLASSREVIEWID + " TEXT, "
                + COL_CLASSTAGID + " TEXT )";
        db.execSQL(sql);

        //샘플데이터
        db.execSQL("INSERT INTO " + ClassReviewTagDBHelper.TABLE_NAME + " VALUES (NULL, 1, 1);");
        db.execSQL("INSERT INTO " + ClassReviewTagDBHelper.TABLE_NAME + " VALUES (NULL, 1, 3);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_NAME);
        onCreate(db);
    }
}
