package com.exam.metering;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ClassReviewDBHelper extends SQLiteOpenHelper {
    final static String DB_NAME = "classreview.db";
    public final static String TABLE_NAME = "classreview_table";
    public final static String COL_CLASSREVIEWID = "classReviewId";
    public final static String COL_CLASSID = "classId";
    public final static String COL_USERID = "userId";
    public final static String COL_REVIEWRATING = "reviewRating";
    public final static String COL_REVIEWCONTENT = "reviewContent";

    public ClassReviewDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABLE_NAME
                + " (" + COL_CLASSREVIEWID + " integer primary key autoincrement, "
                + COL_CLASSID + " TEXT, " + COL_USERID + " TEXT, " + COL_REVIEWRATING + " TEXT, "
                + COL_REVIEWCONTENT + " TEXT )";
        db.execSQL(sql);

        //샘플데이터
        db.execSQL("INSERT INTO " + ClassReviewDBHelper.TABLE_NAME + " VALUES (NULL, 1, 'kimgukmun', '5', '코딩을 배워보고 싶어서 C언어 기초부터 알려주는 호남선님의 수업을 들었습니다. 완전 친절하시고 꼼꼼하게 알려주세요. 코알못 입문자에게 이 수업 강주드려요!');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_NAME);
        onCreate(db);
    }
}
