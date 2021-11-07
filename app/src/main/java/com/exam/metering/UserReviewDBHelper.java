package com.exam.metering;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class UserReviewDBHelper extends SQLiteOpenHelper {
    final static String DB_NAME = "userreview.db";
    public final static String TABLE_NAME = "userreview_table";
    public final static String COL_USERREVIEWID = "userReviewId";
    public final static String COL_USERID = "userId";
    public final static String COL_REVIEWCONTENT = "reviewContent";

    public UserReviewDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABLE_NAME
                + " (" + COL_USERREVIEWID + " integer primary key autoincrement, "
                + COL_USERID + " TEXT, "
                + COL_REVIEWCONTENT + " TEXT )";
        db.execSQL(sql);

        //샘플데이터
        db.execSQL("INSERT INTO " + UserReviewDBHelper.TABLE_NAME + " VALUES (NULL, 'kimgukmun', '코딩 어려운데 포기하지 않고 잘 따라오셨어요.');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_NAME);
        onCreate(db);
    }
}
