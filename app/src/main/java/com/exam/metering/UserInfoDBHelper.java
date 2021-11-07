package com.exam.metering;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class UserInfoDBHelper extends SQLiteOpenHelper {
    final static String DB_NAME = "userinfo.db";
    public final static String TABLE_NAME = "userinfo_table";
    public final static String COL_USERID = "userId";
    public final static String COL_PW = "pw";
    public final static String COL_USERNAME = "userName";
    public final static String COL_NICKNAME = "nickName";
    public final static String COL_EMAIL = "email";
    public final static String COL_PHONE = "phone";
    public final static String COL_BIRTHDAY = "birthday";
    public final static String COL_PICTURE = "picture";
    public final static String COL_SEX = "sex";
    public final static String COL_SCHOOL = "school";
    public final static String COL_MAJOR = "major";
    public final static String COL_CERTSCHOOL = "certSchool";
    public final static String COL_CERTSCORE = "certScore";
    public final static String COL_INTRODUCTION = "introduction";

    public UserInfoDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABLE_NAME
                + " (" + COL_USERID + " TEXT, "
                + COL_PW + " TEXT, " + COL_USERNAME + " TEXT, " + COL_NICKNAME + " TEXT, " + COL_EMAIL + " TEXT, " +  COL_PHONE + " TEXT, "
                + COL_BIRTHDAY + " TEXT, " + COL_PICTURE + " TEXT, " + COL_SEX + " TEXT, " + COL_SCHOOL + " TEXT, " + COL_MAJOR + " TEXT, "
                + COL_CERTSCHOOL + " TEXT, " + COL_CERTSCHOOL + " TEXT, " + COL_INTRODUCTION + " TEXT )";
        db.execSQL(sql);
        
        //샘플데이터
        db.execSQL("INSERT INTO " + UserInfoDBHelper.TABLE_NAME + " VALUES (kimcumgong, '1111', '김컴공', 'binary는호남선', 'honamsun@cumgong.com', '010-1111-1111', '97/11/11', NULL, '여성', 'ㅇㅇ대학교', '컴퓨터공학과', NULL, NULL, '안녕하세요!');");
        db.execSQL("INSERT INTO " + UserInfoDBHelper.TABLE_NAME + " VALUES (kimgukmun, '2222', '김국문', '나랏말싸미', 'naratmal@gukmun.com', '010-2222-2222', '97/12/12', NULL, '남성', 'ㅇㅇ대학교', '국문과', NULL, NULL, '안녕하세요!!');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_NAME);
        onCreate(db);
    }
}
